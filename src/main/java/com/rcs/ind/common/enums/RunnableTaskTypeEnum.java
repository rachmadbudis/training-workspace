package com.rcs.ind.common.enums;

public enum RunnableTaskTypeEnum {
    HVZ_FORMS(""),
    HVZ_GO_PACKAGE(""),
    HVZ_BRP(""),
    HVZ_DEFINITIVE_LIST(""),
    ;

    private final String key;

    RunnableTaskTypeEnum(String key) {
        this.key = key;
    }

    public String getKey() {
        return key;
    }
}
