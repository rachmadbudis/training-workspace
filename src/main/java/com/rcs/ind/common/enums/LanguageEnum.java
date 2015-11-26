package com.rcs.ind.common.enums;

import java.util.Locale;

public enum LanguageEnum {
	ARABIC(new Locale("ar", "SY")),
	DUTCH(new Locale("nl", "NL"));

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

	public static Locale getDefaultLocale() {
		return LanguageEnum.DUTCH.getLanguage();
	}
}
