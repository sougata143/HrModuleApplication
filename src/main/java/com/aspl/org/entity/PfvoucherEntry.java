package com.aspl.org.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name="pfvoucherentry")
public class PfvoucherEntry 
{
	@Id
	@GeneratedValue
	private Integer pfvouID;
	private String pfNo;
	private String voucherNo;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	private Date voucherDate;
	private String empcode;
	private Double arrear;
	private String empname;
	private Double pfcontribution;
	private Double penfund;
	private Double employercontri;
	private String remarks;
	
	
	/**
	 * @return the pfvouID
	 */
	public Integer getPfvouID() {
		return pfvouID;
	}
	/**
	 * @param pfvouID the pfvouID to set
	 */
	public void setPfvouID(Integer pfvouID) {
		this.pfvouID = pfvouID;
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
	 * @return the empcode
	 */
	public String getEmpcode() {
		return empcode;
	}
	/**
	 * @param empcode the empcode to set
	 */
	public void setEmpcode(String empcode) {
		this.empcode = empcode;
	}
	/**
	 * @return the arrear
	 */
	public Double getArrear() {
		return arrear;
	}
	/**
	 * @param arrear the arrear to set
	 */
	public void setArrear(Double arrear) {
		this.arrear = arrear;
	}
	/**
	 * @return the empname
	 */
	public String getEmpname() {
		return empname;
	}
	/**
	 * @param empname the empname to set
	 */
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	/**
	 * @return the pfcontribution
	 */
	public Double getPfcontribution() {
		return pfcontribution;
	}
	/**
	 * @param pfcontribution the pfcontribution to set
	 */
	public void setPfcontribution(Double pfcontribution) {
		this.pfcontribution = pfcontribution;
	}
	/**
	 * @return the penfund
	 */
	public Double getPenfund() {
		return penfund;
	}
	/**
	 * @param penfund the penfund to set
	 */
	public void setPenfund(Double penfund) {
		this.penfund = penfund;
	}
	/**
	 * @return the employercontri
	 */
	public Double getEmployercontri() {
		return employercontri;
	}
	/**
	 * @param employercontri the employercontri to set
	 */
	public void setEmployercontri(Double employercontri) {
		this.employercontri = employercontri;
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
	public String getPfNo() {
		return pfNo;
	}
	public void setPfNo(String pfNo) {
		this.pfNo = pfNo;
	}
	
	
	

}
