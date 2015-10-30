package com.rcs.ind.common.entities.dtos;

import java.util.Date;

import com.rcs.ind.common.dtos.GenericEntityDTO;
import com.rcs.ind.common.enums.ApplicationStatusEnum;

public class ApplicationHistoryDTO extends GenericEntityDTO {

	private Long applicationHistoryId;
	private ApplicationStatusEnum status;
	private Date startDate;
	private Date endDate;
	private ApplicationDTO application;
	private UserProfileDTO assignedUser;

	public ApplicationHistoryDTO() {
	}

	public ApplicationHistoryDTO(Long applicationHistoryId, ApplicationStatusEnum status, Date startDate, Date endDate, ApplicationDTO application, UserProfileDTO assignedUser) {
		this.applicationHistoryId = applicationHistoryId;
		this.status = status;
		this.startDate = startDate;
		this.endDate = endDate;
		this.application = application;
		this.assignedUser = assignedUser;
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