package com.rcs.ind.common.entities.dtos;

import com.rcs.ind.common.dtos.GenericEntityDTO;

import java.util.Date;

public class MissionDTO extends GenericEntityDTO {
    private long missionId;
    private String name;
    private Date missionDate;
    private String status;
    private String targetGroup;
    private String groupNumber;
    private Date ricEndDate;

    public MissionDTO() {
    }

    public MissionDTO(long missionId) {
        this.missionId = missionId;
    }

    public long getMissionId() {
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

    public Date getMissionDate() {
        return missionDate;
    }

    public void setMissionDate(Date missionDate) {
        this.missionDate = missionDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTargetGroup() {
        return targetGroup;
    }

    public void setTargetGroup(String targetGroup) {
        this.targetGroup = targetGroup;
    }

    public String getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(String groupNumber) {
        this.groupNumber = groupNumber;
    }

	
	public Date getRicEndDate() {
		return ricEndDate;
	}

	
	public void setRicEndDate(Date ricEndDate) {
		this.ricEndDate = ricEndDate;
	}
}

