package com.rcs.ind.common.filters.dtos;

import java.util.Date;

import com.rcs.ind.common.dtos.PaginationFiltersDTO;
import com.rcs.ind.common.enums.SampleEnum;

public class SamplePaginationFiltersDTO extends PaginationFiltersDTO {

	private Long sampleId;
	private Integer integer;
	private Date startDate;
	private Date endDate;
	private String string;
	private SampleEnum status;
	private Long sampleDepId;
	private Long[] sampleDeps;

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

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public String getString() {
		return string;
	}

	public void setString(String string) {
		this.string = string;
	}

	public SampleEnum getStatus() {
		return status;
	}

	public void setStatus(SampleEnum status) {
		this.status = status;
	}

	public Long getSampleDepId() {
		return sampleDepId;
	}

	public void setSampleDepId(Long sampleDepId) {
		this.sampleDepId = sampleDepId;
	}

	public Long[] getSampleDeps() {
		return sampleDeps;
	}

	public void setSampleDeps(Long[] sampleDeps) {
		this.sampleDeps = sampleDeps;
	}
}
