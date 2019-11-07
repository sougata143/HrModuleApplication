package com.aspl.org.dto;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class PfReportForStaffDTO {

	
	
	private String empCode;
	private String empName;
	private Double basicSalary;
	private Double grossSalary;
	private Double pfContribution;
	private Double pensionableSal;
	private Double penFund;
	private Double erSrPf;
	
	private Double totalbasicSalary;
	private Double totalgrossSalary;
	private Double totalpfContribution;
	private Double totalpensionableSal;
	private Double totalpenFund;
	private Double totalerSrPf;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	private Date fromDate;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	private Date toDate;
	
	/**
	 * @return the empCode
	 */
	public String getEmpCode() {
		return empCode;
	}
	/**
	 * @param empCode the empCode to set
	 */
	public void setEmpCode(String empCode) {
		this.empCode = empCode;
	}
	/**
	 * @return the empName
	 */
	public String getEmpName() {
		return empName;
	}
	/**
	 * @param empName the empName to set
	 */
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	/**
	 * @return the basicSalary
	 */
	public Double getBasicSalary() {
		return basicSalary;
	}
	/**
	 * @param basicSalary the basicSalary to set
	 */
	public void setBasicSalary(Double basicSalary) {
		this.basicSalary = basicSalary;
	}
	/**
	 * @return the grossSalary
	 */
	public Double getGrossSalary() {
		return grossSalary;
	}
	/**
	 * @param grossSalary the grossSalary to set
	 */
	public void setGrossSalary(Double grossSalary) {
		this.grossSalary = grossSalary;
	}
	/**
	 * @return the pfContribution
	 */
	public Double getPfContribution() {
		return pfContribution;
	}
	/**
	 * @param pfContribution the pfContribution to set
	 */
	public void setPfContribution(Double pfContribution) {
		this.pfContribution = pfContribution;
	}
	/**
	 * @return the pensionableSal
	 */
	public Double getPensionableSal() {
		return pensionableSal;
	}
	/**
	 * @param pensionableSal the pensionableSal to set
	 */
	public void setPensionableSal(Double pensionableSal) {
		this.pensionableSal = pensionableSal;
	}
	/**
	 * @return the penFund
	 */
	public Double getPenFund() {
		return penFund;
	}
	/**
	 * @param penFund the penFund to set
	 */
	public void setPenFund(Double penFund) {
		this.penFund = penFund;
	}
	/**
	 * @return the erSrPf
	 */
	public Double getErSrPf() {
		return erSrPf;
	}
	/**
	 * @param erSrPf the erSrPf to set
	 */
	public void setErSrPf(Double erSrPf) {
		this.erSrPf = erSrPf;
	}
	/**
	 * @return the totalbasicSalary
	 */
	public Double getTotalbasicSalary() {
		return totalbasicSalary;
	}
	/**
	 * @param totalbasicSalary the totalbasicSalary to set
	 */
	public void setTotalbasicSalary(Double totalbasicSalary) {
		this.totalbasicSalary = totalbasicSalary;
	}
	/**
	 * @return the totalgrossSalary
	 */
	public Double getTotalgrossSalary() {
		return totalgrossSalary;
	}
	/**
	 * @param totalgrossSalary the totalgrossSalary to set
	 */
	public void setTotalgrossSalary(Double totalgrossSalary) {
		this.totalgrossSalary = totalgrossSalary;
	}
	/**
	 * @return the totalpfContribution
	 */
	public Double getTotalpfContribution() {
		return totalpfContribution;
	}
	/**
	 * @param totalpfContribution the totalpfContribution to set
	 */
	public void setTotalpfContribution(Double totalpfContribution) {
		this.totalpfContribution = totalpfContribution;
	}
	/**
	 * @return the totalpensionableSal
	 */
	public Double getTotalpensionableSal() {
		return totalpensionableSal;
	}
	/**
	 * @param totalpensionableSal the totalpensionableSal to set
	 */
	public void setTotalpensionableSal(Double totalpensionableSal) {
		this.totalpensionableSal = totalpensionableSal;
	}
	/**
	 * @return the totalpenFund
	 */
	public Double getTotalpenFund() {
		return totalpenFund;
	}
	/**
	 * @param totalpenFund the totalpenFund to set
	 */
	public void setTotalpenFund(Double totalpenFund) {
		this.totalpenFund = totalpenFund;
	}
	/**
	 * @return the totalerSrPf
	 */
	public Double getTotalerSrPf() {
		return totalerSrPf;
	}
	/**
	 * @param totalerSrPf the totalerSrPf to set
	 */
	public void setTotalerSrPf(Double totalerSrPf) {
		this.totalerSrPf = totalerSrPf;
	}
	/**
	 * @return the fromDate
	 */
	public Date getFromDate() {
		return fromDate;
	}
	/**
	 * @param fromDate the fromDate to set
	 */
	public void setFromDate(Date fromDate) {
		this.fromDate = fromDate;
	}
	/**
	 * @return the toDate
	 */
	public Date getToDate() {
		return toDate;
	}
	/**
	 * @param toDate the toDate to set
	 */
	public void setToDate(Date toDate) {
		this.toDate = toDate;
	}

	
}
