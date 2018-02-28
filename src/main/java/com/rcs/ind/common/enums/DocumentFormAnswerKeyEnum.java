package com.rcs.ind.common.enums;

import java.util.ArrayList;
import java.util.List;

public enum DocumentFormAnswerKeyEnum {
	DOCUMENTEN_SYRIA("faanmeldformulierdocumenten.documentensyria.welkedocumenten"),
	DOCUMENTEN_ERITREA("faanmeldformulierdocumenten.documenteneritera.welkedocumenten"),
	DOCUMENTEN_AFGHANISTAN("faanmeldformulierdocumenten.documentenafghanistan.welkedocumenten"),
	DOCUMENTEN_IRAK("faanmeldformulierdocumenten.documentenirak.welkedocumenten"),
	DOCUMENTEN_IRAN("faanmeldformulierdocumenten.documenteniran.welkedocumenten"),
	DOCUMENTEN_VANDAAGBIJ("faanmeldformulierdocumenten.welkedocumentenbij.welkedocumenten"),
	DOCUMENTEN_SYRIA_TRANSLATION("faanmeldformulierdocumenten.documentensyria.welkedocumenten_translation"),
	DOCUMENTEN_ERITREA_TRANSLATION("faanmeldformulierdocumenten.documenteneritera.welkedocumenten_translation"),
	DOCUMENTEN_AFGHANISTAN_TRANSLATION("faanmeldformulierdocumenten.documentenafghanistan.welkedocumenten_translation"),
	DOCUMENTEN_IRAK_TRANSLATION("faanmeldformulierdocumenten.documentenirak.welkedocumenten_translation"),
	DOCUMENTEN_IRAN_TRANSLATION("faanmeldformulierdocumenten.documenteniran.welkedocumenten_translation"),
	DOCUMENTEN_VANDAAGBIJ_TRANSLATION("faanmeldformulierdocumenten.welkedocumentenbij.welkedocumenten_translation"),
	DOCUMENTEN_DATUMAFGIFTEIDENTITEITSKAART("faanmeldformulierdocumenten.datumafgifteidentiteitskaart"),
	DOCUMENTEN_DATUMAFGIFTEPASPOORT("faanmeldformulierdocumenten.datumafgiftepaspoort");

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
