package com.rcs.ind.common.enums;

public enum ConfigurationEnum {
	EmailSender(1, "emailSender", "changethis@ind.com"),
	EmailReceiver(2, "emailReceiver", "changethis@ind.com"),
	NationalitiesDDL(3, "nationalitiesDDL", "0"),
	LanguageDDL(4, "languageDDL", "0"),
	ClaimlandDDL(5, "claimlandDDL", "0"),
	LocationDDL(6, "locationDDL", "0"),
	SessionExtend(7, "sessionAutoExtend", "false"),
	LDAP_BASE_PROVIDER_URL(8, "LdapBaseProviderUrl"),
	LDAP_BASE_DN(9, "LdapBaseDn"),
	
	LDAP_SECURITY_PRINCIPAL(10, "LdapSecurityPrincipal"),
	LDAP_SECURITY_CREDENTIALS(11, "LdapSecurityCredentials"),

	LDAP_AGGREGATE_GROUP_FILTER(12, "LdapAggregateGroupFilter"),
	LDAP_ACTUAL_GROUP_FILTER(13, "LdapActuaGroupFilter"),
	
	LDAP_AUTH_SEARCH_FILTER(14,"LdapAuthSearchFilter"),
	LDAP_IMPORT_USER_SEARCH_FILTER(15,"LdapImportUserSearchFilter"),
	
	LDAP_USER_UUID_ATTRIBUTE(16, "LdapUserUuidAttribute"),
	LDAP_USER_SCREEN_NAME_ATTRIBUTE(17, "LdapUserScreenNameAttribute"),
	LDAP_USER_EMAIL_ATTRIBUTE(18, "LdapUserEmailAttribute"),
	LDAP_USER_PASSWORD_ATTRIBUTE(19, "LdapUserPasswordAttribute"),
	LDAP_USER_FIRST_NAME_ATTRIBUTE(20, "LdapUserFirsNameAttribute"),
	LDAP_USER_MIDDLE_NAME_ATTRIBUTE(21, "LdapUserMiddleNameAttribute"),
	LDAP_USER_LAST_NAME_ATTRIBUTE(22, "LdapUserLastNameAttribute"),
	LDAP_USER_FULL_NAME_ATTRIBUTE(23, "LdapUserFullNameAttribute"),
	LDAP_USER_MEMBEROF_ATTRIBUTE(24, "LdapUserMemberofAttribute"),
	
	LDAP_GROUP_NAME_ATTRIBUTE(25, "LdapGroupNameAttribute"),
	LDAP_GROUP_DESC_ATTRIBUTE(26, "LdapGroupDescAttribute"),
	LDAP_GROUP_MEMBER_ATTRIBUTE(27, "LdapGroupMemberAttribute"),

	LDAP_SERVER_NAME(28, "LdapServerName"),
	;

	private final int id;
	private final String key;
	private final String defaultValue;

	private ConfigurationEnum(int id, String key) {
		this.id = id;
		this.key = key;
		this.defaultValue = "";
	}


	private ConfigurationEnum(int id, String key, String defaultValue) {
		this.id = id;
		this.key = key;
		this.defaultValue = defaultValue;
	}

	public int getId() {
		return id;
	}

	public String getKey() {
		return key;
	}

	public String getDefaultValue() {
		return defaultValue;
	}
}
