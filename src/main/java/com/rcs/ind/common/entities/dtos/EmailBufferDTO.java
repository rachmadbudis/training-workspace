package com.rcs.ind.common.entities.dtos;

public class EmailBufferDTO {

	private Long emailBufferId;
	private String messageId;
	private byte[] emailRaw;

	public EmailBufferDTO() {
	}

	public EmailBufferDTO(Long emailBufferId) {
		this.emailBufferId = emailBufferId;
	}

	public Long getEmailBufferId() {
		return emailBufferId;
	}

	public void setEmailBufferId(Long emailBufferId) {
		this.emailBufferId = emailBufferId;
	}

	public String getMessageId() {
		return messageId;
	}

	public void setMessageId(String messageId) {
		this.messageId = messageId;
	}

	public byte[] getEmailRaw() {
		return emailRaw;
	}

	public void setEmailRaw(byte[] emailRaw) {
		this.emailRaw = emailRaw;
	}

}