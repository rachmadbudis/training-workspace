package com.rcs.ind.common.enums;

public enum ConfigurationEnum {
	// General Configuration that doesn't belong to other category
	DEFAULT_GROUP("defaultGroup"),
	DEFAULT_COMPANYID("defaultCompanyId"),
	FRONTEND_URL("frontendUrl"),
	BACKEND_URL("backendUrl"),
	
	// Configuration key for email
	EmailSender("emailSender", ""),
	EmailReceiver("emailReceiver", ""),
	EmailReceiverEMM("emailReceiverEMM", ""),
	EmailErrorMessages("emailErrorMessages", ""),
	
	// Configuration key for Session
	SessionExtend("sessionAutoExtend", "false"),
	

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
	RD_SUPERVISOR_DETAIL("rdSupervisorDetail"),
	RD_SUPERVISOR_MARKETPLACE("rdSupervisorMarketplace"),
	RD_CUSTOMER_DETAIL("rdCustomerDetail"),
	RD_HVZ_MARKETPLACE("rdHVZMarketplace"),
	RD_MISSION_MARKETPLACE("rdMissionMarketplace"),
	RD_MISSION_FILES("rdMissionFiles"),

	// Configuration key for automated deletion and release of old application
	
	// Configuration key for automated deletion of general applications and release of old applications
	AT_APPLICATION_DELETION_PASSED_DAYS("atApplicationDeletionPassedDays", "7"),
	AT_EVENTS_DELETION_PASSED_DAYS("atEventsDeletionPassedDays", "21"),
	AT_INCOMPLETE_EMAIL_TEMPLATE_TITLE("atIncompleteEmailTemplateTitle", "incomplete-email-template"),
	EMM_APPLICATION_DELETION_PASSED_DAYS("emmApplicationDeletionPassedDays", "60"),

	
	//Configuration key for websocket
	WebSocketFE("websocket_fe", "false"),
	WebSocket("websocket", "false"),

	//Configuration key for event log
	EventLog("eventlog", "false"),

	//Configuration key for logging level
	LoggingLevel("loggingLevel", "error"),

	//Configuration for mission type filter
	MISSION_TYPE_GROUPS("missionTypeGroups", "")
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
