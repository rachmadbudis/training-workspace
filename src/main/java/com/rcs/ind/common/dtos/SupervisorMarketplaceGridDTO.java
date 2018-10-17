package com.rcs.ind.common.dtos;

import java.util.Date;
import java.util.Locale;

import com.rcs.ind.common.enums.ApplicationStatusEnum;
import com.rcs.ind.common.enums.GenQuestionStatusEnum;
import com.rcs.ind.common.enums.TrackEnum;

public class SupervisorMarketplaceGridDTO  {

	private Long applicationId;
	private String vNumber;
	private String smartflowNumber;
	private ApplicationStatusEnum status;
	private GenQuestionStatusEnum interviewPreparationStatus;
	private TrackEnum track;
	private String trackLabel;
	private Date startDate;
	private String nationality;
	private Locale language;
	private Date creationDate;
	
	public String getvNumber() {
		return vNumber;
	}
	
	public void setvNumber(String vNumber) {
		this.vNumber = vNumber;
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
	
	public TrackEnum getTrack() {
		return track;
	}
	
	public void setTrack(TrackEnum track) {
		this.track = track;
	}
	
	public Date getStartDate() {
		return startDate;
	}
	
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	
	public String getNationality() {
		return nationality;
	}
	
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	
	public Locale getLanguage() {
		return language;
	}
	
	public void setLanguage(Locale language) {
		this.language = language;
	}

	public GenQuestionStatusEnum getInterviewPreparationStatus() {
		return interviewPreparationStatus;
	}

	public void setInterviewPreparationStatus(GenQuestionStatusEnum interviewPreparationStatus) {
		this.interviewPreparationStatus = interviewPreparationStatus;
	}

	
	public Long getApplicationId() {
		return applicationId;
	}

	
	public void setApplicationId(Long applicationId) {
		this.applicationId = applicationId;
	}

	public String getTrackLabel() {
		return trackLabel;
	}

	public void setTrackLabel(String trackLabel) {
		this.trackLabel = trackLabel;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
	
	}
