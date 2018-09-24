package com.rcs.ind.common.filters.dtos;

import com.rcs.ind.common.dtos.PaginationFiltersDTO;
import com.rcs.ind.common.enums.HvzRicStatusEnum;
import com.rcs.ind.common.enums.RelationEnum;

public class HvzRicFiltersDTO extends PaginationFiltersDTO {
    private Boolean ricApplicable;
    private String assignee;
    private HvzRicStatusEnum hvzRicStatus;

    private RelationEnum relation;

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

    public RelationEnum getRelation() {
        return relation;
    }

    public void setRelation(RelationEnum relation) {
        this.relation = relation;
    }
}
