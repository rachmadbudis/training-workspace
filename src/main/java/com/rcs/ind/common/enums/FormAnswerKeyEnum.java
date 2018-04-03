package com.rcs.ind.common.enums;

import java.util.ArrayList;
import java.util.List;

public enum FormAnswerKeyEnum {
	NAME("faanmeldformulierpersonalia.voornaam"),
	SURNAME("faanmeldformulierpersonalia.naamachternaamfamilienaam"),
	BIRTH_DATE("faanmeldformulierpersonalia.geboortedatum"),
	NATIONALITY("faanmeldformulierpersonalia.nationaliteit"),
	MULTIPLE_NATIONALITY("faanmeldformulierpersonalia.meerdaneennationaliteit"),
	LANGUAGE("faanmeldformulierleefomgeving.watisuwspreektaal"),
	PROVIDED_DOCUMENTS("faanmeldformulierdocumenten.documentenbij"),
	BIRTH_PLACE("faanmeldformulierpersonalia.geboorteplaats"),
	COUNTRY_OF_BIRTH("faanmeldformulierpersonalia.geboorteland"),
	MARITAL_STATUS_MARRIED_YESNO("faanmeldformuliergezinenfamilie.bentugehuwd"),
	MARITAL_STATUS("faanmeldformuliergezinenfamilie.watisburgerlijkestaat"),
	SEX("faanmeldformulierpersonalia.geslacht"),
	RELIGION("faanmeldformulierpersonalia.religie"),
	RELIGION_OTHERS("faanmeldformulierpersonalia.religieanders"),
	RELIGION_YESNO("faanmeldformulierpersonalia.belijdtueenreligie"),
	COUNTRY("faanmeldformulierpersonalia.land");
	
	private final String key;

	private FormAnswerKeyEnum(String key) {
		this.key = key;
	}

	public String getKey() {
		return key;
	}
	
	public static List<String> getFormAnswerKeys() {
		List<String> list = new ArrayList<String>();
		for (FormAnswerKeyEnum formAnswerKey : FormAnswerKeyEnum.values()) {
			list.add(formAnswerKey.getKey());
		}
		return list;
	}

}
