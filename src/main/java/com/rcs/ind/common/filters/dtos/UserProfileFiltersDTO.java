package com.rcs.ind.common.filters.dtos;

import java.util.Locale;

import com.rcs.ind.common.dtos.PaginationFiltersDTO;


public class UserProfileFiltersDTO extends PaginationFiltersDTO {

	private Long userId;
	private Locale language;
	
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
