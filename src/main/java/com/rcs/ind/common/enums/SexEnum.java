package com.rcs.ind.common.enums;

public enum SexEnum {
	Male("Male"),
	Female("Female");/* TODO: sample */

	private final String key;

	private SexEnum(String key) {
		this.key = key;
	}
	public String getKey() {
		return key;
	}
}
