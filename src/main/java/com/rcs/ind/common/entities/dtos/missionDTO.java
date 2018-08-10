package com.rcs.ind.common.entities.dtos;

import com.rcs.ind.common.dtos.GenericEntityDTO;

public class missionDTO extends GenericEntityDTO {

	private Long missionId;

	public missionDTO() {
	}

	public missionDTO(Long missionId) {
		this.missionId = missionId;
	}

	public Long getmissionId() {
		return missionId;
	}

	public void setmissionId(Long missionId) {
		this.missionId = missionId;
	}
}