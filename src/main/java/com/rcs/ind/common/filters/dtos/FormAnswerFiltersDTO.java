package com.rcs.ind.common.filters.dtos;

import java.util.List;
import java.util.Locale;

import com.rcs.ind.common.dtos.PaginationFiltersDTO;

public class FormAnswerFiltersDTO extends PaginationFiltersDTO {

	private Long formAnswerId;
	private String questionId;
	private String answer;
	private String translation;
	private Locale answerLanguage;
	private Long applicationId;
	private List<Long> applicationIds;
	private List<String> questionIds;

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

	public String getTranslation() {
		return translation;
	}

	public void setTranslation(String translation) {
		this.translation = translation;
	}

	public Long getApplicationId() {
		return applicationId;
	}

	public void setApplicationId(Long applicationId) {
		this.applicationId = applicationId;
	}

	public Locale getAnswerLanguage() {
		return answerLanguage;
	}

	public void setAnswerLanguage(Locale answerLanguage) {
		this.answerLanguage = answerLanguage;
	}

	public List<String> getQuestionIds() {
		return questionIds;
	}

	public void setQuestionIds(List<String> questionIds) {
		this.questionIds = questionIds;
	}

	public List<Long> getApplicationIds() {
		return applicationIds;
	}

	public void setApplicationIds(List<Long> applicationIds) {
		this.applicationIds = applicationIds;
	}

}
