package com.rcs.ind.common.entities.dtos;

import com.rcs.ind.common.dtos.GenericEntityDTO;
import com.rcs.ind.common.enums.ApprovalStatusEnum;

public class CustomerDTO extends GenericEntityDTO {

	private long customerId;

	private boolean ricApplicable;

	private String caseNumber;

	private String vNumber;

	private String firstName;

	private String birthDate;

	private String lastName;

	private String birthPlace;

	private String residence;

	private ApprovalStatusEnum approvalStatus;

	public CustomerDTO() {
	}

	public CustomerDTO(long customerId) {
		this.customerId = customerId;
	}

	public long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}

	public boolean isRicApplicable() {
		return ricApplicable;
	}

	public void setRicApplicable(boolean ricApplicable) {
		this.ricApplicable = ricApplicable;
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

	public String getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getBirthPlace() {
		return birthPlace;
	}

	public void setBirthPlace(String birthPlace) {
		this.birthPlace = birthPlace;
	}

	public String getResidence() {
		return residence;
	}

	public void setResidence(String residence) {
		this.residence = residence;
	}

	public ApprovalStatusEnum getApprovalStatus() {
		return approvalStatus;
	}

	public void setApprovalStatus(ApprovalStatusEnum approvalStatus) {
		this.approvalStatus = approvalStatus;
	}
}