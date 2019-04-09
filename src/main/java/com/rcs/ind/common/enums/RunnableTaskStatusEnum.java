package com.rcs.ind.common.enums;

public enum RunnableTaskStatusEnum {
    RUNNING("com.rcs.ind.runnable.status.running"),
    FINISHED("com.rcs.ind.runnable.status.finished"),
    ERROR("com.rcs.ind.runnable.status.error"),
    ;

    private final String key;

    RunnableTaskStatusEnum(String key) {
        this.key = key;
    }

    public String getKey() {
        return key;
    }
}
