package com.rcs.ind.common.dtos;


public class ApplicationGridDTO extends GenericEntityDTO {
	
	private Long applicationId;
	private String smartflowNumber;
	
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
}
