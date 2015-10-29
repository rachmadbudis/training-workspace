package com.rcs.ind.common.entities.dtos;

import com.rcs.ind.common.dtos.GenericEntityDTO;

public class FormAnswerDTO extends GenericEntityDTO {

	private Long formAnswerId;
	private Long questionNumber;
	private String answer;
	private String translation;
	private String language;
	private ApplicationDTO application;

	public FormAnswerDTO() {
	}

	public FormAnswerDTO(Long formAnswerId, Long questionNumber, String answer, String translation, String language, ApplicationDTO application) {
		this.formAnswerId = formAnswerId;
		this.questionNumber = questionNumber;
		this.answer = answer;
		this.translation = translation; 
		this.language = language;
		this.application = application;
	}

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

	
	public String getLanguage() {
		return language;
	}

	
	public void setLanguage(String language) {
		this.language = language;
	}

	
	public ApplicationDTO getApplication() {
		return application;
	}

	
	public void setApplication(ApplicationDTO application) {
		this.application = application;
	}

	public String getTranslation() {
		return translation;
	}

	public void setTranslation(String translation) {
		this.translation = translation;
	}
}