package com.rcs.ind.common.filters.dtos;

import com.rcs.ind.common.dtos.PaginationFiltersDTO;
import com.rcs.ind.common.enums.HvzRicStatusEnum;

public class HvzRicFiltersDTO extends PaginationFiltersDTO {
    private Boolean ricApplicable;
    private String assignee;
    private HvzRicStatusEnum hvzRicStatus;
    private String relation;
    private String vNumber;
    private String caseNumber;
    private String placeOfBirth;
    private String missionName;
    private String countryOfBirth;

   

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

    public String getRelation() {
        return relation;
    }

    public void setRelation(String relation) {
        this.relation = relation;
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

	
	public String getPlaceOfBirth() {
		return placeOfBirth;
	}

	
	public void setPlaceOfBirth(String placeOfBirth) {
		this.placeOfBirth = placeOfBirth;
	}

	
	public String getMissionName() {
		return missionName;
	}

	
	public void setMissionName(String missionName) {
		this.missionName = missionName;
	}

	public String getCountryOfBirth() {
		return countryOfBirth;
	}

	public void setCountryOfBirth(String countryOfBirth) {
		this.countryOfBirth = countryOfBirth;
	}
}
