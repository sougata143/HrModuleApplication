package com.aspl.org.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;


@Entity
@Table(name="welfarefundreport")
public class WelfareFundReport {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer welfarefundeportId;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
	private Date asOnDate;
	private Integer totalNoOfEmp;
	private Integer noOfEmpContributionDeducted;
	private Integer noOfEmployefromconTender;
	private Integer totalAmtofEmpFromContriTender;
	private Integer toAmtofContractorLabour;
	private Integer grandTotal;
	private String chequeCash;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
	private Date chequeDate;
	private String branch;
	
	private String welfareFundType;
	
	
	

	/**
	 * @return the welfarefundeportId
	 */
	public Integer getWelfarefundeportId() {
		return welfarefundeportId;
	}

	/**
	 * @param welfarefundeportId the welfarefundeportId to set
	 */
	public void setWelfarefundeportId(Integer welfarefundeportId) {
		this.welfarefundeportId = welfarefundeportId;
	}

	/**
	 * @return the totalNoOfEmp
	 */
	public Integer getTotalNoOfEmp() {
		return totalNoOfEmp;
	}

	/**
	 * @param totalNoOfEmp the totalNoOfEmp to set
	 */
	public void setTotalNoOfEmp(Integer totalNoOfEmp) {
		this.totalNoOfEmp = totalNoOfEmp;
	}

	/**
	 * @return the noOfEmpContributionDeducted
	 */
	public Integer getNoOfEmpContributionDeducted() {
		return noOfEmpContributionDeducted;
	}

	/**
	 * @param noOfEmpContributionDeducted the noOfEmpContributionDeducted to set
	 */
	public void setNoOfEmpContributionDeducted(Integer noOfEmpContributionDeducted) {
		this.noOfEmpContributionDeducted = noOfEmpContributionDeducted;
	}

	/**
	 * @return the noOfEmployefromconTender
	 */
	public Integer getNoOfEmployefromconTender() {
		return noOfEmployefromconTender;
	}

	/**
	 * @param noOfEmployefromconTender the noOfEmployefromconTender to set
	 */
	public void setNoOfEmployefromconTender(Integer noOfEmployefromconTender) {
		this.noOfEmployefromconTender = noOfEmployefromconTender;
	}

	/**
	 * @return the totalAmtofEmpFromContriTender
	 */
	public Integer getTotalAmtofEmpFromContriTender() {
		return totalAmtofEmpFromContriTender;
	}

	/**
	 * @param totalAmtofEmpFromContriTender the totalAmtofEmpFromContriTender to set
	 */
	public void setTotalAmtofEmpFromContriTender(Integer totalAmtofEmpFromContriTender) {
		this.totalAmtofEmpFromContriTender = totalAmtofEmpFromContriTender;
	}

	/**
	 * @return the toAmtofContractorLabour
	 */
	public Integer getToAmtofContractorLabour() {
		return toAmtofContractorLabour;
	}

	/**
	 * @param toAmtofContractorLabour the toAmtofContractorLabour to set
	 */
	public void setToAmtofContractorLabour(Integer toAmtofContractorLabour) {
		this.toAmtofContractorLabour = toAmtofContractorLabour;
	}

	/**
	 * @return the grandTotal
	 */
	public Integer getGrandTotal() {
		return grandTotal;
	}

	/**
	 * @param grandTotal the grandTotal to set
	 */
	public void setGrandTotal(Integer grandTotal) {
		this.grandTotal = grandTotal;
	}

	/**
	 * @return the chequeCash
	 */
	public String getChequeCash() {
		return chequeCash;
	}

	/**
	 * @param chequeCash the chequeCash to set
	 */
	public void setChequeCash(String chequeCash) {
		this.chequeCash = chequeCash;
	}

	/**
	 * @return the chequeDate
	 */
	public Date getChequeDate() {
		return chequeDate;
	}

	/**
	 * @param chequeDate the chequeDate to set
	 */
	public void setChequeDate(Date chequeDate) {
		this.chequeDate = chequeDate;
	}

	/**
	 * @return the branch
	 */
	public String getBranch() {
		return branch;
	}

	/**
	 * @param branch the branch to set
	 */
	public void setBranch(String branch) {
		this.branch = branch;
	}

	/**
	 * @return the welfareFundType
	 */
	public String getWelfareFundType() {
		return welfareFundType;
	}

	/**
	 * @param welfareFundType the welfareFundType to set
	 */
	public void setWelfareFundType(String welfareFundType) {
		this.welfareFundType = welfareFundType;
	}

	public Date getAsOnDate() {
		return asOnDate;
	}

	public void setAsOnDate(Date asOnDate) {
		this.asOnDate = asOnDate;
	}
	
	
	
	
	

}
