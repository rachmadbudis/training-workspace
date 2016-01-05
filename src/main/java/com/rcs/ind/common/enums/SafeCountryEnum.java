package com.rcs.ind.common.enums;

public enum SafeCountryEnum {
	Syrian("com.rcs.ind.nationality.syrian"),;
	
	private final String key;

	private SafeCountryEnum(String key) {
		this.key = key;
	}

	public String getKey() {
		return key;
	}
}
