package com.rcs.ind.common.enums;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public enum SettlementResultEnum {
	EMPTY("com.rcs.ind.hvz.settlementresult.empty",""),
	TOELATING("com.rcs.ind.hvz.settlementresult.toelating","Toelating"),
	NIET_TOELATING("com.rcs.ind.hvz.settlementresult.niet.toelating","Niet toelating"),
	INTREKKING_DOOR_KLANT("com.rcs.ind.hvz.settlementresult.intrekking.door.klant","Intrekking door klant"),
	OVERLIJDEN("com.rcs.ind.hvz.settlementresult.overlijden","Overlijden"),
	ONTERECHTE_OPVOERING("com.rcs.ind.hvz.settlementresult.onterechte.opvoering","Onterechte Opvoering")
	;

	private static final Map<String, SettlementResultEnum> lookupIndigoKey = new HashMap<>();
	private final String key;
	private final String indigoKey;

	private SettlementResultEnum(String key, String indigoKey) {
		this.key = key;
		this.indigoKey = indigoKey;
	}
	
	public String getKey() {
		return key;
	}
	
	public String getIndigoKey() {
		return indigoKey;
	}
	
	
    static {
        for (SettlementResultEnum re : SettlementResultEnum.values()) {
            lookupIndigoKey.put(re.getIndigoKey(), re);
        }
    }
	
    public static SettlementResultEnum getByIndigoKey(String value) {
    	if(lookupIndigoKey.get(value)!=null) return lookupIndigoKey.get(value);
    	else return EMPTY;
    }
    
    public static List<SettlementResultEnum> negativeResult(){
    	return Arrays.asList(NIET_TOELATING,INTREKKING_DOOR_KLANT,OVERLIJDEN,ONTERECHTE_OPVOERING);
    }
}
