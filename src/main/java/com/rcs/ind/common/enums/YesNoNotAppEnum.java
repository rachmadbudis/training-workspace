package com.rcs.ind.common.enums;

public enum YesNoNotAppEnum {
	Yes("com.rcs.ind.common.yes"),
	No("com.rcs.ind.common.no"),
	NotApplicable("com.rcs.ind.preparation.dublin.dactyl.not.applicable");

	private final String key;

	private YesNoNotAppEnum(String key) {
		this.key = key;
	}
	
	public String getKey() {
		return key;
	}
}
