package com.rcs.ind.common.entities.dtos;

import java.util.Locale;

import com.rcs.ind.common.dtos.GenericEntityDTO;

public class FormAnswerTranslationDTO extends GenericEntityDTO {

	private Long formAnswerTranslationId;
	private String answerTranslation;
	private Locale language;
	private FormAnswerDTO formAnswer;

	public FormAnswerTranslationDTO() {
	}

	public FormAnswerTranslationDTO(Long formAnswerTranslationId, String answerTranslation, Locale language, FormAnswerDTO formAnswer) {
		this.formAnswerTranslationId = formAnswerTranslationId;
		this.answerTranslation = answerTranslation;
		this.language = language;
		this.formAnswer = formAnswer;
	}

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

	public FormAnswerDTO getFormAnswer() {
		return formAnswer;
	}

	public void setFormAnswer(FormAnswerDTO formAnswer) {
		this.formAnswer = formAnswer;
	}
}