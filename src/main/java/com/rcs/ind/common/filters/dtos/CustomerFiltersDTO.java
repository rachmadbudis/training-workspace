package com.rcs.ind.common.filters.dtos;

import com.rcs.ind.common.dtos.PaginationFiltersDTO;

public class CustomerFiltersDTO extends PaginationFiltersDTO {
    String mission;

    public String getMission() {
        return mission;
    }

    public void setMission(String mission) {
        this.mission = mission;
    }
}
