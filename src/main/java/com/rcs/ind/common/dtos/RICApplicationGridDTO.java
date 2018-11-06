package com.rcs.ind.common.dtos;

import java.util.Date;

import com.rcs.ind.common.enums.TrackEnum;

public class RICApplicationGridDTO extends ApplicationGridDTO {

	private Date startDate;
	private Date updateDate;
	private String nationality;
	private TrackEnum track;
	private String interviewPreparationNationality;
	private String formAnswersNationality;
	

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
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

	
	public TrackEnum getTrack() {
		return track;
	}

	
	public void setTrack(TrackEnum track) {
		this.track = track;
	}

}
