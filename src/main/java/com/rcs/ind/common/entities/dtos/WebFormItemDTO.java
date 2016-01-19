package com.rcs.ind.common.entities.dtos;

import com.rcs.ind.common.dtos.GenericEntityDTO;
import com.rcs.ind.common.enums.WebFormItemInputTypeEnum;
import com.rcs.ind.common.enums.WebFormItemTypeEnum;

public class WebFormItemDTO extends GenericEntityDTO {

	private Long webFormItemId;
	private String question;
	private WebFormItemTypeEnum itemType;
	private WebFormItemInputTypeEnum inputType;
	private Integer itemOrder;
	private String itemCssClass;
	private String questionCssClass;
	private String inputCssClass;
	private WebFormDTO webForm;

	public WebFormItemDTO() {
	}

	public WebFormItemDTO(Long webFormItemId, String question, WebFormItemTypeEnum itemType, WebFormItemInputTypeEnum inputType, Integer itemOrder,
			String itemCssClass, String questionCssClass, String inputCssClass, WebFormDTO webForm) {
		this.webFormItemId = webFormItemId;
		this.question = question;
		this.itemType = itemType;
		this.inputType = inputType;
		this.itemOrder = itemOrder;
		this.itemCssClass = itemCssClass;
		this.questionCssClass = questionCssClass;
		this.inputCssClass = inputCssClass;
		this.webForm = webForm;
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

}