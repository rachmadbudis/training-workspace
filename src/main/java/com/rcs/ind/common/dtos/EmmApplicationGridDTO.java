package com.rcs.ind.common.dtos;

import java.util.Date;

public class EmmApplicationGridDTO extends ApplicationGridDTO {

	private Date startDate;
	private String vNumber;
	private String nationality;

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public String getvNumber() {
		return vNumber;
	}

	public void setvNumber(String vNumber) {
		this.vNumber = vNumber;
	}


}
