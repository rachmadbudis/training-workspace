package com.rcs.ind.common;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.rcs.ind.common.dtos.AutocompleteRequestDTO;
import com.rcs.ind.common.dtos.ServiceResponseDTO;
import org.apache.commons.beanutils.PropertyUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.portlet.PortletRequest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class Autocomplete extends GenericController {

	private static final Log logger = LogFactoryUtil.getLog(Autocomplete.class);

	@Autowired
	private RestRequester restRequester;

	public <E> JsonResponse getResults(String specificServiceUrl, AutocompleteRequestDTO ar, Class<E> listPayload, String keyProperty, String valueProperty,
			PortletRequest request) {
		JsonResponse jsonResponse = null;

		try {
			ServiceResponseDTO<List<E>> results = restRequester.postList(specificServiceUrl, ar, listPayload, request);

			List<Map<String, String>> list = new ArrayList<>();
			if (results.isSuccess() && results.getPayload() != null) {
				for (Object dto : results.getPayload()) {
					Map<String, String> model = new HashMap<>();
					model.put("value", String.valueOf(PropertyUtils.getProperty(dto, keyProperty)));
					model.put("label", String.valueOf(PropertyUtils.getProperty(dto, valueProperty)));
					list.add(model);
				}
			}

			jsonResponse = JsonResponse.build(results.isSuccess(), getLocalizedKey(request, results.getMessageKey()), list);
		} catch (Exception e) {
			logger.error("Error in autocomplete request: " + e.getMessage(), e);
			jsonResponse = JsonResponse.buildFailure(getLocalizedKey(request, IndConstants.UNKNOWN_ERROR_KEY));
		}
		return jsonResponse;
	}
}