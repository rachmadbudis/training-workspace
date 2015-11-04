package com.rcs.ind.common.dtos;

import java.util.Date;
import java.util.Locale;


public class ApplicationGridDTO extends GenericEntityDTO {
	
	private Long applicationId;
	private String smartflowNumber;
	private Date startDate;
	private Date endDate;
	private Locale language;
	
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
}
