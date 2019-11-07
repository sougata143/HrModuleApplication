package com.aspl.org.dto;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class PfReportForWorkerDTO {

	
	
	private String empCode;
	private String empName;

	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	private Date firstweekfromDate;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	private Date firstweektoDate;
	private Double firstweekwages;
	private Double firstweekpfemployee;
	private Double firstweekpfemployer;
	private Double firstweekpensionfund;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	private Date secondweekfromDate;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	private Date secondweektoDate;
	private Double secondweekwages;
	private Double secondweekpfemployee;
	private Double secondweekpfemployer;
	private Double secondweekpensionfund;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	private Date thirdweekfromDate;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	private Date thirdweektoDate;
	private Double thirdweekwages;
	private Double thirdweekpfemployee;
	private Double thirdweekpfemployer;
	private Double thirdweekpensionfund;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	private Date fourweekfromDate;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	private Date fourweektoDate;
	private Double fourweekwages;
	private Double fourweekpfemployee;
	private Double fourweekpfemployer;
	private Double fourweekpensionfund;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	private Date fifthweekfromDate;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	private Date fifthweektoDate;
	private Double fifthweekwages;
	private Double fifthweekpfemployee;
	private Double fifthweekpfemployer;
	private Double fifthweekpensionfund;
	
	private Double totalwages;
	private Double totalpfemployee;
	private Double totalpfemployer;
	private Double totalpensionfund;
	private Double totalpenFund;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	private Date reportfromDate;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	private Date reporttoDate;
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
	 * @return the firstweekfromDate
	 */
	public Date getFirstweekfromDate() {
		return firstweekfromDate;
	}
	/**
	 * @param firstweekfromDate the firstweekfromDate to set
	 */
	public void setFirstweekfromDate(Date firstweekfromDate) {
		this.firstweekfromDate = firstweekfromDate;
	}
	/**
	 * @return the firstweektoDate
	 */
	public Date getFirstweektoDate() {
		return firstweektoDate;
	}
	/**
	 * @param firstweektoDate the firstweektoDate to set
	 */
	public void setFirstweektoDate(Date firstweektoDate) {
		this.firstweektoDate = firstweektoDate;
	}
	/**
	 * @return the firstweekwages
	 */
	public Double getFirstweekwages() {
		return firstweekwages;
	}
	/**
	 * @param firstweekwages the firstweekwages to set
	 */
	public void setFirstweekwages(Double firstweekwages) {
		this.firstweekwages = firstweekwages;
	}
	/**
	 * @return the firstweekpfemployee
	 */
	public Double getFirstweekpfemployee() {
		return firstweekpfemployee;
	}
	/**
	 * @param firstweekpfemployee the firstweekpfemployee to set
	 */
	public void setFirstweekpfemployee(Double firstweekpfemployee) {
		this.firstweekpfemployee = firstweekpfemployee;
	}
	/**
	 * @return the firstweekpfemployer
	 */
	public Double getFirstweekpfemployer() {
		return firstweekpfemployer;
	}
	/**
	 * @param firstweekpfemployer the firstweekpfemployer to set
	 */
	public void setFirstweekpfemployer(Double firstweekpfemployer) {
		this.firstweekpfemployer = firstweekpfemployer;
	}
	/**
	 * @return the firstweekpensionfund
	 */
	public Double getFirstweekpensionfund() {
		return firstweekpensionfund;
	}
	/**
	 * @param firstweekpensionfund the firstweekpensionfund to set
	 */
	public void setFirstweekpensionfund(Double firstweekpensionfund) {
		this.firstweekpensionfund = firstweekpensionfund;
	}
	/**
	 * @return the secondweekfromDate
	 */
	public Date getSecondweekfromDate() {
		return secondweekfromDate;
	}
	/**
	 * @param secondweekfromDate the secondweekfromDate to set
	 */
	public void setSecondweekfromDate(Date secondweekfromDate) {
		this.secondweekfromDate = secondweekfromDate;
	}
	/**
	 * @return the secondweektoDate
	 */
	public Date getSecondweektoDate() {
		return secondweektoDate;
	}
	/**
	 * @param secondweektoDate the secondweektoDate to set
	 */
	public void setSecondweektoDate(Date secondweektoDate) {
		this.secondweektoDate = secondweektoDate;
	}
	/**
	 * @return the secondweekwages
	 */
	public Double getSecondweekwages() {
		return secondweekwages;
	}
	/**
	 * @param secondweekwages the secondweekwages to set
	 */
	public void setSecondweekwages(Double secondweekwages) {
		this.secondweekwages = secondweekwages;
	}
	/**
	 * @return the secondweekpfemployee
	 */
	public Double getSecondweekpfemployee() {
		return secondweekpfemployee;
	}
	/**
	 * @param secondweekpfemployee the secondweekpfemployee to set
	 */
	public void setSecondweekpfemployee(Double secondweekpfemployee) {
		this.secondweekpfemployee = secondweekpfemployee;
	}
	/**
	 * @return the secondweekpfemployer
	 */
	public Double getSecondweekpfemployer() {
		return secondweekpfemployer;
	}
	/**
	 * @param secondweekpfemployer the secondweekpfemployer to set
	 */
	public void setSecondweekpfemployer(Double secondweekpfemployer) {
		this.secondweekpfemployer = secondweekpfemployer;
	}
	/**
	 * @return the secondweekpensionfund
	 */
	public Double getSecondweekpensionfund() {
		return secondweekpensionfund;
	}
	/**
	 * @param secondweekpensionfund the secondweekpensionfund to set
	 */
	public void setSecondweekpensionfund(Double secondweekpensionfund) {
		this.secondweekpensionfund = secondweekpensionfund;
	}
	/**
	 * @return the thirdweekfromDate
	 */
	public Date getThirdweekfromDate() {
		return thirdweekfromDate;
	}
	/**
	 * @param thirdweekfromDate the thirdweekfromDate to set
	 */
	public void setThirdweekfromDate(Date thirdweekfromDate) {
		this.thirdweekfromDate = thirdweekfromDate;
	}
	/**
	 * @return the thirdweektoDate
	 */
	public Date getThirdweektoDate() {
		return thirdweektoDate;
	}
	/**
	 * @param thirdweektoDate the thirdweektoDate to set
	 */
	public void setThirdweektoDate(Date thirdweektoDate) {
		this.thirdweektoDate = thirdweektoDate;
	}
	/**
	 * @return the thirdweekwages
	 */
	public Double getThirdweekwages() {
		return thirdweekwages;
	}
	/**
	 * @param thirdweekwages the thirdweekwages to set
	 */
	public void setThirdweekwages(Double thirdweekwages) {
		this.thirdweekwages = thirdweekwages;
	}
	/**
	 * @return the thirdweekpfemployee
	 */
	public Double getThirdweekpfemployee() {
		return thirdweekpfemployee;
	}
	/**
	 * @param thirdweekpfemployee the thirdweekpfemployee to set
	 */
	public void setThirdweekpfemployee(Double thirdweekpfemployee) {
		this.thirdweekpfemployee = thirdweekpfemployee;
	}
	/**
	 * @return the thirdweekpfemployer
	 */
	public Double getThirdweekpfemployer() {
		return thirdweekpfemployer;
	}
	/**
	 * @param thirdweekpfemployer the thirdweekpfemployer to set
	 */
	public void setThirdweekpfemployer(Double thirdweekpfemployer) {
		this.thirdweekpfemployer = thirdweekpfemployer;
	}
	/**
	 * @return the thirdweekpensionfund
	 */
	public Double getThirdweekpensionfund() {
		return thirdweekpensionfund;
	}
	/**
	 * @param thirdweekpensionfund the thirdweekpensionfund to set
	 */
	public void setThirdweekpensionfund(Double thirdweekpensionfund) {
		this.thirdweekpensionfund = thirdweekpensionfund;
	}
	/**
	 * @return the fourweekfromDate
	 */
	public Date getFourweekfromDate() {
		return fourweekfromDate;
	}
	/**
	 * @param fourweekfromDate the fourweekfromDate to set
	 */
	public void setFourweekfromDate(Date fourweekfromDate) {
		this.fourweekfromDate = fourweekfromDate;
	}
	/**
	 * @return the fourweektoDate
	 */
	public Date getFourweektoDate() {
		return fourweektoDate;
	}
	/**
	 * @param fourweektoDate the fourweektoDate to set
	 */
	public void setFourweektoDate(Date fourweektoDate) {
		this.fourweektoDate = fourweektoDate;
	}
	/**
	 * @return the fourweekwages
	 */
	public Double getFourweekwages() {
		return fourweekwages;
	}
	/**
	 * @param fourweekwages the fourweekwages to set
	 */
	public void setFourweekwages(Double fourweekwages) {
		this.fourweekwages = fourweekwages;
	}
	/**
	 * @return the fourweekpfemployee
	 */
	public Double getFourweekpfemployee() {
		return fourweekpfemployee;
	}
	/**
	 * @param fourweekpfemployee the fourweekpfemployee to set
	 */
	public void setFourweekpfemployee(Double fourweekpfemployee) {
		this.fourweekpfemployee = fourweekpfemployee;
	}
	/**
	 * @return the fourweekpfemployer
	 */
	public Double getFourweekpfemployer() {
		return fourweekpfemployer;
	}
	/**
	 * @param fourweekpfemployer the fourweekpfemployer to set
	 */
	public void setFourweekpfemployer(Double fourweekpfemployer) {
		this.fourweekpfemployer = fourweekpfemployer;
	}
	/**
	 * @return the fourweekpensionfund
	 */
	public Double getFourweekpensionfund() {
		return fourweekpensionfund;
	}
	/**
	 * @param fourweekpensionfund the fourweekpensionfund to set
	 */
	public void setFourweekpensionfund(Double fourweekpensionfund) {
		this.fourweekpensionfund = fourweekpensionfund;
	}
	/**
	 * @return the fifthweekfromDate
	 */
	public Date getFifthweekfromDate() {
		return fifthweekfromDate;
	}
	/**
	 * @param fifthweekfromDate the fifthweekfromDate to set
	 */
	public void setFifthweekfromDate(Date fifthweekfromDate) {
		this.fifthweekfromDate = fifthweekfromDate;
	}
	/**
	 * @return the fifthweektoDate
	 */
	public Date getFifthweektoDate() {
		return fifthweektoDate;
	}
	/**
	 * @param fifthweektoDate the fifthweektoDate to set
	 */
	public void setFifthweektoDate(Date fifthweektoDate) {
		this.fifthweektoDate = fifthweektoDate;
	}
	/**
	 * @return the fifthweekwages
	 */
	public Double getFifthweekwages() {
		return fifthweekwages;
	}
	/**
	 * @param fifthweekwages the fifthweekwages to set
	 */
	public void setFifthweekwages(Double fifthweekwages) {
		this.fifthweekwages = fifthweekwages;
	}
	/**
	 * @return the fifthweekpfemployee
	 */
	public Double getFifthweekpfemployee() {
		return fifthweekpfemployee;
	}
	/**
	 * @param fifthweekpfemployee the fifthweekpfemployee to set
	 */
	public void setFifthweekpfemployee(Double fifthweekpfemployee) {
		this.fifthweekpfemployee = fifthweekpfemployee;
	}
	/**
	 * @return the fifthweekpfemployer
	 */
	public Double getFifthweekpfemployer() {
		return fifthweekpfemployer;
	}
	/**
	 * @param fifthweekpfemployer the fifthweekpfemployer to set
	 */
	public void setFifthweekpfemployer(Double fifthweekpfemployer) {
		this.fifthweekpfemployer = fifthweekpfemployer;
	}
	/**
	 * @return the fifthweekpensionfund
	 */
	public Double getFifthweekpensionfund() {
		return fifthweekpensionfund;
	}
	/**
	 * @param fifthweekpensionfund the fifthweekpensionfund to set
	 */
	public void setFifthweekpensionfund(Double fifthweekpensionfund) {
		this.fifthweekpensionfund = fifthweekpensionfund;
	}
	/**
	 * @return the totalwages
	 */
	public Double getTotalwages() {
		return totalwages;
	}
	/**
	 * @param totalwages the totalwages to set
	 */
	public void setTotalwages(Double totalwages) {
		this.totalwages = totalwages;
	}
	/**
	 * @return the totalpfemployee
	 */
	public Double getTotalpfemployee() {
		return totalpfemployee;
	}
	/**
	 * @param totalpfemployee the totalpfemployee to set
	 */
	public void setTotalpfemployee(Double totalpfemployee) {
		this.totalpfemployee = totalpfemployee;
	}
	/**
	 * @return the totalpfemployer
	 */
	public Double getTotalpfemployer() {
		return totalpfemployer;
	}
	/**
	 * @param totalpfemployer the totalpfemployer to set
	 */
	public void setTotalpfemployer(Double totalpfemployer) {
		this.totalpfemployer = totalpfemployer;
	}
	/**
	 * @return the totalpensionfund
	 */
	public Double getTotalpensionfund() {
		return totalpensionfund;
	}
	/**
	 * @param totalpensionfund the totalpensionfund to set
	 */
	public void setTotalpensionfund(Double totalpensionfund) {
		this.totalpensionfund = totalpensionfund;
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
	 * @return the reportfromDate
	 */
	public Date getReportfromDate() {
		return reportfromDate;
	}
	/**
	 * @param reportfromDate the reportfromDate to set
	 */
	public void setReportfromDate(Date reportfromDate) {
		this.reportfromDate = reportfromDate;
	}
	/**
	 * @return the reporttoDate
	 */
	public Date getReporttoDate() {
		return reporttoDate;
	}
	/**
	 * @param reporttoDate the reporttoDate to set
	 */
	public void setReporttoDate(Date reporttoDate) {
		this.reporttoDate = reporttoDate;
	}
	@Override
	public String toString() {
		return "PfReportForWorkerDTO [empCode=" + empCode + ", empName=" + empName + ", firstweekfromDate="
				+ firstweekfromDate + ", firstweektoDate=" + firstweektoDate + ", firstweekwages=" + firstweekwages
				+ ", firstweekpfemployee=" + firstweekpfemployee + ", firstweekpfemployer=" + firstweekpfemployer
				+ ", firstweekpensionfund=" + firstweekpensionfund + ", secondweekfromDate=" + secondweekfromDate
				+ ", secondweektoDate=" + secondweektoDate + ", secondweekwages=" + secondweekwages
				+ ", secondweekpfemployee=" + secondweekpfemployee + ", secondweekpfemployer=" + secondweekpfemployer
				+ ", secondweekpensionfund=" + secondweekpensionfund + ", thirdweekfromDate=" + thirdweekfromDate
				+ ", thirdweektoDate=" + thirdweektoDate + ", thirdweekwages=" + thirdweekwages
				+ ", thirdweekpfemployee=" + thirdweekpfemployee + ", thirdweekpfemployer=" + thirdweekpfemployer
				+ ", thirdweekpensionfund=" + thirdweekpensionfund + ", fourweekfromDate=" + fourweekfromDate
				+ ", fourweektoDate=" + fourweektoDate + ", fourweekwages=" + fourweekwages + ", fourweekpfemployee="
				+ fourweekpfemployee + ", fourweekpfemployer=" + fourweekpfemployer + ", fourweekpensionfund="
				+ fourweekpensionfund + ", fifthweekfromDate=" + fifthweekfromDate + ", fifthweektoDate="
				+ fifthweektoDate + ", fifthweekwages=" + fifthweekwages + ", fifthweekpfemployee="
				+ fifthweekpfemployee + ", fifthweekpfemployer=" + fifthweekpfemployer + ", fifthweekpensionfund="
				+ fifthweekpensionfund + ", totalwages=" + totalwages + ", totalpfemployee=" + totalpfemployee
				+ ", totalpfemployer=" + totalpfemployer + ", totalpensionfund=" + totalpensionfund + ", totalpenFund="
				+ totalpenFund + ", reportfromDate=" + reportfromDate + ", reporttoDate=" + reporttoDate + "]";
	}
	
	
	
	
	
	
}
