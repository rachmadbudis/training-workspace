package com.rcs.ind.common.util;

import com.liferay.portal.kernel.util.Base64;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.net.URLDecoder;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

@Component
public class MaskURLParamUtil extends P2PAuthenticationHelper {

	private static final String TOKEN_KEY = "t";
	private static final String PARAM_KEY = "p";

	@Value(value = "${p2pSharedKey}")
	private static String SHARED_KEY;

	/**
	 * Return an encoded param.
	 * 
	 * @param url
	 * @return
	 */
	public static String maskParam(String unEncodedParam) {
		return TOKEN_KEY + "=" + generateSHA(SHARED_KEY + unEncodedParam) + "&" + PARAM_KEY + "=" + Base64.encode(unEncodedParam.getBytes());
	}

	/**
	 * Return a map from encoded query param in url.
	 * 
	 * @param url
	 * @return
	 */
	public static Map<String, String> getParam(URL url) throws UnsupportedEncodingException {
		Map<String, String> encodedParamMap = new HashMap<>();
		encodedParamMap = splitQuery(url);
		if (!StringUtils.isBlank(encodedParamMap.get(TOKEN_KEY)) && !StringUtils.isBlank(encodedParamMap.get(PARAM_KEY))) {
			String decodedParam = new String(Base64.decode(encodedParamMap.get(PARAM_KEY)));
			if (generateSHA(SHARED_KEY + decodedParam).equals(encodedParamMap.get(TOKEN_KEY))) {
				return splitQuery(decodedParam);
			}
		}
		return encodedParamMap;
	}

	/**
	 * Return a map from query param inside url.
	 * 
	 * @param url
	 * @return
	 */
	private static Map<String, String> splitQuery(URL url) throws UnsupportedEncodingException {
		return splitQuery(url.getQuery());
	}

	/**
	 * Return a map from query param.
	 * 
	 * @param params
	 * @return
	 */
	private static Map<String, String> splitQuery(String params) throws UnsupportedEncodingException {
		Map<String, String> query_pairs = new LinkedHashMap<String, String>();
		String[] pairs = params.split("&");
		for (String pair : pairs) {
			int idx = pair.indexOf("=");
			query_pairs.put(URLDecoder.decode(pair.substring(0, idx), "UTF-8"), URLDecoder.decode(pair.substring(idx + 1), "UTF-8"));
		}
		return query_pairs;
	}

}
