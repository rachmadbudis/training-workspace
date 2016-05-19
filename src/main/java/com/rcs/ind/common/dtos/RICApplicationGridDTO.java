package com.rcs.ind.common.dtos;

import java.util.Date;
import java.util.Locale;

public class RICApplicationGridDTO extends ApplicationGridDTO {

	private Date updateDate;
	private String nationality;
	private Locale language;

	public Locale getLanguage() {
		return language;
	}

	public void setLanguage(Locale language) {
		this.language = language;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}
	
}
