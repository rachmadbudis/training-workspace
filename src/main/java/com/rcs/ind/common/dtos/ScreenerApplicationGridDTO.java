package com.rcs.ind.common.dtos;


public class ScreenerApplicationGridDTO extends ApplicationGridDTO {

	private String vNumber;
	private String nationality;

	public String getvNumber() {
		return vNumber;
	}

	public void setvNumber(String vNumber) {
		this.vNumber = vNumber;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

}
