package com.rcs.ind.common.enums;

import java.util.HashMap;
import java.util.Map;

public enum RelationEnum {
    Unknown("com.rcs.ind.relation.unknown", ""),
    PRA("com.rcs.ind.relation.pra", "PRA"),
    Husband("com.rcs.ind.relation.husband", "Echtgenoot"),
    Wife("com.rcs.ind.relation.wife", "Echtgenote"),
    HusbandWife("com.rcs.ind.relation.husbandwife", "Echtgeno(o)t(e)"),
    Partner("com.rcs.ind.relation.partner", "Partner"),
    Son("com.rcs.ind.relation.son", "Zoon"),
    Daughter("com.rcs.ind.relation.daughter", "Dochter"),
    Child("com.rcs.ind.relation.child", "Kind"),
    BiologicalChild("com.rcs.ind.relation.biological.child", "Biologisch kind"),
    Father("com.rcs.ind.relation.father", "Vader"),
    Mother("com.rcs.ind.relation.mother", "Moeder"),
    GrandSon("com.rcs.ind.relation.grandson", "GrandSon"),
    GrandDaughter("com.rcs.ind.relation.granddaughter", "GrandDaughter"),
    GrandFather("com.rcs.ind.relation.grandfather", "GrandFather"),
    GrandMother("com.rcs.ind.relation.grandmother", "GrandMother"),
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
    	if(lookupIndigoKey.get(value)!=null) return lookupIndigoKey.get(value);
    	else return Unknown;
    }
    
}
