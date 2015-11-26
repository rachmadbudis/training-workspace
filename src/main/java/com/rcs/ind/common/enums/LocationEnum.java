package com.rcs.ind.common.enums;

public enum LocationEnum {
	IND_LOKET_ROTTERDAM("IND Loket Rotterdam"),
	RIJSWIJK("Rijswijk"),
	TER_APEL("Ter Apel");

	private final String location;

	private LocationEnum(String location) {
		this.location = location;
	}

	public String getLocation() {
		return location;
	}

	public LocationEnum getDefaultLocation() {
		return IND_LOKET_ROTTERDAM;
	}
}
