package com.rcs.ind.common.enums;

public enum ApplicationTypeEnum {
	DIGITAL(0, "com.rcs.ind.application.type.digital", ""),
	PAPER(1, "com.rcs.ind.application.type.paper", ""),
	ILLITERATE(2, "com.rcs.ind.application.type.illiterate", "");
	
	private final int order;
	private final String key;
	private final String screenerKey;

	private ApplicationTypeEnum(int order, String key, String screenerKey) {
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
