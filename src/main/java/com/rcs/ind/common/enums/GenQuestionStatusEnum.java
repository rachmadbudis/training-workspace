package com.rcs.ind.common.enums;


public enum GenQuestionStatusEnum {
	General("General"),
	Additional("Additional"),
	StartGehoor("StartGehoor");

	private final String key;
	private static GenQuestionStatusEnum[] vals = values();

	private GenQuestionStatusEnum(String key) {
		this.key = key;
	}

	public String getKey() {
		return key;
	}

	public GenQuestionStatusEnum next() {
		return ((this.ordinal() + 1) != vals.length) ? vals[(this.ordinal() + 1)] : null;
	}

	public GenQuestionStatusEnum previous() {
		return ((this.ordinal() - 1) != -1) ? vals[(this.ordinal() - 1)] : null;
	}
}
