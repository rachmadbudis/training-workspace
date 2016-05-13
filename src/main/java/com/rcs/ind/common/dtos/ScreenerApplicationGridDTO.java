package com.rcs.ind.common.dtos;

import java.util.Locale;

public class ScreenerApplicationGridDTO extends ApplicationGridDTO {

	private String vNumber;
	private String nationality;
	private Locale language;

	public String getvNumber() {
		return vNumber;
	}

	public void setvNumber(String vNumber) {
		this.vNumber = vNumber;
	}

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

}
