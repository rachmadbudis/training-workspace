package com.rcs.ind.common.enums;

import java.util.HashMap;
import java.util.Map;

public enum GeneralDocumentTypeEnum {
	EMM_EXPORT("EMM Export");

	private final String label;
	private static final Map<String, GeneralDocumentTypeEnum> lookupLabel = new HashMap<String, GeneralDocumentTypeEnum>();


	private GeneralDocumentTypeEnum(String label) {
		this.label = label;
	}

	public String getLabel() {
		return label;
	}

	static {
		for (GeneralDocumentTypeEnum dt : GeneralDocumentTypeEnum.values()) {
			lookupLabel.put(dt.getLabel(), dt);
		}
	}
	
	public static GeneralDocumentTypeEnum getByLabel(String value) {
		return lookupLabel.get(value);
	}
	
}
