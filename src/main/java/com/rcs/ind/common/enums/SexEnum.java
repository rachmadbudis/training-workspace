package com.rcs.ind.common.enums;

public enum SexEnum {
	Male("com.rcs.ind.sex.male"),
	Female("com.rcs.ind.sex.female");

	private final String key;

	private SexEnum(String key) {
		this.key = key;
	}
	public String getKey() {
		return key;
	}
}
