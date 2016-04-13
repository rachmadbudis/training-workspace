package com.rcs.ind.common.enums;

public enum ConfigurationEnum {
	EmailSender(1, "emailSender", "changethis@ind.com"),
	EmailReceiver(2, "emailReceiver", "changethis@ind.com");

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
