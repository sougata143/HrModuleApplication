package com.aspl.org.dto;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class StaffRetirementDTO {

private String empcode;
private String name;
@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
private Date dateofbirth;
@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
private Date dateofjoin;
@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
private Date retirementdate;

public String getEmpcode() {
	return empcode;
}
public void setEmpcode(String empcode) {
	this.empcode = empcode;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}

public Date getDateofbirth() {
	return dateofbirth;
}
public void setDateofbirth(Date dateofbirth) {
	this.dateofbirth = dateofbirth;
}
public Date getDateofjoin() {
	return dateofjoin;
}
public void setDateofjoin(Date dateofjoin) {
	this.dateofjoin = dateofjoin;
}
public Date getRetirementdate() {
	return retirementdate;
}
public void setRetirementdate(Date retirementdate) {
	this.retirementdate = retirementdate;
}


}
