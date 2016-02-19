package com.rcs.ind.common.entities.dtos;

import java.util.Date;

import com.rcs.ind.common.dtos.GenericEntityDTO;

public class EventDTO extends GenericEntityDTO {

	private Long eventId;

	private Date eventTime;
	private String userEmail;
	private long userId;
	private String ip;
	private String expertName;
	private String methodName;
	private String reqPayload;
	private String resPayload;

	public EventDTO() {
	}

	public EventDTO(Long eventId) {
		super();
		this.eventId = eventId;
	}

	public void setEventId(Long eventId) {
		this.eventId = eventId;
	}

	public Long getEventId() {
		return eventId;
	}

	public void setEventId(long eventId) {
		this.eventId = eventId;
	}

	public Date getEventTime() {
		return eventTime;
	}

	public void setEventTime(Date eventTime) {
		this.eventTime = eventTime;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getExpertName() {
		return expertName;
	}

	public void setExpertName(String expertName) {
		this.expertName = expertName;
	}

	public String getReqPayload() {
		return reqPayload;
	}

	public void setReqPayload(String reqPayload) {
		this.reqPayload = reqPayload;
	}

	public String getResPayload() {
		return resPayload;
	}

	public void setResPayload(String resPayload) {
		this.resPayload = resPayload;
	}

	public String getMethodName() {
		return methodName;
	}

	public void setMethodName(String methodName) {
		this.methodName = methodName;
	}

}