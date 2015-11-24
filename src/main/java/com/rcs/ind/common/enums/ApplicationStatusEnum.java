package com.rcs.ind.common.enums;

public enum ApplicationStatusEnum {
	Empty("com.rcs.ind.application.status.empty"),
	CreateInProgress("com.rcs.ind.application.status.create.in.progress"),
	New("com.rcs.ind.application.status.new"),
	TranslateInProgress("com.rcs.ind.application.status.translate.in.progress"),
	Translated("com.rcs.ind.application.status.translated"),
	ReviewInProgress("com.rcs.ind.application.status.review.in.progress"),
	Reviewed("com.rcs.ind.application.status.reviewed"),
	Printed("com.rcs.ind.application.status.printed"),
	Finished("com.rcs.ind.application.status.finished"),
	Closed("com.rcs.ind.application.status.closed");

	private final String key;
	private static ApplicationStatusEnum[] vals = values();

	private ApplicationStatusEnum(String key) {
		this.key = key;
	}

	public String getKey() {
		return key;
	}

	public ApplicationStatusEnum next() {
		return ((this.ordinal() + 1) != vals.length) ? vals[(this.ordinal() + 1)] : null;
	}

	public ApplicationStatusEnum previous() {
		return ((this.ordinal() - 1) != -1) ? vals[(this.ordinal() - 1)] : null;
	}
}
