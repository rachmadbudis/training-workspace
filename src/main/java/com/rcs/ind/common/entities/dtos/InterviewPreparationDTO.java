package com.rcs.ind.common.entities.dtos;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.rcs.ind.common.enums.LocationEnum;
import com.rcs.ind.common.enums.MartialStatusEnum;
import com.rcs.ind.common.enums.NationalityEnum;
import com.rcs.ind.common.enums.SexEnum;
import com.rcs.ind.common.enums.YesNoNotAppEnum;


public class InterviewPreparationDTO {
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
	private List<String> documents = new ArrayList<String>();
	private long interpreter; /* user id from liferay with role translator */
	private LocationEnum location;
	private LocationEnum polLocation;
	private String track;
	private String customeQuestion;
	
	/**
	 * @return the dateApplied
	 */
	public Date getDateApplied() {
		return dateApplied;
	}
	
	/**
	 * @param dateApplied the dateApplied to set
	 */
	public void setDateApplied(Date dateApplied) {
		this.dateApplied = dateApplied;
	}
	
	/**
	 * @return the dateInterview
	 */
	public Date getDateInterview() {
		return dateInterview;
	}
	
	/**
	 * @param dateInterview the dateInterview to set
	 */
	public void setDateInterview(Date dateInterview) {
		this.dateInterview = dateInterview;
	}
	
	/**
	 * @return the customerNumber
	 */
	public String getCustomerNumber() {
		return customerNumber;
	}
	
	/**
	 * @param customerNumber the customerNumber to set
	 */
	public void setCustomerNumber(String customerNumber) {
		this.customerNumber = customerNumber;
	}
	
	/**
	 * @return the caseNumber
	 */
	public String getCaseNumber() {
		return caseNumber;
	}
	
	/**
	 * @param caseNumber the caseNumber to set
	 */
	public void setCaseNumber(String caseNumber) {
		this.caseNumber = caseNumber;
	}
	
	/**
	 * @return the vNumber
	 */
	public String getvNumber() {
		return vNumber;
	}
	
	/**
	 * @param vNumber the vNumber to set
	 */
	public void setvNumber(String vNumber) {
		this.vNumber = vNumber;
	}
	
	/**
	 * @return the surname
	 */
	public String getSurname() {
		return surname;
	}
	
	/**
	 * @param surname the surname to set
	 */
	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * @return the dateBirth
	 */
	public Date getDateBirth() {
		return dateBirth;
	}
	
	/**
	 * @param dateBirth the dateBirth to set
	 */
	public void setDateBirth(Date dateBirth) {
		this.dateBirth = dateBirth;
	}
	
	/**
	 * @return the nationality
	 */
	public NationalityEnum getNationality() {
		return nationality;
	}
	
	/**
	 * @param nationality the nationality to set
	 */
	public void setNationality(NationalityEnum nationality) {
		this.nationality = nationality;
	}
	
	/**
	 * @return the placeBirth
	 */
	public String getPlaceBirth() {
		return placeBirth;
	}
	
	/**
	 * @param placeBirth the placeBirth to set
	 */
	public void setPlaceBirth(String placeBirth) {
		this.placeBirth = placeBirth;
	}
	
	/**
	 * @return the countryBirth
	 */
	public String getCountryBirth() {
		return countryBirth;
	}
	
	/**
	 * @param countryBirth the countryBirth to set
	 */
	public void setCountryBirth(String countryBirth) {
		this.countryBirth = countryBirth;
	}
	
	/**
	 * @return the martialStatus
	 */
	public MartialStatusEnum getMartialStatus() {
		return martialStatus;
	}
	
	/**
	 * @param martialStatus the martialStatus to set
	 */
	public void setMartialStatus(MartialStatusEnum martialStatus) {
		this.martialStatus = martialStatus;
	}
	
	/**
	 * @return the sex
	 */
	public SexEnum getSex() {
		return sex;
	}
	
