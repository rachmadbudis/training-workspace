package com.rcs.ind.common.enums;

public enum TrackEnum {
	Dublin("com.rcs.ind.track.dublin"),
	ProtectedCountry("com.rcs.ind.track.protected.country"),
	SafeCountry("com.rcs.ind.track.safe.country"),
	NationalitySyErValid("com.rcs.ind.track.nationality.sy.er.valid"),
	NationalityElse("com.rcs.ind.track.nationality.else"),
	NationalitySyErInvalid("com.rcs.ind.track.nationality.sy.er.invalid"), 
	;

	private final String key;

	private TrackEnum(String key) {
		this.key = key;
	}

	public String getKey() {
		return key;
	}
}
