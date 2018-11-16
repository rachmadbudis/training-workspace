package com.rcs.ind.common.dtos;

import java.util.Date;

public class MissionGridDTO {
    private Long missionId;
    private String name;
    private String targetGroup;
    private boolean customerExists;
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

    public boolean getCustomerExists() {
        return customerExists;
    }

    public void setCustomerExists(boolean customerExists) {
        this.customerExists = customerExists;
    }

	
	public Date getRicEndDate() {
		return ricEndDate;
	}

	
	public void setRicEndDate(Date ricEndDate) {
		this.ricEndDate = ricEndDate;
	}

}
