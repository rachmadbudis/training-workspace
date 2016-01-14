package com.rcs.ind.common.entities.dtos;

import com.rcs.ind.common.dtos.GenericEntityDTO;
import com.rcs.ind.common.enums.EurodacMatchReasonEnum;
import com.rcs.ind.common.enums.YesNoNotAppEnum;

public class AvimReportDTO extends GenericEntityDTO {

	private Long avimReportId;
	private String nationality;
	private boolean protectedCountry;
	private String protectingCountry;
	private boolean valid;
	private boolean eurodacMatch;
	private String eurodacClaimedCountry;
	private EurodacMatchReasonEnum reason;
	private boolean euvisMatch;
	private YesNoNotAppEnum euvisDactyl;
	private YesNoNotAppEnum euvisNameResearch;
	private String euvisClaimedCountry;
	private String expDateVisum;
	private String vNumber;
	private ApplicationDTO applicationDTO;
	private String smartflowNumber;

	public AvimReportDTO() {
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

	public String getExpDateVisum() {
		return expDateVisum;
	}

	public void setExpDateVisum(String expDateVisum) {
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