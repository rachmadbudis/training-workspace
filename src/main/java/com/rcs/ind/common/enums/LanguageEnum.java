package com.rcs.ind.common.enums;

import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public enum LanguageEnum {
	ARABIC(new Locale("ar", "SY"), "language.ar"),
	DUTCH(new Locale("nl", "NL"), "language.nl"),
	ERITREA(new Locale("ti", "ER"), "language.ti"),
	ENGLISH(new Locale("en"),"language.en"),
	FRENCH(new Locale("fr"),"language.fr"),
	SPANISH(new Locale("es"),"language.es"),
	SORANI(new Locale("ckb","IQ"),"language.ckb"),
	KURMANJI(new Locale("kmr","IQ"),"language.kmr"),
	FARSI(new Locale("fa","IR"),"language.fa"),
	DARI(new Locale("prs","AF"),"language.prs"),
	PASHTO(new Locale("ps","AF"),"language.ps");

	private final Locale language;
	private final String label;
	private static final List<Map<String, String>> AUTOCOMPLETE_LIST;

	static {
		List<Map<String, String>> list = new ArrayList<>();
		for (LanguageEnum language : values()) {
			Map<String, String> tModel = new HashMap<>();
			tModel.put("value", language.getLanguage().toString());
			tModel.put("label", language.getLabel());
			list.add(Collections.unmodifiableMap(tModel));
		}
		AUTOCOMPLETE_LIST = Collections.unmodifiableList(list);
	}

	private LanguageEnum(Locale language, String label) {
		this.language = language;
		this.label = label;
	}

	public Locale getLanguage() {
		return language;
	}

	public String getLabel() {
		return label;
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
	
	public static EnumSet<LanguageEnum> getCustomerLanguageList() {
		return EnumSet.of(ARABIC, ERITREA, ENGLISH, FRENCH, SPANISH, SORANI, KURMANJI, FARSI, DARI, PASHTO);
	}

}
