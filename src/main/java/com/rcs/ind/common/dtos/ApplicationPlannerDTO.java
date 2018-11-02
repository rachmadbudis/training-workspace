package com.rcs.ind.common.dtos;

import java.util.Date;
import java.util.Locale;
import java.util.Set;

import com.rcs.ind.common.entities.dtos.FormAnswerTranslationDTO;
import com.rcs.ind.common.enums.ApplicationStatusEnum;
import com.rcs.ind.common.enums.TrackEnum;

public class ApplicationPlannerDTO {

	private Long applicationId;
	private String smartflowNumber;
	private ApplicationStatusEnum status;
	private String assignedUserName;
	private Date creationDate;
	private Boolean priority;
	private String trackLabel;
	private TrackEnum track;
	private Locale language;
	private String nationality;
	private Date startDate;
	private String applicationType;
	private Long assignedUser;
	private String interviewPreparationNationality;
	private String formAnswersNationality;

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

	public ApplicationStatusEnum getStatus() {
		return status;
	}

	public void setStatus(ApplicationStatusEnum status) {
		this.status = status;
	}

	public String getAssignedUserName() {
		return assignedUserName;
	}

	public void setAssignedUserName(String assignedUserName) {
		this.assignedUserName = assignedUserName;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
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
	
	public Locale getLanguage() {
		return language;
	}

	public void setLanguage(Locale language) {
		this.language = language;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public String getApplicationType() {
		return applicationType;
	}

	public void setApplicationType(String applicationType) {
		this.applicationType = applicationType;
	}
	
	public TrackEnum getTrack() {
		return track;
	}
	
	public void setTrack(TrackEnum track) {
		this.track = track;
	}

	
	public Long getAssignedUser() {
		return assignedUser;
	}

	
	public void setAssignedUser(Long assignedUser) {
		this.assignedUser = assignedUser;
	}

	
	public String getInterviewPreparationNationality() {
		return interviewPreparationNationality;
	}

	
	public void setInterviewPreparationNationality(String interviewPreparationNationality) {
		this.interviewPreparationNationality = interviewPreparationNationality;
	}

	public String getFormAnswersNationality() {
		return formAnswersNationality;
	}

	
	public void setFormAnswersNationality(String formAnswersNationality) {
		this.formAnswersNationality = formAnswersNationality;
	}
	
}
