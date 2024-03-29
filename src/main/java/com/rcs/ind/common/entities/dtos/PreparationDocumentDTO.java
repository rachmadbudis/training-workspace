package com.rcs.ind.common.entities.dtos;

import java.util.Date;

public class PreparationDocumentDTO {

	private Long preparationDocumentId;
	private String type;
	private String documentNumber;
	private String releaseLocation;
	private Date releaseDate;
	private String issueOrganization;
	private InterviewPreparationDTO interviewPreparation;

	public PreparationDocumentDTO() {
	}

	public PreparationDocumentDTO(Long preparationDocumentId) {
		this.preparationDocumentId = preparationDocumentId;
	}

	public Long getPreparationDocumentId() {
		return preparationDocumentId;
	}

	public void setPreparationDocumentId(Long preparationDocumentId) {
		this.preparationDocumentId = preparationDocumentId;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getDocumentNumber() {
		return documentNumber;
	}

	public void setDocumentNumber(String documentNumber) {
		this.documentNumber = documentNumber;
	}

	public String getReleaseLocation() {
		return releaseLocation;
	}

	public void setReleaseLocation(String releaseLocation) {
		this.releaseLocation = releaseLocation;
	}
	
	public String getIssueOrganization() {
		return issueOrganization;
	}

	public void setIssueOrganization(String issueOrganization) {
		this.issueOrganization = issueOrganization;
	}

	public Date getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}

	public InterviewPreparationDTO getInterviewPreparation() {
		return interviewPreparation;
	}

	public void setInterviewPreparation(InterviewPreparationDTO interviewPreparation) {
		this.interviewPreparation = interviewPreparation;
	}

}