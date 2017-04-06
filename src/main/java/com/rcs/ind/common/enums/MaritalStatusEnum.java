package com.rcs.ind.common.enums;

public enum MaritalStatusEnum {
	Single("com.rcs.ind.marital.single", "Ongehuwd en alleenstaand"),
	Married("com.rcs.ind.marital.merried", "Gehuwd"),
	Divorced("com.rcs.ind.marital.divorced", "Gescheiden"),
	Widowed("com.rcs.ind.marital.widowed", "Weduwe of Weduwnaar"),
	LivingTogether("com.rcs.ind.marital.living.together", "Ongehuwd en samenwonend");

	private final String key;
	private final String label;

	private MaritalStatusEnum(String key, String label) {
		this.key = key;
		this.label = label;
	}

	public String getKey() {
		return key;
	}

	public String getLabel() {
		return label;
	}
}
