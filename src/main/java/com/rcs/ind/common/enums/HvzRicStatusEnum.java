package com.rcs.ind.common.enums;

public enum HvzRicStatusEnum {
    EMPTY("com.rcs.ind.hvz.ric.status.empty"),
    IN_PROGRESS("com.rcs.ind.hvz.ric.status.inprogress"),
    FINISHED("com.rcs.ind.hvz.ric.status.finished"),
    ;
    private final String key;

    HvzRicStatusEnum(String key) {
        this.key = key;
    }

    public String getKey() {
        return key;
    }
}
