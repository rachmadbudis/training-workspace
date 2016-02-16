package com.rcs.ind.common.enums;


public enum RegisteredInterpreterEnum {
	Yes("com.rcs.registered.interpreter.yes"),
	AuthorizedTranslator("com.rcs.registered.interpreter.authorized.translator"),
	NotAvailable("com.rcs.registered.interpreter.not.available"),
	NotAvailableThisTime("com.rcs.registered.interpreter.not.available.this.time");
	
	private final String key;
	
	private RegisteredInterpreterEnum(String key) {
		this.key = key;
	}
	
	public String getKey() {
		return key;
	}
	
}
