package com.rcs.ind.common.dtos;

import com.rcs.ind.common.enums.LanguageEnum;


public class TranslatorGridDTO {

	private long userId;
	private String userName;
	private String emailAddress;
	private String language;
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}



}
