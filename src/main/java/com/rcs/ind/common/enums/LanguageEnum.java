package com.rcs.ind.common.enums;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public enum LanguageEnum {
	ARABIC(new Locale("ar", "SY")),
	DUTCH(new Locale("nl", "NL")),
	ERITREA(new Locale("ti", "ER"));

	private final Locale language;
	private static final List<Map<String, String>> AUTOCOMPLETE_LIST;

	static {
		List<Map<String, String>> list = new ArrayList<>();
		for (LanguageEnum language : values()) {
			Map<String, String> tModel = new HashMap<>();
			tModel.put("value", language.getLanguage().toString());
			tModel.put("label", language.getDisplayLanguage());
			list.add(Collections.unmodifiableMap(tModel));
		}
		AUTOCOMPLETE_LIST = Collections.unmodifiableList(list);
	}

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
		return AUTOCOMPLETE_LIST;
	}

}
