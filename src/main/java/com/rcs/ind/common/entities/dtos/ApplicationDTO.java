package com.rcs.ind.common.entities.dtos;

import java.util.List;
import java.util.Locale;

import com.rcs.ind.common.dtos.GenericEntityDTO;
import com.rcs.ind.common.enums.ReleaseReason;

public class ApplicationDTO extends GenericEntityDTO {

	private Long applicationId;
	private String smartflowNumber;
	private Locale language;
	private String location;
	private Boolean registered;
	private UserProfileDTO createUser;
	private List<DocumentDTO> documents;
	private boolean completeOnSubmit;
	private ReleaseReason releaseReason;

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
	
	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
	
	public Boolean getRegistered() {
		return registered;
	}

	public void setRegistered(Boolean registered) {
		this.registered = registered;
	}

	public UserProfileDTO getCreateUser() {
		return createUser;
	}

	public void setCreateUser(UserProfileDTO createUser) {
		this.createUser = createUser;
	}

	public List<DocumentDTO> getDocuments() {
		return documents;
	}

	public void setDocuments(List<DocumentDTO> documents) {
		this.documents = documents;
	}

	public boolean isCompleteOnSubmit() {
		return completeOnSubmit;
	}

	public void setCompleteOnSubmit(boolean completeOnSubmit) {
		this.completeOnSubmit = completeOnSubmit;
	}

	public ReleaseReason getReleaseReason() {
		return releaseReason;
	}

	public void setReleaseReason(ReleaseReason releaseReason) {
		this.releaseReason = releaseReason;
	}
}