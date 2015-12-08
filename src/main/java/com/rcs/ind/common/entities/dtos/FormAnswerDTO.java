package com.rcs.ind.common.entities.dtos;

import java.util.Locale;

import com.rcs.ind.common.dtos.GenericEntityDTO;

public class FormAnswerDTO extends GenericEntityDTO {

	private Long formAnswerId;
	private String questionId;
	private String answer;
	private Locale answerLanguage;
	private ApplicationDTO application;

	public FormAnswerDTO() {
	}

	public FormAnswerDTO(Long formAnswerId, String questionId, String answer, Locale answerLanguage, ApplicationDTO application) {
		this.formAnswerId = formAnswerId;
		this.questionId = questionId;
		this.answer = answer;
		this.answerLanguage = answerLanguage;
		this.application = application;
	}

	public Long getFormAnswerId() {
		return formAnswerId;
	}

	public void setFormAnswerId(Long formAnswerId) {
		this.formAnswerId = formAnswerId;
	}

	public String getQuestionId() {
		return questionId;
	}

	public void setQuestionId(String questionId) {
		this.questionId = questionId;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public ApplicationDTO getApplication() {
		return application;
	}

	public void setApplication(ApplicationDTO application) {
		this.application = application;
	}

	public Locale getAnswerLanguage() {
		return answerLanguage;
	}

	public void setAnswerLanguage(Locale answerLanguage) {
		this.answerLanguage = answerLanguage;
	}

}