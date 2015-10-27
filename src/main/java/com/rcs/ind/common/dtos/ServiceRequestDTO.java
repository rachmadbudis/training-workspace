package com.rcs.ind.common.dtos;

import java.util.Date;
import java.util.Locale;

import com.rcs.ind.common.enums.ValidatorTypeEnum;

public class ServiceRequestDTO<T> {

	// Used as an extra unique parameter for hashing.
	private String timestamp = String.valueOf(new Date().getTime());

	// Used for validation between portlet and services.
	private String idToken;

	// The validator to use.
	private ValidatorTypeEnum validator;

	// Used to authenticate the user that comes from the portlet/client to the service.
	private String userEmail;

	// Used to authenticate the user that comes from the portlet (Optional).
	private long userId;

	// User locale (Optional).
	private Locale userLocale;

	// Liferay specific fields (Optionals).
	private long groupId;
	private long companyId;

	// Request payload.
	private T payload;

	public String getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

	public String getIdToken() {
		return idToken;
	}

	public void setIdToken(String idToken) {
		this.idToken = idToken;
	}

	public ValidatorTypeEnum getValidator() {
		return validator;
	}

	public void setValidator(ValidatorTypeEnum validator) {
		this.validator = validator;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public Locale getUserLocale() {
		return userLocale;
	}

	public void setUserLocale(Locale userLocale) {
		this.userLocale = userLocale;
	}

	public long getGroupId() {
		return groupId;
	}

	public void setGroupId(long groupId) {
		this.groupId = groupId;
	}

	public long getCompanyId() {
		return companyId;
	}

	public void setCompanyId(long companyId) {
		this.companyId = companyId;
	}

	public T getPayload() {
		return payload;
	}

	public void setPayload(T payload) {
		this.payload = payload;
	}
}
