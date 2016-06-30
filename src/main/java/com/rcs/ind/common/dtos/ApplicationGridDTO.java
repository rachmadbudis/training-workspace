package com.rcs.ind.common.dtos;

import java.util.Date;
import java.util.Locale;

import com.rcs.ind.common.enums.ApplicationStatusEnum;
import com.rcs.ind.common.enums.InterviewStatusEnum;

public class ApplicationGridDTO {

	private Long applicationId;
	private String smartflowNumber;
	private ApplicationStatusEnum status;
	private Date creationDate;
	private Boolean priority;
	private String trackLabel;
	private InterviewStatusEnum interviewStatus;
	private Locale language;

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

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public ApplicationStatusEnum getStatus() {
		return status;
	}

	public void setStatus(ApplicationStatusEnum status) {
		this.status = status;
	}

	public Boolean getPriority() {
		return priority;
	}

	public void setPriority(Boolean priority) {
		this.priority = priority;
	}

	public String getTrackLabel() {
		return trackLabel;
	}

	public void setTrackLabel(String trackLabel) {
		this.trackLabel = trackLabel;
	}

	public InterviewStatusEnum getInterviewStatus() {
		return interviewStatus;
	}

	public void setInterviewStatus(InterviewStatusEnum interviewStatus) {
		this.interviewStatus = interviewStatus;
	}
	
	public Locale getLanguage() {
		return language;
	}

	public void setLanguage(Locale language) {
		this.language = language;
	}
}
