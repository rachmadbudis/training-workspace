package com.rcs.ind.common.enums;


public enum ApplicationStatusEnum {
	CreateInProgress("create_in_progress"),
	New("new"),
	TranslateInProgress("translate_in_progress"),
	Translated("translated"),
	ReviewInProgress("review_in_progress"),
	Reviewed("reviewed"),
	Closed("closed"),
	Finished("finished");

	private final String key;

	private ApplicationStatusEnum(String key) {
		this.key = key;
	}

	public String getKey() {
		return key;
	}
}
