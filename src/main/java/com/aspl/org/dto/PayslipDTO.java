package com.aspl.org.dto;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class PayslipDTO {
	
	private Integer payslipId;
	private String employeeCode;
	private String empname;
	private String empCardNo;
	private String bankName;
	private String pfNo;
	private String bankAcNo;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	private Date dateofjoining;
	private String esiNo;
	private Integer holiday;
	private String empLocation;
	private Integer total_working_day;
	private Integer total_absent_day;
	
	private Integer totalleave;
	private Double otHrs;
	private Integer days_for_pay;
	private String dept;
	private String designation;
	
	private Double basicsalary;
	private Double normalwagesearned;
	private Double earningRateperday;
	private Double otamount;
	private Double grossearning;
	
	private Double salaryAdv;
	private Double pfcontribution;
	
	private Double esicontribution;
	
	
	private Double incTax;
	private Double canteenCharge;
	private Double profTax;
	private Double welFund;
	private Double hrRecovary;
	private Double fineAmount;
	
	
	private Double grossdeduction;
	
	private Double netamt;
	
	private String amountinwords;
	private Date createdDate;
	private Date modifyedDate;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	private Date payDate;
	private String foremployee;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	private Date fromDate;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	private Date toDate;
	private String payslipMonth;
	private Integer payslipYear;
	
	private String generationfor;
	private Double houserentforworker;
	private Double totalforesiworkers;
	/**
	 * @return the payslipId
	 */
	public Integer getPayslipId() {
		return payslipId;
	}
	/**
	 * @param payslipId the payslipId to set
	 */
	public void setPayslipId(Integer payslipId) {
		this.payslipId = payslipId;
	}
	/**
	 * @return the employeeCode
	 */
	public String getEmployeeCode() {
		return employeeCode;
	}
	/**
	 * @param employeeCode the employeeCode to set
	 */
	public void setEmployeeCode(String employeeCode) {
		this.employeeCode = employeeCode;
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
	 * @return the empCardNo
	 */
	public String getEmpCardNo() {
		return empCardNo;
	}
	/**
	 * @param empCardNo the empCardNo to set
	 */
	public void setEmpCardNo(String empCardNo) {
		this.empCardNo = empCardNo;
	}
	/**
	 * @return the bankName
	 */
	public String getBankName() {
		return bankName;
	}
	/**
	 * @param bankName the bankName to set
	 */
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	/**
	 * @return the pfNo
	 */
	public String getPfNo() {
		return pfNo;
	}
	/**
	 * @param pfNo the pfNo to set
	 */
	public void setPfNo(String pfNo) {
		this.pfNo = pfNo;
	}
	/**
	 * @return the bankAcNo
	 */
	public String getBankAcNo() {
		return bankAcNo;
	}
	/**
	 * @param bankAcNo the bankAcNo to set
	 */
	public void setBankAcNo(String bankAcNo) {
		this.bankAcNo = bankAcNo;
	}
	/**
	 * @return the dateofjoining
	 */
	public Date getDateofjoining() {
		return dateofjoining;
	}
	/**
	 * @param dateofjoining the dateofjoining to set
	 */
	public void setDateofjoining(Date dateofjoining) {
		this.dateofjoining = dateofjoining;
	}
	/**
	 * @return the esiNo
	 */
	public String getEsiNo() {
		return esiNo;
	}
	/**
	 * @param esiNo the esiNo to set
	 */
	public void setEsiNo(String esiNo) {
		this.esiNo = esiNo;
	}
	/**
	 * @return the holiday
	 */
	public Integer getHoliday() {
		return holiday;
	}
	/**
	 * @param holiday the holiday to set
	 */
	public void setHoliday(Integer holiday) {
		this.holiday = holiday;
	}
	/**
	 * @return the empLocation
	 */
	public String getEmpLocation() {
		return empLocation;
	}
	/**
	 * @param empLocation the empLocation to set
	 */
	public void setEmpLocation(String empLocation) {
		this.empLocation = empLocation;
	}
	/**
	 * @return the total_working_day
	 */
	public Integer getTotal_working_day() {
		return total_working_day;
	}
	/**
	 * @param total_working_day the total_working_day to set
	 */
	public void setTotal_working_day(Integer total_working_day) {
		this.total_working_day = total_working_day;
	}
	/**
	 * @return the total_absent_day
	 */
	public Integer getTotal_absent_day() {
		return total_absent_day;
	}
	/**
	 * @param total_absent_day the total_absent_day to set
	 */
	public void setTotal_absent_day(Integer total_absent_day) {
		this.total_absent_day = total_absent_day;
	}
	/**
	 * @return the totalleave
	 */
	public Integer getTotalleave() {
		return totalleave;
	}
	/**
	 * @param totalleave the totalleave to set
	 */
	public void setTotalleave(Integer totalleave) {
		this.totalleave = totalleave;
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
	 * @return the days_for_pay
	 */
	public Integer getDays_for_pay() {
		return days_for_pay;
	}
	/**
	 * @param days_for_pay the days_for_pay to set
	 */
	public void setDays_for_pay(Integer days_for_pay) {
		this.days_for_pay = days_for_pay;
	}
	/**
	 * @return the dept
	 */
	public String getDept() {
		return dept;
	}
	/**
	 * @param dept the dept to set
	 */
	public void setDept(String dept) {
		this.dept = dept;
	}
	/**
	 * @return the designation
	 */
	public String getDesignation() {
		return designation;
	}
	/**
	 * @param designation the designation to set
	 */
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	/**
	 * @return the basicsalary
	 */
	public Double getBasicsalary() {
		return basicsalary;
	}
	/**
	 * @param basicsalary the basicsalary to set
	 */
	public void setBasicsalary(Double basicsalary) {
		this.basicsalary = basicsalary;
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
	 * @return the earningRateperday
	 */
	public Double getEarningRateperday() {
		return earningRateperday;
	}
	/**
	 * @param earningRateperday the earningRateperday to set
	 */
	public void setEarningRateperday(Double earningRateperday) {
		this.earningRateperday = earningRateperday;
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
	 * @return the grossearning
	 */
	public Double getGrossearning() {
		return grossearning;
	}
	/**
	 * @param grossearning the grossearning to set
	 */
	public void setGrossearning(Double grossearning) {
		this.grossearning = grossearning;
	}
	/**
	 * @return the salaryAdv
	 */
	public Double getSalaryAdv() {
		return salaryAdv;
	}
	/**
	 * @param salaryAdv the salaryAdv to set
	 */
	public void setSalaryAdv(Double salaryAdv) {
		this.salaryAdv = salaryAdv;
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
	 * @return the esicontribution
	 */
	public Double getEsicontribution() {
		return esicontribution;
	}
	/**
	 * @param esicontribution the esicontribution to set
	 */
	public void setEsicontribution(Double esicontribution) {
		this.esicontribution = esicontribution;
	}
	/**
	 * @return the incTax
	 */
	public Double getIncTax() {
		return incTax;
	}
	/**
	 * @param incTax the incTax to set
	 */
	public void setIncTax(Double incTax) {
		this.incTax = incTax;
	}
	/**
	 * @return the canteenCharge
	 */
	public Double getCanteenCharge() {
		return canteenCharge;
	}
	/**
	 * @param canteenCharge the canteenCharge to set
	 */
	public void setCanteenCharge(Double canteenCharge) {
		this.canteenCharge = canteenCharge;
	}
	/**
	 * @return the profTax
	 */
	public Double getProfTax() {
		return profTax;
	}
	/**
	 * @param profTax the profTax to set
	 */
	public void setProfTax(Double profTax) {
		this.profTax = profTax;
	}
	/**
	 * @return the welFund
	 */
	public Double getWelFund() {
		return welFund;
	}
	/**
	 * @param welFund the welFund to set
	 */
	public void setWelFund(Double welFund) {
		this.welFund = welFund;
	}
	/**
	 * @return the hrRecovary
	 */
	public Double getHrRecovary() {
		return hrRecovary;
	}
	/**
	 * @param hrRecovary the hrRecovary to set
	 */
	public void setHrRecovary(Double hrRecovary) {
		this.hrRecovary = hrRecovary;
	}
	/**
	 * @return the fineAmount
	 */
	public Double getFineAmount() {
		return fineAmount;
	}
	/**
	 * @param fineAmount the fineAmount to set
	 */
	public void setFineAmount(Double fineAmount) {
		this.fineAmount = fineAmount;
	}
	/**
	 * @return the grossdeduction
	 */
	public Double getGrossdeduction() {
		return grossdeduction;
	}
	/**
	 * @param grossdeduction the grossdeduction to set
	 */
	public void setGrossdeduction(Double grossdeduction) {
		this.grossdeduction = grossdeduction;
	}
	/**
	 * @return the netamt
	 */
	public Double getNetamt() {
		return netamt;
	}
	/**
	 * @param netamt the netamt to set
	 */
	public void setNetamt(Double netamt) {
		this.netamt = netamt;
	}
	/**
	 * @return the amountinwords
	 */
	public String getAmountinwords() {
		return amountinwords;
	}
	/**
	 * @param amountinwords the amountinwords to set
	 */
	public void setAmountinwords(String amountinwords) {
		this.amountinwords = amountinwords;
	}
	/**
	 * @return the createdDate
	 */
	public Date getCreatedDate() {
		return createdDate;
	}
	/**
	 * @param createdDate the createdDate to set
	 */
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	/**
	 * @return the modifyedDate
	 */
	public Date getModifyedDate() {
		return modifyedDate;
	}
	/**
	 * @param modifyedDate the modifyedDate to set
	 */
	public void setModifyedDate(Date modifyedDate) {
		this.modifyedDate = modifyedDate;
	}
	/**
	 * @return the payDate
	 */
	public Date getPayDate() {
		return payDate;
	}
	/**
	 * @param payDate the payDate to set
	 */
	public void setPayDate(Date payDate) {
		this.payDate = payDate;
	}
	/**
	 * @return the foremployee
	 */
	public String getForemployee() {
		return foremployee;
	}
	/**
	 * @param foremployee the foremployee to set
	 */
	public void setForemployee(String foremployee) {
		this.foremployee = foremployee;
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
	 * @return the payslipMonth
	 */
	public String getPayslipMonth() {
		return payslipMonth;
	}
	/**
	 * @param payslipMonth the payslipMonth to set
	 */
	public void setPayslipMonth(String payslipMonth) {
		this.payslipMonth = payslipMonth;
	}
	/**
	 * @return the payslipYear
	 */
	public Integer getPayslipYear() {
		return payslipYear;
	}
	/**
	 * @param payslipYear the payslipYear to set
	 */
	public void setPayslipYear(Integer payslipYear) {
		this.payslipYear = payslipYear;
	}
	/**
	 * @return the generationfor
	 */
	public String getGenerationfor() {
		return generationfor;
	}
	/**
	 * @param generationfor the generationfor to set
	 */
	public void setGenerationfor(String generationfor) {
		this.generationfor = generationfor;
	}
	/**
	 * @return the houserentforworker
	 */
	public Double getHouserentforworker() {
		return houserentforworker;
	}
	/**
	 * @param houserentforworker the houserentforworker to set
	 */
	public void setHouserentforworker(Double houserentforworker) {
		this.houserentforworker = houserentforworker;
	}
	/**
	 * @return the totalforesiworkers
	 */
	public Double getTotalforesiworkers() {
		return totalforesiworkers;
	}
	/**
	 * @param totalforesiworkers the totalforesiworkers to set
	 */
	public void setTotalforesiworkers(Double totalforesiworkers) {
		this.totalforesiworkers = totalforesiworkers;
	}
	
	
	@Override
	public String toString() {
		return "PayslipDTO [payslipId=" + payslipId + ", employeeCode=" + employeeCode + ", empname=" + empname
				+ ", empCardNo=" + empCardNo + ", bankName=" + bankName + ", pfNo=" + pfNo + ", bankAcNo=" + bankAcNo
				+ ", dateofjoining=" + dateofjoining + ", esiNo=" + esiNo + ", holiday=" + holiday + ", empLocation="
				+ empLocation + ", total_working_day=" + total_working_day + ", total_absent_day=" + total_absent_day
				+ ", totalleave=" + totalleave + ", otHrs=" + otHrs + ", days_for_pay=" + days_for_pay + ", dept="
				+ dept + ", designation=" + designation + ", basicsalary=" + basicsalary + ", normalwagesearned="
				+ normalwagesearned + ", earningRateperday=" + earningRateperday + ", otamount=" + otamount
				+ ", grossearning=" + grossearning + ", salaryAdv=" + salaryAdv + ", pfcontribution=" + pfcontribution
				+ ", esicontribution=" + esicontribution + ", incTax=" + incTax + ", canteenCharge=" + canteenCharge
				+ ", profTax=" + profTax + ", welFund=" + welFund + ", hrRecovary=" + hrRecovary + ", fineAmount="
				+ fineAmount + ", grossdeduction=" + grossdeduction + ", netamt=" + netamt + ", amountinwords="
				+ amountinwords + ", createdDate=" + createdDate + ", modifyedDate=" + modifyedDate + ", payDate="
				+ payDate + ", foremployee=" + foremployee + ", fromDate=" + fromDate + ", toDate=" + toDate
				+ ", payslipMonth=" + payslipMonth + ", payslipYear=" + payslipYear + ", generationfor=" + generationfor
				+ ", houserentforworker=" + houserentforworker + ", totalforesiworkers=" + totalforesiworkers + "]";
	}
	
	
	
	
	

}
