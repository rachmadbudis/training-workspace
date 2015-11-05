package com.rcs.ind.common.filters.dtos;

import java.util.Date;
import java.util.List;
import java.util.Locale;

import com.rcs.ind.common.dtos.PaginationFiltersDTO;
import com.rcs.ind.common.enums.ApplicationStatusEnum;

public class ApplicationHistoryFiltersDTO extends PaginationFiltersDTO {

	private Long applicationHistoryId;
	private List<ApplicationStatusEnum> statuses;
	private Date startDate;
	private Date endDate;
	private Long applicationId;
	private String smartflowNumber;
	private Locale language;
	private Long assignedUserId;

	public Long getApplicationHistoryId() {
		return applicationHistoryId;
	}

	public void setApplicationHistoryId(Long applicationHistoryId) {
		this.applicationHistoryId = applicationHistoryId;
	}

	public List<ApplicationStatusEnum> getStatuses() {
		return statuses;
	}

	public void setStatuses(List<ApplicationStatusEnum> statuses) {
		this.statuses = statuses;
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

	public Long getApplicationId() {
		return applicationId;
	}

	public void setApplicationId(Long applicationId) {
		this.applicationId = applicationId;
	}

	public Long getAssignedUserId() {
		return assignedUserId;
	}

	public void setAssignedUserId(Long assignedUserId) {
		this.assignedUserId = assignedUserId;
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
}
