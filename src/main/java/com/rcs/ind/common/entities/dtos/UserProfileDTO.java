package com.rcs.ind.common.entities.dtos;

import java.util.Locale;

import com.rcs.ind.common.dtos.GenericEntityDTO;

public class UserProfileDTO extends GenericEntityDTO {

	private Long userId;
	private Locale language;

	public UserProfileDTO() {
	}

	public UserProfileDTO(Long userId, Locale language) {
		this.userId = userId;
		this.language = language;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	
	public Locale getLanguage() {
		return language;
	}

	
	public void setLanguage(Locale language) {
		this.language = language;
	}
}