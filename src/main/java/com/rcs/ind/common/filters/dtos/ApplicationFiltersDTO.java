package com.rcs.ind.common.filters.dtos;

import java.util.Locale;

import com.rcs.ind.common.dtos.PaginationFiltersDTO;

public class ApplicationFiltersDTO extends PaginationFiltersDTO {

	private Long applicationId;
	private String smartflowNumber;
	private Locale language;
	private Long userId;

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

	public Locale getLanguage() {
		return language;
	}

	public void setLanguage(Locale language) {
		this.language = language;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

}
