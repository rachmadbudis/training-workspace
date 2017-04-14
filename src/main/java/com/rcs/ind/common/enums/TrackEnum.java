package com.rcs.ind.common.enums;

public enum TrackEnum {
	Dublin("com.rcs.ind.track.dublin", false),
	ProtectedCountry("com.rcs.ind.track.protected.country", false),
	SafeCountry("com.rcs.ind.track.safe.country", false),
	NationalitySyErValid("com.rcs.ind.track.nationality.sy.er.valid", false),
	NationalityElse("com.rcs.ind.track.nationality.else", false),
	NationalitySyErInvalid("com.rcs.ind.track.nationality.sy.er.invalid", false),
	DublinAMG("com.rcs.ind.track.dublinAMG", true),
	VLG("com.rcs.ind.track.vlg", true),
	Normal("com.rcs.ind.track.normal", true)
	;

	private final String key;
	private final boolean simplified;

	private TrackEnum(String key, boolean simplified) {
		this.key = key;
		this.simplified = simplified;
	}

	public String getKey() {
		return key;
	}
	
	public boolean getSimplified() {
		return simplified;
	}
}
