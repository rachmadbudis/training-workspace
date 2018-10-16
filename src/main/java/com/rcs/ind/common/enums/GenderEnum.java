package com.rcs.ind.common.enums;

import java.util.HashMap;
import java.util.Map;

public enum  GenderEnum {
    Male("com.rcs.ind.gender.male", "Man"),
    Female("com.rcs.ind.gender.female", "Vrouw"),
    Other("com.rcs.ind.gender.other", ""),
    ;

    private static final Map<String, GenderEnum> lookupIndigoKey= new HashMap<>();

    private final String key;
    private final String indigoKey;

    GenderEnum(String key, String indigoKey) {
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
        for (GenderEnum re : GenderEnum.values()) {
            lookupIndigoKey.put(re.getIndigoKey(), re);
        }
    }

    public static GenderEnum getByIndigoKey(String value) {
        return lookupIndigoKey.get(value);
    }
}
