package com.rcs.ind.common.enums;

public enum ApprovalStatusEnum {
	STATUS_29_1_A("com.rcs.ind.hvz.status.29.1.a"),
	STATUS_29_1_B("com.rcs.ind.hvz.status.29.1.b"),
	WITHDRAWN("com.rcs.ind.hvz.status.withdrawn"),
	REJECTED("com.rcs.ind.hvz.status.rejected"),
	;

	private final String key;

	private ApprovalStatusEnum(String key) {
		this.key = key;
	}
	
	public String getKey() {
		return key;
	}
}
