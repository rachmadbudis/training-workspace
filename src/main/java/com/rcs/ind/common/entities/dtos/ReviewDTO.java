package com.rcs.ind.common.entities.dtos;

import com.rcs.ind.common.dtos.GenericEntityDTO;

public class ReviewDTO extends GenericEntityDTO {

	private Long reviewId;
	private String workflow;
	private String questionId;
	private String value;
	private ApplicationDTO application;

	public ReviewDTO() {
	}

	public ReviewDTO(Long reviewId, String workflow, String questionId, String value, ApplicationDTO application) {
		this.reviewId = reviewId;
		this.workflow = workflow;
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

	public String getWorkflow() {
		return workflow;
	}

	public void setWorkflow(String workflow) {
		this.workflow = workflow;
	}
}