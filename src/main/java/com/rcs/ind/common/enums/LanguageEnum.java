package com.rcs.ind.common.enums;

import java.util.Locale;

public enum LanguageEnum {
	ENGLISH(new Locale("en_GB")),
	ARABIC(new Locale("ar_SY")),
	DUTCH(new Locale("nl_NL"));

	private final Locale language;

	private LanguageEnum(Locale language) {
		this.language = language;
	}	
	
	public Locale getLanguage() {
		return language;
	}
	
	public String getDisplayLanguage() {
		return language.getDisplayName();
	}
	
	public Locale getDefaultLocale() {
		return LanguageEnum.ENGLISH.getLanguage();
	}
}
