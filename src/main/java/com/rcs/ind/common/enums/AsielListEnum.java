package com.rcs.ind.common.enums;

import java.util.HashMap;
import java.util.Map;

public enum AsielListEnum {
	RIC_APPLICABLE("Ric Applicable"),
	TRACKS ("Tracks"),
	NATIONALITIES ("Nationalities"),
	LANGUAGES("Language"),
	CLAIMLAND ("Claimland"),
	LOCATION("Location"),
	INDIGO ("Indigo Codes"),;
	
	String name;
	public String getName() {
		return name;
	}
	
	private AsielListEnum(String name) {
		this.name = name;
	}

	private static final Map<String, AsielListEnum> lookup = new HashMap<String, AsielListEnum>();

	static {
		for (AsielListEnum s : AsielListEnum.values()) {
			lookup.put(s.getName(), s);
		}
	}
	
	public static AsielListEnum fromName(String name) {
		return lookup.get(name);
	}
	
}
