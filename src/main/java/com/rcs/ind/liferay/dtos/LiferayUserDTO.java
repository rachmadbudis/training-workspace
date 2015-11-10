package com.rcs.ind.liferay.dtos;

import java.util.Date;
import java.util.Locale;

public class LiferayUserDTO extends LiferayEntityDTO {

	private boolean agreedToTermsOfUse;
	private String comments;
	private long companyId;
	private long contactId;
	private boolean defaultUser;
	private String emailAddress;
	private boolean emailAddressVerified;
	private long facebookId;
	private int failedLoginAttempts;
	private String firstName;
	private int graceLoginCount;
	private String greeting;
	private String jobTitle;
	private Locale languageId;
	private Date lastFailedLoginDate;
	private Date lastLoginDate;
	private String lastLoginIP;
	private String lastName;
	private long ldapServerId;
	private boolean lockout;
	private Date lockoutDate;
	private Date loginDate;
	private String loginIP;
	private String middleName;
	private String openId;
	private long portraitId;
	private String reminderQueryAnswer;
	private String reminderQueryQuestion;
	private String screenName;
	private int status;
	private String timeZoneId;
	private long userId;

	public boolean isAgreedToTermsOfUse() {
		return agreedToTermsOfUse;
	}

	public void setAgreedToTermsOfUse(boolean agreedToTermsOfUse) {
		this.agreedToTermsOfUse = agreedToTermsOfUse;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public long getCompanyId() {
		return companyId;
	}

	public void setCompanyId(long companyId) {
		this.companyId = companyId;
	}

	public long getContactId() {
		return contactId;
	}

	public void setContactId(long contactId) {
		this.contactId = contactId;
	}

	public boolean isDefaultUser() {
		return defaultUser;
	}

	public void setDefaultUser(boolean defaultUser) {
		this.defaultUser = defaultUser;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public boolean isEmailAddressVerified() {
		return emailAddressVerified;
	}

	public void setEmailAddressVerified(boolean emailAddressVerified) {
		this.emailAddressVerified = emailAddressVerified;
	}

	public long getFacebookId() {
		return facebookId;
	}

	public void setFacebookId(long facebookId) {
		this.facebookId = facebookId;
	}

	public int getFailedLoginAttempts() {
		return failedLoginAttempts;
	}

	public void setFailedLoginAttempts(int failedLoginAttempts) {
		this.failedLoginAttempts = failedLoginAttempts;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public int getGraceLoginCount() {
		return graceLoginCount;
	}

	public void setGraceLoginCount(int graceLoginCount) {
		this.graceLoginCount = graceLoginCount;
	}

	public String getGreeting() {
		return greeting;
	}

	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public Locale getLanguageId() {
		return languageId;
	}

	public void setLanguageId(Locale languageId) {
		this.languageId = languageId;
	}

	public Date getLastFailedLoginDate() {
		return lastFailedLoginDate;
	}

	public void setLastFailedLoginDate(Date lastFailedLoginDate) {
		this.lastFailedLoginDate = lastFailedLoginDate;
	}

	public Date getLastLoginDate() {
		return lastLoginDate;
	}

	public void setLastLoginDate(Date lastLoginDate) {
		this.lastLoginDate = lastLoginDate;
	}

	public String getLastLoginIP() {
		return lastLoginIP;
	}

	public void setLastLoginIP(String lastLoginIP) {
		this.lastLoginIP = lastLoginIP;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public long getLdapServerId() {
		return ldapServerId;
	}

	public void setLdapServerId(long ldapServerId) {
		this.ldapServerId = ldapServerId;
	}

	public boolean isLockout() {
		return lockout;
	}

	public void setLockout(boolean lockout) {
		this.lockout = lockout;
	}

	public Date getLockoutDate() {
		return lockoutDate;
	}

	public void setLockoutDate(Date lockoutDate) {
		this.lockoutDate = lockoutDate;
	}

	public Date getLoginDate() {
		return loginDate;
	}

	public void setLoginDate(Date loginDate) {
		this.loginDate = loginDate;
	}

	public String getLoginIP() {
		return loginIP;
	}

	public void setLoginIP(String loginIP) {
		this.loginIP = loginIP;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getOpenId() {
		return openId;
	}

	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public long getPortraitId() {
		return portraitId;
	}

	public void setPortraitId(long portraitId) {
		this.portraitId = portraitId;
	}

	public String getReminderQueryAnswer() {
		return reminderQueryAnswer;
	}

	public void setReminderQueryAnswer(String reminderQueryAnswer) {
		this.reminderQueryAnswer = reminderQueryAnswer;
	}

	public String getReminderQueryQuestion() {
		return reminderQueryQuestion;
	}

	public void setReminderQueryQuestion(String reminderQueryQuestion) {
		this.reminderQueryQuestion = reminderQueryQuestion;
	}

	public String getScreenName() {
		return screenName;
	}

	public void setScreenName(String screenName) {
		this.screenName = screenName;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getTimeZoneId() {
		return timeZoneId;
	}

	public void setTimeZoneId(String timeZoneId) {
		this.timeZoneId = timeZoneId;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}
}
