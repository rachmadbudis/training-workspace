package com.rcs.ind.common.enums;

public enum MaritalStatusEnum {
	Single("Single"),
	Married("Married"),
	Divorced("Divorced"),
	Widowed("Widowed");/* TODO: sample */

	private final String key;

	private MaritalStatusEnum(String key) {
		this.key = key;
	}

	public String getKey() {
		return key;
	}
}
