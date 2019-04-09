package com.rcs.ind.common.dtos;

import com.rcs.ind.common.entities.dtos.GeneralDocumentDTO;
import com.rcs.ind.common.enums.RunnableTaskStatusEnum;

public class MissionFileDTO extends GeneralDocumentDTO {
    private RunnableTaskStatusEnum status;
    private String notes;

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
