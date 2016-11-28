package com.rcs.ind.common.enums;

import java.util.HashMap;
import java.util.Map;

public enum DocumentTypeEnum {
	Passport("com.rcs.ind.preparation.doc.type.passport", "Paspoort"),
	Identity("com.rcs.ind.preparation.doc.type.identity", "Identiteitskaart"),
	IdentityBook("com.rcs.ind.preparation.doc.type.identitybook", "Identiteitsboekje");

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
