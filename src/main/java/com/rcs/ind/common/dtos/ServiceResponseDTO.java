package com.rcs.ind.common.dtos;

public class ServiceResponseDTO<T> {

	private boolean success;
	private String messageKey;
	private T payload;

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public String getMessageKey() {
		return messageKey;
	}

	public void setMessageKey(String messageKey) {
		this.messageKey = messageKey;
	}

	public T getPayload() {
		return payload;
	}

	public void setPayload(T payload) {
		this.payload = payload;
	}

	/**
	 * Builds a success response with payload but no message.
	 * 
	 * @param payload
	 * @return
	 */
	public static <E> ServiceResponseDTO<E> buildSuccess(E payload) {
		return buildSuccess(payload, null);
	}

	/**
	 * Builds a success response with payload and message.
	 * 
	 * @param payload
	 * @param messageKey
	 * @return
	 */
	public static <E> ServiceResponseDTO<E> buildSuccess(E payload, String messageKey) {
		ServiceResponseDTO<E> dto = new ServiceResponseDTO<E>();
		dto.setSuccess(true);
		dto.setMessageKey(messageKey);
		dto.setPayload(payload);
		return dto;
	}

	/**
	 * Builds an error response.
	 * 
	 * @param messageKey
	 * @return
	 */
	public static <E> ServiceResponseDTO<E> buildError(String messageKey) {
		ServiceResponseDTO<E> dto = new ServiceResponseDTO<>();
		dto.setSuccess(false);
		dto.setMessageKey(messageKey);
		return dto;
	}
}