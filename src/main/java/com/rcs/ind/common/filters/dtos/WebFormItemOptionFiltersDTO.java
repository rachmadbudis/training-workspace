package com.rcs.ind.common.filters.dtos;

import com.rcs.ind.common.dtos.PaginationFiltersDTO;

public class WebFormItemOptionFiltersDTO extends PaginationFiltersDTO {

	private Long webFormItemOptionId;
	private String optionValue;
	private String optionLabel;
	private Long webFormItemId;

	public WebFormItemOptionFiltersDTO() {
	}

	public WebFormItemOptionFiltersDTO(Long webFormItemOptionId, String optionValue, String optionLabel, Long webFormItemId) {
		super();
		this.webFormItemOptionId = webFormItemOptionId;
		this.optionValue = optionValue;
		this.optionLabel = optionLabel;
		this.webFormItemId = webFormItemId;
	}

	public Long getWebFormItemOptionId() {
		return webFormItemOptionId;
	}

	public void setWebFormItemOptionId(Long webFormItemOptionId) {
		this.webFormItemOptionId = webFormItemOptionId;
	}

	public String getOptionValue() {
		return optionValue;
	}

	public void setOptionValue(String optionValue) {
		this.optionValue = optionValue;
	}

	public String getOptionLabel() {
		return optionLabel;
	}

	public void setOptionLabel(String optionLabel) {
		this.optionLabel = optionLabel;
	}

	public Long getWebFormItemId() {
		return webFormItemId;
	}

	public void setWebFormItemId(Long webFormItemId) {
		this.webFormItemId = webFormItemId;
	}

}
