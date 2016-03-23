package com.rcs.ind.common.filters.dtos;

import com.rcs.ind.common.dtos.PaginationFiltersDTO;
import com.rcs.ind.common.enums.WebFormItemInputTypeEnum;
import com.rcs.ind.common.enums.WebFormItemTypeEnum;

public class WebFormAnswerFiltersDTO extends PaginationFiltersDTO {

	private Long webFormAnswerId;
	private Long applicationId;
	private String question;
	private String value;
	private Boolean isMultiline;
	private WebFormItemTypeEnum itemType;
	private WebFormItemInputTypeEnum inputType;
	private Integer itemOrder;
	private String itemCssClass;
	private String questionCssClass;
	private String inputCssClass;

	public WebFormAnswerFiltersDTO() {
	}

	public Long getWebFormAnswerId() {
		return webFormAnswerId;
	}

	public void setWebFormAnswerId(Long webFormAnswerId) {
		this.webFormAnswerId = webFormAnswerId;
	}

	public Long getApplicationId() {
		return applicationId;
	}

	public void setApplicationId(Long applicationId) {
		this.applicationId = applicationId;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
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

}
