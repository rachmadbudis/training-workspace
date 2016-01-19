package com.rcs.ind.common.entities.dtos;

import com.rcs.ind.common.dtos.GenericEntityDTO;

public class WebFormDTO extends GenericEntityDTO {

	private Long webFormId;
	private String title;
	private String description;
	private Long version;

	public WebFormDTO() {
	}

	public WebFormDTO(Long webFormId, String title, String description, Long version) {
		this.webFormId = webFormId;
		this.title = title;
		this.description = description;
		this.version = version;
	}

	public Long getWebFormId() {
		return webFormId;
	}

	public void setWebFormId(Long webFormId) {
		this.webFormId = webFormId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Long getVersion() {
		return version;
	}

	public void setVersion(Long version) {
		this.version = version;
	}

}