package com.rcs.ind.common.dtos;

import java.util.Locale;

import com.rcs.ind.common.entities.dtos.ApplicationDocumentDTO;
import com.rcs.ind.common.enums.ApplicationStatusEnum;
import com.rcs.ind.common.enums.TrackEnum;

public class ScreenerApplicationInfoDTO {

	private String smartflowNumber;
	private Locale language;
	private String languageString;
	private ApplicationStatusEnum status;
	private String statusString;
	private TrackEnum track;
	private String trackString;
	private String nationality;
	private Long interviewerUserId;
	private String interviewerName;
	private String interpreterName;
	private Long customerFormId;
	
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

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getLanguageString() {
		return languageString;
	}

	public void setLanguageString(String languageString) {
		this.languageString = languageString;
	}

	public String getStatusString() {
		return statusString;
	}

	public void setStatusString(String statusString) {
		this.statusString = statusString;
	}

	public String getTrackString() {
		return trackString;
	}

	public void setTrackString(String trackString) {
		this.trackString = trackString;
	}

	public String getInterpreterName() {
		return interpreterName;
	}

	public void setInterpreterName(String interpreterName) {
		this.interpreterName = interpreterName;
	}

	public String getInterviewerName() {
		return interviewerName;
	}

	public void setInterviewerName(String interviewerName) {
		this.interviewerName = interviewerName;
	}

	public Long getInterviewerUserId() {
		return interviewerUserId;
	}

	public void setInterviewerUserId(Long interviewerUserId) {
		this.interviewerUserId = interviewerUserId;
	}
	
	public Long getCustomerFormId() {
		return customerFormId;
	}
	
	public void setCustomerFormId(Long customerFormId) {
		this.customerFormId = customerFormId;
	}	
}
