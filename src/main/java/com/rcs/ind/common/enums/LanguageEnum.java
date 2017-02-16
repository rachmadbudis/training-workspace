package com.rcs.ind.common.enums;

import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



public enum LanguageEnum {
	DUTCH(new Locale("nl", "NL"), "language.nl", false),
	ENGLISH(new Locale("en", "GB"), "language.en", false),
	ARABICSGENERAL(new Locale("ar"), "language.ar.g",true),
	ARABICSYRIA(new Locale("ar", "SY"), "language.ar", true),
	ARABICIRAQ(new Locale("ar", "IQ"), "language.iq", true),
	ERITREA(new Locale("ti", "ER"), "language.ti", false),
	SORANI(new Locale("ckb", "IQ"), "language.ckb",true),
	FARSI(new Locale("fa", "IR"), "language.fa",true),
	DARI(new Locale("prs", "AF"), "language.prs",true),
	PASHTO(new Locale("ps", "AF"), "language.ps",true),
	BADINI(new Locale("ba", "IQ"), "language.ba",true),
	ALBANIAN(new Locale("sq","AL"),"language.sq",false),
	SERBIAN(new Locale("sr","RS"),"language.sr",false);

	private final Locale language;
	private final String label;
	//right to left writting
	private final boolean rtl; 
	private static final List<Map<String, String>> AUTOCOMPLETE_LIST;
	private static final Logger logger = LoggerFactory.getLogger(LanguageEnum.class);
	static {
		List<Map<String, String>> list = new ArrayList<>();
		for (LanguageEnum language : values()) {
			Map<String, String> tModel = new HashMap<>();
			tModel.put("value", language.getLanguage().toString());
			tModel.put("label", language.getLabel());
			tModel.put("rtl", String.valueOf(language.getRtl()));
			list.add(Collections.unmodifiableMap(tModel));
		}
		AUTOCOMPLETE_LIST = Collections.unmodifiableList(list);
	}

	private LanguageEnum(Locale language, String label, boolean rtl) {
		this.language = language;
		this.label = label;
		this.rtl = rtl;
	}

	public Locale getLanguage() {
		return language;
	}

	public String getLabel() {
		return label;
	}

	public boolean getRtl() {
		return rtl;
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
		return EnumSet.of(ARABICSGENERAL,ARABICSYRIA, ARABICIRAQ, ERITREA, SORANI, BADINI, FARSI, DARI, PASHTO,ALBANIAN,SERBIAN);
	}

	
	private static final Map<String, LanguageEnum> lookup = new HashMap<String, LanguageEnum>();

	static {
		for (LanguageEnum s : LanguageEnum.values()) {
			lookup.put(s.getLanguage().toString(), s);
		}
	}

	/**
	 * Get Language Enum by language code
	 * 
	 * @param langCode
	 * @return
	 */
	public static LanguageEnum get(String langCode) {
		return lookup.get(langCode);
	}

}
