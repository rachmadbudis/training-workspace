package com.rcs.ind.common.enums;

public enum ApplicationReleaseReasonEnum {
	Iliterate("com.rcs.ind.application.release.reason.iliterate"),
	Leave("com.rcs.ind.application.release.reason.leave"),
	AutomaticRelease("com.rcs.ind.application.release.reason.automatic.release");

	private final String key;

	private ApplicationReleaseReasonEnum(String key) {
		this.key = key;
	}

	public String getKey() {
		return key;
	}
}
