package com.rcs.ind.common.enums;


public enum ApplicationStatusEnum {
	CreateInProgress("com.rcs.ind.application.status.create.in.progress"),
	New("com.rcs.ind.application.status.new"),
	TranslateInProgress("com.rcs.ind.application.status.translate.in.progress"),
	Translated("com.rcs.ind.application.status.translated"),
	ReviewInProgress("com.rcs.ind.application.status.review.in.progress"),
	Reviewed("com.rcs.ind.application.status.reviewed"),
	Closed("com.rcs.ind.application.status.closed"),
	Finished("com.rcs.ind.application.status.finished");

	private final String key;

	private ApplicationStatusEnum(String key) {
		this.key = key;
	}

	public String getKey() {
		return key;
	}
}
