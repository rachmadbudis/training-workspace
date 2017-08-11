package com.rcs.ind.common.util;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.rcs.ind.common.RestRequester;
import com.rcs.ind.common.entities.dtos.ConfigurationDTO;
import com.rcs.ind.common.enums.ConfigurationEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.portlet.PortletRequest;
import java.util.List;

@Component
public class ConfigurationUtil {

	private static final Log logger = LogFactoryUtil.getLog(ConfigurationUtil.class);
	
	@Autowired
	private RestRequester restRequester;

	private final String CONFIGURATION_GET_CONFIG_VALUE = "/configuration/getConfigValue";
	private final String CONFIGURATION_GET_ALL = "/configuration/getAll";

	public String getConfig(ConfigurationEnum configurationEnum, PortletRequest request) {
		return restRequester.post(CONFIGURATION_GET_CONFIG_VALUE, configurationEnum, String.class, request).getPayload();
	}
	
	public List<ConfigurationDTO> getAllConfig(PortletRequest request) {
		return restRequester.postList(CONFIGURATION_GET_ALL, null, ConfigurationDTO.class, request).getPayload();
	}
}
