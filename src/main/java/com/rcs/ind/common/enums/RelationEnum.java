package com.rcs.ind.common.enums;

import java.util.HashMap;
import java.util.Map;

public enum RelationEnum {
    Unknown("com.rcs.ind.relation.unknown", ""),
    PRA("com.rcs.ind.relation.pra", "PRA"),
    Echtgenote("com.rcs.ind.relation.partner", "Echtgenote"),
    Echtgenoot("com.rcs.ind.relation.husband", "Husband"),
    Vrouw("com.rcs.ind.relation.wife", "Wife"),
    Zoon("com.rcs.ind.relation.son", "Son"),
    Dochter("com.rcs.ind.relation.daughter", "Daughter"),
    Kind("com.rcs.ind.relation.children", "Kinder"),
    Vader("com.rcs.ind.relation.father", "Father"),
    Moeder("com.rcs.ind.relation.mother", "Mother"),
    Kleinzoon("com.rcs.ind.relation.grandson", "GrandSon"),
    Kleindochter("com.rcs.ind.relation.granddaughter", "GrandDaughter"),
    Grootvader("com.rcs.ind.relation.grandfather", "GrandFather"),
    Grootmoeder("com.rcs.ind.relation.grandmother", "GrandMother"),
    ;

    private static final Map<String, RelationEnum> lookupIndigoKey = new HashMap<>();

    private final String key;
    private final String indigoKey;

    RelationEnum(String key, String indigoKey) {
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
        for (RelationEnum re : RelationEnum.values()) {
            lookupIndigoKey.put(re.getIndigoKey(), re);
        }
    }

    public static RelationEnum getByIndigoKey(String value) {
        if (lookupIndigoKey.get(value) == null) {
            return RelationEnum.Unknown;
        }
        return lookupIndigoKey.get(value);
    }
}
