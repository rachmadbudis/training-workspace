package com.rcs.ind.common.enums;

import java.util.HashMap;
import java.util.Map;

public enum MaritalStatusEnum {
	Single("com.rcs.ind.marital.single", "Ongehuwd en alleenstaand", "Alleenstaand"),
	Married("com.rcs.ind.marital.merried", "Gehuwd", "Gehuwd"),
	Divorced("com.rcs.ind.marital.divorced", "Gescheiden", "Gescheiden"),
	Widowed("com.rcs.ind.marital.widowed", "Weduwe of Weduwnaar", "Weduwe"),
	Widower("com.rcs.ind.marital.widowed", "Weduwe of Weduwnaar", "Weduwnaar"),
	LivingTogether("com.rcs.ind.marital.living.together", "Ongehuwd en samenwonend", "Samenwonend");

	private static final Map<String, MaritalStatusEnum> lookupLabel = new HashMap<>();
	private static final Map<String, MaritalStatusEnum> lookupIndigoKey = new HashMap<>();

	private final String key;
	private final String label;
	private final String indigoKey;

	MaritalStatusEnum(String key, String label, String indigoKey) {
		this.key = key;
		this.label = label;
		this.indigoKey = indigoKey;
	}

	public String getKey() {
		return key;
	}

	public String getLabel() {
		return label;
	}

	public String getIndigoKey() {
		return indigoKey;
	}

	static {
		for (MaritalStatusEnum	me : MaritalStatusEnum.values()) {
			lookupLabel.put(me.getLabel(), me);
		}
	}

	public static MaritalStatusEnum getByLabel(String value) {
		return lookupLabel.get(value);
	}

	static {
		for (MaritalStatusEnum me : MaritalStatusEnum.values()) {
			lookupIndigoKey.put(me.getIndigoKey(), me);
		}
	}

	public static MaritalStatusEnum getByIndigoKey(String value) {
		return lookupIndigoKey.get(value);
	}

}
