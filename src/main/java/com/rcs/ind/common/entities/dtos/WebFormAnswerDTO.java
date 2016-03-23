package com.rcs.ind.common.entities.dtos;

import java.util.Map;

import com.rcs.ind.common.dtos.GenericEntityDTO;
import com.rcs.ind.common.enums.WebFormItemInputTypeEnum;
import com.rcs.ind.common.enums.WebFormItemTypeEnum;

public class WebFormAnswerDTO extends GenericEntityDTO {

	private Long webFormAnswerId;
	private String question;
	private Boolean isMultiline;
	private WebFormItemTypeEnum itemType;
	private WebFormItemInputTypeEnum inputType;
	private String itemOrder;
	private String itemCssClass;
	private String questionCssClass;
	private String inputCssClass;
	private String value;
	private ApplicationDTO application;
	private Map<String, String> itemOptions;

	public Long getWebFormAnswerId() {
		return webFormAnswerId;
	}

	public void setWebFormAnswerId(Long webFormAnswerId) {
		this.webFormAnswerId = webFormAnswerId;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public Boolean getIsMultiline() {
		return isMultiline;
	}

	public void setIsMultiline(Boolean isMultiline) {
		this.isMultiline = isMultiline;
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

	public String getItemOrder() {
		return itemOrder;
	}

	public void setItemOrder(String itemOrder) {
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

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public ApplicationDTO getApplication() {
		return application;
	}

	public void setApplication(ApplicationDTO application) {
		this.application = application;
	}

	public Map<String, String> getItemOptions() {
		return itemOptions;
	}

	public void setItemOptions(Map<String, String> itemOptions) {
		this.itemOptions = itemOptions;
	}
}