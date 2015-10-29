package com.rcs.ind.common.entities.dtos;

import com.rcs.ind.common.dtos.GenericEntityDTO;

public class ApplicationDTO extends GenericEntityDTO {

	private Long applicationId;
	private String smartflowNumber;
	private String language;
	private UserDTO createUser;

	public ApplicationDTO() {
	}

	public ApplicationDTO(Long applicationId, String smartflowNumber, String language, UserDTO createUser) {
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

	
	public String getLanguage() {
		return language;
	}

	
	public void setLanguage(String language) {
		this.language = language;
	}

	public UserDTO getCreateUser() {
		return createUser;
	}

	public void setCreateUser(UserDTO createUser) {
		this.createUser = createUser;
	}

}