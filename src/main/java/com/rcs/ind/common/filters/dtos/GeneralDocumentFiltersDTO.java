package com.rcs.ind.common.filters.dtos;

import java.util.List;

import com.rcs.ind.common.dtos.PaginationFiltersDTO;
import com.rcs.ind.common.enums.DocumentTypeEnum;

public class GeneralDocumentFiltersDTO extends PaginationFiltersDTO {

	private Long documentId;
	private List<String> fileNames;
	private List<DocumentTypeEnum> documentTypes;

	public Long getDocumentId() {
		return documentId;
	}

	public void setDocumentId(Long documentId) {
		this.documentId = documentId;
	}
	
	public List<String> getFileNames() {
		return fileNames;
	}
	
	public void setFileNames(List<String> fileNames) {
		this.fileNames = fileNames;
	}

	public List<DocumentTypeEnum> getDocumentTypes() {
		return documentTypes;
	}

	public void setDocumentTypes(List<DocumentTypeEnum> documentTypes) {
		this.documentTypes = documentTypes;
	}

}
