package com.aspl.org.dto;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class HolidayMasterDTO {
	
	private Integer holidayid;
	private String holidayname;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	private Date holidaytodate;
	private Integer totalholiday;
	private String description;
	
	public Integer getHolidayid() {
		return holidayid;
	}
	public void setHolidayid(Integer holidayid) {
		this.holidayid = holidayid;
	}
	public String getHolidayname() {
		return holidayname;
	}
	public void setHolidayname(String holidayname) {
		this.holidayname = holidayname;
	}
	public Date getHolidaytodate() {
		return holidaytodate;
	}
	public void setHolidaytodate(Date holidaytodate) {
		this.holidaytodate = holidaytodate;
	}
	public Integer getTotalholiday() {
		return totalholiday;
	}
	public void setTotalholiday(Integer totalholiday) {
		this.totalholiday = totalholiday;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
