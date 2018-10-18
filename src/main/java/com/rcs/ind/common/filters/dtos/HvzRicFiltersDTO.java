package com.rcs.ind.common.filters.dtos;

import com.rcs.ind.common.dtos.PaginationFiltersDTO;
import com.rcs.ind.common.enums.HvzRicStatusEnum;

public class HvzRicFiltersDTO extends PaginationFiltersDTO {
    private Boolean ricApplicable;
    private String assignee;
    private HvzRicStatusEnum hvzRicStatus;

    private String relation;

    public Boolean getRicApplicable() {
        return ricApplicable;
    }

    public void setRicApplicable(Boolean ricApplicable) {
        this.ricApplicable = ricApplicable;
    }

    public String getAssignee() {
        return assignee;
    }

    public void setAssignee(String assignee) {
        this.assignee = assignee;
    }

    public HvzRicStatusEnum getHvzRicStatus() {
        return hvzRicStatus;
    }

    public void setHvzRicStatus(HvzRicStatusEnum hvzRicStatus) {
        this.hvzRicStatus = hvzRicStatus;
    }

    public String getRelation() {
        return relation;
    }

    public void setRelation(String relation) {
        this.relation = relation;
    }
}
