package com.rcs.ind.common.enums;

public enum ApplicationStepEnum {
    New("AF"),
    Translated("VAF"),
    RicCreated("RIC"),
    Prepared("Voorbereiding"),
    Interviewed("Gehoor"),
    Indigo("Indigo");
    
    private final String key;
    
    ApplicationStepEnum(String key) {
        this.key = key;
    }
    
    public String getKey() {
        return key;
    }
}
