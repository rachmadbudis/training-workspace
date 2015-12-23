package com.rcs.ind.common.enums;

public enum EurodacMatchReasonEnum {
	ASYLUM_REQUEST("com.rcs.ind.avim.asylum.request"),
	ILLEGAL_STAY("com.rcs.ind.avim.illegal.stay");

	private final String key;

	private EurodacMatchReasonEnum(String key) {
		this.key = key;
	}

	public String getKey() {
		return key;
	}
}
