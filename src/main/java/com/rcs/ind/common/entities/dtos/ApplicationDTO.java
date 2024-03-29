package com.rcs.ind.common.entities.dtos;

import java.util.Date;
import java.util.List;
import java.util.Locale;

import com.rcs.ind.common.enums.ApplicationReleaseReasonEnum;
import com.rcs.ind.common.enums.ApplicationStatusEnum;

public class ApplicationDTO {

	private Long applicationId;
	private String smartflowNumber;
	private String vNumber;
	private Locale language;
	private String location;
	private Boolean registered;
	private Boolean isPaperApplication;
	/** use primitive type to make sure no null value */
	private boolean priority;
	private String xmlAnswer;
	private Long createUser;
	private List<ApplicationDocumentDTO> documents;
	private ApplicationReleaseReasonEnum releaseReason;
	private String tfaStream;
	private String nationality;
	private String applicationType;
	private ApplicationStatusEnum status;
	private Date emmDownloadDate;

	public ApplicationDTO() {
	}

	public ApplicationDTO(Long applicationId, String smartflowNumber, Locale language, Long createUser) {
		this.applicationId = applicationId;
		this.smartflowNumber = smartflowNumber;
		this.language = language;
		this.createUser = createUser;
	}

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

	public String getvNumber() {
		return vNumber;
	}

	public void setvNumber(String vNumber) {
		this.vNumber = vNumber;
	}

	public Locale getLanguage() {
		return language;
	}

	public void setLanguage(Locale language) {
		this.language = language;
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

	public Long getCreateUser() {
		return createUser;
	}

	public void setCreateUser(Long createUser) {
		this.createUser = createUser;
	}

	public List<ApplicationDocumentDTO> getDocuments() {
		return documents;
	}

	public void setDocuments(List<ApplicationDocumentDTO> documents) {
		this.documents = documents;
	}

	public ApplicationReleaseReasonEnum getReleaseReason() {
		return releaseReason;
	}

	public void setReleaseReason(ApplicationReleaseReasonEnum releaseReason) {
		this.releaseReason = releaseReason;
	}

	public boolean getPriority() {
		return priority;
	}

	public void setPriority(boolean priority) {
		this.priority = priority;
	}

	public String getXmlAnswer() {
		return xmlAnswer;
	}

	public void setXmlAnswer(String xmlAnswer) {
		this.xmlAnswer = xmlAnswer;
	}

	public Boolean getIsPaperApplication() {
		return isPaperApplication;
	}

	public void setIsPaperApplication(Boolean isPaperApplication) {
		this.isPaperApplication = isPaperApplication;
	}

	public String getTfaStream() {
		return tfaStream;
	}

	public void setTfaStream(String tfaStream) {
		this.tfaStream = tfaStream;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public ApplicationStatusEnum getStatus() {
		return status;
	}

	public void setStatus(ApplicationStatusEnum status) {
		this.status = status;
	}

	
	public String getApplicationType() {
		return applicationType;
	}

	public void setApplicationType(String applicationType) {
		this.applicationType = applicationType;
	}
	
	public Date getEmmDownloadDate() {
		return emmDownloadDate;
	}

	public void setDownloadDate(Date emmDownloadDate) {
		this.emmDownloadDate = emmDownloadDate;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ApplicationDTO [applicationId=");
		builder.append(applicationId);
		builder.append(", smartflowNumber=");
		builder.append(smartflowNumber);
		builder.append(", language=");
		builder.append(language);
		builder.append(", location=");
		builder.append(location);
		builder.append(", registered=");
		builder.append(registered);
		builder.append(", isPaperApplication=");
		builder.append(isPaperApplication);
		builder.append(", priority=");
		builder.append(priority);
		builder.append(", xmlAnswer=");
		builder.append(xmlAnswer);
		builder.append(", createUser=");
		builder.append(createUser);
		builder.append(", documents=");
		builder.append(documents);
		builder.append(", releaseReason=");
		builder.append(releaseReason);
		builder.append(", tfaStream=");
		builder.append(tfaStream);
		builder.append(", nationality=");
		builder.append(nationality);
		builder.append(", status=");
		builder.append(status);
		builder.append(", applicationType=");
		builder.append(applicationType);
		builder.append("]");
		return builder.toString();
	}
}