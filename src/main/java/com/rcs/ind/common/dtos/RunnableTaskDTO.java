package com.rcs.ind.common.dtos;

import com.rcs.ind.common.enums.RunnableTaskStatusEnum;
import com.rcs.ind.common.enums.RunnableTaskTypeEnum;

public class RunnableTaskDTO {
    private RunnableTaskTypeEnum type;
    private RunnableTaskStatusEnum status;
    private String notes;

    public RunnableTaskTypeEnum getType() {
        return type;
    }

    public void setType(RunnableTaskTypeEnum type) {
        this.type = type;
    }

    public RunnableTaskStatusEnum getStatus() {
        return status;
    }

    public void setStatus(RunnableTaskStatusEnum status) {
        this.status = status;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }
}
