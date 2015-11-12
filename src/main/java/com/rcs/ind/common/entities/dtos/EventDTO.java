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
	private String funcName;
	private String reqPayload;
	private String resPayload;

	public EventDTO() {
	}
	


	public EventDTO(Long eventId) {
		super();
		this.eventId = eventId;
	}



	public EventDTO(long eventId, Date eventTime, String userEmail,
			long userId, String ip, String expertName, String funcName,
			String reqPayload, String resPayload) {
		super();
		this.eventId = eventId;
		this.eventTime = eventTime;
		this.userEmail = userEmail;
		this.userId = userId;
		this.ip = ip;
		this.expertName = expertName;
		this.funcName = funcName;
		this.reqPayload = reqPayload;
		this.resPayload = resPayload;
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

	public String getFuncName() {
		return funcName;
	}

	public void setFuncName(String funcName) {
		this.funcName = funcName;
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

}