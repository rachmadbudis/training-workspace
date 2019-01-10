package com.rcs.ind.common.entities.dtos;

public class HvzRicDocumentDTO extends GeneralDocumentDTO {
    private String caseNumber;

    public String getCaseNumber() {
        return caseNumber;
    }

    public void setCaseNumber(String caseNumber) {
        this.caseNumber = caseNumber;
    }
}