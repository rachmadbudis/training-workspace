package com.rcs.ind.common.enums;

public enum ApplicationResultEnum {
    SUCCESS("com.rcs.ind.application.result.success"),
    FAILED("com.rcs.ind.application.result.failed");
    
    private final String key;
    
    ApplicationResultEnum(String key) {
        this.key = key;
    }
    
    public String getKey() {
        return key;
    }
    
}
