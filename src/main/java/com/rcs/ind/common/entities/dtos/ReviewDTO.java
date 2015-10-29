package com.rcs.ind.common.entities.dtos;

import com.rcs.ind.common.dtos.GenericEntityDTO;

public class ReviewDTO extends GenericEntityDTO {

	private Long reviewId;
	private String formId;
	private String questionId;
	private String value;
	private ApplicationDTO application;

	public ReviewDTO() {
	}

	public ReviewDTO(Long reviewId, String formId, String questionId, String value, ApplicationDTO application) {
		this.reviewId = reviewId;
		this.formId = formId;
		this.questionId = questionId;
		this.value = value;
		this.application = application;
	}

	public Long getReviewId() {
		return reviewId;
	}

	public void setReviewId(Long reviewId) {
		this.reviewId = reviewId;
	}

	
	public String getFormId() {
		return formId;
	}

	public void setFormId(String formId) {
		this.formId = formId;
	}

	public String getQuestionId() {
		return questionId;
	}

	public void setQuestionId(String questionId) {
		this.questionId = questionId;
	}

	public String getValue() {
		return value;
	}

	
	public void setValue(String value) {
		this.value = value;
	}

	public ApplicationDTO getApplication() {
		return application;
	}

	public void setApplication(ApplicationDTO application) {
		this.application = application;
	}
}