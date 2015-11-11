package com.rcs.ind.common.dtos;

import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Set;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.rcs.ind.liferay.enums.LiferayRoleEnum;

public class UserFullDTO {

	private Long userId;
	@JsonDeserialize(as = LinkedHashSet.class)
	private Set<Locale> languages;
	private String firstName;
	private String lastName;
	private String emailAddress;
	@JsonDeserialize(as = LinkedHashSet.class)
	private Set<LiferayRoleEnum> roles;
	private String location;
	private String origin;

	public UserFullDTO() {
		this.roles = new LinkedHashSet<LiferayRoleEnum>();
	}	

	public UserFullDTO(Long userId, Set<Locale> languages, String firstName, String lastName, String emailAddress, Set<LiferayRoleEnum> roles, String location,
			String origin) {
		this.userId = userId;
		this.languages = languages;
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailAddress = emailAddress;
		this.roles = roles;
		this.location = location;
		this.origin = origin;
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