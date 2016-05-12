package com.rcs.ind.common.enums;

public enum ConfigurationEnum {
	EmailSender("emailSender", "changethis@ind.com"),
	EmailReceiver("emailReceiver", "changethis@ind.com"),
	NationalitiesDDL("nationalitiesDDL", "0"),
	LanguageDDL("languageDDL", "0"),
	ClaimlandDDL("claimlandDDL", "0"),
	LocationDDL("locationDDL", "0"),
	TrackDDL("trackDDL", "0"),
	SessionExtend("sessionAutoExtend", "false"),
	
	LDAP_BASE_PROVIDER_URL("LdapBaseProviderUrl"),
	LDAP_BASE_DN("LdapBaseDn"),
	
	LDAP_SECURITY_PRINCIPAL("LdapSecurityPrincipal"),
	LDAP_SECURITY_CREDENTIALS("LdapSecurityCredentials"),

	LDAP_AGGREGATE_GROUP_FILTER("LdapAggregateGroupFilter"),
	LDAP_ACTUAL_GROUP_FILTER("LdapActualGroupFilter"),
	
	LDAP_AUTH_SEARCH_FILTER("LdapAuthSearchFilter"),
	LDAP_IMPORT_USER_SEARCH_FILTER("LdapImportUserSearchFilter"),
	
	LDAP_USER_UUID_ATTRIBUTE("LdapUserUuidAttribute"),
	LDAP_USER_SCREEN_NAME_ATTRIBUTE("LdapUserScreenNameAttribute"),
	LDAP_USER_EMAIL_ATTRIBUTE("LdapUserEmailAttribute"),
	LDAP_USER_PASSWORD_ATTRIBUTE("LdapUserPasswordAttribute"),
	LDAP_USER_FIRST_NAME_ATTRIBUTE("LdapUserFirstNameAttribute"),
	LDAP_USER_MIDDLE_NAME_ATTRIBUTE("LdapUserMiddleNameAttribute"),
	LDAP_USER_LAST_NAME_ATTRIBUTE("LdapUserLastNameAttribute"),
	LDAP_USER_FULL_NAME_ATTRIBUTE("LdapUserFullNameAttribute"),
	LDAP_USER_MEMBEROF_ATTRIBUTE("LdapUserMemberofAttribute"),
	
	LDAP_GROUP_NAME_ATTRIBUTE("LdapGroupNameAttribute"),
	LDAP_GROUP_DESC_ATTRIBUTE("LdapGroupDescAttribute"),
	LDAP_GROUP_MEMBER_ATTRIBUTE("LdapGroupMemberAttribute"),

	LDAP_SERVER_NAME("LdapServerName"),
	;

	private final String key;
	private final String defaultValue;

	private ConfigurationEnum(String key) {
		this.key = key;
		this.defaultValue = "";
	}


	private ConfigurationEnum(String key, String defaultValue) {
		this.key = key;
		this.defaultValue = defaultValue;
	}

	public String getKey() {
		return key;
	}

	public String getDefaultValue() {
		return defaultValue;
	}
}
