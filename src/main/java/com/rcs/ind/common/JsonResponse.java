package com.rcs.ind.common;

import com.rcs.ind.common.dtos.ServiceResponseDTO;

import javax.portlet.PortletRequest;

public class JsonResponse extends BackendResponse {

	private boolean success = true;
	private String message = "";
	private Object data;

	public static JsonResponse buildSuccess(String message, Object data) {
		return build(true, message, data);
	}

	public static JsonResponse buildSuccess(String message) {
		return build(true, message);
	}

	public static JsonResponse buildFailure(String message) {
		return build(false, message);
	}

	/**
	 * Builds a JsonResponse based on a ServiceResponseDTO obtained from a Services request. It also allows to override the messageKey that comes in the
	 * ServiceResponseDTO.
	 * 
	 * @param sr
	 * @param request
	 * @param messageKey
	 * @return
	 */
	public static JsonResponse build(ServiceResponseDTO<?> sr, PortletRequest request, String messageKey) {
		return build(sr.isSuccess(), GenericController.getLocalizedKey(request, messageKey), sr.getPayload());
	}

	/**
	 * Builds a JsonResponse based on a ServiceResponseDTO obtained from a Services request.
	 * 
	 * @param sr
	 * @param request
	 * @return
	 */
	public static JsonResponse build(ServiceResponseDTO<?> sr, PortletRequest request) {
		return build(sr.isSuccess(), GenericController.getLocalizedKey(request, sr.getMessageKey()), sr.getPayload());
	}

	/**
	 * Builds a JsonResponse with success and message.
	 * 
	 * @param success
	 * @param message
	 * @return
	 */
	public static JsonResponse build(boolean success, String message) {
		return build(success, message, null);
	}

	/**
	 * Builds a JsonResponse with all the possible fields.
	 * 
	 * @param success
	 * @param message
	 * @param data
	 * @return
	 */
	public static JsonResponse build(boolean success, String message, Object data) {
		JsonResponse response = new JsonResponse();
		response.setSuccess(success);
		response.setMessage(message);
		response.setData(data);
		return response;
	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}
}
