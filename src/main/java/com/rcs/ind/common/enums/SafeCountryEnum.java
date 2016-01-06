package com.rcs.ind.common.enums;

public enum SafeCountryEnum {
	Dutch("com.rcs.ind.nationality.dutch");
	
	private final String key;

	private SafeCountryEnum(String key) {
		this.key = key;
	}

	public String getKey() {
		return key;
	}
}
