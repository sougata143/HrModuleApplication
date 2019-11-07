package com.aspl.org.dto;


public class OverTimeDepertmentWiseEmpDetailsDTO {

	private String empCode;
	private String empName;
	private Double otHrs;
	private Double otamount;
	
	private Double totalOthrs;
	private Double totalOtamt;
	
	private Double totalothouse;
	
	private String dept;
	
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
	
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	
}
