package com.rcs.ind.common.dtos;

import java.util.Collections;
import java.util.Date;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Set;

import com.rcs.ind.common.enums.ValidatorTypeEnum;
import com.rcs.ind.liferay.enums.LiferayRoleEnum;

public class ServiceRequestDTO<T> {

	// Used as an extra unique parameter for hashing.
	private String timestamp = String.valueOf(new Date().getTime());

	// Used for validation between portlet and services.
	private String idToken;

	// The validator to use.
	private ValidatorTypeEnum validator;

	// Used to authenticate the user that comes from the portlet/client to the service.
	private String userEmail;

	// User First Name (Optional)
	private String userFirstName;

	// User Last Name (Optional)
	private String userLastName;

	// Used to authenticate the user that comes from the portlet (Optional).
	private long userId;

	// User locale (Optional).
	private Locale userLocale;

	// Liferay specific fields (Optionals).
	private long groupId;
	private long companyId;

	// Request payload.
	private T payload;

	/**
	 * Roles owned by current user
	 */
	private Set<String> userRoles = Collections.synchronizedSet(new LinkedHashSet<String>());

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

	/**
	 * Get All roles owned by current user
	 * 
	 * @return List of roles in string, zero list will returned if user does not have any role.
	 */
	public Set<String> getUserRoles() {
		return userRoles;
	}

	/**
	 * set roles
	 * 
	 * @param ownedRoles
	 */
	public void setUserRoles(Set<String> userRoles) {
		this.userRoles = userRoles;
	}

	/**
	 * Helper method to add a role.
	 * 
	 * @param role
	 */
	public void addUserRole(String role) {
		this.userRoles.add(role);
	}

	/**
	 * Check one or more roles belong to user or not
	 * 
	 * @param roles
	 *            one or more role to be checked
	 * @return return true if one of params belong to user, otherwise return false
	 */
	public boolean hasUserRole(LiferayRoleEnum... roles) {
		for (LiferayRoleEnum role : roles) {
			if (userRoles.contains(role.getName())) {
				return true;
			}
		}
		return false;
	}

	public String getUserFirstName() {
		return userFirstName;
	}

	public void setUserFirstName(String userFirstName) {
		this.userFirstName = userFirstName;
	}

	public String getUserLastName() {
		return userLastName;
	}

	public void setUserLastName(String userLastName) {
		this.userLastName = userLastName;
	}

}
