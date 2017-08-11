package com.rcs.ind.common;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.rcs.ind.common.entities.dtos.ConfigurationDTO;
import com.rcs.ind.common.enums.ConfigurationEnum;
import com.rcs.ind.common.util.ConfigurationUtil;
import com.rcs.ind.common.util.GenericUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.portlet.PortletRequest;
import java.util.List;
import java.util.Properties;

@Component
public class ConfigValues {

	private static final Log logger = LogFactoryUtil.getLog(ConfigValues.class);

	@Autowired
	private ConfigurationUtil configurationUtil;

	@Value(value = "${liferayAdminEmail}")
	private String liferayAdminEmail;

	@Value(value = "${interviewer.claim.application.limit}")
	private Long interviewerClaimApplicationLimit;

	@Value(value = "${translator.claim.application.limit}")
	private Long translatorClaimApplicationLimit;

	@Value(value = "${application.interview.expire.after}")
	private String applicationInterviewExpireAfter;

	@Value(value = "${application.build.number}")
	private String buildNumber;

	@Value(value = "${application.build.date}")
	private String buildDate;

	private static Properties props = new Properties();

	public void populateProps() {
		List<ConfigurationDTO> configurationDTOs = configurationUtil.getAllConfig(null);
		for (ConfigurationDTO configurationDTO : configurationDTOs) {
			props.put(configurationDTO.getKey(), configurationDTO.getValue());
		}
	}

	private String getProp(String key) {
		if (props.isEmpty()) {
			populateProps();
		}
		return props.getProperty(key);
	}

	public String getLiferayAdminEmail() {
		return liferayAdminEmail;
	}

	public String getPageOpenApplication(PortletRequest request) {
		return GenericUtil.getPageUrl(request, Long.parseLong(getProp(ConfigurationEnum.RD_OPEN_APPLICATION.getKey())));
	}

	public String getTripleformsStartForm(PortletRequest request) {
		return getProp(ConfigurationEnum.TF_FORM_URL.getKey());
	}

	public String getPageTranslateApplication(PortletRequest request) {
		return GenericUtil.getPageUrl(request, Long.parseLong(getProp(ConfigurationEnum.RD_TRANSLATE_APPLICATION.getKey())));
	}

	public Long getInterviewerClaimApplicationLimit() {
		return interviewerClaimApplicationLimit;
	}

	public Long getTranslatorClaimApplicationLimit() {
		return translatorClaimApplicationLimit;
	}

	public String getPageInterviewPreparation(PortletRequest request) {
		return GenericUtil.getPageUrl(request, Long.parseLong(getProp(ConfigurationEnum.RD_INTERVIEWER_PREPARATION.getKey())));
	}

	public String getPageInterviewProreg(PortletRequest request) {
		return GenericUtil.getPageUrl(request, Long.parseLong(getProp(ConfigurationEnum.RD_INTERVIEWER_INTERVIEW.getKey())));
	}

	public String getPageMarketplace(PortletRequest request) {
		return GenericUtil.getPageUrl(request, Long.parseLong(getProp(ConfigurationEnum.RD_INTERVIEWER_MARKETPLACE.getKey())));
	}

	public String getApplicationInterviewExpireAfter() {
		return applicationInterviewExpireAfter;
	}

	public String getPageActiveInterview(PortletRequest request) {
		return GenericUtil.getPageUrl(request, Long.parseLong(getProp(ConfigurationEnum.RD_SCREENER_INTERVIEW.getKey())));
	}

	public String getPageScreenerMarketplace(PortletRequest request) {
		return GenericUtil.getPageUrl(request, Long.parseLong(getProp(ConfigurationEnum.RD_SCREENER_MARKETPLACE.getKey())));
	}

	public String getPageRicMarketplace(PortletRequest request) {
		return GenericUtil.getPageUrl(request, Long.parseLong(getProp(ConfigurationEnum.RD_RIC_MARKETPLACE.getKey())));
	}

	public String getPageRicProfile(PortletRequest request) {
		return GenericUtil.getPageUrl(request, Long.parseLong(getProp(ConfigurationEnum.RD_RIC_PROFILE.getKey())));
	}

	public String getAutoExtend(PortletRequest request) {
		return getProp(ConfigurationEnum.SessionExtend.getKey());
	}

	public String getEnableWebSocket(PortletRequest request) {
		return getProp(ConfigurationEnum.WebSocket.getKey());
	}

	public String getBuildNumber() {
		return buildNumber;
	}

	public String getBuildDate() {
		return buildDate;
	}
}
