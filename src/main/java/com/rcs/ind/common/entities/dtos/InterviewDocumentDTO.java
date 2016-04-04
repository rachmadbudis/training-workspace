package com.rcs.ind.common.entities.dtos;

import com.rcs.ind.common.dtos.GenericEntityDTO;

public class InterviewDocumentDTO extends GenericEntityDTO {

	private Long interviewDocumentId;
	private String content;
	private ApplicationDTO application;
	private int version;
	
	public InterviewDocumentDTO() {
	}

	public InterviewDocumentDTO(Long interviewDocumentId, String content,
			ApplicationDTO application, int version) {
		this.interviewDocumentId = interviewDocumentId;
		this.content = content;
		this.application = application;
		this.version = version;
	}

	public Long getInterviewDocumentId() {
		return interviewDocumentId;
	}

	public void setInterviewDocumentId(Long interviewDocumentId) {
		this.interviewDocumentId = interviewDocumentId;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public ApplicationDTO getApplication() {
		return application;
	}

	public void setApplication(ApplicationDTO application) {
		this.application = application;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}
}