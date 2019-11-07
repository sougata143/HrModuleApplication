package com.aspl.org.dto;

import java.util.Date;

public class WagessheetforWorkersDTO {

	private Integer pfno;
	private String esino;
	private String empname;
	private Integer totalworkdays;
	private Double hd;
	private Integer leaveday;
	private Integer dayforpay;
	private Double rateperday;
	private Double normalwagesearned;
	private Double oThrs;
	private Double oTamt;
	private Double grosswagesearned;
	
	private Date reportfromDate;
	private Date reporttoDate;
	
	private Double wagesAdvdeduction;
	private Double pfAmtdeduction;
	private Double empPenfunddeduction;
	private Double erSrpfdeduction;
	private Double fineAmtdeduction;
	private Double totalDeduction;
	
	private Double totalNetpay;

	
	
	/**
	 * @return the pfno
	 */
	public Integer getPfno() {
		return pfno;
	}

	/**
	 * @param pfno the pfno to set
	 */
	public void setPfno(Integer pfno) {
		this.pfno = pfno;
	}

	/**
	 * @return the esino
	 */
	public String getEsino() {
		return esino;
	}

	/**
	 * @param esino the esino to set
	 */
	public void setEsino(String esino) {
		this.esino = esino;
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
	 * @return the totalworkdays
	 */
	public Integer getTotalworkdays() {
		return totalworkdays;
	}

	/**
	 * @param totalworkdays the totalworkdays to set
	 */
	public void setTotalworkdays(Integer totalworkdays) {
		this.totalworkdays = totalworkdays;
	}

	/**
	 * @return the hd
	 */
	public Double getHd() {
		return hd;
	}

	/**
	 * @param hd the hd to set
	 */
	public void setHd(Double hd) {
		this.hd = hd;
	}

	/**
	 * @return the leaveday
	 */
	public Integer getLeaveday() {
		return leaveday;
	}

	/**
	 * @param leaveday the leaveday to set
	 */
	public void setLeaveday(Integer leaveday) {
		this.leaveday = leaveday;
	}

	/**
	 * @return the dayforpay
	 */
	public Integer getDayforpay() {
		return dayforpay;
	}

	/**
	 * @param dayforpay the dayforpay to set
	 */
	public void setDayforpay(Integer dayforpay) {
		this.dayforpay = dayforpay;
	}

	/**
	 * @return the rateperday
	 */
	public Double getRateperday() {
		return rateperday;
	}

	/**
	 * @param rateperday the rateperday to set
	 */
	public void setRateperday(Double rateperday) {
		this.rateperday = rateperday;
	}

	/**
	 * @return the normalwagesearned
	 */
	public Double getNormalwagesearned() {
		return normalwagesearned;
	}

	/**
	 * @param normalwagesearned the normalwagesearned to set
	 */
	public void setNormalwagesearned(Double normalwagesearned) {
		this.normalwagesearned = normalwagesearned;
	}

	/**
	 * @return the oThrs
	 */
	public Double getoThrs() {
		return oThrs;
	}

	/**
	 * @param oThrs the oThrs to set
	 */
	public void setoThrs(Double oThrs) {
		this.oThrs = oThrs;
	}

	/**
	 * @return the oTamt
	 */
	public Double getoTamt() {
		return oTamt;
	}

	/**
	 * @param oTamt the oTamt to set
	 */
	public void setoTamt(Double oTamt) {
		this.oTamt = oTamt;
	}

	/**
	 * @return the grosswagesearned
	 */
	public Double getGrosswagesearned() {
		return grosswagesearned;
	}

	/**
	 * @param grosswagesearned the grosswagesearned to set
	 */
	public void setGrosswagesearned(Double grosswagesearned) {
		this.grosswagesearned = grosswagesearned;
	}

	/**
	 * @return the wagesAdvdeduction
	 */
	public Double getWagesAdvdeduction() {
		return wagesAdvdeduction;
	}

	/**
	 * @param wagesAdvdeduction the wagesAdvdeduction to set
	 */
	public void setWagesAdvdeduction(Double wagesAdvdeduction) {
		this.wagesAdvdeduction = wagesAdvdeduction;
	}

	/**
	 * @return the pfAmtdeduction
	 */
	public Double getPfAmtdeduction() {
		return pfAmtdeduction;
	}

	/**
	 * @param pfAmtdeduction the pfAmtdeduction to set
	 */
	public void setPfAmtdeduction(Double pfAmtdeduction) {
		this.pfAmtdeduction = pfAmtdeduction;
	}

	/**
	 * @return the empPenfunddeduction
	 */
	public Double getEmpPenfunddeduction() {
		return empPenfunddeduction;
	}

	/**
	 * @param empPenfunddeduction the empPenfunddeduction to set
	 */
	public void setEmpPenfunddeduction(Double empPenfunddeduction) {
		this.empPenfunddeduction = empPenfunddeduction;
	}

	/**
	 * @return the erSrpfdeduction
	 */
	public Double getErSrpfdeduction() {
		return erSrpfdeduction;
	}

	/**
	 * @param erSrpfdeduction the erSrpfdeduction to set
	 */
	public void setErSrpfdeduction(Double erSrpfdeduction) {
		this.erSrpfdeduction = erSrpfdeduction;
	}

	/**
	 * @return the fineAmtdeduction
	 */
	public Double getFineAmtdeduction() {
		return fineAmtdeduction;
	}

	/**
	 * @param fineAmtdeduction the fineAmtdeduction to set
	 */
	public void setFineAmtdeduction(Double fineAmtdeduction) {
		this.fineAmtdeduction = fineAmtdeduction;
	}

	/**
	 * @return the totalDeduction
	 */
	public Double getTotalDeduction() {
		return totalDeduction;
	}

	/**
	 * @param totalDeduction the totalDeduction to set
	 */
	public void setTotalDeduction(Double totalDeduction) {
		this.totalDeduction = totalDeduction;
	}

	/**
	 * @return the totalNetpay
	 */
	public Double getTotalNetpay() {
		return totalNetpay;
	}

	/**
	 * @param totalNetpay the totalNetpay to set
	 */
	public void setTotalNetpay(Double totalNetpay) {
		this.totalNetpay = totalNetpay;
	}

	public Date getReportfromDate() {
		return reportfromDate;
	}

	public void setReportfromDate(Date reportfromDate) {
		this.reportfromDate = reportfromDate;
	}

	public Date getReporttoDate() {
		return reporttoDate;
	}

	public void setReporttoDate(Date reporttoDate) {
		this.reporttoDate = reporttoDate;
	}
	
	
	
	
	
	
	
	
}
