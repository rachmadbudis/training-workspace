package com.rcs.ind.common.entities.dtos;

import java.util.Date;

public class IndigoPreparationDTO {

    private String customerNumber;
    private String name;
    private String surname;
    private Date dateBirth;
    private String nationality;
    private String placeBirth;
    private String countryBirth;
    private String maritalStatus;
    private String sex;

    public IndigoPreparationDTO() {
    }

    public String getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(String customerNumber) {
        this.customerNumber = customerNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Date getDateBirth() {
        return dateBirth;
    }

    public void setDateBirth(Date dateBirth) {
        this.dateBirth = dateBirth;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getPlaceBirth() {
        return placeBirth;
    }

    public void setPlaceBirth(String placeBirth) {
        this.placeBirth = placeBirth;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

	
	public String getCountryBirth() {
		return countryBirth;
	}

	
	public void setCountryBirth(String countryBirth) {
		this.countryBirth = countryBirth;
	}
}
