package com.rcs.ind.common.enums;

import java.util.ArrayList;
import java.util.List;

public enum DocumentFormAnswerKeyEnum {
	DOCUMENTEN_VANDAAGBIJ("faanmeldformulierdocumenten.welkedocumentenbij.welkedocumenten", "faanmeldformulierdocumenten.welkedocumentenbij.welkedocumenten_translation"),
	DOCUMENTEN_VANDAAGBIJ_ANDERS("faanmeldformulierdocumenten.welkedocumentenbijanders", "faanmeldformulierdocumenten.welkedocumentenbijanders_translation"),
	DOCUMENTEN_DATUMAFGIFTEIDENTITEITSKAART("faanmeldformulierdocumenten.datumafgifteidentiteitskaart", "faanmeldformulierdocumenten.datumafgifteidentiteitskaart_translation"),
	DOCUMENTEN_DATUMAFGIFTEPASPOORT("faanmeldformulierdocumenten.datumafgiftepaspoort", "faanmeldformulierdocumenten.datumafgiftepaspoort_translation"),
	DOCUMENTEN_WELKEINSTANTIEIDENTITEITSKAARTAFGEGEVEN("faanmeldformulierdocumenten.welkeinstantieidentiteitskaartafgegeven", "faanmeldformulierdocumenten.welkeinstantieidentiteitskaartafgegeven_translation"),
	DOCUMENTEN_WELKEINSTANTIEPASPOORTAFGEGEVEN("faanmeldformulierdocumenten.welkeinstantiepaspoortafgegeven", "faanmeldformulierdocumenten.welkeinstantiepaspoortafgegeven_translation");

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

	public static List<String> getFormAnswerKeys() {
		List<String> list = new ArrayList<>();
		for (DocumentFormAnswerKeyEnum formAnswerKey : DocumentFormAnswerKeyEnum.values()) {
			list.add(formAnswerKey.getKey());
		}
		return list;
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
