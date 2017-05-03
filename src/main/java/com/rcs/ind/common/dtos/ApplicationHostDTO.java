package com.rcs.ind.common.dtos;

import java.util.Locale;

import com.rcs.ind.common.enums.ApplicationStatusEnum;

public class ApplicationHostDTO {

	private Long applicationId;
	private String smartflowNumber;
	private ApplicationStatusEnum status;
	private Boolean priority;
	private Locale language;
	private String nationality;
	private Boolean isPaperApplication;
	private Boolean isSafeCountry;

	public Long getApplicationId() {
		return applicationId;
	}

	public void setApplicationId(Long applicationId) {
		this.applicationId = applicationId;
	}

	public String getSmartflowNumber() {
		return smartflowNumber;
	}

	public void setSmartflowNumber(String smartflowNumber) {
		this.smartflowNumber = smartflowNumber;
	}

	public ApplicationStatusEnum getStatus() {
		return status;
	}

	public void setStatus(ApplicationStatusEnum status) {
		this.status = status;
	}

	public Boolean getPriority() {
		return priority;
	}

	public void setPriority(Boolean priority) {
		this.priority = priority;
	}

	public Locale getLanguage() {
		return language;
	}

	public void setLanguage(Locale language) {
		this.language = language;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	
	public Boolean getIsPaperApplication() {
		return isPaperApplication;
	}

	public void setIsPaperApplication(Boolean isPaperApplication) {
		this.isPaperApplication = isPaperApplication;
	}
	public Boolean getIsSafeCountry() {
		return isSafeCountry;
	}

	public void setIsSafeCountry(Boolean isSafeCountry) {
		this.isSafeCountry = isSafeCountry;
	}
}
