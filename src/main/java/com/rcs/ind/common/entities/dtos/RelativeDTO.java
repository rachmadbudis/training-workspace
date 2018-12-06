package com.rcs.ind.common.entities.dtos;

import com.rcs.ind.common.enums.RelationEnum;
import java.util.Date;

public class RelativeDTO implements Comparable<RelativeDTO>{
    private long customerId;
    private String vNumber;
    private String firstName;
    private String lastName;
    private Date dateOfBirth;
    private RelationEnum relatie;

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

    public RelationEnum getRelatie() {
        return relatie;
    }

    public void setRelatie(RelationEnum relatie) {
        this.relatie = relatie;
    }

	@Override
	public int compareTo(RelativeDTO o) {
        return Integer.compare(getRelatie().ordinal(), o.getRelatie().ordinal());
    }

}
