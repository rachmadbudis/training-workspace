package com.rcs.ind.common.filters.dtos;

import com.rcs.ind.common.dtos.PaginationFiltersDTO;
import com.rcs.ind.common.enums.RelationEnum;

import java.util.Date;

public class CustomerFiltersDTO extends PaginationFiltersDTO {
    private String mission;
    private String caseNumber;
    private String vNumber;
    private String lastName;
    private Date dateOfBirth;
    private RelationEnum relationEnum;

    public String getMission() {
        return mission;
    }

    public void setMission(String mission) {
        this.mission = mission;
    }

    public String getCaseNumber() {
        return caseNumber;
    }

    public void setCaseNumber(String caseNumber) {
        this.caseNumber = caseNumber;
    }

    public String getvNumber() {
        return vNumber;
    }

    public void setvNumber(String vNumber) {
        this.vNumber = vNumber;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public RelationEnum getRelationEnum() {
        return relationEnum;
    }

    public void setRelationEnum(RelationEnum relationEnum) {
        this.relationEnum = relationEnum;
    }
}
