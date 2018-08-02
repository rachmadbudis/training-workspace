package com.rcs.ind.common.enums;

public enum ApplicationStatusEnum {
	Empty(0, "com.rcs.ind.application.status.empty", "", ApplicationStepEnum.New),
	CreateInProgress(1, "com.rcs.ind.application.status.create.in.progress", "", ApplicationStepEnum.New),
	New(2, "com.rcs.ind.application.status.new", "", ApplicationStepEnum.New),
	TranslateInProgress(3, "com.rcs.ind.application.status.translate.in.progress", "", ApplicationStepEnum.Translated),
	Translated(4, "com.rcs.ind.application.status.translated", "", ApplicationStepEnum.Translated),
	Illiterate(4, "com.rcs.ind.application.status.illiterate", "", ApplicationStepEnum.Translated),
	PreparationInProgress(5, "com.rcs.ind.application.status.preparation.in.progress", "com.rcs.ind.screener.status.being.prepared", ApplicationStepEnum.Prepared),
	ReadyForInterview(6, "com.rcs.ind.application.status.ready.for.interview", "com.rcs.ind.screener.status.prepared", ApplicationStepEnum.Prepared),
	ReviewInProgress(7, "com.rcs.ind.application.status.review.in.progress", "com.rcs.ind.screener.status.in.progress", ApplicationStepEnum.Interviewed),
	Reviewed(8, "com.rcs.ind.application.status.reviewed", "com.rcs.ind.screener.status.finished", ApplicationStepEnum.Interviewed),
	SentToIndigo(9, "com.rcs.ind.application.status.upload.sent", "com.rcs.ind.application.status.upload.sent", ApplicationStepEnum.Indigo),
	UploadSuccess(10, "com.rcs.ind.application.status.upload.success", "com.rcs.ind.screener.status.upload.success", ApplicationStepEnum.Indigo),
	UploadFailed(10, "com.rcs.ind.application.status.upload.failed", "com.rcs.ind.screener.status.upload.failed", ApplicationStepEnum.Indigo);

	private final int order;
	private final String key;
	private final String screenerKey;
	private final ApplicationStepEnum stepEnum;

	private ApplicationStatusEnum(int order, String key, String screenerKey, ApplicationStepEnum stepEnum) {
		this.order = order;
		this.key = key;
		this.screenerKey = screenerKey;
		this.stepEnum = stepEnum;
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

	public ApplicationStepEnum getStepEnum() {
		return stepEnum;
	}
}
