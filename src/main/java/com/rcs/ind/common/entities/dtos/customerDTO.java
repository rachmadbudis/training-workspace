package com.rcs.ind.common.entities.dtos;

import com.rcs.ind.common.dtos.GenericEntityDTO;

public class customerDTO extends GenericEntityDTO {

	private Long customerId;

	public customerDTO() {
	}

	public customerDTO(Long customerId) {
		this.customerId = customerId;
	}

	public Long getcustomerId() {
		return customerId;
	}

	public void setcustomerId(Long customerId) {
		this.customerId = customerId;
	}
}