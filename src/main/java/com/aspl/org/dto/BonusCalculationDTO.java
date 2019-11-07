package com.aspl.org.dto;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class BonusCalculationDTO {
	
	private String empcode;
	private String empName;
	private Double total_yrly_bassal;
	private Integer departmentId;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	private Date fromDate;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	private Date toDate;
	private String departmentname;
	private Integer total_yrly_presentday;
	private Double bonusamt;
	
	public String getEmpcode() {
		return empcode;
	}
	public void setEmpcode(String empcode) {
		this.empcode = empcode;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public Integer getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(Integer departmentId) {
		this.departmentId = departmentId;
	}
	public Double getBonusamt() {
		return bonusamt;
	}
	public void setBonusamt(Double bonusamt) {
		this.bonusamt = bonusamt;
	}
	public Double getTotal_yrly_bassal() {
		return total_yrly_bassal;
	}
	public void setTotal_yrly_bassal(Double total_yrly_bassal) {
		this.total_yrly_bassal = total_yrly_bassal;
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
	public String getDepartmentname() {
		return departmentname;
	}
	public void setDepartmentname(String departmentname) {
		this.departmentname = departmentname;
	}
	public Integer getTotal_yrly_presentday() {
		return total_yrly_presentday;
	}
	public void setTotal_yrly_presentday(Integer total_yrly_presentday) {
		this.total_yrly_presentday = total_yrly_presentday;
	}
	
	
	
	

}
