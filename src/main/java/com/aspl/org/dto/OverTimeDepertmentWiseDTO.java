package com.aspl.org.dto;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;

public class OverTimeDepertmentWiseDTO {

	private Integer departmentId;
	private String departmentName;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	private Date reportFromDate;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	private Date reportToDate;
	
	private List<OverTimeDepertmentWiseEmpDetailsDTO> otDepertmentWiseEmpDetailsDTO;
	
	
	/**
	 * @return the departmentId
	 */
	public Integer getDepartmentId() {
		return departmentId;
	}
	/**
	 * @param departmentId the departmentId to set
	 */
	public void setDepartmentId(Integer departmentId) {
		this.departmentId = departmentId;
	}
	/**
	 * @return the departmentName
	 */
	public String getDepartmentName() {
		return departmentName;
	}
	/**
	 * @param departmentName the departmentName to set
	 */
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public List<OverTimeDepertmentWiseEmpDetailsDTO> getOtDepertmentWiseEmpDetailsDTO() {
		return otDepertmentWiseEmpDetailsDTO;
	}
	public void setOtDepertmentWiseEmpDetailsDTO(List<OverTimeDepertmentWiseEmpDetailsDTO> otDepertmentWiseEmpDetailsDTO) {
		this.otDepertmentWiseEmpDetailsDTO = otDepertmentWiseEmpDetailsDTO;
	}
	
	public Date getReportFromDate() {
		return reportFromDate;
	}
	/**
	 * @param reportFromDate the reportFromDate to set
	 */
	public void setReportFromDate(Date reportFromDate) {
		this.reportFromDate = reportFromDate;
	}
	/**
	 * @return the reportToDate
	 */
	public Date getReportToDate() {
		return reportToDate;
	}
	/**
	 * @param reportToDate the reportToDate to set
	 */
	public void setReportToDate(Date reportToDate) {
		this.reportToDate = reportToDate;
	}

	
	
}
