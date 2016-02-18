package com.rcs.ind.common.entities.dtos;

import com.rcs.ind.common.dtos.GenericEntityDTO;

public class DocumentDTO extends GenericEntityDTO {

	private Long documentId;
	private String fileName;
	private ApplicationDTO application;
	private byte[] data;

	public DocumentDTO() {
	}

	public DocumentDTO(Long documentId, String fileName, ApplicationDTO application) {
		this.documentId = documentId;
		this.fileName = fileName;
		this.application = application;
	}

	public Long getDocumentId() {
		return documentId;
	}

	public void setDocumentId(Long documentId) {
		this.documentId = documentId;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public ApplicationDTO getApplication() {
		return application;
	}

	public void setApplication(ApplicationDTO application) {
		this.application = application;
	}

	public byte[] getData() {
		return data;
	}

	public void setData(byte[] data) {
		this.data = data;
	}

	
}