package com.rcs.ind.common.enums;

public enum SampleEnum {
	FirstElement("first"),
	SecondElement("second"),
	ThirdElement("third");

	private final String key;

	private SampleEnum(String key) {
		this.key = key;
	}

	public String getKey() {
		return key;
	}
}
