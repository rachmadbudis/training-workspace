package com.rcs.ind.common.entities.dtos;

import java.util.Date;

import com.rcs.ind.common.dtos.GenericEntityDTO;

public class ApplicationHistoryDTO extends GenericEntityDTO {

	private Long applicationHistoryId;
	private String status;
	private Date startDate;
	private Date endDate;
	private ApplicationDTO application;
	private UserDTO assignedUser;

	public ApplicationHistoryDTO() {
	}

	public ApplicationHistoryDTO(Long applicationHistoryId, String status, Date startDate, Date endDate, ApplicationDTO application, UserDTO assignedUser) {
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

	
	public String getStatus() {
		return status;
	}

	
	public void setStatus(String status) {
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

	public UserDTO getAssignedUser() {
		return assignedUser;
	}

	public void setAssignedUser(UserDTO assignedUser) {
		this.assignedUser = assignedUser;
	}
}