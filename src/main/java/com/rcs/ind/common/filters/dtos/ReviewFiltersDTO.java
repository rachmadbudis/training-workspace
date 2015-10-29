package com.rcs.ind.common.filters.dtos;

import com.rcs.ind.common.dtos.PaginationFiltersDTO;


public class ReviewFiltersDTO extends PaginationFiltersDTO {
	
	private Long reviewId;
	private String formId;
	private String questionId;
	private String value;
	private Long applicationId;
	
	public Long getReviewId() {
		return reviewId;
	}
	
	public void setReviewId(Long reviewId) {
		this.reviewId = reviewId;
	}
	
	public String getValue() {
		return value;
	}
	
	public void setValue(String value) {
		this.value = value;
	}
	
	public Long getApplicationId() {
		return applicationId;
	}
	
	public void setApplicationId(Long applicationId) {
		this.applicationId = applicationId;
	}

	public String getQuestionId() {
		return questionId;
	}

	public void setQuestionId(String questionId) {
		this.questionId = questionId;
	}

	public String getFormId() {
		return formId;
	}

	public void setFormId(String formId) {
		this.formId = formId;
	}
	
	
	
}
