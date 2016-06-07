package com.rcs.ind.common.enums;

public enum RicStatusEnum {
	NotApplicable("com.rcs.ind.preparation.ric.status.nvt"),
	Pending("com.rcs.ind.preparation.ric.status.pending"),
	InProgress("com.rcs.ind.preparation.ric.status.progress"),
	Finish("com.rcs.ind.preparation.ric.status.finish"),
	;

	private final String key;

	private RicStatusEnum(String key) {
		this.key = key;
	}
	
	public String getKey() {
		return key;
	}
}
