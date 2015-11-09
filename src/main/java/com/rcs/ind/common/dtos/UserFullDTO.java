package com.rcs.ind.common.dtos;

import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

public class UserFullDTO extends GenericEntityDTO {

	private Long userId;
	private Set<Locale> languages;
	private String firstName;
	private String lastName;
	private String emailAddress;
	private Set<String> roles;

	public UserFullDTO() {
		this.roles = new HashSet<String>();
	}	

	public UserFullDTO(Long userId, Set<Locale> languages, String firstName, String lastName, String emailAddress, Set<String> roles) {
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

	public Set<String> getRoles() {
		return roles;
	}
	
	public void setRoles(Set<String> roles) {
		this.roles = roles;
	}
	
	public void addRoles(String role) {
		this.roles.add(role);
	}
}