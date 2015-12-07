package com.rcs.ind.common.filters.dtos;

import com.rcs.ind.common.enums.EurodacMatchReasonEnum;

public class AvimReportFiltersDTO {

	private Long avimReportId;
	private Boolean eurodacMatch;
	private Boolean euvisMatch;
	private EurodacMatchReasonEnum reason;
	private String country;
	private Long applicationId;

	public Long getAvimReportId() {
		return avimReportId;
	}

	public void setAvimReportId(Long avimReportId) {
		this.avimReportId = avimReportId;
	}

	public Boolean getEurodacMatch() {
		return eurodacMatch;
	}

	public void setEurodacMatch(Boolean eurodacMatch) {
		this.eurodacMatch = eurodacMatch;
	}

	public Boolean getEuvisMatch() {
		return euvisMatch;
	}

	public void setEuvisMatch(Boolean euvisMatch) {
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

	public Long getApplicationId() {
		return applicationId;
	}

	public void setApplicationId(Long applicationId) {
		this.applicationId = applicationId;
	}

}
