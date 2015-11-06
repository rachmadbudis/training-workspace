package com.rcs.ind.common.dtos;

import java.util.Date;
import java.util.Locale;

import com.rcs.ind.common.enums.ApplicationStatusEnum;


public class ApplicationGridDTO extends GenericEntityDTO {
	
	private Long applicationId;
	private String smartflowNumber;
	private Date startDate;
	private Date endDate;
	private Locale language;
	private ApplicationStatusEnum status;
	private Date appCreatedDate;
	
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
	
	public Date getStartDate() {
		return startDate;
	}

	
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	
	public Date getEndDate() {
		return endDate;
	}

	
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	
	public Locale getLanguage() {
		return language;
	}

	public void setLanguage(Locale language) {
		this.language = language;
	}

	public Date getAppCreatedDate() {
		return appCreatedDate;
	}

	public void setAppCreatedDate(Date appCreatedDate) {
		this.appCreatedDate = appCreatedDate;
	}

	public ApplicationStatusEnum getStatus() {
		return status;
	}

	public void setStatus(ApplicationStatusEnum status) {
		this.status = status;
	}
}
