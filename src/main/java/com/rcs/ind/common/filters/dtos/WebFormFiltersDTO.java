package com.rcs.ind.common.filters.dtos;

import com.rcs.ind.common.dtos.PaginationFiltersDTO;

public class WebFormFiltersDTO extends PaginationFiltersDTO {

	private Long webFormId;
	private String title;
	private String description;
	private Long version;

	public WebFormFiltersDTO() {
	}

	public WebFormFiltersDTO(Long webFormId, String title, String description, Long version) {
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