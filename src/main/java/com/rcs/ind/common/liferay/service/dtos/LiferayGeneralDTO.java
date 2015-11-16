package com.rcs.ind.common.liferay.service.dtos;


import java.util.Date;


public class LiferayGeneralDTO {

	private String uuid;
	private String exception;
	private boolean active;
	private Date createDate;
	private Date modifiedDate;
	
	public String getUuid() {
		return uuid;
	}
	
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}
	
	public String getException() {
		return exception;
	}
	
	public void setException(String exception) {
		this.exception = exception;
	}

	
	public boolean isActive() {
		return active;
	}

	
	public void setActive(boolean active) {
		this.active = active;
	}

	
	public Date getCreateDate() {
		return createDate;
	}

	
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	
	public Date getModifiedDate() {
		return modifiedDate;
	}

	
	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}
	
	
}
