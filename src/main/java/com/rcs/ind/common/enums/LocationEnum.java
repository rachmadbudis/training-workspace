package com.rcs.ind.common.enums;

public enum LocationEnum {
	IND_HEADQUARTERS("Ind Headquarters"),
	RIJSWIJK("Rijswijk"),
	TER_APPLE("Ter apple");

	private final String location;

	private LocationEnum(String location) {
		this.location = location;
	}

	public String getLocation() {
		return location;
	}

	public LocationEnum getDefaultLocation() {
		return IND_HEADQUARTERS;
	}
}
