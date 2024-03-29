package com.rcs.ind.common.enums;

import java.util.HashMap;
import java.util.Map;

public enum DocumentTypeEnum {
	Passport("com.rcs.ind.preparation.doc.type.passport", "Paspoort"),
	Identity("com.rcs.ind.preparation.doc.type.identity", "Identiteitskaart"),
	IdentityBook("com.rcs.ind.preparation.doc.type.identitybook", "Identiteitsboekje"),
	HvzInterview("com.rcs.ind.hvz.resettlement.interview", "Gehoor Hervestiging"),
	HvzDecision("com.rcs.ind.hvz.decision.result", "Beschikking Uitgenodigde Vluchteling"),
	HvzMinutes("com.rcs.ind.hvz.resettlement.minutes", "Minuut Hervestiging"),
	HvzBRP("com.rcs.ind.hvz.brp", "BRP Profile"),
	HvzWerklijst("com.rcs.ind.hvz.werklijst", "Werklijst"),
	HvzRicPackage("com.rcs.ind.hvz.ric.package", "Go Packet"),
	HvzRFF("com.rcs.ind.hvz.rff", "RFF Document"),
	EMM_EXPORT("", "EMM Export"),
	STATISTIC_REPORT("", "Statistic Report"),
	M117C("com.rcs.ind.filename.m117c", "M117c"),
	ANTECEDENTS_DECLARATION("com.rcs.ind.filename.antecedentenverklaring", "antecedentenverklaring"),
	DAF_INTERVIEW("", ""),
	DAF_RIC("", ""),
	DAF_TRACK_HISTORY("", ""),
	DAF_BRP("", ""),
	DAF_NAREIS("", ""),
	HVZ_DEFINITIVE_LIST("", ""),
	HVZ_MISSION_ZIP("", ""),
	HVZ_BRP_ZIP("", ""),
	HVZ_GO_PACKAGE_ZIP("", ""),
	TRIPLEFORMS_ATTACHMENT("", "")
	;

	private final String key;
	private final String label;
	private static final Map<String, DocumentTypeEnum> lookupLabel = new HashMap<String, DocumentTypeEnum>();
	private static final Map<String, DocumentTypeEnum> lookupName = new HashMap<String, DocumentTypeEnum>();

	private DocumentTypeEnum(String key, String label) {
		this.key = key;
		this.label = label;
	}

	public String getKey() {
		return key;
	}

	public String getLabel() {
		return label;
	}

	static {
		for (DocumentTypeEnum dt : DocumentTypeEnum.values()) {
			lookupLabel.put(dt.getLabel(), dt);
		}
	}
	
	static {
		for (DocumentTypeEnum dt : DocumentTypeEnum.values()) {
			lookupName.put(dt.name(), dt);
		}
	}

	public static DocumentTypeEnum getByValue(String value) {
		DocumentTypeEnum type = lookupLabel.get(value);
		if(type == null){
			type = lookupName.get(value);
		}
		return type;
	}
	
}
