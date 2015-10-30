package com.rcs.ind.common.entities.dtos;

import java.util.Locale;

import com.rcs.ind.common.dtos.GenericEntityDTO;

public class ApplicationDTO extends GenericEntityDTO {

	private Long applicationId;
	private String smartflowNumber;
	private Locale language;
	private UserProfileDTO createUser;

	public ApplicationDTO() {
	}

	public ApplicationDTO(Long applicationId, String smartflowNumber, Locale language, UserProfileDTO createUser) {
		this.applicationId = applicationId;
		this.smartflowNumber = smartflowNumber;
		this.language = language;
		this.createUser = createUser;
	}

	public Long getApplicationId() {
		return applicationId;
	}

	public void setApplicationId(Long applicationId) {
		this.applicationId = applicationId;
	}

	
	public String getSmartflowNumber() {
		return smartflowNumber;
	}

	
	public void setSmartflowNumber(String smartflowNumber) {
		this.smartflowNumber = smartflowNumber;
	}

	
	public Locale getLanguage() {
		return language;
	}

	
	public void setLanguage(Locale language) {
		this.language = language;
	}

	public UserProfileDTO getCreateUser() {
		return createUser;
	}

	public void setCreateUser(UserProfileDTO createUser) {
		this.createUser = createUser;
	}

}