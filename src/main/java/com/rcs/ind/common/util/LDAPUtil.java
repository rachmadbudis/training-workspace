package com.rcs.ind.common.util;

import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.PrefsPropsUtil;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnicodeProperties;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.UserGroup;
import com.liferay.portal.service.CompanyServiceUtil;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.service.UserGroupLocalServiceUtil;
import com.rcs.ind.common.enums.ConfigurationEnum;

import javax.naming.Context;
import javax.naming.NamingEnumeration;
import javax.naming.NamingException;
import javax.naming.directory.Attribute;
import javax.naming.directory.Attributes;
import javax.naming.directory.DirContext;
import javax.naming.directory.InitialDirContext;
import javax.naming.directory.SearchControls;
import javax.naming.directory.SearchResult;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class LDAPUtil {

	private static final Log logger = LogFactoryUtil.getLog(LDAPUtil.class);

	private static final Map<String, String> LDAP_KEY_MAPPING;

	static {
		Map<String, String> map = new HashMap<>();
		map.put(ConfigurationEnum.LDAP_BASE_PROVIDER_URL.getKey(), PropsKeys.LDAP_BASE_PROVIDER_URL);
		map.put(ConfigurationEnum.LDAP_BASE_DN.getKey(), PropsKeys.LDAP_BASE_DN);
		map.put(ConfigurationEnum.LDAP_SECURITY_PRINCIPAL.getKey(), PropsKeys.LDAP_SECURITY_PRINCIPAL);
		map.put(ConfigurationEnum.LDAP_SECURITY_CREDENTIALS.getKey(), PropsKeys.LDAP_SECURITY_CREDENTIALS);
		map.put(ConfigurationEnum.LDAP_AUTH_SEARCH_FILTER.getKey(), PropsKeys.LDAP_AUTH_SEARCH_FILTER);
		map.put(ConfigurationEnum.LDAP_IMPORT_USER_SEARCH_FILTER.getKey(), PropsKeys.LDAP_IMPORT_USER_SEARCH_FILTER);
		map.put(ConfigurationEnum.LDAP_SERVER_NAME.getKey(), PropsKeys.LDAP_SERVER_NAME);
		LDAP_KEY_MAPPING = Collections.unmodifiableMap(map);
	}

	private static final Map<String, String> LDAP_USER_MAPPING;

	static {
		Map<String, String> map = new HashMap<>();
		map.put(ConfigurationEnum.LDAP_USER_EMAIL_ATTRIBUTE.getKey(), "emailAddress");
		map.put(ConfigurationEnum.LDAP_USER_SCREEN_NAME_ATTRIBUTE.getKey(), "screenName");
		map.put(ConfigurationEnum.LDAP_USER_PASSWORD_ATTRIBUTE.getKey(), "password");
		map.put(ConfigurationEnum.LDAP_USER_FIRST_NAME_ATTRIBUTE.getKey(), "firstName");
		map.put(ConfigurationEnum.LDAP_USER_MIDDLE_NAME_ATTRIBUTE.getKey(), "middleName");
		map.put(ConfigurationEnum.LDAP_USER_LAST_NAME_ATTRIBUTE.getKey(), "lastName");
		map.put(ConfigurationEnum.LDAP_USER_FULL_NAME_ATTRIBUTE.getKey(), "fullName");
		LDAP_USER_MAPPING = Collections.unmodifiableMap(map);
	}

	public static Hashtable<String, String> getLdapEnvConfigHashtable(Map<String, String> config) {
		Hashtable<String, String> env = new Hashtable<>();
		env.put(Context.INITIAL_CONTEXT_FACTORY, "com.sun.jndi.ldap.LdapCtxFactory");
		env.put(Context.PROVIDER_URL, config.get(ConfigurationEnum.LDAP_BASE_PROVIDER_URL.getKey()) + config.get(ConfigurationEnum.LDAP_BASE_DN.getKey()));
		env.put(Context.SECURITY_AUTHENTICATION, "simple");
		env.put(Context.SECURITY_PRINCIPAL, config.get(ConfigurationEnum.LDAP_SECURITY_PRINCIPAL.getKey()));
		env.put(Context.SECURITY_CREDENTIALS, config.get(ConfigurationEnum.LDAP_SECURITY_CREDENTIALS.getKey()));
		logger.debug("Invoking getLdapEnvConfigHashtable()");
		logger.debug(CommonUtil.toJsonPretty(env));
		return env;
	}

	public static Map<String, List<String>> getUserIDToAggregateGroupMap(Hashtable<String, String> ldapEnv, String searchFilter, String emailAttribute,
	                                                                     String memberOfAttribute) {
		DirContext ctx = null;
		NamingEnumeration results = searchFromLdap(ldapEnv, searchFilter, emailAttribute, memberOfAttribute);
		Map<String, List<String>> userToAggregateGroup = new LinkedHashMap<>();
		if (results != null) {
			try {
				while (results.hasMore()) {
					SearchResult searchResult = (SearchResult) results.next();
					Attributes attributes = searchResult.getAttributes();
					Attribute ldapMemberOfAttribute = attributes.get(memberOfAttribute);
					Attribute ldapEmailAttribute = attributes.get(emailAttribute);
					if (ldapMemberOfAttribute != null && ldapEmailAttribute != null) {
						ArrayList<String> memberList = new ArrayList<String>();
						for (int i = 0; i < ldapMemberOfAttribute.size(); i++) {
							memberList.add((String) ldapMemberOfAttribute.get(i));
						}
						userToAggregateGroup.put((String) ldapEmailAttribute.get(), memberList);
					}
				}
			} catch (NamingException e) {
				logger.debug("Error getting user detail LDAP", e);
				throw new RuntimeException(e);
			} finally {
				if (results != null) {
					try {
						results.close();
					} catch (Exception e) {
					}
				}
			}
		}

		return userToAggregateGroup;
	}

	public static Map<String, List<String>> getAggregateToActualGroupMap(Hashtable<String, String> ldapEnv, String searchFilter, String memberAttribute) {
		logger.debug("Invoking getAggregateToActualGroupMap()");
		Map<String, List<String>> aggregateGroupToActualGroup = new LinkedHashMap<>();
		NamingEnumeration results = searchFromLdap(ldapEnv, searchFilter, memberAttribute);
		if (results != null) {
			logger.debug("NamingEnumeration results is not null");
			try {
				while (results.hasMore()) {
					SearchResult searchResult = (SearchResult) results.next();
					logger.debug("Search result: " + searchResult.getNameInNamespace());
					logger.debug("Searching for " + memberAttribute + " inside search result");
					Attributes attributes = searchResult.getAttributes();
					Attribute ldapMemberAttribute = attributes.get(memberAttribute);
					if (ldapMemberAttribute != null) {
						logger.debug("found. Adding group now");
						ArrayList<String> memberList = new ArrayList<String>();
						for (int i = 0; i < ldapMemberAttribute.size(); i++) {
							logger.debug("Adding " + (String) ldapMemberAttribute.get(i));
							memberList.add((String) ldapMemberAttribute.get(i));
						}
						logger.debug("Merging " + memberList.size() + " member to the aggregateGroupToActualGroup");
						aggregateGroupToActualGroup.put(searchResult.getNameInNamespace(), memberList);
					} else {
						logger.debug("not found.");
					}
				}
			} catch (NamingException e) {
				logger.debug("Error getting aggregate group detail from LDAP", e);
				throw new RuntimeException(e);
			} finally {
				if (results != null) {
					try {
						results.close();
					} catch (Exception e) {
					}
				}
			}
		}
		logger.debug(CommonUtil.toJsonPretty(aggregateGroupToActualGroup));
		return aggregateGroupToActualGroup;
	}

	public static Map<String, Map<String, String>> getActualGroupData(Hashtable<String, String> ldapEnv, Set<String> actualGroupDNSet, String searchFilter,
	                                                                  String groupNameAttribute, String descriptionAttribute) {
		logger.debug("Invoking getActualGroupData()");
		Map<String, Map<String, String>> actualGroupData = new LinkedHashMap<>();
		NamingEnumeration results = searchFromLdap(ldapEnv, searchFilter, groupNameAttribute, descriptionAttribute);
		if (results != null) {
			logger.debug("NamingEnumeration results is not null");
			try {
				while (results.hasMore()) {
					SearchResult searchResult = (SearchResult) results.next();
					Attributes attributes = searchResult.getAttributes();
					Attribute ldapGroupNameAttribute = attributes.get(groupNameAttribute);
					Attribute ldapDescriptionAttribute = attributes.get(descriptionAttribute);
					if (ldapGroupNameAttribute != null && actualGroupDNSet.contains(searchResult.getNameInNamespace())) {
						Map<String, String> groupData = new LinkedHashMap<>();
						groupData.put(ConfigurationEnum.LDAP_GROUP_NAME_ATTRIBUTE.getKey(), (String) ldapGroupNameAttribute.get());
						groupData.put(ConfigurationEnum.LDAP_GROUP_DESC_ATTRIBUTE.getKey(),
								ldapDescriptionAttribute == null ? (String) ldapGroupNameAttribute.get() : (String) ldapGroupNameAttribute.get());
						actualGroupData.put(searchResult.getNameInNamespace(), groupData);
					}
				}
			} catch (NamingException e) {
				logger.debug("Error getting actual group detail from LDAP", e);
				throw new RuntimeException(e);
			} finally {
				if (results != null) {
					try {
						results.close();
					} catch (Exception e) {
					}
				}
			}
		}
		logger.debug("Result: " + CommonUtil.toJsonPretty(actualGroupData));
		return actualGroupData;
	}

	private static NamingEnumeration searchFromLdap(Hashtable<String, String> ldapEnv, String searchFilter, String... attributes) {
		logger.debug("Invoking searchFromLdap()");
		DirContext ctx = null;
		try {
			ctx = new InitialDirContext(ldapEnv);
			SearchControls controls = new SearchControls();
			controls.setSearchScope(SearchControls.SUBTREE_SCOPE);
			controls.setReturningAttributes(attributes);
			return ctx.search("", searchFilter, controls);
		} catch (NamingException e) {
			logger.debug("Error getting data from LDAP", e);
			throw new RuntimeException(e);
		} finally {
			if (ctx != null) {
				try {
					ctx.close();
				} catch (Exception e) {
				}
			}
		}
	}

	public static long addLDAPServer(long companyId, Map<String, String> propertiesMap) throws Exception {
		logger.debug("invoking addLDAPServer()");
		UnicodeProperties properties = new UnicodeProperties();

		long ldapServerId = getLDAPServerId(companyId, propertiesMap.get(ConfigurationEnum.LDAP_SERVER_NAME.getKey()));

		String postfix = getPropertyPostfix(ldapServerId);

		Set<String> keysSet = propertiesMap.keySet();

		String[] keys = keysSet.toArray(new String[keysSet.size()]);

		StringBuilder userMapping = new StringBuilder("");
		for (String key : keys) {
			if (LDAP_KEY_MAPPING.containsKey(key)) {
				properties.setProperty(LDAP_KEY_MAPPING.get(key) + postfix, propertiesMap.get(key));
			} else if (LDAP_USER_MAPPING.containsKey(key)) {
				if (userMapping.length() > 0) {
					userMapping.append("[$NEW_LINE$]");
				}
				userMapping.append(LDAP_USER_MAPPING.get(key) + "=" + propertiesMap.get(key));
			}
		}

		if (userMapping.length() > 0) {
			properties.setProperty(PropsKeys.LDAP_USER_MAPPINGS + postfix, userMapping.toString());
		}

		properties.setProperty(PropsKeys.LDAP_IMPORT_ENABLED, "false");
		properties.setProperty(PropsKeys.LDAP_AUTH_ENABLED, "true");
		properties.setProperty(PropsKeys.LDAP_PASSWORD_POLICY_ENABLED, "true");
		properties.setProperty(PropsKeys.REQUEST_HEADER_AUTH_IMPORT_FROM_LDAP, "true");

		properties.setProperty("ldap.server.ids", String.valueOf(ldapServerId));

		CompanyServiceUtil.updatePreferences(companyId, properties);

		return ldapServerId;
	}

	private static long getLDAPServerId(long companyId, String ldapServerName) throws Exception {
		logger.debug("invoking getLDAPServerId()");

		long result = CounterLocalServiceUtil.increment();

		if (Validator.isNull(ldapServerName)) {
			return result;
		}

		long[] existingLDAPServerIds = StringUtil.split(PrefsPropsUtil.getString(companyId, "ldap.server.ids"), 0L);

		for (long existingLDAPServerId : existingLDAPServerIds) {
			String existingLDAPServerName = PrefsPropsUtil.getString(companyId, "ldap.server.name." + existingLDAPServerId);
			logger.debug("Existing LDAP server name is " + existingLDAPServerName);
			if (ldapServerName.equals(existingLDAPServerName)) {
				result = existingLDAPServerId;
			}
		}
		logger.debug("LDAP server ID : " + result);
		return result;
	}

	public static String getPropertyPostfix(long ldapServerId) {
		return StringPool.PERIOD + ldapServerId;
	}

	public static Set<String> getActualGroupDNSet(Map<String, List<String>> aggregateToActualGroupMap) {
		logger.debug("Invoking getActualGroupDNSet()");
		Set<String> actualGroupDNSet = new HashSet<>();
		for (Map.Entry<String, List<String>> entry : aggregateToActualGroupMap.entrySet()) {
			for (String groupDN : entry.getValue()) {
				actualGroupDNSet.add(groupDN);
			}
		}
		logger.debug("Result: " + CommonUtil.toJsonPretty(actualGroupDNSet));
		return actualGroupDNSet;
	}

	public static Map<String, UserGroup> addActualGroupMapIfNotExist(Map<String, Map<String, String>> actualGroupData, long companyId, long userId,
	                                                                 ServiceContext serviceContext) throws SystemException, PortalException {
		logger.debug("Invoking addActualGroupMapIfNotExist()");
		Map<String, UserGroup> groupDnToUserGroupMap = new LinkedHashMap<>();
		for (Map.Entry<String, Map<String, String>> entry : actualGroupData.entrySet()) {
			logger.debug("Trying to get usergroup " + entry.getValue());
			UserGroup userGroup = UserGroupLocalServiceUtil.fetchUserGroup(companyId, entry.getValue()
					.get(ConfigurationEnum.LDAP_GROUP_NAME_ATTRIBUTE.getKey()));
			if (userGroup == null) {
				logger.debug("Usergroup not exist. Adding one now");
				userGroup = UserGroupLocalServiceUtil.addUserGroup(userId, companyId, entry.getValue()
								.get(ConfigurationEnum.LDAP_GROUP_NAME_ATTRIBUTE.getKey()), entry.getValue().get(ConfigurationEnum.LDAP_GROUP_DESC_ATTRIBUTE.getKey()),
						serviceContext);
			}
			groupDnToUserGroupMap.put(entry.getKey(), userGroup);
		}
		return groupDnToUserGroupMap;
	}

}
