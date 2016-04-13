package com.rcs.ind.common.entities.dtos;

import com.rcs.ind.common.dtos.KeyValuePairDTO;

public class ConfigurationDTO extends KeyValuePairDTO {

	private Long configurationId;

	public ConfigurationDTO() {
	}

	public ConfigurationDTO(Long configurationId) {
		this.configurationId = configurationId;
	}

	public Long getConfigurationId() {
		return configurationId;
	}

	public void setConfigurationId(Long configurationId) {
		this.configurationId = configurationId;
	}

}