package com.rcs.ind.common.dtos;

import java.util.Date;

public abstract class GenericEntityDTO {

	private boolean active;
	private Date creationDate;
	private Date modificationDate;
	private String modificationUser;

	public GenericEntityDTO() {
	}

	public GenericEntityDTO(boolean active, Date creationDate, Date modificationDate, String modificationUser) {
		this.active = active;
		this.creationDate = creationDate;
		this.modificationDate = modificationDate;
		this.modificationUser = modificationUser;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public Date getModificationDate() {
		return modificationDate;
	}

	public void setModificationDate(Date modificationDate) {
		this.modificationDate = modificationDate;
	}

	public String getModificationUser() {
		return modificationUser;
	}

	public void setModificationUser(String modificationUser) {
		this.modificationUser = modificationUser;
	}
}
