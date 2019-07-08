package com.rcs.ind.common.entities.dtos;

import java.util.Date;
import java.util.List;

import com.rcs.ind.common.dtos.GenericEntityDTO;
import com.rcs.ind.common.enums.ApprovalStatusEnum;
import com.rcs.ind.common.enums.HvzRicStatusEnum;
import com.rcs.ind.common.enums.SettlementResultEnum;

public class CustomerDTO extends GenericEntityDTO {

    private long customerId;
    private String zNumber;
    private String iNumber;
    private String vNumber;
    private String firstName;
    private String prefix;
    private String lastName;
    private Date dateOfBirth;
    private Date flightDate;
    private String gender;
    private String caseNumber;
    private String nationality;
    private String maritalStatus;
    private String treatmentResult;
    private SettlementResultEnum settlementResult;
    private String selectionMode;
    private String birthPlace;
    private String birthCountry;
    private String countryOfOrigin;
    private String placeOfOrigin; 
    private String relation;
    private String language;
    private String spokenLanguage;
    private String missionName;
    private String remarks;
    private List<String> comments;
    private Boolean ricApplicable;
    private String assignee;
    private HvzRicStatusEnum hvzRicStatus;
    private String fileName;
    private byte[] file;
    private ApprovalStatusEnum approvalStatus;
    private Date legalStartDate;
    private String RFFDocumentId;
    private String RFFDocumentName;
    private Boolean formsGenerated;
    private Long ricDocumentId;
    
    public long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(long customerId) {
        this.customerId = customerId;
    }

    public String getzNumber() {
        return zNumber;
    }

    public void setzNumber(String zNumber) {
        this.zNumber = zNumber;
    }

    public String getvNumber() {
        return vNumber;
    }

    public void setvNumber(String vNumber) {
        this.vNumber = vNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
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

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public String getTreatmentResult() {
        return treatmentResult;
    }

    public void setTreatmentResult(String treatmentResult) {
        this.treatmentResult = treatmentResult;
    }

    public SettlementResultEnum getSettlementResult() {
        return settlementResult;
    }

    public void setSettlementResult(SettlementResultEnum settlementResult) {
        this.settlementResult = settlementResult;
    }

    public String getSelectionMode() {
        return selectionMode;
    }

    public void setSelectionMode(String selectionMode) {
        this.selectionMode = selectionMode;
    }

    public String getBirthPlace() {
        return birthPlace;
    }

    public void setBirthPlace(String birthPlace) {
        this.birthPlace = birthPlace;
    }

    public String getBirthCountry() {
        return birthCountry;
    }

    public void setBirthCountry(String birthCountry) {
        this.birthCountry = birthCountry;
    }

    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }

    public void setCountryOfOrigin(String countryOfOrigin) {
        this.countryOfOrigin = countryOfOrigin;
    }

    public String getPlaceOfOrigin() {
		return placeOfOrigin;
	}

	public void setPlaceOfOrigin(String placeOfOrigin) {
		this.placeOfOrigin = placeOfOrigin;
	}

	public String getRelation() {
        return relation;
    }

    public void setRelation(String relation) {
        this.relation = relation;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getMissionName() {
        return missionName;
    }

    public void setMissionName(String missionName) {
        this.missionName = missionName;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public ApprovalStatusEnum getApprovalStatus() {
        return approvalStatus;
    }

    public void setApprovalStatus(ApprovalStatusEnum approvalStatus) {
        this.approvalStatus = approvalStatus;
    }

    public List<String> getComments() {
        return comments;
    }

    public void setComments(List<String> comments) {
        this.comments = comments;
    }

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

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public byte[] getFile() {
        return file;
    }

    public void setFile(byte[] file) {
        this.file = file;
    }

    public String getSpokenLanguage() {
        return spokenLanguage;
    }

    public void setSpokenLanguage(String spokenLanguage) {
        this.spokenLanguage = spokenLanguage;
    }

    public Date getFlightDate() {
        return flightDate;
    }

    public void setFlightDate(Date flightDate) {
        this.flightDate = flightDate;
    }
	
	public String getiNumber() {
		return iNumber;
	}

	public void setiNumber(String iNumber) {
		this.iNumber = iNumber;
	}

	public String getPrefix() {
		return prefix;
	}

	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}
	public Date getLegalStartDate() {
		return legalStartDate;
	}
	
	public void setLegalStartDate(Date legalStartDate) {
		this.legalStartDate = legalStartDate;
	}

    public String getRFFDocumentId() {
        return RFFDocumentId;
    }

    public void setRFFDocumentId(String RFFDocumentId) {
        this.RFFDocumentId = RFFDocumentId;
    }

	
	public String getRFFDocumentName() {
		return RFFDocumentName;
	}

	
	public void setRFFDocumentName(String rFFDocumentName) {
		RFFDocumentName = rFFDocumentName;
	}

    public Boolean getFormsGenerated() {
        return formsGenerated;
    }

    public void setFormsGenerated(Boolean formsGenerated) {
        this.formsGenerated = formsGenerated;
    }

    public Long getRicDocumentId() {
        return ricDocumentId;
    }

    public void setRicDocumentId(Long ricDocumentId) {
        this.ricDocumentId = ricDocumentId;
    }
}