package com.rcs.ind.common.enums;


public enum ReleaseReason {
	Iliterate("iliterate"),
	Leave("leave");

	private final String key;

	private ReleaseReason(String key) {
		this.key = key;
	}

	public String getKey() {
		return key;
	}
}
