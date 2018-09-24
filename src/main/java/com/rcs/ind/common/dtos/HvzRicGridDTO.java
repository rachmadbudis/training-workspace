package com.rcs.ind.common.dtos;

import com.rcs.ind.common.enums.RicStatusEnum;

public class HvzRicGridDTO {
    private String vNumber;
    private String caseNumber;
    private String nationality;
    private String residence;
    private String birthplace;
    private String assignee;
    private RicStatusEnum status;

    public String getvNumber() {
        return vNumber;
    }

    public void setvNumber(String vNumber) {
        this.vNumber = vNumber;
    }

    public String getCaseNumber() {
        return caseNumber;
    }

    public void setCaseNumber(String caseNumber) {
        this.caseNumber = caseNumber;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getResidence() {
        return residence;
    }

    public void setResidence(String residence) {
        this.residence = residence;
    }

    public String getBirthplace() {
        return birthplace;
    }

    public void setBirthplace(String birthplace) {
        this.birthplace = birthplace;
    }

    public String getAssignee() {
        return assignee;
    }

    public void setAssignee(String assignee) {
        this.assignee = assignee;
    }

    public RicStatusEnum getStatus() {
        return status;
    }

    public void setStatus(RicStatusEnum status) {
        this.status = status;
    }
}
