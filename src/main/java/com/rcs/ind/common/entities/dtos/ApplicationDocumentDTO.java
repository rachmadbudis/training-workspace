package com.rcs.ind.common.entities.dtos;

public class ApplicationDocumentDTO extends GeneralDocumentDTO {

	private ApplicationDTO application;

	public ApplicationDocumentDTO() {
	}

	public ApplicationDocumentDTO(Long documentId, String fileName, ApplicationDTO application) {
		super.setDocumentId(documentId);
		super.setFileName(fileName);
		this.application = application;
	}

	public ApplicationDTO getApplication() {
		return application;
	}

	public void setApplication(ApplicationDTO application) {
		this.application = application;
	}

	
}