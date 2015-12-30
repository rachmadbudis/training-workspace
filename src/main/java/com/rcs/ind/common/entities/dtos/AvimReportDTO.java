package com.rcs.ind.common.entities.dtos;

import com.rcs.ind.common.dtos.GenericEntityDTO;
import com.rcs.ind.common.enums.EurodacMatchReasonEnum;

public class AvimReportDTO extends GenericEntityDTO {

	private Long avimReportId;
	private boolean eurodacMatch;
	private boolean euvisMatch;
	private String vNumber;
	private EurodacMatchReasonEnum reason;
	private String country;
	private ApplicationDTO applicationDTO;
	private String smartflowNumber;

	public AvimReportDTO() {
	}

	public AvimReportDTO(Long avimReportId, boolean eurodacMatch, boolean euvisMatch, String vNumber, EurodacMatchReasonEnum reason, String country,
			ApplicationDTO applicationDTO) {
		this.avimReportId = avimReportId;
		this.eurodacMatch = eurodacMatch;
		this.euvisMatch = euvisMatch;
		this.reason = reason;
		this.country = country;
		this.applicationDTO = applicationDTO;
		this.vNumber = vNumber;
	}

	public AvimReportDTO(Long avimReportId) {
		this.avimReportId = avimReportId;
	}

	public Long getAvimReportId() {
		return avimReportId;
	}

	public void setAvimReportId(Long avimReportId) {
		this.avimReportId = avimReportId;
	}

	public boolean isEurodacMatch() {
		return eurodacMatch;
	}

	public void setEurodacMatch(boolean eurodacMatch) {
		this.eurodacMatch = eurodacMatch;
	}

	public boolean isEuvisMatch() {
		return euvisMatch;
	}

	public void setEuvisMatch(boolean euvisMatch) {
		this.euvisMatch = euvisMatch;
	}

	public EurodacMatchReasonEnum getReason() {
		return reason;
	}

	public void setReason(EurodacMatchReasonEnum reason) {
		this.reason = reason;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public ApplicationDTO getApplicationDTO() {
		return applicationDTO;
	}

	public void setApplicationDTO(ApplicationDTO applicationDTO) {
		this.applicationDTO = applicationDTO;
	}

	public String getSmartflowNumber() {
		return smartflowNumber;
	}

	public void setSmartflowNumber(String smartflowNumber) {
		this.smartflowNumber = smartflowNumber;
	}

	public String getvNumber() {
		return vNumber;
	}

	public void setvNumber(String vNumber) {
		this.vNumber = vNumber;
	}

}