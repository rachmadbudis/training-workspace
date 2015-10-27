package com.rcs.ind.common.entities.dtos;

import java.util.Date;

import com.rcs.ind.common.dtos.GenericEntityDTO;
import com.rcs.ind.common.enums.SampleEnum;

public class SampleDTO extends GenericEntityDTO {

	private Long sampleId;
	private Integer integer;
	private String string;
	private Boolean trueFalse;
	private Date date;
	private SampleEnum status;
	private SampleDepDTO sampleDep;

	public SampleDTO() {
	}

	public SampleDTO(Long sampleId, Integer integer, String string, Boolean trueFalse, Date date, SampleEnum status, SampleDepDTO sampleDep) {
		this.sampleId = sampleId;
		this.integer = integer;
		this.string = string;
		this.trueFalse = trueFalse;
		this.date = date;
		this.status = status;
		this.sampleDep = sampleDep;
	}

	public Long getSampleId() {
		return sampleId;
	}

	public void setSampleId(Long sampleId) {
		this.sampleId = sampleId;
	}

	public Integer getInteger() {
		return integer;
	}

	public void setInteger(Integer integer) {
		this.integer = integer;
	}

	public String getString() {
		return string;
	}

	public void setString(String string) {
		this.string = string;
	}

	public Boolean getTrueFalse() {
		return trueFalse;
	}

	public void setTrueFalse(Boolean trueFalse) {
		this.trueFalse = trueFalse;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public SampleEnum getStatus() {
		return status;
	}

	public void setStatus(SampleEnum status) {
		this.status = status;
	}

	public SampleDepDTO getSampleDep() {
		return sampleDep;
	}

	public void setSampleDep(SampleDepDTO sampleDep) {
		this.sampleDep = sampleDep;
	}
}
