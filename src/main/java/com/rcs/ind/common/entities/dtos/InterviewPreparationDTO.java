package com.rcs.ind.common.entities.dtos;

import java.util.Date;

import com.rcs.ind.common.dtos.GenericEntityDTO;
import com.rcs.ind.common.enums.LocationEnum;
import com.rcs.ind.common.enums.MartialStatusEnum;
import com.rcs.ind.common.enums.NationalityEnum;
import com.rcs.ind.common.enums.SexEnum;
import com.rcs.ind.common.enums.YesNoNotAppEnum;

public class InterviewPreparationDTO extends GenericEntityDTO {

	private Long interviewPreparationId;
	private Date dateApplied;
	private Date dateInterview;
	private String customerNumber;
	private String caseNumber;
	private String vNumber;
	private String surname;
	private String name;
	private Date dateBirth;
	private NationalityEnum nationality;
	private String placeBirth;
	private String countryBirth;
	private MartialStatusEnum martialStatus;
	private SexEnum sex;
	private String eurodacClaimedCountry;
	private String eurodacReason;
	private YesNoNotAppEnum euvisDactyl;
	private YesNoNotAppEnum euvisNameResearch;
	private String euvisClaimedCountry;
	private String expDateVisum;
	private Long interpreter; /* user id from liferay with role translator */
	private LocationEnum location;
	private LocationEnum polLocation;
	private String track;
	private String customQuestion;
	private ApplicationDTO application;

	public InterviewPreparationDTO() {
	}

	public InterviewPreparationDTO(Long interviewPreparationId) {
		this.interviewPreparationId = interviewPreparationId;
	}

	public Long getInterviewPreparationId() {
		return interviewPreparationId;
	}

	public void setInterviewPreparationId(Long interviewPreparationId) {
		this.interviewPreparationId = interviewPreparationId;
	}

	public Date getDateApplied() {
		return dateApplied;
	}

	public void setDateApplied(Date dateApplied) {
		this.dateApplied = dateApplied;
	}

	public Date getDateInterview() {
		return dateInterview;
	}

	public void setDateInterview(Date dateInterview) {
		this.dateInterview = dateInterview;
	}

	public String getCustomerNumber() {
		return customerNumber;
	}

	public void setCustomerNumber(String customerNumber) {
		this.customerNumber = customerNumber;
	}

	public String getCaseNumber() {
		return caseNumber;
	}

	public void setCaseNumber(String caseNumber) {
		this.caseNumber = caseNumber;
	}

	public String getvNumber() {
		return vNumber;
	}

	public void setvNumber(String vNumber) {
		this.vNumber = vNumber;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDateBirth() {
		return dateBirth;
	}

	public void setDateBirth(Date dateBirth) {
		this.dateBirth = dateBirth;
	}

	public NationalityEnum getNationality() {
		return nationality;
	}

	public void setNationality(NationalityEnum nationality) {
		this.nationality = nationality;
	}

	public String getPlaceBirth() {
		return placeBirth;
	}

	public void setPlaceBirth(String placeBirth) {
		this.placeBirth = placeBirth;
	}

	public String getCountryBirth() {
		return countryBirth;
	}

	public void setCountryBirth(String countryBirth) {
		this.countryBirth = countryBirth;
	}

	public MartialStatusEnum getMartialStatus() {
		return martialStatus;
	}

	public void setMartialStatus(MartialStatusEnum martialStatus) {
		this.martialStatus = martialStatus;
	}

	public SexEnum getSex() {
		return sex;
	}

	public void setSex(SexEnum sex) {
		this.sex = sex;
	}

	public String getEurodacClaimedCountry() {
		return eurodacClaimedCountry;
	}

	public void setEurodacClaimedCountry(String eurodacClaimedCountry) {
		this.eurodacClaimedCountry = eurodacClaimedCountry;
	}

	public String getEurodacReason() {
		return eurodacReason;
	}

	public void setEurodacReason(String eurodacReason) {
		this.eurodacReason = eurodacReason;
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

	public Long getInterpreter() {
		return interpreter;
	}

	public void setInterpreter(Long interpreter) {
		this.interpreter = interpreter;
	}

	public LocationEnum getLocation() {
		return location;
	}

	public void setLocation(LocationEnum location) {
		this.location = location;
	}

	public LocationEnum getPolLocation() {
		return polLocation;
	}

	public void setPolLocation(LocationEnum polLocation) {
		this.polLocation = polLocation;
	}

	public String getTrack() {
		return track;
	}

	public void setTrack(String track) {
		this.track = track;
	}

	public String getCustomQuestion() {
		return customQuestion;
	}

	public void setCustomQuestion(String customQuestion) {
		this.customQuestion = customQuestion;
	}

	public ApplicationDTO getApplication() {
		return application;
	}

	public void setApplication(ApplicationDTO application) {
		this.application = application;
	}

}