package com.rcs.ind.common.enums;

public enum RegisteredInterpreterEnum {
	Yes("com.rcs.registered.interpreter.yes", "Ja"),
	NotAvailable("com.rcs.registered.interpreter.not.available", "Nee, niet beschikbaar"),
	NotAvailableThisTime("com.rcs.registered.interpreter.not.available.this.time", "Nee, niet tijdig beschikbaar");

	private final String key;
	private final String name;

	private RegisteredInterpreterEnum(String key, String name) {
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
