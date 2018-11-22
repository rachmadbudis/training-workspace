package com.rcs.ind.common.dtos;

import java.util.Date;

public class MissionGridDTO {
    private Long missionId;
    private String name;
    private String targetGroup;
    private Boolean customerExists;
    private Boolean finished;
    private Boolean closed;
    private Date ricEndDate;

    public Long getMissionId() {
        return missionId;
    }

    public void setMissionId(Long missionId) {
        this.missionId = missionId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTargetGroup() {
        return targetGroup;
    }

    public void setTargetGroup(String targetGroup) {
        this.targetGroup = targetGroup;
    }

    public Boolean getCustomerExists() {
        return customerExists;
    }

    public void setCustomerExists(Boolean customerExists) {
        this.customerExists = customerExists;
    }

    public Boolean getFinished() {
        return finished;
    }

    public void setFinished(Boolean finished) {
        this.finished = finished;
    }

    public Boolean getClosed() {
        return closed;
    }

    public void setClosed(Boolean closed) {
        this.closed = closed;
    }

    public Date getRicEndDate() {
		return ricEndDate;
	}

	
	public void setRicEndDate(Date ricEndDate) {
		this.ricEndDate = ricEndDate;
	}

}
