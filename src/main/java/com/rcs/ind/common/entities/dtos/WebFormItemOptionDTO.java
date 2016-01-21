package com.rcs.ind.common.entities.dtos;

import java.lang.reflect.Field;

import com.rcs.ind.common.dtos.GenericEntityDTO;

public class WebFormItemOptionDTO extends GenericEntityDTO {

	private Long webFormItemOptionId;
	private String optionValue;
	private String optionLabel;
	private String selectKey;
	private WebFormItemDTO webFormItem;

	public WebFormItemOptionDTO() {
	}

	public WebFormItemOptionDTO(String optionValue, String optionLabel, WebFormItemDTO webFormItem) {
		super();
		this.optionValue = optionValue;
		this.optionLabel = optionLabel;
		this.webFormItem = webFormItem;
	}

	public WebFormItemOptionDTO(Long webFormItemOptionId, String optionValue, String optionLabel, WebFormItemDTO webFormItem) {
		this.webFormItemOptionId = webFormItemOptionId;
		this.optionValue = optionValue;
		this.optionLabel = optionLabel;
		this.webFormItem = webFormItem;
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

	/**
	 * @return the selectKey
	 */
	public String getSelectKey() {
		return selectKey;
	}

	/**
	 * @param selectKey
	 *            the selectKey to set
	 */
	public void setSelectKey(String selectKey) {
		this.selectKey = selectKey;
	}

	public WebFormItemDTO getWebFormItem() {
		return webFormItem;
	}

	public void setWebFormItem(WebFormItemDTO webFormItem) {
		this.webFormItem = webFormItem;
	}

	public boolean isNull() throws IllegalAccessException {
		for (Field f : getClass().getDeclaredFields()) {
			if (f.get(this) != null) {
				return false;
			}
		}

		return true;
	}

}