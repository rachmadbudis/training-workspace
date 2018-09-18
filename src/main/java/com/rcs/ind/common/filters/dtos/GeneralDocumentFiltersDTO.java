package com.rcs.ind.common.filters.dtos;

import java.util.List;

import com.rcs.ind.common.dtos.PaginationFiltersDTO;

public class GeneralDocumentFiltersDTO extends PaginationFiltersDTO {

	private Long documentId;
	private List<String> fileNames;
	private List<String> documentTypes;

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

	public List<String> getDocumentTypes() {
		return documentTypes;
	}

	public void setDocumentTypes(List<String> documentTypes) {
		this.documentTypes = documentTypes;
	}

}
