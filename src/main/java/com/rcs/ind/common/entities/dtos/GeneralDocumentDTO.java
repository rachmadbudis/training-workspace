package com.rcs.ind.common.entities.dtos;

import com.rcs.ind.common.dtos.GenericEntityDTO;
import com.rcs.ind.common.enums.DocumentTypeEnum;

public class GeneralDocumentDTO extends GenericEntityDTO{

	private Long documentId;
	private String fileName;
	private DocumentTypeEnum documentType;
	private byte[] data;
	private boolean active;
	private String modificationUser;

	public GeneralDocumentDTO() {
	}

	public GeneralDocumentDTO(Long documentId, String fileName, DocumentTypeEnum documentType) {
		this.documentId = documentId;
		this.fileName = fileName;
		this.documentType = documentType;
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

	public DocumentTypeEnum getDocumentType() {
		return documentType;
	}

	public void setDocumentType(DocumentTypeEnum documentType) {
		this.documentType = documentType;
	}

	public byte[] getData() {
		return data;
	}

	public void setData(byte[] data) {
		this.data = data;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public String getModificationUser() {
		return modificationUser;
	}

	public void setModificationUser(String modificationUser) {
		this.modificationUser = modificationUser;
	}

}