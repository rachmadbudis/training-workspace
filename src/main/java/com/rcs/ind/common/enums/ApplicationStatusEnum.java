package com.rcs.ind.common.enums;

public enum ApplicationStatusEnum {
	Empty(0, "com.rcs.ind.application.status.empty", ""),
	CreateInProgress(1, "com.rcs.ind.application.status.create.in.progress", ""),
	New(2, "com.rcs.ind.application.status.new", ""),
	TranslateInProgress(3, "com.rcs.ind.application.status.translate.in.progress", ""),
	Translated(4, "com.rcs.ind.application.status.translated", ""),
	Illiterate(4, "com.rcs.ind.application.status.illiterate", ""),
	PreparationInProgress(5, "com.rcs.ind.application.status.preparation.in.progress", "com.rcs.ind.screener.status.being.prepared"),
	ReadyForInterview(6, "com.rcs.ind.application.status.ready.for.interview", "com.rcs.ind.screener.status.prepared"),
	ReviewInProgress(7, "com.rcs.ind.application.status.review.in.progress", "com.rcs.ind.screener.status.in.progress"),
	Reviewed(8, "com.rcs.ind.application.status.reviewed", "com.rcs.ind.screener.status.finished");

	private final int order;
	private final String key;
	private final String screenerKey;

	private ApplicationStatusEnum(int order, String key, String screenerKey) {
		this.order = order;
		this.key = key;
		this.screenerKey = screenerKey;
	}

	public int getOrder() {
		return order;
	}

	public String getKey() {
		return key;
	}

	public String getScreenerKey() {
		return screenerKey;
	}
}
