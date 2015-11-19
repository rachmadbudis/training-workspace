package com.rcs.ind.common.enums;

public enum ValidatorTypeEnum {
	DefaultValidator("defaultValidator"),
	KodisionVallidator("kodisionValidator");

	private String beanName;

	private ValidatorTypeEnum(String beanName) {
		this.beanName = beanName;
	}

	public String getBeanName() {
		return this.beanName;
	}
}
