package com.aspl.org.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name="esientry")
public class Esientry {
	
	
	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private Integer esiId;
	private String esiNo;
	private String voucherNo;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	private Date voucherDate;
	private String empCode;
	private String empName;
	private Integer noofDays;
	private Double amount;
	private Double esipercent;
	private Double contribution;
	private String remarks;
	
	/**
	 * @return the esiId
	 */
	public Integer getEsiId() {
		return esiId;
	}
	/**
	 * @param esiId the esiId to set
	 */
	public void setEsiId(Integer esiId) {
		this.esiId = esiId;
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
	 * @return the voucherDate
	 */
	public Date getVoucherDate() {
		return voucherDate;
	}
	/**
	 * @param voucherDate the voucherDate to set
	 */
	public void setVoucherDate(Date voucherDate) {
		this.voucherDate = voucherDate;
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
	 * @return the noofDays
	 */
	public Integer getNoofDays() {
		return noofDays;
	}
	/**
	 * @param noofDays the noofDays to set
	 */
	public void setNoofDays(Integer noofDays) {
		this.noofDays = noofDays;
	}
	/**
	 * @return the amount
	 */
	public Double getAmount() {
		return amount;
	}
	/**
	 * @param amount the amount to set
	 */
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	/**
	 * @return the esipercent
	 */
	public Double getEsipercent() {
		return esipercent;
	}
	/**
	 * @param esipercent the esipercent to set
	 */
	public void setEsipercent(Double esipercent) {
		this.esipercent = esipercent;
	}
	/**
	 * @return the contribution
	 */
	public Double getContribution() {
		return contribution;
	}
	/**
	 * @param contribution the contribution to set
	 */
	public void setContribution(Double contribution) {
		this.contribution = contribution;
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
	public String getEsiNo() {
		return esiNo;
	}
	public void setEsiNo(String esiNo) {
		this.esiNo = esiNo;
	}
	
	
	
	
	

}
