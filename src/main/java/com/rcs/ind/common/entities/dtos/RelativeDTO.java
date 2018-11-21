package com.rcs.ind.common.entities.dtos;

import java.util.Date;

import com.rcs.ind.common.dtos.CustomerGridDTO;
import com.rcs.ind.common.enums.RelationEnum;

public class RelativeDTO implements Comparable<RelativeDTO>{
    private long customerId;
    private String vNumber;
    private String firstName;
    private String lastName;
    private Date dateOfBirth;
    private String relatie;

    public long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(long customerId) {
        this.customerId = customerId;
    }

    public String getvNumber() {
        return vNumber;
    }

    public void setvNumber(String vNumber) {
        this.vNumber = vNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getRelatie() {
        return relatie;
    }

    public void setRelatie(String relatie) {
        this.relatie = relatie;
    }

	@Override
	public int compareTo(RelativeDTO o) {
        if (RelationEnum.getByIndigoKey(getRelatie()).ordinal() > RelationEnum.getByIndigoKey(o.getRelatie()).ordinal()) return 1;
        if (RelationEnum.getByIndigoKey(getRelatie()).ordinal() < RelationEnum.getByIndigoKey(o.getRelatie()).ordinal()) return -1;
        else return 0;
	}

}
