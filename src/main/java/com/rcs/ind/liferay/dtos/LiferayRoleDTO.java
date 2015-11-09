package com.rcs.ind.liferay.dtos;

public class LiferayRoleDTO extends LiferayEntityDTO {

	private long classNameId;
	private long classPK;
	private long companyId;
	private String description;
	private String descriptionCurrentValue;
	private String name;
	private long roleId;
	private String subtype;
	private String title;
	private String titleCurrentValue;
	private int type;
	private long userId;
	private String userName;

	public long getClassNameId() {
		return classNameId;
	}

	public void setClassNameId(long classNameId) {
		this.classNameId = classNameId;
	}

	public long getClassPK() {
		return classPK;
	}

	public void setClassPK(long classPK) {
		this.classPK = classPK;
	}

	public long getCompanyId() {
		return companyId;
	}

	public void setCompanyId(long companyId) {
		this.companyId = companyId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDescriptionCurrentValue() {
		return descriptionCurrentValue;
	}

	public void setDescriptionCurrentValue(String descriptionCurrentValue) {
		this.descriptionCurrentValue = descriptionCurrentValue;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getRoleId() {
		return roleId;
	}

	public void setRoleId(long roleId) {
		this.roleId = roleId;
	}

	public String getSubtype() {
		return subtype;
	}

	public void setSubtype(String subtype) {
		this.subtype = subtype;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTitleCurrentValue() {
		return titleCurrentValue;
	}

	public void setTitleCurrentValue(String titleCurrentValue) {
		this.titleCurrentValue = titleCurrentValue;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
}
