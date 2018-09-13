package com.rcs.ind.common.entities.dtos;

import com.rcs.ind.common.dtos.GenericEntityDTO;
import com.rcs.ind.common.enums.ApprovalStatusEnum;
import com.rcs.ind.common.enums.RelationEnum;

import java.util.Date;
import java.util.Locale;

public class CustomerDTO extends GenericEntityDTO {

    private long customerId;
    private String ricResult;
    private String vNumber;
    private String zNumber;
    private String firstName;
    private String lastName;
    private Date dateOfBirth;
    private String gender;
    private String caseNumber;
    private String nationality;
    private String maritalStatus;
    private Locale language;
    private String approvalGrounds;
    private String birthPlace;
    private String birthCountry;
    private String selectionMode;
    private String quotaYear;
    private String decisionScreener;
    private Date flightDate;
    private String remarks;
    private Locale spokenLanguage;
    private String countryOfResidence;
    private String crossReference;
    private RelationEnum relation;
    private String missionName;
    private String comments;

    private ApprovalStatusEnum approvalStatus;

    public long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(long customerId) {
        this.customerId = customerId;
    }

    public String getRicResult() {
        return ricResult;
    }

    public void setRicResult(String ricResult) {
        this.ricResult = ricResult;
    }

    public String getvNumber() {
        return vNumber;
    }

    public void setvNumber(String vNumber) {
        this.vNumber = vNumber;
    }

    public String getzNumber() {
        return zNumber;
    }

    public void setzNumber(String zNumber) {
        this.zNumber = zNumber;
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

    public Locale getLanguage() {
        return language;
    }

    public void setLanguage(Locale language) {
        this.language = language;
    }

    public String getApprovalGrounds() {
        return approvalGrounds;
    }

    public void setApprovalGrounds(String approvalGrounds) {
        this.approvalGrounds = approvalGrounds;
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

    public String getSelectionMode() {
        return selectionMode;
    }

    public void setSelectionMode(String selectionMode) {
        this.selectionMode = selectionMode;
    }

    public String getQuotaYear() {
        return quotaYear;
    }

    public void setQuotaYear(String quotaYear) {
        this.quotaYear = quotaYear;
    }

    public String getDecisionScreener() {
        return decisionScreener;
    }

    public void setDecisionScreener(String decisionScreener) {
        this.decisionScreener = decisionScreener;
    }

    public Date getFlightDate() {
        return flightDate;
    }

    public void setFlightDate(Date flightDate) {
        this.flightDate = flightDate;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public Locale getSpokenLanguage() {
        return spokenLanguage;
    }

    public void setSpokenLanguage(Locale spokenLanguage) {
        this.spokenLanguage = spokenLanguage;
    }

    public String getCountryOfResidence() {
        return countryOfResidence;
    }

    public void setCountryOfResidence(String countryOfResidence) {
        this.countryOfResidence = countryOfResidence;
    }

    public String getCrossReference() {
        return crossReference;
    }

    public void setCrossReference(String crossReference) {
        this.crossReference = crossReference;
    }

    public ApprovalStatusEnum getApprovalStatus() {
        return approvalStatus;
    }

    public void setApprovalStatus(ApprovalStatusEnum approvalStatus) {
        this.approvalStatus = approvalStatus;
    }

    public RelationEnum getRelation() {
        return relation;
    }

    public void setRelation(RelationEnum relation) {
        this.relation = relation;
    }

    public String getMissionName() {
        return missionName;
    }

    public void setMissionName(String missionName) {
        this.missionName = missionName;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }
}