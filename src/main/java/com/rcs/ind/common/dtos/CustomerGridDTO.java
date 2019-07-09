package com.rcs.ind.common.dtos;

import java.util.Date;

import com.rcs.ind.common.enums.HvzRicStatusEnum;
import com.rcs.ind.common.enums.RelationEnum;
import com.rcs.ind.common.enums.SettlementResultEnum;

public class CustomerGridDTO {
    private Long customerId;
    private String ricResult;
    private String caseNumber;
    private String vNumber;
    private String firstName;
    private String lastName;
    private Date dateOfBirth;
    private RelationEnum relativeType;
    private String nationality;
    private String language;
    private SettlementResultEnum settlementResult;
    private HvzRicStatusEnum hvzRicStatus;
    private Long documentId;
    private String errorMessage;
    private Boolean formsGenerated;

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

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public SettlementResultEnum getSettlementResult() {
        return settlementResult;
    }

    public void setSettlementResult(SettlementResultEnum settlementResult) {
        this.settlementResult = settlementResult;
    }

    public HvzRicStatusEnum getHvzRicStatus() {
        return hvzRicStatus;
    }

    public void setHvzRicStatus(HvzRicStatusEnum hvzRicStatus) {
        this.hvzRicStatus = hvzRicStatus;
    }

    public Long getDocumentId() {
        return documentId;
    }

    public void setDocumentId(Long documentId) {
        this.documentId = documentId;
    }

    public Boolean getFormsGenerated() {
        return formsGenerated;
    }

    public void setFormsGenerated(Boolean formsGenerated) {
        this.formsGenerated = formsGenerated;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

}
