package com.rcs.ind.common.enums;

public enum TrackEnum {
	Dublin("com.rcs.ind.track.dublin", false),
	ProtectedCountry("com.rcs.ind.track.protected.country", false),
	SafeCountry("com.rcs.ind.track.safe.country", false),
	NationalitySyErValid("com.rcs.ind.track.nationality.sy.er.valid", false),
	NationalityElse("com.rcs.ind.track.nationality.else", false),
	NationalitySyErInvalid("com.rcs.ind.track.nationality.sy.er.invalid", false),
	;

    private final String key;

    private TrackEnum(String key, boolean simplified) {
        this.key = key;
    }

    public String getKey() {
        return key;
    }
}
