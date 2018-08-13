package com.rcs.ind.common.entities.dtos;

import com.rcs.ind.common.dtos.GenericEntityDTO;

import java.util.Date;

public class MissionDTO extends GenericEntityDTO {
    private Long missionId;
    private String name;
    private Date startDate;

    public MissionDTO() {
    }

    public MissionDTO(Long missionId) {
        this.missionId = missionId;
    }

    public Long getMissionId() {
        return missionId;
    }

    public void setMissionId(long missionId) {
        this.missionId = missionId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }
}

