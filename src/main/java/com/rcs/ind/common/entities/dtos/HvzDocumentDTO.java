package com.rcs.ind.common.entities.dtos;

public class HvzDocumentDTO extends GeneralDocumentDTO {

    MissionDTO mission;

    public HvzDocumentDTO() {
    }

    public MissionDTO getMission() {
        return mission;
    }

    public void setMission(MissionDTO mission) {
        this.mission = mission;
    }
}