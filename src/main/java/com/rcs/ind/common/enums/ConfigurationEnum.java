package com.rcs.ind.common.enums;

public enum ConfigurationEnum {
	EmailSender(1, "emailSender", "changethis@ind.com"),
	EmailReceiver(2, "emailReceiver", "changethis@ind.com"),
	NationalitiesDDL(3, "nationalitiesDDL", "0"),
	LanguageDDL(4, "languageDDL", "0"),
	ClaimlandDDL(5, "claimlandDDL", "0"),
	LocationDDL(6, "locationDDL", "0"),
	SessionExtend(7, "sessionAutoExtend", "false"),
	;

	private final int id;
	private final String key;
	private final String defaultValue;

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
