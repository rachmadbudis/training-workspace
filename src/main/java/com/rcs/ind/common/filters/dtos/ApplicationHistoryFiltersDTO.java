package com.rcs.ind.common.filters.dtos;

import java.util.Date;

import com.rcs.ind.common.dtos.PaginationFiltersDTO;
import com.rcs.ind.common.enums.ApplicationStatusEnum;


public class ApplicationHistoryFiltersDTO extends PaginationFiltersDTO {
	
	private Long applicationHistoryId;
	private ApplicationStatusEnum status;
	private Date startDate;
	private Date endDate;
	private Long applicationId;
	private Long assignedUserId;
	
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
	
}
