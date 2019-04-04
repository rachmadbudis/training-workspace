package com.rcs.ind.common.dtos;

import com.rcs.ind.common.entities.dtos.GeneralDocumentDTO;

public class MissionFileDTO extends GeneralDocumentDTO {
    private String note;

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
