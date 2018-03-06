package com.rcs.ind.common.enums;

import java.util.ArrayList;
import java.util.List;

public enum DocumentFormAnswerKeyEnum {
	DOCUMENTEN_VANDAAGBIJ("faanmeldformulierdocumenten.welkedocumentenbij.welkedocumenten"),
	DOCUMENTEN_VANDAAGBIJ_TRANSLATION("faanmeldformulierdocumenten.welkedocumentenbij.welkedocumenten_translation"),
	DOCUMENTEN_DATUMAFGIFTEIDENTITEITSKAART("faanmeldformulierdocumenten.datumafgifteidentiteitskaart"),
	DOCUMENTEN_DATUMAFGIFTEPASPOORT("faanmeldformulierdocumenten.datumafgiftepaspoort"),
	DOCUMENTEN_WELKEINSTANTIEIDENTITEITSKAARTAFGEGEVEN("faanmeldformulierdocumenten.welkeinstantieidentiteitskaartafgegeven"),
	DOCUMENTEN_WELKEINSTANTIEPASPOORTAFGEGEVEN("faanmeldformulierdocumenten.welkeinstantiepaspoortafgegeven");

	private final String key;

	private DocumentFormAnswerKeyEnum(String key) {
		this.key = key;
	}

	public String getKey() {
		return key;
	}

	public static List<String> getFormAnswerKeys() {
		List<String> list = new ArrayList<String>();
		for (DocumentFormAnswerKeyEnum formAnswerKey : DocumentFormAnswerKeyEnum.values()) {
			list.add(formAnswerKey.getKey());
		}
		return list;
	}
}
