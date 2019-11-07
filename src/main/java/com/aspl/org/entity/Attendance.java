package com.aspl.org.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;


@Entity
@Table(name="attendace")
public class Attendance {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer attendaceID;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd" , timezone = "Asia/Kolkata" )
	private Date fromDate;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd" , timezone = "Asia/Kolkata" )
	private Date toDate;
	private String emp_code;
	private String empName;
	private Integer total_working_day;
	private Double total_working_hrs;
	private Integer total_absent_day;
	private Double total_absent_hrs;
	private Double total_ot_hrs;
	private Double fine_amt;
	private String employeeType;
	/**
	 * @return the attendaceID
	 */
	public Integer getAttendaceID() {
		return attendaceID;
	}
	/**
	 * @param attendaceID the attendaceID to set
	 */
	public void setAttendaceID(Integer attendaceID) {
		this.attendaceID = attendaceID;
	}
	
	public Date getFromDate() {
		return fromDate;
	}
	public void setFromDate(Date fromDate) {
		this.fromDate = fromDate;
	}
	public Date getToDate() {
		return toDate;
	}
	public void setToDate(Date toDate) {
		this.toDate = toDate;
	}
	/**
	 * @return the emp_code
	 */
	public String getEmp_code() {
		return emp_code;
	}
	/**
	 * @param emp_code the emp_code to set
	 */
	public void setEmp_code(String emp_code) {
		this.emp_code = emp_code;
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
	 * @return the total_working_hrs
	 */
	public Double getTotal_working_hrs() {
		return total_working_hrs;
	}
	/**
	 * @param total_working_hrs the total_working_hrs to set
	 */
	public void setTotal_working_hrs(Double total_working_hrs) {
		this.total_working_hrs = total_working_hrs;
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
	 * @return the total_absent_hrs
	 */
	public Double getTotal_absent_hrs() {
		return total_absent_hrs;
	}
	/**
	 * @param total_absent_hrs the total_absent_hrs to set
	 */
	public void setTotal_absent_hrs(Double total_absent_hrs) {
		this.total_absent_hrs = total_absent_hrs;
	}
	/**
	 * @return the total_ot_hrs
	 */
	public Double getTotal_ot_hrs() {
		return total_ot_hrs;
	}
	/**
	 * @param total_ot_hrs the total_ot_hrs to set
	 */
	public void setTotal_ot_hrs(Double total_ot_hrs) {
		this.total_ot_hrs = total_ot_hrs;
	}
	public String getEmployeeType() {
		return employeeType;
	}
	public void setEmployeeType(String employeeType) {
		this.employeeType = employeeType;
	}
	public Double getFine_amt() {
		return fine_amt;
	}
	public void setFine_amt(Double fine_amt) {
		this.fine_amt = fine_amt;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
	
	
	
}
