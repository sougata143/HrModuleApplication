package com.aspl.org.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name="attendacegenerator")
public class AttendaceGenerator {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer attendacegeneretorID;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy HH:mm:ss",  timezone = "Asia/Kolkata"   )
	private Date attendaceinDatetime;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy HH:mm:ss",  timezone = "Asia/Kolkata"  )
	private Date attendaceoutDatetime;
	private String emp_code;
	private String empName;
	private Integer total_working_day;
	private Double total_working_hrs;
	private Integer total_absent_day;
	private Double total_absent_hrs;
	private Double total_ot_hrs;
	private String employeeType;
	/**
	 * @return the attendacegeneretorID
	 */
	public Integer getAttendacegeneretorID() {
		return attendacegeneretorID;
	}
	/**
	 * @param attendacegeneretorID the attendacegeneretorID to set
	 */
	public void setAttendacegeneretorID(Integer attendacegeneretorID) {
		this.attendacegeneretorID = attendacegeneretorID;
	}
	
	
	
	
	
	
	
	
	/**
	 * @return the attendaceinDatetime
	 */
	public Date getAttendaceinDatetime() {
		return attendaceinDatetime;
	}
	/**
	 * @param attendaceinDatetime the attendaceinDatetime to set
	 */
	public void setAttendaceinDatetime(Date attendaceinDatetime) {
		this.attendaceinDatetime = attendaceinDatetime;
	}
	/**
	 * @return the attendaceoutDatetime
	 */
	public Date getAttendaceoutDatetime() {
		return attendaceoutDatetime;
	}
	/**
	 * @param attendaceoutDatetime the attendaceoutDatetime to set
	 */
	public void setAttendaceoutDatetime(Date attendaceoutDatetime) {
		this.attendaceoutDatetime = attendaceoutDatetime;
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
	/**
	 * @return the employeeType
	 */
	public String getEmployeeType() {
		return employeeType;
	}
	/**
	 * @param employeeType the employeeType to set
	 */
	public void setEmployeeType(String employeeType) {
		this.employeeType = employeeType;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
	
	
	
	
}
