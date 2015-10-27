package com.rcs.ind.common.entities.dtos;

import com.rcs.ind.common.dtos.GenericEntityDTO;

public class SampleDepDTO extends GenericEntityDTO {

	public static final String SAMPLE_DEP_ID = "sampleDepId";
	public static final String NAME = "name";

	private Long sampleDepId;
	private String name;

	public SampleDepDTO() {
	}

	public SampleDepDTO(Long sampleDepId, String name) {
		this.sampleDepId = sampleDepId;
		this.name = name;
	}

	public Long getSampleDepId() {
		return sampleDepId;
	}

	public void setSampleDepId(Long sampleDepId) {
		this.sampleDepId = sampleDepId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
