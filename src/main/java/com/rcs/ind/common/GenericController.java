package com.rcs.ind.common;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.language.LanguageUtil;
import com.liferay.portal.kernel.util.KeyValuePair;
import com.liferay.portal.kernel.util.LocaleUtil;
import com.liferay.portal.model.Company;
import com.liferay.portal.model.User;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.service.ServiceContextFactory;
import com.liferay.portal.util.PortalUtil;
import com.rcs.ind.common.enums.LanguageEnum;
import org.springframework.web.portlet.ModelAndView;

import javax.portlet.PortletRequest;
import javax.portlet.PortletResponse;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.ResourceBundle;

public class GenericController {

	private static final Map<String, List<KeyValuePair>> AVAILABLE_LANGUAGE_LIST;
	private static final List<KeyValuePair> LANGUAGE_LIST;

	static {
		Map<String, List<KeyValuePair>> availableLanguage = new HashMap<>();
		for (LanguageEnum languageEnum : LanguageEnum.values()) {
			if (!availableLanguage.containsKey(languageEnum.getLanguage().getDisplayCountry())) {
				List<KeyValuePair> lang = new ArrayList<KeyValuePair>();
				lang.add(new KeyValuePair(LocaleUtil.toLanguageId(languageEnum.getLanguage()), languageEnum.getLabel()));
				availableLanguage.put(languageEnum.getLanguage().getDisplayCountry(), lang);
			} else {
				availableLanguage.get(languageEnum.getLanguage().getDisplayCountry()).add(
						new KeyValuePair(LocaleUtil.toLanguageId(languageEnum.getLanguage()), languageEnum.getLabel()));
			}

		}
		AVAILABLE_LANGUAGE_LIST = Collections.unmodifiableMap(availableLanguage);
	}

	static {
		List<KeyValuePair> languages = new ArrayList<KeyValuePair>();
		for (LanguageEnum languageEnum : LanguageEnum.getCustomerLanguageList()) {
			languages.add(new KeyValuePair(languageEnum.getLanguage().toString(), languageEnum.getLabel()));
		}
		LANGUAGE_LIST = Collections.unmodifiableList(languages);
	}

	/**
	 * Get translated key from both the Portlet's resources or the Liferay built-in resources otherwise. If no resource is found, just return the key.
	 * 
	 * @param request
	 * @param key
	 * @return
	 */
	public static String getLocalizedKey(PortletRequest request, String key) {
		Locale locale = LocaleUtil.fromLanguageId(LanguageUtil.getLanguageId(request));

		// Try to get the resource first from portlet's own stuff.
		ResourceBundle res = ResourceBundle.getBundle("Language", locale);
		String value = res.containsKey(key) ? res.getString(key) : key;

		// If it could not be translated, try with the Liferay resources.
		if (value.equals(key)) {
			value = LanguageUtil.get(locale, key, key);
		}

		return value;
	}

	protected Locale getLocale(PortletRequest request) {
		return LocaleUtil.fromLanguageId(getLocaleId(request));
	}

	protected String getLocaleId(PortletRequest request) {
		return LanguageUtil.getLanguageId(request);
	}

	protected Company getCompany(PortletRequest request) throws PortalException, SystemException {
		return PortalUtil.getCompany(request);
	}

	protected long getCompanyId(PortletRequest request) throws PortalException, SystemException {
		return getCompany(request).getCompanyId();
	}

	protected long getGroupId(PortletRequest request) throws PortalException, SystemException {
		return getCompany(request).getGroup().getGroupId();
	}

	protected long getSiteId(PortletRequest request) throws PortalException, SystemException {
		return PortalUtil.getScopeGroupId(request);
	}

	protected String getPortalUrl(PortletRequest request) {
		return PortalUtil.getPortalURL(request);
	}

	protected User getLoggedUser(PortletRequest request) throws PortalException, SystemException {
		return PortalUtil.getUser(request);
	}

	protected long getUserId(PortletRequest request) {
		return PortalUtil.getUserId(request);
	}

	protected String getUserEmail(PortletRequest request) {
		String userEmail = null;
		try {
			User user = PortalUtil.getUser(request);
			userEmail = user.getEmailAddress();
		} catch (Exception ignored) {
		}
		return userEmail;
	}

	protected ServiceContext getServiceContext(PortletRequest request) throws PortalException, SystemException {
		return ServiceContextFactory.getInstance(request);
	}

	protected ModelAndView getJsonModelAndView(PortletResponse response, BackendResponse backendResponse) {
		return new ModelAndView(new JsonModelAndView(backendResponse.toString()), "model", backendResponse);
	}

	protected ModelAndView getDefaultErrorPage(PortletRequest request, String resourceBundleKey) {
		String message = getLocalizedKey(request, resourceBundleKey);
		HashMap<String, Object> modelAttrs = new HashMap<String, Object>();
		modelAttrs.put("message", message);
		return new ModelAndView("error", modelAttrs);
	}

	protected Map<String, List<KeyValuePair>> getAvailableLanguages() {
		return AVAILABLE_LANGUAGE_LIST;
	}

	protected List<KeyValuePair> getLanguages() {
		return LANGUAGE_LIST;
	}

	/**
	 * Get translated key.
	 * 
	 * @param request
	 * @param key
	 * @return
	 */
	public static String getLocalizedKeyUTF8(Locale locale, String key) {
		// Try to get the resource first from portlet's own stuff.
		ResourceBundle res = ResourceBundle.getBundle("Language", locale);
		String value = res.containsKey(key) ? res.getString(key) : "";
		try {
			return new String(value.getBytes("ISO-8859-1"), "UTF-8");
		} catch (UnsupportedEncodingException e) {
			return value;
		}
	}

}
