package com.rcs.ind.common.enums;

public enum TrackEnum {
	Dublin("com.rcs.ind.track.dublin", "1. Dublin"),
	ProtectedCountry("com.rcs.ind.track.protected.country", "2. Beschermd door EU land"),
	SafeCountry("com.rcs.ind.track.safe.country", "2. Veilig land"),
	NationalitySyErValid("com.rcs.ind.track.nationality.sy.er.valid", "3. Nationaliteit (Syrische of Eritreese) (Valide id-documenten aangeleverd)"),
	NationalityElse("com.rcs.ind.track.nationality.else", "4. Overige Nationaliteiten"),
	NationalitySyErInvalid("com.rcs.ind.track.nationality.sy.er.invalid", "5. Nationaliteit (Syrische of Eritreese) (Geen valide id-documenten aangeleverd)"),
	;
	
	private final String key;
	private final String name;
	
	private TrackEnum(String key, String name) {
		this.key = key;
		this.name = name;
	}
	
	public String getKey() {
		return key;
	}

	public String getName() {
		return name;
	}
}
