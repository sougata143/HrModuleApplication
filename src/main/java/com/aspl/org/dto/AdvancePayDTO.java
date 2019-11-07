package com.aspl.org.dto;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class AdvancePayDTO {
	
	
	private Integer adpayId;
	private String empcode;
	private String employeeName;
	private Integer section;
	private String SectionName;
	private String voucherNo;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	private Date voucherDate;
	private Double advamount;
	private Double payamount;
	private Integer noofinstallments;
	private Double installmentamt;
	private String remarks;
	private Double balenceamount;
	
	private Date userfromDate;
	private Date usertoDate;
	/**
	 * @return the adpayId
	 */
	public Integer getAdpayId() {
		return adpayId;
	}
	/**
	 * @param adpayId the adpayId to set
	 */
	public void setAdpayId(Integer adpayId) {
		this.adpayId = adpayId;
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
	 * @return the employeeName
	 */
	public String getEmployeeName() {
		return employeeName;
	}
	/**
	 * @param employeeName the employeeName to set
	 */
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
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
	 * @return the sectionName
	 */
	public String getSectionName() {
		return SectionName;
	}
	/**
	 * @param sectionName the sectionName to set
	 */
	public void setSectionName(String sectionName) {
		SectionName = sectionName;
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
	 * @return the advamount
	 */
	public Double getAdvamount() {
		return advamount;
	}
	/**
	 * @param advamount the advamount to set
	 */
	public void setAdvamount(Double advamount) {
		this.advamount = advamount;
	}
	/**
	 * @return the payamount
	 */
	public Double getPayamount() {
		return payamount;
	}
	/**
	 * @param payamount the payamount to set
	 */
	public void setPayamount(Double payamount) {
		this.payamount = payamount;
	}
	/**
	 * @return the noofinstallments
	 */
	public Integer getNoofinstallments() {
		return noofinstallments;
	}
	/**
	 * @param noofinstallments the noofinstallments to set
	 */
	public void setNoofinstallments(Integer noofinstallments) {
		this.noofinstallments = noofinstallments;
	}
	/**
	 * @return the installmentamt
	 */
	public Double getInstallmentamt() {
		return installmentamt;
	}
	/**
	 * @param installmentamt the installmentamt to set
	 */
	public void setInstallmentamt(Double installmentamt) {
		this.installmentamt = installmentamt;
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

	public Date getUserfromDate() {
		return userfromDate;
	}
	public void setUserfromDate(Date userfromDate) {
		this.userfromDate = userfromDate;
	}
	public Date getUsertoDate() {
		return usertoDate;
	}
	public void setUsertoDate(Date usertoDate) {
		this.usertoDate = usertoDate;
	}
	
	public Double getBalenceamount() {
		return balenceamount;
	}
	public void setBalenceamount(Double balenceamount) {
		this.balenceamount = balenceamount;
	}
	@Override
	public String toString() {
		return "AdvancePayDTO [adpayId=" + adpayId + ", empcode=" + empcode + ", employeeName=" + employeeName
				+ ", section=" + section + ", SectionName=" + SectionName + ", voucherNo=" + voucherNo
				+ ", voucherDate=" + voucherDate + ", advamount=" + advamount + ", payamount=" + payamount
				+ ", noofinstallments=" + noofinstallments + ", installmentamt=" + installmentamt + ", remarks="
				+ remarks + ", balenceamount=" + balenceamount + ", userfromDate=" + userfromDate + ", usertoDate="
				+ usertoDate + "]";
	} 
	
	
	
	
	

}
