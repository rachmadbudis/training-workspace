package com.rcs.ind.common.entities.dtos;

import java.util.Date;

import com.rcs.ind.common.dtos.GenericEntityDTO;
import com.rcs.ind.common.enums.GenQuestionStatusEnum;
import com.rcs.ind.common.enums.MaritalStatusEnum;
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
	private MaritalStatusEnum martialStatus;
	private SexEnum sex;
	private String eurodacClaimedCountry;
	private String eurodacReason;
	private YesNoNotAppEnum euvisDactyl;
	private YesNoNotAppEnum euvisNameResearch;
	private String euvisClaimedCountry;
	private String expDateVisum;
	private String interpreterName;
	private SexEnum interpreterSex;
	private String interpreterLanguage;
	private String InterpreterRegistered;
	private String location;
	private String polLocation;
	private String track;
	private String customQuestion;
	private GenQuestionStatusEnum status;

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

	public MaritalStatusEnum getMartialStatus() {
		return martialStatus;
	}

	public void setMartialStatus(MaritalStatusEnum martialStatus) {
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

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getPolLocation() {
		return polLocation;
	}

	public void setPolLocation(String polLocation) {
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

	/**
	 * @return the interpreterName
	 */
	public String getInterpreterName() {
		return interpreterName;
	}

	/**
	 * @param interpreterName
	 *            the interpreterName to set
	 */
	public void setInterpreterName(String interpreterName) {
		this.interpreterName = interpreterName;
	}

	/**
	 * @return the interpreterSex
	 */
	public SexEnum getInterpreterSex() {
		return interpreterSex;
	}

	/**
	 * @param interpreterSex
	 *            the interpreterSex to set
	 */
	public void setInterpreterSex(SexEnum interpreterSex) {
		this.interpreterSex = interpreterSex;
	}

	/**
	 * @return the interpreterLanguage
	 */
	public String getInterpreterLanguage() {
		return interpreterLanguage;
	}

	/**
	 * @param interpreterLanguage
	 *            the interpreterLanguage to set
	 */
	public void setInterpreterLanguage(String interpreterLanguage) {
		this.interpreterLanguage = interpreterLanguage;
	}

	/**
	 * @return the status
	 */
	public GenQuestionStatusEnum getStatus() {
		return status;
	}

	/**
	 * @param status
	 *            the status to set
	 */
	public void setStatus(GenQuestionStatusEnum status) {
		this.status = status;
	}

	/**
	 * @return the interpreterRegistered
	 */
	public String getInterpreterRegistered() {
		return InterpreterRegistered;
	}

	/**
	 * @param interpreterRegistered
	 *            the interpreterRegistered to set
	 */
	public void setInterpreterRegistered(String interpreterRegistered) {
		InterpreterRegistered = interpreterRegistered;
	}

}