package com.rcs.ind.common.dtos;

import com.rcs.ind.common.enums.RelationEnum;

import java.util.Date;
import java.util.Locale;

public class CustomerGridDTO {
    private Long customerId;
    private String ricResult;
    private String caseNumber;
    private String vNumber;
    private String firstName;
    private String lastName;
    private Date dateOfBirth;
    private RelationEnum relativeType;
    private Locale language;
    private String approvalGrounds; //TODO: Change to enum

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public String getRicResult() {
        return ricResult;
    }

    public void setRicResult(String ricResult) {
        this.ricResult = ricResult;
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

    public RelationEnum getRelativeType() {
        return relativeType;
    }

    public void setRelativeType(RelationEnum relativeType) {
        this.relativeType = relativeType;
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
}
