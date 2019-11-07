package com.aspl.org.dto;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class OverTimeDepertmentWiseDTOLIST {

	private String sectionName;
	private Integer sectionId;
	
	private Integer departmentId;
	private String departmentName;
	
	private Integer empCode;
	private String empName;
	private Double otHrs;
	private Double otamount;
	
	private Double totalOthrs;
	private Double totalOtamt;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	private Date reportFromDate;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	private Date reportToDate;
	private Double totalothouse;
	/**
	 * @return the sectionName
	 */
	public String getSectionName() {
		return sectionName;
	}
	/**
	 * @param sectionName the sectionName to set
	 */
	public void setSectionName(String sectionName) {
		this.sectionName = sectionName;
	}
	/**
	 * @return the sectionId
	 */
	public Integer getSectionId() {
		return sectionId;
	}
	/**
	 * @param sectionId the sectionId to set
	 */
	public void setSectionId(Integer sectionId) {
		this.sectionId = sectionId;
	}
	/**
	 * @return the departmentId
	 */
	public Integer getDepartmentId() {
		return departmentId;
	}
	/**
	 * @param departmentId the departmentId to set
	 */
	public void setDepartmentId(Integer departmentId) {
		this.departmentId = departmentId;
	}
	/**
	 * @return the departmentName
	 */
	public String getDepartmentName() {
		return departmentName;
	}
	/**
	 * @param departmentName the departmentName to set
	 */
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	/**
	 * @return the empCode
	 */
	public Integer getEmpCode() {
		return empCode;
	}
	/**
	 * @param empCode the empCode to set
	 */
	public void setEmpCode(Integer empCode) {
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
	 * @return the otamount
	 */
	public Double getOtamount() {
		return otamount;
	}
	/**
	 * @param otamount the otamount to set
	 */
	public void setOtamount(Double otamount) {
		this.otamount = otamount;
	}
	/**
	 * @return the totalOthrs
	 */
	public Double getTotalOthrs() {
		return totalOthrs;
	}
	/**
	 * @param totalOthrs the totalOthrs to set
	 */
	public void setTotalOthrs(Double totalOthrs) {
		this.totalOthrs = totalOthrs;
	}
	/**
	 * @return the totalOtamt
	 */
	public Double getTotalOtamt() {
		return totalOtamt;
	}
	/**
	 * @param totalOtamt the totalOtamt to set
	 */
	public void setTotalOtamt(Double totalOtamt) {
		this.totalOtamt = totalOtamt;
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
	/**
	 * @return the totalothouse
	 */
	public Double getTotalothouse() {
		return totalothouse;
	}
	/**
	 * @param totalothouse the totalothouse to set
	 */
	public void setTotalothouse(Double totalothouse) {
		this.totalothouse = totalothouse;
	}
	@Override
	public String toString() {
		return "OverTimeDepertmentWiseDTO [sectionName=" + sectionName + ", sectionId=" + sectionId + ", departmentId="
				+ departmentId + ", departmentName=" + departmentName + ", empCode=" + empCode + ", empName=" + empName
				+ ", otHrs=" + otHrs + ", otamount=" + otamount + ", totalOthrs=" + totalOthrs + ", totalOtamt="
				+ totalOtamt + ", reportFromDate=" + reportFromDate + ", reportToDate=" + reportToDate
				+ ", totalothouse=" + totalothouse + "]";
	}
	
	
	
	
}
