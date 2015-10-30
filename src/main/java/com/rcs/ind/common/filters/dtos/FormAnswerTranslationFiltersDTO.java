package com.rcs.ind.common.filters.dtos;

import java.util.Locale;


public class FormAnswerTranslationFiltersDTO {
	
	private Long formAnswerTranslationId;
	private String answerTranslation;
	private Locale language;
	private Long formAnswerId;
	
	public Long getFormAnswerTranslationId() {
		return formAnswerTranslationId;
	}
	
	public void setFormAnswerTranslationId(Long formAnswerTranslationId) {
		this.formAnswerTranslationId = formAnswerTranslationId;
	}
	
	public String getAnswerTranslation() {
		return answerTranslation;
	}
	
	public void setAnswerTranslation(String answerTranslation) {
		this.answerTranslation = answerTranslation;
	}
	
	public Locale getLanguage() {
		return language;
	}
	
	public void setLanguage(Locale language) {
		this.language = language;
	}
	
	public Long getFormAnswerId() {
		return formAnswerId;
	}
	
	public void setFormAnswerId(Long formAnswerId) {
		this.formAnswerId = formAnswerId;
	}
	
}
