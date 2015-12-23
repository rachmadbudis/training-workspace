package com.rcs.ind.common.enums;

public enum YesNoNotAppEnum {
	Yes("Yes"),
	No("No"),
	NotApplicable("NotApplicable");

	private final String key;

	private YesNoNotAppEnum(String key) {
		this.key = key;
	}
}
