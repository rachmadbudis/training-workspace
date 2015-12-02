package com.rcs.ind.common.filters.dtos;

import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Set;

import com.rcs.ind.common.dtos.PaginationFiltersDTO;
import com.rcs.ind.common.enums.ApplicationStatusEnum;
import com.rcs.ind.liferay.enums.LiferayRoleEnum;

public class ApplicationHistoryFiltersDTO extends PaginationFiltersDTO {

	private Long applicationHistoryId;
	private List<ApplicationStatusEnum> statuses;
	private Date startDate;
	private Date endDate;
	private Date creationStartDate;
	private Date creationEndDate;
	private Long applicationId;
	private String smartflowNumber;
	private Locale language;
	private Long assignedUserId;
	private List<Long> assignedUserIds;
	private String assignedUserName;
	private String location;
	private Boolean registered;
	private Set<Locale> languages;
	private LiferayRoleEnum userRole;

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Boolean getRegistered() {
		return registered;
	}

	public void setRegistered(Boolean registered) {
		this.registered = registered;
	}

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

	public String getAssignedUserName() {
		return assignedUserName;
	}

	public void setAssignedUserName(String assignedUserName) {
		this.assignedUserName = assignedUserName;
	}

	public List<Long> getAssignedUserIds() {
		return assignedUserIds;
	}

	public void setAssignedUserIds(List<Long> assignedUserIds) {
		this.assignedUserIds = assignedUserIds;
	}

	public Date getCreationStartDate() {
		return creationStartDate;
	}

	public void setCreationStartDate(Date creationStartDate) {
		this.creationStartDate = creationStartDate;
	}

	public Date getCreationEndDate() {
		return creationEndDate;
	}

	public void setCreationEndDate(Date creationEndDate) {
		this.creationEndDate = creationEndDate;
	}

	public Set<Locale> getLanguages() {
		return languages;
	}

	public void setLanguages(Set<Locale> languages) {
		this.languages = languages;
	}

	public LiferayRoleEnum getUserRole() {
		return userRole;
	}

	public void setUserRole(LiferayRoleEnum userRole) {
		this.userRole = userRole;
	}
}
