package com.rcs.ind.common.dtos;

import java.util.Date;
import java.util.List;

import com.rcs.ind.common.enums.ApplicationStatusEnum;

public class ApplicationAuditDTO {

	private Long applicationId;
	private String smartflowNumber;
	private ApplicationStatusEnum status;
	private Date modificationDate;
	private String location;
	private String modificationUser;
	private List<ApplicationAuditDTO> childrenHistories;

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

	public Date getModificationDate() {
		return modificationDate;
	}

	public void setModificationDate(Date modificationDate) {
		this.modificationDate = modificationDate;
	}

	public ApplicationStatusEnum getStatus() {
		return status;
	}

	public void setStatus(ApplicationStatusEnum status) {
		this.status = status;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getModificationUser() {
		return modificationUser;
	}

	public void setModificationUser(String modificationUser) {
		this.modificationUser = modificationUser;
	}

	public List<ApplicationAuditDTO> getChildrenHistories() {
		return childrenHistories;
	}

	public void setChildrenHistories(List<ApplicationAuditDTO> childrenHistories) {
		this.childrenHistories = childrenHistories;
	}

}
