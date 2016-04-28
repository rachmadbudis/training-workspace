package com.rcs.ind.common.entities.dtos;

import java.util.Date;
import java.util.List;
import java.util.Map;

import com.rcs.ind.common.enums.GenQuestionStatusEnum;
import com.rcs.ind.common.enums.TrackEnum;
import com.rcs.ind.common.enums.YesNoNotAppEnum;

public class InterviewPreparationDTO {

	private Long interviewPreparationId;
	private Date dateApplied;
	private Date dateInterview;
	private String customerNumber;
	private String caseNumber;
	private String vNumber;
	private String surname;
	private String name;
	private String dateBirth;
	private String nationality;
	private String placeBirth;
	private String countryBirth;
	private String maritalStatus;
	private String sex;
	private boolean protectedCountry;
	private String protectingCountry;
	private boolean valid;
	private boolean eurodac;
	private String eurodacClaimedCountry;
	private String eurodacReason;
	private boolean euvis;
	private YesNoNotAppEnum euvisDactyl;
	private YesNoNotAppEnum euvisNameResearch;
	private String euvisClaimedCountry;
	private boolean safeCountry;
	private Date expDateVisum;
	private String interpreterName;
	private String interpreterSex;
	private String interpreterLanguage;
	private String InterpreterRegistered;
	private String location;
	private String polLocation;
	private TrackEnum track;
	private TrackEnum trackAdvice;
	private String customQuestion;
	private GenQuestionStatusEnum status;

	private ApplicationDTO application;
	private boolean providedDocuments;
	private Date dateAVIMDelivery;
	private List<PreparationDocumentDTO> documents;
	private Map<String, String> data;
	private String interviewDocument;
	private String locationAdded;
	private String contactPerson;
	private Date dateAdded;
	private String locationApplied;
	private boolean hasDocument;

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

	public String getDateBirth() {
		return dateBirth;
	}

	public void setDateBirth(String dateBirth) {
		this.dateBirth = dateBirth;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
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

	/**
	 * @return the maritalStatus
	 */
	public String getMaritalStatus() {
		return maritalStatus;
	}

	/**
	 * @param maritalStatus
	 *            the maritalStatus to set
	 */
	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
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

	public Date getExpDateVisum() {
		return expDateVisum;
	}

	public void setExpDateVisum(Date expDateVisum) {
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

	public TrackEnum getTrack() {
		return track;
	}

	public void setTrack(TrackEnum track) {
		this.track = track;
	}

	public TrackEnum getTrackAdvice() {
		return trackAdvice;
	}

	public void setTrackAdvice(TrackEnum trackAdvice) {
		this.trackAdvice = trackAdvice;
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
	public String getInterpreterSex() {
		return interpreterSex;
	}

	/**
	 * @param interpreterSex
	 *            the interpreterSex to set
	 */
	public void setInterpreterSex(String interpreterSex) {
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

	/**
	 * @return the eurodac
	 */
	public boolean getEurodac() {
		return eurodac;
	}

	/**
	 * @param eurodac
	 *            the eurodac to set
	 */
	public void setEurodac(boolean eurodac) {
		this.eurodac = eurodac;
	}

	/**
	 * @return the euvis
	 */
	public boolean getEuvis() {
		return euvis;
	}

	/**
	 * @param euvis
	 *            the euvis to set
	 */
	public void setEuvis(boolean euvis) {
		this.euvis = euvis;
	}

	public boolean getProtectedCountry() {
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

	public boolean getValid() {
		return valid;
	}

	public void setValid(boolean valid) {
		this.valid = valid;
	}

	public boolean getSafeCountry() {
		return safeCountry;
	}

	public void setSafeCountry(boolean safeCountry) {
		this.safeCountry = safeCountry;
	}

	public List<PreparationDocumentDTO> getDocuments() {
		return documents;
	}

	public void setDocuments(List<PreparationDocumentDTO> documents) {
		this.documents = documents;
	}

	public boolean getProvidedDocuments() {
		return providedDocuments;
	}

	public void setProvidedDocuments(boolean providedDocuments) {
		this.providedDocuments = providedDocuments;
	}

	public Date getDateAVIMDelivery() {
		return dateAVIMDelivery;
	}

	public void setDateAVIMDelivery(Date dateAVIMDelivery) {
		this.dateAVIMDelivery = dateAVIMDelivery;
	}

	public Map<String, String> getData() {
		return data;
	}

	public void setData(Map<String, String> data) {
		this.data = data;
	}

	public String getInterviewDocument() {
		return interviewDocument;
	}

	public void setInterviewDocument(String interviewDocument) {
		this.interviewDocument = interviewDocument;
	}

	public String getLocationAdded() {
		return locationAdded;
	}

	public void setLocationAdded(String locationAdded) {
		this.locationAdded = locationAdded;
	}

	public String getContactPerson() {
		return contactPerson;
	}

	public void setContactPerson(String contactPerson) {
		this.contactPerson = contactPerson;
	}

	public Date getDateAdded() {
		return dateAdded;
	}

	public void setDateAdded(Date dateAdded) {
		this.dateAdded = dateAdded;
	}

	public String getLocationApplied() {
		return locationApplied;
	}

	public void setLocationApplied(String locationApplied) {
		this.locationApplied = locationApplied;
	}

	public boolean getHasDocument() {
		return hasDocument;
	}

	public void setHasDocument(boolean hasDocument) {
		this.hasDocument = hasDocument;
	}
}