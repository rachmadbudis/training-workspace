package com.rcs.ind.common.filters.dtos;

import com.rcs.ind.common.dtos.PaginationFiltersDTO;

import java.util.Date;

public class MissionFiltersDTO extends PaginationFiltersDTO {
    private String[] targetGroups;
    private Date startDate;
    private Date endDate;
    private Boolean excludeEmpty;
    private Long missionId;
    private String[] missionNames;

    public String[] getTargetGroups() {
        return targetGroups;
    }

    public void setTargetGroups(String[] targetGroups) {
        this.targetGroups = targetGroups;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Boolean getExcludeEmpty() {
        return excludeEmpty;
    }

    public void setExcludeEmpty(Boolean excludeEmpty) {
        this.excludeEmpty = excludeEmpty;
    }

    public Long getMissionId() {
        return missionId;
    }

    public void setMissionId(Long missionId) {
        this.missionId = missionId;
    }
    
    public String[] getMissionNames() {
    	return missionNames;
    }

    public void setMissionNames(String[] missionNames) {
    	this.missionNames = missionNames;
    }
}
