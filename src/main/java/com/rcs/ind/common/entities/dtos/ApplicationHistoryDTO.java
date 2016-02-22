package com.rcs.ind.common.entities.dtos;

import java.util.Date;

import com.rcs.ind.common.enums.ApplicationStatusEnum;

public class ApplicationHistoryDTO {

	private Long applicationHistoryId;
	private ApplicationStatusEnum status;
	private Date startDate;
	private Date endDate;
	private ApplicationDTO application;
	private UserProfileDTO assignedUser;

	public ApplicationHistoryDTO() {
	}

	public ApplicationHistoryDTO(ApplicationDTO application, ApplicationStatusEnum status, UserProfileDTO assignedUser) {
		this.setApplication(application);
		this.status = status;
		this.setStartDate(new Date());
		this.setAssignedUser(assignedUser);
	}

	public Long getApplicationHistoryId() {
		return applicationHistoryId;
	}

	public void setApplicationHistoryId(Long applicationHistoryId) {
		this.applicationHistoryId = applicationHistoryId;
	}

	public ApplicationStatusEnum getStatus() {
		return status;
	}

	public void setStatus(ApplicationStatusEnum status) {
		this.status = status;
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

	public ApplicationDTO getApplication() {
		return application;
	}

	public void setApplication(ApplicationDTO application) {
		this.application = application;
	}

	public UserProfileDTO getAssignedUser() {
		return assignedUser;
	}

	public void setAssignedUser(UserProfileDTO assignedUser) {
		this.assignedUser = assignedUser;
	}
}