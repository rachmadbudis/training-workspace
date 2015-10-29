package com.rcs.ind.common.filters.dtos;

import com.rcs.ind.common.dtos.PaginationFiltersDTO;


public class FormAnswerFiltersDTO extends PaginationFiltersDTO {
	
	private Long formAnswerId;
	private Long questionNumber;
	private String answer;
	private String translation;
	private String language;
	private Long applicationId;
	
	public Long getFormAnswerId() {
		return formAnswerId;
	}
	
	public void setFormAnswerId(Long formAnswerId) {
		this.formAnswerId = formAnswerId;
	}
	
	public Long getQuestionNumber() {
		return questionNumber;
	}
	
	public void setQuestionNumber(Long questionNumber) {
		this.questionNumber = questionNumber;
	}
	
	public String getAnswer() {
		return answer;
	}
	
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	
	public String getTranslation() {
		return translation;
	}

	public void setTranslation(String translation) {
		this.translation = translation;
	}

	public String getLanguage() {
		return language;
	}
	
	public void setLanguage(String language) {
		this.language = language;
	}
	
	public Long getApplicationId() {
		return applicationId;
	}
	
	public void setApplicationId(Long applicationId) {
		this.applicationId = applicationId;
	}
	
	
}
