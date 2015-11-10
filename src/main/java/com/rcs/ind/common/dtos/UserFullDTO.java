package com.rcs.ind.common.dtos;

import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.rcs.ind.liferay.enums.LiferayRoleEnum;

public class UserFullDTO {

	private Long userId;
	@JsonDeserialize(contentAs = Locale.class)
	private Set<Locale> languages;
	private String firstName;
	private String lastName;
	private String emailAddress;
	@JsonDeserialize(contentAs = LiferayRoleEnum.class)
	private Set<LiferayRoleEnum> roles;

	public UserFullDTO() {
		this.roles = new HashSet<LiferayRoleEnum>();
	}

	public UserFullDTO(Long userId, Set<Locale> languages, String firstName, String lastName, String emailAddress, Set<LiferayRoleEnum> roles) {
		this.userId = userId;
		this.languages = languages;
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailAddress = emailAddress;
		this.roles = roles;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Set<Locale> getLanguages() {
		return languages;
	}

	public void setLanguages(Set<Locale> languages) {
		this.languages = languages;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public Set<LiferayRoleEnum> getRoles() {
		return roles;
	}

	public void setRoles(Set<LiferayRoleEnum> roles) {
		this.roles = roles;
	}

	public void addRoles(LiferayRoleEnum role) {
		this.roles.add(role);
	}
}