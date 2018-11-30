package com.rcs.ind.common.enums;

import java.util.HashMap;
import java.util.Map;

public enum MissionStatusEnum {
    EMPTY("com.rcs.ind.hvz.mission.status.empty", ""),
    ACTIVE("com.rcs.ind.hvz.mission.status.active", "Actief"),
    INCOMPLETE("com.rcs.ind.hvz.mission.status.incomplete", ""),
    FINISHED("com.rcs.ind.hvz.mission.status.closed", "Afgewerkt"),
    CLOSED("com.rcs.ind.hvz.mission.status.closed", "Sluiten"),
    ;

    private static final Map<String, MissionStatusEnum> lookupIndigoKey = new HashMap<>();

    private final String key;
    private final String indigoKey;

    MissionStatusEnum(String key, String indigoKey) {
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
        for (MissionStatusEnum me : MissionStatusEnum.values()) {
            lookupIndigoKey.put(me.getIndigoKey(), me);
        }
    }

    public static MissionStatusEnum getByIndigoKey(String value) {
        return lookupIndigoKey.get(value);
    }
}
