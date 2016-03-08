package com.rcs.ind.common.dtos;

import java.util.Map;

public class WebFormRawDataDTO {

	private Long applicationId;
	private Map<String, String> data;

	public WebFormRawDataDTO() {
	}

	public WebFormRawDataDTO(Long applicationId, Map<String, String> data) {
		this.applicationId = applicationId;
		this.data = data;
	}

	public Long getApplicationId() {
		return applicationId;
	}

	public void setApplicationId(Long applicationId) {
		this.applicationId = applicationId;
	}

	public Map<String, String> getData() {
		return data;
	}

	public void setData(Map<String, String> data) {
		this.data = data;
	}

}
