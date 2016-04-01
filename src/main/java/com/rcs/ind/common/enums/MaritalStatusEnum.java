package com.rcs.ind.common.enums;

public enum MaritalStatusEnum {
	Single("com.rcs.ind.marital.single"),
	Married("com.rcs.ind.marital.merried"),
	Divorced("com.rcs.ind.marital.divorced"),
	Widowed("com.rcs.ind.marital.widowed"),
	LivingTogether("com.rcs.ind.marital.living.together");

	private final String key;

	private MaritalStatusEnum(String key) {
		this.key = key;
	}

	public String getKey() {
		return key;
	}
}
