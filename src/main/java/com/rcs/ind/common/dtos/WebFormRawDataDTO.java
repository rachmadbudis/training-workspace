package com.rcs.ind.common.dtos;

import java.util.Map;

public class WebFormRawDataDTO {

	private Long applicationId;
	private Long webFormId;
	private Map<String, String> data;

	public Long getApplicationId() {
		return applicationId;
	}

	public void setApplicationId(Long applicationId) {
		this.applicationId = applicationId;
	}

	public Long getWebFormId() {
		return webFormId;
	}

	public void setWebFormId(Long webFormId) {
		this.webFormId = webFormId;
	}

	public Map<String, String> getData() {
		return data;
	}

	public void setData(Map<String, String> data) {
		this.data = data;
	}

}
