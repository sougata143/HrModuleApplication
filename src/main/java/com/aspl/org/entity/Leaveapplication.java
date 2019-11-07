package com.aspl.org.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name="leaveapplication")
public class Leaveapplication 

{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	private Integer leaveapplicationID;
	private String voucherNo;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	private Date applicationDate;
	private String empCode;
	private String empName;
	private String leaveType;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	private Date fromDate;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	private Date toDate;
	private String approvedstatus;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	private Date approvedDate;
	private Integer noofdays;
	private String remarks;
	/**
	 * @return the leaveapplicationID
	 */
	public Integer getLeaveapplicationID() {
		return leaveapplicationID;
	}
	/**
	 * @param leaveapplicationID the leaveapplicationID to set
	 */
	public void setLeaveapplicationID(Integer leaveapplicationID) {
		this.leaveapplicationID = leaveapplicationID;
	}
	/**
	 * @return the voucherNo
	 */
	public String getVoucherNo() {
		return voucherNo;
	}
	/**
	 * @param voucherNo the voucherNo to set
	 */
	public void setVoucherNo(String voucherNo) {
		this.voucherNo = voucherNo;
	}
	/**
	 * @return the applicationDate
	 */
	public Date getApplicationDate() {
		return applicationDate;
	}
	/**
	 * @param applicationDate the applicationDate to set
	 */
	public void setApplicationDate(Date applicationDate) {
		this.applicationDate = applicationDate;
	}
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
	 * @return the leaveType
	 */
	public String getLeaveType() {
		return leaveType;
	}
	/**
	 * @param leaveType the leaveType to set
	 */
	public void setLeaveType(String leaveType) {
		this.leaveType = leaveType;
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
	/**
	 * @return the approvedstatus
	 */
	public String getApprovedstatus() {
		return approvedstatus;
	}
	/**
	 * @param approvedstatus the approvedstatus to set
	 */
	public void setApprovedstatus(String approvedstatus) {
		this.approvedstatus = approvedstatus;
	}
	/**
	 * @return the approvedDate
	 */
	public Date getApprovedDate() {
		return approvedDate;
	}
	/**
	 * @param approvedDate the approvedDate to set
	 */
	public void setApprovedDate(Date approvedDate) {
		this.approvedDate = approvedDate;
	}
	/**
	 * @return the noofdays
	 */
	public Integer getNoofdays() {
		return noofdays;
	}
	/**
	 * @param noofdays the noofdays to set
	 */
	public void setNoofdays(Integer noofdays) {
		this.noofdays = noofdays;
	}
	/**
	 * @return the remarks
	 */
	public String getRemarks() {
		return remarks;
	}
	/**
	 * @param remarks the remarks to set
	 */
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	
	
	
	

	
	
	
}
