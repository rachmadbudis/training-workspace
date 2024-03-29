package com.rcs.ind.common.entities.dtos;

import java.util.Date;

import com.rcs.ind.common.enums.EurodacMatchReasonEnum;
import com.rcs.ind.common.enums.YesNoNotAppEnum;

public class AvimReportDTO {

	private Long avimReportId;
	private String nationality;
	private boolean protectedCountry;
	private String protectingCountry;
	private boolean valid;
	private boolean eurodacMatch;
	private String eurodacClaimedCountry;
	private EurodacMatchReasonEnum reason;
	private String eurodacNumber;
	private boolean euvisMatch;
	private YesNoNotAppEnum euvisDactyl;
	private YesNoNotAppEnum euvisNameResearch;
	private String euvisClaimedCountry;
	private Date expDateVisum;
	private String vNumber;
	private ApplicationDTO applicationDTO;
	private String smartflowNumber;

	public AvimReportDTO() {
	}

	public AvimReportDTO(Long avimReportId, String nationality, boolean protectedCountry, String protectingCountry, boolean valid, boolean eurodacMatch,
			String eurodacClaimedCountry, String eurodacNumber, EurodacMatchReasonEnum reason, boolean euvisMatch, YesNoNotAppEnum euvisDactyl,
			YesNoNotAppEnum euvisNameResearch, String euvisClaimedCountry, Date expDateVisum, String vNumber, ApplicationDTO applicationDTO,
			String smartflowNumber) {
		this.avimReportId = avimReportId;
		this.nationality = nationality;
		this.protectedCountry = protectedCountry;
		this.protectingCountry = protectingCountry;
		this.valid = valid;
		this.eurodacMatch = eurodacMatch;
		this.eurodacClaimedCountry = eurodacClaimedCountry;
		this.reason = reason;
		this.eurodacNumber = eurodacNumber;
		this.euvisMatch = euvisMatch;
		this.euvisDactyl = euvisDactyl;
		this.euvisNameResearch = euvisNameResearch;
		this.euvisClaimedCountry = euvisClaimedCountry;
		this.expDateVisum = expDateVisum;
		this.vNumber = vNumber;
		this.applicationDTO = applicationDTO;
		this.smartflowNumber = smartflowNumber;
	}

	public Long getAvimReportId() {
		return avimReportId;
	}

	public void setAvimReportId(Long avimReportId) {
		this.avimReportId = avimReportId;
	}

	public boolean isProtectedCountry() {
		return protectedCountry;
	}

	public void setProtectedCountry(boolean protectedCountry) {
		this.protectedCountry = protectedCountry;
	}

	public String getProtectingCountry() {
		return protectingCountry;
	}

	public void setProtectingCountry(String protectingCountry) {
		this.protectingCountry = protectingCountry;
	}

	public boolean isValid() {
		return valid;
	}

	public void setValid(boolean valid) {
		this.valid = valid;
	}

	public boolean isEurodacMatch() {
		return eurodacMatch;
	}

	public void setEurodacMatch(boolean eurodacMatch) {
		this.eurodacMatch = eurodacMatch;
	}

	public String getEurodacClaimedCountry() {
		return eurodacClaimedCountry;
	}

	public void setEurodacClaimedCountry(String eurodacClaimedCountry) {
		this.eurodacClaimedCountry = eurodacClaimedCountry;
	}

	public EurodacMatchReasonEnum getReason() {
		return reason;
	}

	public void setReason(EurodacMatchReasonEnum reason) {
		this.reason = reason;
	}

	public String getEurodacNumber() {
		return eurodacNumber;
	}

	public void setEurodacNumber(String eurodacNumber) {
		this.eurodacNumber = eurodacNumber;
	}

	public boolean isEuvisMatch() {
		return euvisMatch;
	}

	public void setEuvisMatch(boolean euvisMatch) {
		this.euvisMatch = euvisMatch;
	}

	public YesNoNotAppEnum getEuvisDactyl() {
		return euvisDactyl;
	}

	public void setEuvisDactyl(YesNoNotAppEnum euvisDactyl) {
		this.euvisDactyl = euvisDactyl;
	}

	public YesNoNotAppEnum getEuvisNameResearch() {
		return euvisNameResearch;
	}

	public void setEuvisNameResearch(YesNoNotAppEnum euvisNameResearch) {
		this.euvisNameResearch = euvisNameResearch;
	}

	public String getEuvisClaimedCountry() {
		return euvisClaimedCountry;
	}

	public void setEuvisClaimedCountry(String euvisClaimedCountry) {
		this.euvisClaimedCountry = euvisClaimedCountry;
	}

	public Date getExpDateVisum() {
		return expDateVisum;
	}

	public void setExpDateVisum(Date expDateVisum) {
		this.expDateVisum = expDateVisum;
	}

	public String getvNumber() {
		return vNumber;
	}

	public void setvNumber(String vNumber) {
		this.vNumber = vNumber;
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

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

}