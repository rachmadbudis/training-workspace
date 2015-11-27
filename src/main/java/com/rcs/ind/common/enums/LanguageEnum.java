package com.rcs.ind.common.enums;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public enum LanguageEnum {
	ARABIC(new Locale("ar", "SY")),
	DUTCH(new Locale("nl", "NL"));

	private final Locale language;
	private static LanguageEnum[] vals = values();

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

	public static List<Map<String, String>> getAutoCompleteLanguages() {
		List<Map<String, String>> list = new ArrayList<>();
		for (LanguageEnum languageEnum : vals) {
			Map<String, String> tModel = new HashMap<>();
			tModel.put("value", languageEnum.getLanguage().toString());
			tModel.put("label", languageEnum.getDisplayLanguage());
			list.add(tModel);
		}
		return list;
	}

}
