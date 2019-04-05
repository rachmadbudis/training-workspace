package com.rcs.ind.common.dtos;

import com.rcs.ind.common.entities.dtos.GeneralDocumentDTO;

public class MissionFileDTO extends GeneralDocumentDTO {
    private String status;
    private String notes;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }
}
