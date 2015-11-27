package com.rcs.ind.common.enums;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public enum LocationEnum {
	IND_LOKET_ROTTERDAM("IND Loket Rotterdam"),
	RIJSWIJK("Rijswijk"),
	TER_APEL("Ter Apel");

	private final String location;
	private static LocationEnum[] vals = values();

	private LocationEnum(String location) {
		this.location = location;
	}

	public String getLocation() {
		return location;
	}

	public LocationEnum getDefaultLocation() {
		return IND_LOKET_ROTTERDAM;
	}

	public static List<Map<String, String>> getAutoCompleteLocations() {
		List<Map<String, String>> list = new ArrayList<>();
		for (LocationEnum locationEnum : vals) {
			Map<String, String> tModel = new HashMap<>();
			tModel.put("value", locationEnum.name());
			tModel.put("label", locationEnum.getLocation());
			list.add(tModel);
		}
		return list;
	}

}
