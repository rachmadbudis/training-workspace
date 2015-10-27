package com.rcs.ind.common.dtos;

public class AutocompleteRequestDTO {

	private String searchTerm;
	private Long[] removeIds;

	public AutocompleteRequestDTO() {
	}

	public AutocompleteRequestDTO(String searchTerm, Long[] removeIds) {
		this.searchTerm = searchTerm;
		this.removeIds = removeIds;
	}

	public String getSearchTerm() {
		return searchTerm;
	}

	public void setSearchTerm(String searchTerm) {
		this.searchTerm = searchTerm;
	}

	public Long[] getRemoveIds() {
		return removeIds;
	}

	public void setRemoveIds(Long[] removeIds) {
		this.removeIds = removeIds;
	}
}
