package com.rcs.ind.common.enums;

public enum ApplicationStatusEnum {
	Empty(0, "com.rcs.ind.application.status.empty"),
	CreateInProgress(1, "com.rcs.ind.application.status.create.in.progress"),
	New(2, "com.rcs.ind.application.status.new"),
	TranslateInProgress(3, "com.rcs.ind.application.status.translate.in.progress"),
	Translated(4, "com.rcs.ind.application.status.translated"),
	PreparationInProgress(5, "com.rcs.ind.application.status.preparation.in.progress"),
	ReadyForInterview(6, "com.rcs.ind.application.status.ready.for.interview"),
	ReviewInProgress(7, "com.rcs.ind.application.status.review.in.progress"),
	Reviewed(8, "com.rcs.ind.application.status.reviewed"),
	Printed(9, "com.rcs.ind.application.status.printed"),
	Finished(10, "com.rcs.ind.application.status.finished"),
	Closed(11, "com.rcs.ind.application.status.closed"),
	Illiterate(4, "com.rcs.ind.application.status.illiterate");

	private final int order;
	private final String key;

	private ApplicationStatusEnum(int order, String key) {
		this.order = order;
		this.key = key;
	}

	public int getOrder() {
		return order;
	}

	public String getKey() {
		return key;
	}
}
