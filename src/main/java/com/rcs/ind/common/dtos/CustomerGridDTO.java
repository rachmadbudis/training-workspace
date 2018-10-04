package com.rcs.ind.common.dtos;

import com.rcs.ind.common.enums.HvzRicStatusEnum;
import com.rcs.ind.common.enums.RelationEnum;

import java.util.Date;
import java.util.Locale;

public class CustomerGridDTO implements Comparable<CustomerGridDTO> {
    private Long customerId;
    private String ricResult;
    private String caseNumber;
    private String vNumber;
    private String firstName;
    private String lastName;
    private Date dateOfBirth;
    private RelationEnum relativeType;
    private String nationality;
    private Locale language;
    private String settlementResult; //TODO: Change to enum
    private HvzRicStatusEnum hvzRicStatus;
    private Long documentId;

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

    public Locale getLanguage() {
        return language;
    }

    public void setLanguage(Locale language) {
        this.language = language;
    }

    public String getSettlementResult() {
        return settlementResult;
    }

    public void setSettlementResult(String settlementResult) {
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

    @Override
    public int compareTo(CustomerGridDTO o) {
        if (this.getCaseNumber().compareToIgnoreCase(o.getCaseNumber()) > 0) return 1;
        else if (this.getCaseNumber().compareToIgnoreCase(o.getCaseNumber()) < 0) return -1;
        else {
            if (this.getRelativeType().ordinal() > o.getRelativeType().ordinal()) return 1;
            if (this.getRelativeType().ordinal() < o.getRelativeType().ordinal()) return -1;
            else return 0;
        }
    }
}
