package com.aspl.org.dto;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class OverTimeDTO {

	private String empCode;
	private String empName;
	private Double otHrs;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	private Date reportFromDate;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	private Date reportToDate;
	private Double totalothouse;
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
	 * @return the otHrs
	 */
	public Double getOtHrs() {
		return otHrs;
	}
	/**
	 * @param otHrs the otHrs to set
	 */
	public void setOtHrs(Double otHrs) {
		this.otHrs = otHrs;
	}
	/**
	 * @return the reportFromDate
	 */
	public Date getReportFromDate() {
		return reportFromDate;
	}
	/**
	 * @param reportFromDate the reportFromDate to set
	 */
	public void setReportFromDate(Date reportFromDate) {
		this.reportFromDate = reportFromDate;
	}
	/**
	 * @return the reportToDate
	 */
	public Date getReportToDate() {
		return reportToDate;
	}
	/**
	 * @param reportToDate the reportToDate to set
	 */
	public void setReportToDate(Date reportToDate) {
		this.reportToDate = reportToDate;
	}
	
	
		public Double getTotalothouse() {
		return totalothouse;
	}
	public void setTotalothouse(Double totalothouse) {
		this.totalothouse = totalothouse;
	}
	@Override
	public String toString() {
		return "OverTimeDTO [empCode=" + empCode + ", empName=" + empName + ", otHrs=" + otHrs + ", reportFromDate="
				+ reportFromDate + ", reportToDate=" + reportToDate + ", totalothouse=" + totalothouse + "]";
	}
	
	
	
}
