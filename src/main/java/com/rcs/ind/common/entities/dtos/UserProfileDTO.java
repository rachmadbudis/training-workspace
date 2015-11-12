package com.rcs.ind.common.entities.dtos;

import java.util.Locale;

import com.rcs.ind.common.dtos.GenericEntityDTO;

public class UserProfileDTO extends GenericEntityDTO {

	private Long userId;
	private Locale language;
	private String location;
	private String origin;

	public UserProfileDTO() {
	}

	public UserProfileDTO(Long userId, Locale language, String location, String origin) {
		this.userId = userId;
		this.language = language;
		this.location = location;
		this.origin = origin;
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

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}
}