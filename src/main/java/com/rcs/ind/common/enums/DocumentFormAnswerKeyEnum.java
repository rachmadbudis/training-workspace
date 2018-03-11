package com.rcs.ind.common.enums;

import java.util.ArrayList;
import java.util.List;

public enum DocumentFormAnswerKeyEnum {
	DOCUMENTEN_VANDAAGBIJ("faanmeldformulierdocumenten.welkedocumentenbij.welkedocumenten", "faanmeldformulierdocumenten.welkedocumentenbij.welkedocumenten_translation"),
	DOCUMENTEN_DATUMAFGIFTEIDENTITEITSKAART("faanmeldformulierdocumenten.welkedocumentenbij.datumafgifteidentiteitskaart", "faanmeldformulierdocumenten.welkedocumentenbij.datumafgifteidentiteitskaart_translation"),
	DOCUMENTEN_DATUMAFGIFTEPASPOORT("faanmeldformulierdocumenten.welkedocumentenbij.datumafgiftepaspoort", "faanmeldformulierdocumenten.welkedocumentenbij.datumafgiftepaspoort_translation"),
	DOCUMENTEN_WELKEINSTANTIEIDENTITEITSKAARTAFGEGEVEN("faanmeldformulierdocumenten.welkedocumentenbij.welkeinstantieidentiteitskaartafgegeven", "faanmeldformulierdocumenten.welkedocumentenbij.welkeinstantieidentiteitskaartafgegeven_translation"),
	DOCUMENTEN_WELKEINSTANTIEPASPOORTAFGEGEVEN("faanmeldformulierdocumenten.welkedocumentenbij.welkeinstantiepaspoortafgegeven", "faanmeldformulierdocumenten.welkedocumentenbij.welkeinstantiepaspoortafgegeven_translation"),;

	private final String key;
	private final String translation;

	private DocumentFormAnswerKeyEnum(String key, String translation) {
		this.key = key;
		this.translation = translation;
	}

	public String getKey() {
		return key;
	}

	public String getTranslation() {
		return translation;
	}

	public static List<String> getFormAnswerKeysAndTranslation() {
		List<String> list = new ArrayList<>();
		for (DocumentFormAnswerKeyEnum formAnswerKey : DocumentFormAnswerKeyEnum.values()) {
			list.add(formAnswerKey.getKey());
			list.add(formAnswerKey.getTranslation());
		}
		return list;
	}
}