	/**
	 * @param sex the sex to set
	 */
	public void setSex(SexEnum sex) {
		this.sex = sex;
	}
	
	/**
	 * @return the eurodacClaimedCountry
	 */
	public String getEurodacClaimedCountry() {
		return eurodacClaimedCountry;
	}
	
	/**
	 * @param eurodacClaimedCountry the eurodacClaimedCountry to set
	 */
	public void setEurodacClaimedCountry(String eurodacClaimedCountry) {
		this.eurodacClaimedCountry = eurodacClaimedCountry;
	}
	
	/**
	 * @return the eurodacReason
	 */
	public String getEurodacReason() {
		return eurodacReason;
	}
	
	/**
	 * @param eurodacReason the eurodacReason to set
	 */
	public void setEurodacReason(String eurodacReason) {
		this.eurodacReason = eurodacReason;
	}
	
	/**
	 * @return the euvisDactyl
	 */
	public YesNoNotAppEnum getEuvisDactyl() {
		return euvisDactyl;
	}
	
	/**
	 * @param euvisDactyl the euvisDactyl to set
	 */
	public void setEuvisDactyl(YesNoNotAppEnum euvisDactyl) {
		this.euvisDactyl = euvisDactyl;
	}
	
	/**
	 * @return the euvisNameResearch
	 */
	public YesNoNotAppEnum getEuvisNameResearch() {
		return euvisNameResearch;
	}
	
	/**
	 * @param euvisNameResearch the euvisNameResearch to set
	 */
	public void setEuvisNameResearch(YesNoNotAppEnum euvisNameResearch) {
		this.euvisNameResearch = euvisNameResearch;
	}
	
	/**
	 * @return the euvisClaimedCountry
	 */
	public String getEuvisClaimedCountry() {
		return euvisClaimedCountry;
	}
	
	/**
	 * @param euvisClaimedCountry the euvisClaimedCountry to set
	 */
	public void setEuvisClaimedCountry(String euvisClaimedCountry) {
		this.euvisClaimedCountry = euvisClaimedCountry;
	}
	
	/**
	 * @return the expDateVisum
	 */
	public String getExpDateVisum() {
		return expDateVisum;
	}
	
	/**
	 * @param expDateVisum the expDateVisum to set
	 */
	public void setExpDateVisum(String expDateVisum) {
		this.expDateVisum = expDateVisum;
	}
	
	/**
	 * @return the documents
	 */
	public List<String> getDocuments() {
		return documents;
	}
	
	/**
	 * @param documents the documents to set
	 */
	public void setDocuments(List<String> documents) {
		this.documents = documents;
	}
	
	public void addDocument(String doc){
		this.documents.add(doc);
	}
	
	/**
	 * @return the interpreter
	 */
	public long getInterpreter() {
		return interpreter;
	}
	
	/**
	 * @param interpreter the interpreter to set
	 */
	public void setInterpreter(long interpreter) {
		this.interpreter = interpreter;
	}
	
	/**
	 * @return the location
	 */
	public LocationEnum getLocation() {
		return location;
	}
	
	/**
	 * @param location the location to set
	 */
	public void setLocation(LocationEnum location) {
		this.location = location;
	}
	
	/**
	 * @return the polLocation
	 */
	public LocationEnum getPolLocation() {
		return polLocation;
	}
	
	/**
	 * @param polLocation the polLocation to set
	 */
	public void setPolLocation(LocationEnum polLocation) {
		this.polLocation = polLocation;
	}
	
	/**
	 * @return the track
	 */
	public String getTrack() {
		return track;
	}
	
	/**
	 * @param track the track to set
	 */
	public void setTrack(String track) {
		this.track = track;
	}
	
	/**
	 * @return the customeQuestion
	 */
	public String getCustomeQuestion() {
		return customeQuestion;
	}
	
	/**
	 * @param customeQuestion the customeQuestion to set
	 */
	public void setCustomeQuestion(String customeQuestion) {
		this.customeQuestion = customeQuestion;
	}
	
	
}
