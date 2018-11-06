package com.rcs.ind.common.filters.dtos;

import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Set;

import com.rcs.ind.common.dtos.PaginationFiltersDTO;
import com.rcs.ind.common.enums.ApplicationStatusEnum;
import com.rcs.ind.common.enums.ApplicationTypeEnum;
import com.rcs.ind.common.enums.TrackEnum;
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
	private String vNumber;
	private TrackEnum track;
	private String nationality;
	private String startDateTimestamp;
	private ApplicationTypeEnum appType;
	private Date emmDownloadDate;

	public ApplicationHistoryFiltersDTO() {
	}

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

	public String getvNumber() {
		return vNumber;
	}

	public void setvNumber(String vNumber) {
		this.vNumber = vNumber;
	}

	public TrackEnum getTrack() {
		return track;
	}

	public void setTrack(TrackEnum track) {
		this.track = track;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getStartDateTimestamp() {
		return startDateTimestamp;
	}

	public void setStartDateTimestamp(String startDateTimestamp) {
		this.startDateTimestamp = startDateTimestamp;
	}

	public ApplicationTypeEnum getAppType() {
		return appType;
	}

	public void setAppType(ApplicationTypeEnum appType) {
		this.appType = appType;
	}

	public Date getEmmDownloadDate() {
		return emmDownloadDate;
	}

	public void setEmmDownloadDate(Date emmDownloadDate) {
		this.emmDownloadDate = emmDownloadDate;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ApplicationHistoryFiltersDTO [applicationHistoryId=");
		builder.append(applicationHistoryId);
		builder.append(", statuses=");
		builder.append(statuses);
		builder.append(", startDate=");
		builder.append(startDate);
		builder.append(", endDate=");
		builder.append(endDate);
		builder.append(", creationStartDate=");
		builder.append(creationStartDate);
		builder.append(", creationEndDate=");
		builder.append(creationEndDate);
		builder.append(", applicationId=");
		builder.append(applicationId);
		builder.append(", smartflowNumber=");
		builder.append(smartflowNumber);
		builder.append(", language=");
		builder.append(language);
		builder.append(", assignedUserId=");
		builder.append(assignedUserId);
		builder.append(", assignedUserIds=");
		builder.append(assignedUserIds);
		builder.append(", assignedUserName=");
		builder.append(assignedUserName);
		builder.append(", location=");
		builder.append(location);
		builder.append(", registered=");
		builder.append(registered);
		builder.append(", languages=");
		builder.append(languages);
		builder.append(", userRole=");
		builder.append(userRole);
		builder.append(", vNumber=");
		builder.append(vNumber);
		builder.append(", track=");
		builder.append(track);
		builder.append(", nationality=");
		builder.append(nationality);
		builder.append(", startDateTimestamp=");
		builder.append(startDateTimestamp);
		builder.append(", appType=");
		builder.append(appType);
		builder.append(", emmDownloadDate=");
		builder.append(emmDownloadDate);
		builder.append(", getSidx()=");
		builder.append(getSidx());
		builder.append(", getSord()=");
		builder.append(getSord());
		builder.append(", getPage()=");
		builder.append(getPage());
		builder.append(", getRows()=");
		builder.append(getRows());
		builder.append(", getDraw()=");
		builder.append(getDraw());
		builder.append(", getClass()=");
		builder.append(getClass());
		builder.append(", hashCode()=");
		builder.append(hashCode());
		builder.append("]");
		return builder.toString();
	}
	
	

}
