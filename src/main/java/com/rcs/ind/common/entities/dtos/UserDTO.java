package com.rcs.ind.common.entities.dtos;

import com.rcs.ind.common.dtos.GenericEntityDTO;

public class UserDTO extends GenericEntityDTO {

	private Long userId;
	private String language;

	public UserDTO() {
	}

	public UserDTO(Long userId, String language) {
		this.userId = userId;
		this.language = language;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	
	public String getLanguage() {
		return language;
	}

	
	public void setLanguage(String language) {
		this.language = language;
	}
}