package com.rcs.ind.common.enums;

public enum NationalityEnum {
	Syrian("com.rcs.ind.nationality.syrian"),
	Dutch("com.rcs.ind.nationality.dutch"),
	Eritrean("com.rcs.ind.nationality.eritrean");

	private final String key;

	private NationalityEnum(String key) {
		this.key = key;
	}

	public String getKey() {
		return key;
	}
}
