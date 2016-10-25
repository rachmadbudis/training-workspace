package com.rcs.ind.common.enums;

public enum ConfigurationEnum {
	// General Configuration that don't belong to other category
	DEFAULT_GROUP("defaultGroup"),
	PREPARED_QUESTION_FOLDER("preparedQuestionFolder"),
	
	// Configuration key for email
	EmailSender("emailSender", "changethis@ind.com"),
	EmailReceiver("emailReceiver", "changethis@ind.com"),
	EmailReceiverEMM("emailReceiverEMM", "changethis@ind.com"),
	
	// Configuration key for DDL ID
	NationalitiesDDL("nationalitiesDDL", "0"),
	LanguageDDL("languageDDL", "0"),
	ClaimlandDDL("claimlandDDL", "0"),
	LocationDDL("locationDDL", "0"),
	TrackDDL("trackDDL", "0"),
	
	// Configuration key for Session
	SessionExtend("sessionAutoExtend", "false"),
	
	// Configuration key for LDAP settings
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
	
	// Configuration key for tripleform parameter
	TF_PROJECT("3fProject"),
	TF_PASSWORD("3fPassword"),
	TF_ENVIRONMENT("3fEnvironment"),
	TF_AUTH_URL("3fAuthUrl"),
	TF_FORM_URL("3fFormUrl"),
	TF_SCENARIO_CUSTOMER("3fScenarioCustomer"),
	TF_SCENARIO_TRANSLATOR("3fScenarioTranslator"),
	TF_SCENARIO_DIGITAL("3fScenarioDigital"),
	TF_REDIRECT_GUEST("3fRedirectGuest"),
	TF_REDIRECT_TRANSLATOR("3fRedirectTranslator"),

	// Configuration key for redirect pages
	RD_OPEN_APPLICATION("rdOpenApplication"),
	RD_TRANSLATE_APPLICATION("rdTranslateApplication"),
	RD_INTERVIEWER_PREPARATION("rdInterviewerPreparation"),
	RD_INTERVIEWER_INTERVIEW("rdInterviewerProreg"),
	RD_INTERVIEWER_MARKETPLACE("rdInterviewerMarketplace"),
	RD_SCREENER_INTERVIEW("rdScreenerActiveInterview"),
	RD_SCREENER_MARKETPLACE("rdScreenerMarketplace"),
	RD_RIC_PROFILE("rdRicProfile"),
	RD_RIC_MARKETPLACE("rdRicMarketplace"),
	
	// Configuration key for automated deletion and release of old application
	AT_APPLICATION_DELETION_PASSED_DAYS("atApplicationDeletionPassedDays", "7"),
	AT_INCOMPLETE_EMAIL_TEMPLATE_TITLE("atIncompleteEmailTemplateTitle", "incomplete-email-template"),
	
	//Configuration key for websocket
	WebSocket("websocket", "false"),
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
