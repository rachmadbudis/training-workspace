package com.rcs.ind.common.enums;

public enum TrackEnum {
	Dublin("Dublin"),
	Standard("Standard");

	private final String key;

	private TrackEnum(String key) {
		this.key = key;
	}
	
	public String getKey() {
		return key;
	}
}
