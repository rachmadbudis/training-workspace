package com.rcs.ind.common.filters.dtos;

import com.rcs.ind.common.dtos.PaginationFiltersDTO;
import com.rcs.ind.common.enums.WebFormItemInputTypeEnum;
import com.rcs.ind.common.enums.WebFormItemTypeEnum;

public class WebFormItemFiltersDTO extends PaginationFiltersDTO {

	private Long webFormItemId;
	private String question;
	private WebFormItemTypeEnum itemType;
	private WebFormItemInputTypeEnum inputType;
	private Integer itemOrder;
	private String itemCssClass;
	private String questionCssClass;
	private String inputCssClass;
	private Long webFormId;

	public WebFormItemFiltersDTO() {
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

	public Long getWebFormId() {
		return webFormId;
	}

	public void setWebFormId(Long webFormId) {
		this.webFormId = webFormId;
	}

}
