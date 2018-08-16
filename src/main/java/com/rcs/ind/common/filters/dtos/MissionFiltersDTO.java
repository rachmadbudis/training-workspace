package com.rcs.ind.common.filters.dtos;

import com.rcs.ind.common.dtos.PaginationFiltersDTO;

import java.util.Date;

public class MissionFiltersDTO extends PaginationFiltersDTO {
    String[] targetGroups;
    Date startDate;
    Date endDate;

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
}
