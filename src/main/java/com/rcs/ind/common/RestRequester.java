package com.rcs.ind.common;

import com.fasterxml.jackson.databind.JavaType;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.model.RoleConstants;
import com.liferay.portal.model.User;
import com.liferay.portal.model.UserGroupGroupRole;
import com.liferay.portal.service.UserGroupGroupRoleLocalServiceUtil;
import com.liferay.portal.theme.ThemeDisplay;
import com.liferay.portal.util.PortalUtil;
import com.rcs.ind.common.dtos.GenericEntityDTO;
import com.rcs.ind.common.dtos.PaginationDTO;
import com.rcs.ind.common.dtos.ServiceRequestDTO;
import com.rcs.ind.common.dtos.ServiceResponseDTO;
import com.rcs.ind.common.enums.ValidatorTypeEnum;
import com.rcs.ind.common.util.JsonConverter;
import com.rcs.ind.common.util.P2PAuthenticationHelper;
import com.rcs.ind.liferay.enums.LiferayRoleEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import javax.portlet.PortletRequest;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

@Component
public class RestRequester {

	private static final Log logger = LogFactoryUtil.getLog(RestRequester.class);

	@Value(value = "${p2pSharedKey}")
	private String SHARED_KEY;

	@Value(value = "${servicesURL}")
	private String SERVICES_URL;

	@Autowired
	private RestTemplate restTemplate;

	private JsonConverter converter = new JsonConverter();

	@SuppressWarnings("unchecked")
	public <E> ServiceResponseDTO<PaginationDTO<E>> postPagination(String specificServiceUrl, Object payload, Class<E> paginationPayload, PortletRequest request) {
		JavaType type = converter.constructParametricType(ServiceResponseDTO.class, converter.constructParametricType(PaginationDTO.class, paginationPayload));
		return (ServiceResponseDTO<PaginationDTO<E>>) callServices(specificServiceUrl, payload, HttpMethod.POST, type, request);
	}
	
	@SuppressWarnings("unchecked")
	public <E> ServiceResponseDTO<PaginationDTO<E>> postPagination(String specificServiceUrl, Object payload, Class<E> paginationPayload, PortletRequest request, Set<String> roles) {
		JavaType type = converter.constructParametricType(ServiceResponseDTO.class, converter.constructParametricType(PaginationDTO.class, paginationPayload));
		return (ServiceResponseDTO<PaginationDTO<E>>) callServices(specificServiceUrl, payload, HttpMethod.POST, type, request, roles);
	}

	@SuppressWarnings("unchecked")
	public <E> ServiceResponseDTO<List<E>> postList(String specificServiceUrl, Object payload, Class<E> listPayload, PortletRequest request) {
		JavaType type = converter.constructParametricType(ServiceResponseDTO.class, converter.constructParametricType(List.class, listPayload));
		return (ServiceResponseDTO<List<E>>) callServices(specificServiceUrl, payload, HttpMethod.POST, type, request);
	}

	public <E> ServiceResponseDTO<E> get(String specificServiceUrl, Object payload, Class<E> returnPayloadClass, PortletRequest request) {
		throw new UnsupportedOperationException("Jersey does not support HTTP GET with parameters, which are necessary to validate a request.");
	}

	@SuppressWarnings("unchecked")
	public <E> ServiceResponseDTO<E> post(String specificServiceUrl, Object payload, Class<E> returnPayloadClass, PortletRequest request, Set<String> roles) {
		JavaType type = converter.constructParametricType(ServiceResponseDTO.class, returnPayloadClass);
		return (ServiceResponseDTO<E>) this.callServices(specificServiceUrl, payload, HttpMethod.POST, type, request, roles);
	}

	@SuppressWarnings("unchecked")
	public <E> ServiceResponseDTO<E> post(String specificServiceUrl, Object payload, Class<E> returnPayloadClass, PortletRequest request) {
		JavaType type = converter.constructParametricType(ServiceResponseDTO.class, returnPayloadClass);
		return (ServiceResponseDTO<E>) this.callServices(specificServiceUrl, payload, HttpMethod.POST, type, request);
	}

	@SuppressWarnings("unchecked")
	public <E> ServiceResponseDTO<E> put(String specificServiceUrl, Object payload, Class<E> returnPayloadClass, PortletRequest request) {
		JavaType type = converter.constructParametricType(ServiceResponseDTO.class, returnPayloadClass);
		return (ServiceResponseDTO<E>) this.callServices(specificServiceUrl, payload, HttpMethod.PUT, type, request);
	}

	@SuppressWarnings("unchecked")
	public <E> ServiceResponseDTO<E> delete(String specificServiceUrl, Object payload, Class<?> returnPayloadClass, PortletRequest request) {
		JavaType type = converter.constructParametricType(ServiceResponseDTO.class, returnPayloadClass);
		return (ServiceResponseDTO<E>) this.callServices(specificServiceUrl, payload, HttpMethod.DELETE, type, request);
	}

	/**
	 * Base method for Rest calls to the services. HttpMethod and return type must be specified.
	 * 
	 * @param specificServiceUrl
	 * @param payload
	 * @param method
	 * @param returnType
	 * @param request
	 * @return
	 */
	public ServiceResponseDTO<?> callServices(String specificServiceUrl, Object payload, HttpMethod method, JavaType returnType, PortletRequest request) {
		return callServices(specificServiceUrl, payload, method, returnType, request, getUserGroupRoles(request));
	}

