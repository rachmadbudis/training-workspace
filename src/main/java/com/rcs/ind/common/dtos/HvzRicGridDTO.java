package com.rcs.ind.common.dtos;

import com.rcs.ind.common.enums.HvzRicStatusEnum;

public class HvzRicGridDTO {
    private Long customerId;
    private String vNumber;
    private String caseNumber;
    private String nationality;
    private String residence;
    private String birthPlace;
    private String birthCountry;
    private String assignee;
    private HvzRicStatusEnum hvzRicStatus;

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

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

    public String getBirthPlace() {
        return birthPlace;
    }

    public void setBirthPlace(String birthPlace) {
        this.birthPlace = birthPlace;
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

	
	public String getBirthCountry() {
		return birthCountry;
	}

	
	public void setBirthCountry(String birthCountry) {
		this.birthCountry = birthCountry;
	}
}
