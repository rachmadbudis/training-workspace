package com.rcs.ind.common.filters.dtos;

import java.util.List;

import com.rcs.ind.common.dtos.PaginationFiltersDTO;

public class DocumentFiltersDTO extends PaginationFiltersDTO {

	private Long documentId;
	private Long applicationId;
	private List<String> fileNames;

	public Long getDocumentId() {
		return documentId;
	}

	public void setDocumentId(Long documentId) {
		this.documentId = documentId;
	}

	public Long getApplicationId() {
		return applicationId;
	}

	public void setApplicationId(Long applicationId) {
		this.applicationId = applicationId;
	}
	
	public List<String> getFileNames() {
		return fileNames;
	}
	
	public void setFileNames(List<String> fileNames) {
		this.fileNames = fileNames;
	}

}
