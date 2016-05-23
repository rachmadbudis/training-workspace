package com.rcs.ind.common.entities.dtos;

import com.rcs.ind.common.dtos.GenericEntityDTO;

public class RicProfileDTO extends GenericEntityDTO {

	private Long ricProfileId;
	private String content;
	private ApplicationDTO application;
	private int version;
	private Boolean done;

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

	public Boolean getDone() {
		return done;
	}

	public void setDone(Boolean done) {
		this.done = done;
	}

}