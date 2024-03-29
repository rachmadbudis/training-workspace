package com.rcs.ind.common.enums;

public enum StatisticReportHeaderEnum {
    SMARTFLOW_NUMBER("com.rcs.ind.application.label.smartflownumber"),
    STEP("com.rcs.ind.application.label.step"),
    STATUS("com.rcs.ind.marketplace.status"),
    NATIONALITY("com.rcs.ind.application.label.nationality"),
    LANGUAGE("com.rcs.ind.application.label.language"),
    LOCATION("com.rcs.ind.application.label.location"),
    TRACK("com.rcs.ind.application.label.track"),
    START_DATE("com.rcs.ind.common.date.start"),
    END_DATE("com.rcs.ind.common.date.end"),
    PREPARATION_LOCATION("com.rcs.ind.common.preparation.location");

    private final String key;

    StatisticReportHeaderEnum(String key) {
        this.key = key;
    }

    public String getKey() {
        return key;
    }
}
