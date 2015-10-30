package com.rcs.ind.common.entities.dtos;

import com.rcs.ind.common.dtos.GenericEntityDTO;

public class FormAnswerDTO extends GenericEntityDTO {

	private Long formAnswerId;
	private Integer questionNumber;
	private String answer;
	private ApplicationDTO application;

	public FormAnswerDTO() {
	}

	public FormAnswerDTO(Long formAnswerId, Integer questionNumber, String answer, ApplicationDTO application) {
		this.formAnswerId = formAnswerId;
		this.questionNumber = questionNumber;
		this.answer = answer;
		this.application = application;
	}

	public Long getFormAnswerId() {
		return formAnswerId;
	}

	public void setFormAnswerId(Long formAnswerId) {
		this.formAnswerId = formAnswerId;
	}

	
	public Integer getQuestionNumber() {
		return questionNumber;
	}

	
	public void setQuestionNumber(Integer questionNumber) {
		this.questionNumber = questionNumber;
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

}