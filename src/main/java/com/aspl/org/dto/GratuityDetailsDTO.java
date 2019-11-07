package com.aspl.org.dto;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class GratuityDetailsDTO {
 
private Integer policyNo;
private Integer licid;
private String empname;
@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
private Date dob;
@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
private Date doa;

private String dor;
private Double basic;

public Integer getPolicyNo() {
	return policyNo;
}
public void setPolicyNo(Integer policyNo) {
	this.policyNo = policyNo;
}
public Integer getLicid() {
	return licid;
}
public void setLicid(Integer licid) {
	this.licid = licid;
}
public String getEmpname() {
	return empname;
}
public void setEmpname(String empname) {
	this.empname = empname;
}
public Date getDob() {
	return dob;
}
public void setDob(Date dob) {
	this.dob = dob;
}
public Date getDoa() {
	return doa;
}
public void setDoa(Date doa) {
	this.doa = doa;
}
public String getDor() {
	return dor;
}
public void setDor(String dor) {
	this.dor = dor;
}
public Double getBasic() {
	return basic;
}
public void setBasic(Double basic) {
	this.basic = basic;
}






}
