package com.rcs.ind.common.enums;

public enum ApplicationReleaseReasonEnum {
	Iliterate("com.rcs.ind.application.release.reason.iliterate"),
	ComputerIliterate("com.rcs.ind.application.release.reason.computer.iliterate"),
	Leave("com.rcs.ind.application.release.reason.leave");

	private final String key;

	private ApplicationReleaseReasonEnum(String key) {
		this.key = key;
	}

	public String getKey() {
		return key;
	}
}
