package com.rcs.ind.common.dtos;

import java.util.List;

import com.rcs.ind.common.entities.dtos.FormAnswerDTO;

public class ProregDTO {

	private String smartflowNumber;
	private List<FormAnswerDTO> formAnswers;

	public String getSmartflowNumber() {
		return smartflowNumber;
	}

	public void setSmartflowNumber(String smartflowNumber) {
		this.smartflowNumber = smartflowNumber;
	}

	public List<FormAnswerDTO> getFormAnswers() {
		return formAnswers;
	}

	public void setFormAnswers(List<FormAnswerDTO> formAnswers) {
		this.formAnswers = formAnswers;
	}

}