	/**
	 * Base method for Rest calls to the services. HttpMethod and return type must be specified.
	 * 
	 * @param specificServiceUrl
	 * @param payload
	 * @param method
	 * @param returnType
	 * @param request
	 * @param roles
	 * @return
	 */
	public ServiceResponseDTO<?> callServices(String specificServiceUrl, Object payload, HttpMethod method, JavaType returnType, PortletRequest request,
			Set<String> roles) {
		logger.debug("Service url: " + SERVICES_URL + "/"+specificServiceUrl);
		ServiceResponseDTO<?> results;
		try {
			// Build ServiceRequestDTO and add the payload.
			ServiceRequestDTO<Object> dto = new ServiceRequestDTO<>();
			dto.setPayload(payload);

			// If request is not null, fill in user data.
			if (request != null) {
				String userEmail = this.getUserEmail(request);
				dto.setUserEmail(userEmail);
				dto.setUserFirstName(getUserFirstName(request));
				dto.setUserLastName(getUserLastName(request));
				dto.setUserId(this.getUserId(request));

				// Liferay specific information.
				ThemeDisplay td = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);
				dto.setUserLocale(td.getLocale());
				dto.setGroupId(td.getScopeGroupId());
				dto.setCompanyId(td.getCompanyId());

				// User Roles
				dto.setUserRoles(roles);

				// Payload modification user, if necessary.
				if (dto.getPayload() instanceof GenericEntityDTO) {
					((GenericEntityDTO) dto.getPayload()).setModificationUser(userEmail);
				}
			}

			// Set validator and token for authentication.
			dto.setValidator(ValidatorTypeEnum.DefaultValidator);
			dto.setIdToken(P2PAuthenticationHelper.getAuthenticationTokenParam(converter.toJson(dto), SHARED_KEY));
			String json = converter.toJson(dto);

			logger.debug("Request body:");
			logger.debug(json);
			
			HttpEntity<String> requestEntity = this.getRequestEntity(json);
			ResponseEntity<String> responseEntity = restTemplate.exchange(SERVICES_URL + specificServiceUrl, method, requestEntity, String.class);

			results = (ServiceResponseDTO<?>) converter.fromJson(responseEntity.getBody(), returnType);
		} catch (Exception e) {
			String message = "An exception has occurred.";
			logger.error(message + " " + e.getMessage(), e);
			results = ServiceResponseDTO.buildError(message + " " + e.getMessage());
		}
		return results;
	}

	private HttpEntity<String> getRequestEntity(String jsonObject) {
		HttpHeaders headers = new HttpHeaders();
		final Map<String, String> params = new HashMap<String, String>();
		params.put("charset", "utf-8");
		headers.setContentType(new MediaType("application", "json", params));
		return new HttpEntity<String>(jsonObject, headers);
	}

	/**
	 * Get Liferay User Name.
	 * 
	 * @param request
	 * @return
	 */
	private String getUserEmail(PortletRequest request) {
		String userEmail = null;
		try {
			User user = PortalUtil.getUser(request);
			userEmail = user != null ? user.getEmailAddress() : RoleConstants.GUEST.toLowerCase();
		} catch (Exception ignored) {
		}
		return userEmail;
	}

	/**
	 * Get Liferay User Name.
	 * 
	 * @param request
	 * @return
	 */
	private String getUserFirstName(PortletRequest request) {
		String userFirstName = null;
		try {
			User user = PortalUtil.getUser(request);
			userFirstName = user != null ? user.getFirstName() : "";
		} catch (Exception ignored) {
		}
		return userFirstName;
	}

	/**
	 * Get Liferay User Name.
	 * 
	 * @param request
	 * @return
	 */
	private String getUserLastName(PortletRequest request) {
		String userLastName = null;
		try {
			User user = PortalUtil.getUser(request);
			userLastName = user != null ? user.getLastName() : "";
		} catch (Exception ignored) {
		}
		return userLastName;
	}

	/**
	 * Get Liferay User ID.
	 * 
	 * @param request
	 * @return
	 */
	private long getUserId(PortletRequest request) {
		long userId = IndConstants.UNDEFINED;
		try {
			User user = PortalUtil.getUser(request);
			userId = user.getUserId();
		} catch (Exception ignored) {
		}
		return userId;
	}

	/**
	 * Get Liferay User Group Roles.
	 * 
	 * @param request
	 * @return
	 */
	private Set<String> getUserGroupRoles(PortletRequest request) {
		Set<String> strRoles = new LinkedHashSet<String>();
		if (request == null) {
			return null;
		}
		
		// If the user is administrator, add Administrator role to strRoles because administrator does not belong to any user groups
		if (request.isUserInRole(LiferayRoleEnum.ADMINISTRATOR.getName())) {
			strRoles.add(LiferayRoleEnum.ADMINISTRATOR.getName());
		} else {
			try {
				List<UserGroupGroupRole> userGroupGroupRoleList = UserGroupGroupRoleLocalServiceUtil.getUserGroupGroupRolesByUser(getUserId(request));
				for (UserGroupGroupRole userGroupGroupRole : userGroupGroupRoleList) {
					if (userGroupGroupRole.getRole() != null) {
						strRoles.add(userGroupGroupRole.getRole().getName());
					}
				}
			} catch (Exception ignored) {
			}
		}
		return strRoles;
	}
}
