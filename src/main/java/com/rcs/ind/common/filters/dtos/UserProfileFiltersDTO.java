package com.rcs.ind.common.filters.dtos;

import java.util.Locale;

import com.rcs.ind.common.dtos.PaginationFiltersDTO;

public class UserProfileFiltersDTO extends PaginationFiltersDTO {

	private Long userId;
	private Locale language;
	private String location;
	private String origin;

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
