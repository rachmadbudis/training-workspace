package com.rcs.ind.common.entities.dtos;

import com.rcs.ind.common.dtos.GenericEntityDTO;
import com.rcs.ind.common.enums.RicStatusEnum;

public class RicProfileDTO extends GenericEntityDTO {

	private Long ricProfileId;
	private String content;
	private ApplicationDTO application;
	private int version;
	private Long applicationId;
	private RicDocumentDTO document;
	private RicStatusEnum status;

	public RicProfileDTO() {
	}

	public RicProfileDTO(Long ricProfileId) {
		this.ricProfileId = ricProfileId;
	}

	public Long getRicProfileId() {
		return ricProfileId;
	}

	public void setRicProfileId(Long ricProfileId) {
		this.ricProfileId = ricProfileId;
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

	public Long getApplicationId() {
		return applicationId;
	}

	public void setApplicationId(Long applicationId) {
		this.applicationId = applicationId;
	}

	public RicStatusEnum getStatus() {
		return status;
	}

	public void setStatus(RicStatusEnum status) {
		this.status = status;
	}

	public RicDocumentDTO getDocument() {
		return document;
	}

	public void setDocument(RicDocumentDTO documents) {
		this.document = documents;
	}
}