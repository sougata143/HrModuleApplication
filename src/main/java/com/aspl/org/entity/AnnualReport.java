package com.aspl.org.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;


@Entity
@Table(name="annualreport")
public class AnnualReport {

	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer reportId;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	private Date fromDatePeriod;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	private Date toDatePeriod;
	private String classificationCode;
	private String fromType;
	private String mandaysworkedformen;
	private String fatalaccidents;
	private String nonfatalaccidents;
	private String noofaccidents;
	private String mandaysLost;
	private String dischargedismisquit;
	private String noofworkerinlieuofleave;
	private String profitsharingbonus;
	private String nonprofitsharingbonus;
	private String arrearsofpay;
	
	
	
	/**
	 * @return the reportId
	 */
	public Integer getReportId() {
		return reportId;
	}
	/**
	 * @param reportId the reportId to set
	 */
	public void setReportId(Integer reportId) {
		this.reportId = reportId;
	}
	/**
	 * @return the fromDatePeriod
	 */
	public Date getFromDatePeriod() {
		return fromDatePeriod;
	}
	/**
	 * @param fromDatePeriod the fromDatePeriod to set
	 */
	public void setFromDatePeriod(Date fromDatePeriod) {
		this.fromDatePeriod = fromDatePeriod;
	}
	/**
	 * @return the toDatePeriod
	 */
	public Date getToDatePeriod() {
		return toDatePeriod;
	}
	/**
	 * @param toDatePeriod the toDatePeriod to set
	 */
	public void setToDatePeriod(Date toDatePeriod) {
		this.toDatePeriod = toDatePeriod;
	}
	/**
	 * @return the classificationCode
	 */
	public String getClassificationCode() {
		return classificationCode;
	}
	/**
	 * @param classificationCode the classificationCode to set
	 */
	public void setClassificationCode(String classificationCode) {
		this.classificationCode = classificationCode;
	}
	/**
	 * @return the fromType
	 */
	public String getFromType() {
		return fromType;
	}
	/**
	 * @param fromType the fromType to set
	 */
	public void setFromType(String fromType) {
		this.fromType = fromType;
	}
	/**
	 * @return the mandaysworkedformen
	 */
	public String getMandaysworkedformen() {
		return mandaysworkedformen;
	}
	/**
	 * @param mandaysworkedformen the mandaysworkedformen to set
	 */
	public void setMandaysworkedformen(String mandaysworkedformen) {
		this.mandaysworkedformen = mandaysworkedformen;
	}
	/**
	 * @return the fatalaccidents
	 */
	public String getFatalaccidents() {
		return fatalaccidents;
	}
	/**
	 * @param fatalaccidents the fatalaccidents to set
	 */
	public void setFatalaccidents(String fatalaccidents) {
		this.fatalaccidents = fatalaccidents;
	}
	/**
	 * @return the nonfatalaccidents
	 */
	public String getNonfatalaccidents() {
		return nonfatalaccidents;
	}
	/**
	 * @param nonfatalaccidents the nonfatalaccidents to set
	 */
	public void setNonfatalaccidents(String nonfatalaccidents) {
		this.nonfatalaccidents = nonfatalaccidents;
	}
	/**
	 * @return the noofaccidents
	 */
	public String getNoofaccidents() {
		return noofaccidents;
	}
	/**
	 * @param noofaccidents the noofaccidents to set
	 */
	public void setNoofaccidents(String noofaccidents) {
		this.noofaccidents = noofaccidents;
	}
	/**
	 * @return the mandaysLost
	 */
	public String getMandaysLost() {
		return mandaysLost;
	}
	/**
	 * @param mandaysLost the mandaysLost to set
	 */
	public void setMandaysLost(String mandaysLost) {
		this.mandaysLost = mandaysLost;
	}
	/**
	 * @return the dischargedismisquit
	 */
	public String getDischargedismisquit() {
		return dischargedismisquit;
	}
	/**
	 * @param dischargedismisquit the dischargedismisquit to set
	 */
	public void setDischargedismisquit(String dischargedismisquit) {
		this.dischargedismisquit = dischargedismisquit;
	}
	/**
	 * @return the noofworkerinlieuofleave
	 */
	public String getNoofworkerinlieuofleave() {
		return noofworkerinlieuofleave;
	}
	/**
	 * @param noofworkerinlieuofleave the noofworkerinlieuofleave to set
	 */
	public void setNoofworkerinlieuofleave(String noofworkerinlieuofleave) {
		this.noofworkerinlieuofleave = noofworkerinlieuofleave;
	}
	/**
	 * @return the profitsharingbonus
	 */
	public String getProfitsharingbonus() {
		return profitsharingbonus;
	}
	/**
	 * @param profitsharingbonus the profitsharingbonus to set
	 */
	public void setProfitsharingbonus(String profitsharingbonus) {
		this.profitsharingbonus = profitsharingbonus;
	}
	/**
	 * @return the nonprofitsharingbonus
	 */
	public String getNonprofitsharingbonus() {
		return nonprofitsharingbonus;
	}
	/**
	 * @param nonprofitsharingbonus the nonprofitsharingbonus to set
	 */
	public void setNonprofitsharingbonus(String nonprofitsharingbonus) {
		this.nonprofitsharingbonus = nonprofitsharingbonus;
	}
	/**
	 * @return the arrearsofpay
	 */
	public String getArrearsofpay() {
		return arrearsofpay;
	}
	/**
	 * @param arrearsofpay the arrearsofpay to set
	 */
	public void setArrearsofpay(String arrearsofpay) {
		this.arrearsofpay = arrearsofpay;
	}
	
	
	
	
	
	
	
	
	
}
