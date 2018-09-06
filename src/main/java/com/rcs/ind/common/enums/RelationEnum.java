package com.rcs.ind.common.enums;

public enum RelationEnum {
    Unknown("com.rcs.ind.relation.unknown", ""),
    Husband("com.rcs.ind.relation.husband", "Husband"),
    Wife("com.rcs.ind.relation.wife", "Wife"),
    Father("com.rcs.ind.relation.father", "Father"),
    Mother("com.rcs.ind.relation.mother", "Mother"),
    Daughter("com.rcs.ind.relation.daughter", "Daughter"),
    Son("com.rcs.ind.relation.son", "Son"),
    GrandSon("com.rcs.ind.relation.grandson", "GrandSon"),
    GrandDaughter("com.rcs.ind.relation.granddaughter", "GrandDaughter");

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


}
