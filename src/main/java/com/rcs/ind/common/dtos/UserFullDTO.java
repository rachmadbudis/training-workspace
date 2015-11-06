package com.rcs.ind.common.dtos;

import java.util.Locale;
import java.util.Set;

public class UserFullDTO extends GenericEntityDTO {

	private Long userId;
	private Set<Locale> language;
	private String firstName;
	private String lastName;
	private String email;
	private Set<String> roles;

	public UserFullDTO() {
	}	

	public UserFullDTO(Long userId, Set<Locale> language, String firstName, String lastName, String email, Set<String> roles) {
		this.userId = userId;
		this.language = language;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.roles = roles;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}
	
	public Set<Locale> getLanguage() {
		return language;
	}
	
	public void setLanguage(Set<Locale> language) {
		this.language = language;
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
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public Set<String> getRoles() {
		return roles;
	}
	
	public void setRoles(Set<String> roles) {
		this.roles = roles;
	}
}