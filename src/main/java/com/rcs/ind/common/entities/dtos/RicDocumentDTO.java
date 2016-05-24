package com.rcs.ind.common.entities.dtos;

public class RicDocumentDTO extends DocumentDTO {

	private Long ricDocumentId;

	public RicDocumentDTO() {
	}

	public RicDocumentDTO(Long ricDocumentId) {
		this.ricDocumentId = ricDocumentId;
	}

	public Long getRicDocumentId() {
		return ricDocumentId;
	}

	public void setRicDocumentId(Long ricDocumentId) {
		this.ricDocumentId = ricDocumentId;
	}
}