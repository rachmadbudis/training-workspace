package com.rcs.ind.common.entities.dtos;

import com.rcs.ind.common.dtos.GenericEntityDTO;

public class CustomerDTO extends GenericEntityDTO {

	private Long customerId;

	public CustomerDTO() {
	}

	public CustomerDTO(Long customerId) {
		this.customerId = customerId;
	}

	public Long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}
}