package com.rcs.ind.common.dtos;

import java.util.List;
import java.util.Map;

import com.rcs.ind.common.entities.dtos.FormAnswerDTO;

public class ProregDTO {

	private String smartflowNumber;
	private List<FormAnswerDTO> formAnswers;
	private Map<String, String> data;

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

	public Map<String, String> getData() {
		return data;
	}

	public void setData(Map<String, String> data) {
		this.data = data;
	}

}
