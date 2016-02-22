package com.rcs.ind.common.entities.dtos;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.rcs.ind.common.enums.WebFormItemInputTypeEnum;
import com.rcs.ind.common.enums.WebFormItemTypeEnum;

public class WebFormItemDTO {

	private Long webFormItemId;
	private String question;
	private WebFormItemTypeEnum itemType;
	private WebFormItemInputTypeEnum inputType;
	private Integer itemOrder;
	private String itemCssClass;
	private String questionCssClass;
	private String inputCssClass;
	private WebFormDTO webForm;
	private String value;
	@JsonManagedReference
	private List<WebFormItemOptionDTO> options;

	public WebFormItemDTO() {
	}

	public Long getWebFormItemId() {
		return webFormItemId;
	}

	public void setWebFormItemId(Long webFormItemId) {
		this.webFormItemId = webFormItemId;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public WebFormItemTypeEnum getItemType() {
		return itemType;
	}

	public void setItemType(WebFormItemTypeEnum itemType) {
		this.itemType = itemType;
	}

	public WebFormItemInputTypeEnum getInputType() {
		return inputType;
	}

	public void setInputType(WebFormItemInputTypeEnum inputType) {
		this.inputType = inputType;
	}

	public Integer getItemOrder() {
		return itemOrder;
	}

	public void setItemOrder(Integer itemOrder) {
		this.itemOrder = itemOrder;
	}

	public String getItemCssClass() {
		return itemCssClass;
	}

	public void setItemCssClass(String itemCssClass) {
		this.itemCssClass = itemCssClass;
	}

	public String getQuestionCssClass() {
		return questionCssClass;
	}

	public void setQuestionCssClass(String questionCssClass) {
		this.questionCssClass = questionCssClass;
	}

	public String getInputCssClass() {
		return inputCssClass;
	}

	public void setInputCssClass(String inputCssClass) {
		this.inputCssClass = inputCssClass;
	}

	public WebFormDTO getWebForm() {
		return webForm;
	}

	public void setWebForm(WebFormDTO webForm) {
		this.webForm = webForm;
	}

	/**
	 * @return the value
	 */
	public String getValue() {
		return value;
	}

	/**
	 * @param value
	 *            the value to set
	 */
	public void setValue(String value) {
		this.value = value;
	}

	public List<WebFormItemOptionDTO> getOptions() {
		return options;
	}

	public void setOptions(List<WebFormItemOptionDTO> options) {
		this.options = options;
	}

	/**
	 * helper method for adding option, with default <code>java.util.ArrayList</code> implementation
	 * 
	 * @param option
	 */
	public void addOption(WebFormItemOptionDTO option) {
		if (this.options == null) this.options = new ArrayList<WebFormItemOptionDTO>();
		this.options.add(option);
	}
	
	public boolean isNull() throws IllegalAccessException {
		for (Field f : getClass().getDeclaredFields()) {
			f.setAccessible(true);
			if (f.get(this) != null) {
				return false;
			}
		}

		return true;
	}
	

}