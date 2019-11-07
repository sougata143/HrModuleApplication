package com.aspl.org.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name="canteenvouchermst")
public class CanteenVoucherEntry 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer canvouID;
	private String empCode;
	private String empName;
	private Integer section;
	private String voucherNo;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	private Date voucherDate;
	private Integer totalCoupon;
	private Double rate;
	private Double charge;
	private String remarks;
	/**
	 * @return the canvouID
	 */
	public Integer getCanvouID() {
		return canvouID;
	}
	/**
	 * @param canvouID the canvouID to set
	 */
	public void setCanvouID(Integer canvouID) {
		this.canvouID = canvouID;
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
	 * @return the section
	 */
	public Integer getSection() {
		return section;
	}
	/**
	 * @param section the section to set
	 */
	public void setSection(Integer section) {
		this.section = section;
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
	 * @return the totalCoupon
	 */
	public Integer getTotalCoupon() {
		return totalCoupon;
	}
	/**
	 * @param totalCoupon the totalCoupon to set
	 */
	public void setTotalCoupon(Integer totalCoupon) {
		this.totalCoupon = totalCoupon;
	}
	/**
	 * @return the rate
	 */
	public Double getRate() {
		return rate;
	}
	/**
	 * @param rate the rate to set
	 */
	public void setRate(Double rate) {
		this.rate = rate;
	}
	/**
	 * @return the charge
	 */
	public Double getCharge() {
		return charge;
	}
	/**
	 * @param charge the charge to set
	 */
	public void setCharge(Double charge) {
		this.charge = charge;
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
