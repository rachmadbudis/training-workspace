package com.rcs.ind.common.dtos;

public class FormIframeDTO {

	private Long applicationId;
	private String smartflowNumber;
	private String iframeUrl;
	
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

	public String getIframeUrl() {
		return iframeUrl;
	}

	public void setIframeUrl(String iframeUrl) {
		this.iframeUrl = iframeUrl;
	}
}
