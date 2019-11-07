package com.aspl.org.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name ="bonus_calculation")

public class BonusCalculation {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer bonuscalID;
	private String empcode;
	private String empName;
	private Double total_netamt;
	private Integer departmentId;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	@Column(nullable = false, updatable = false)
	@CreationTimestamp
	private Date createdDate;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	@Column(nullable = false, updatable = false)
	@CreationTimestamp
	private Date modifiedDate;
	private Double bonusamt;


	public Integer getBonuscalID() {
		return bonuscalID;
	}


	public void setBonuscalID(Integer bonuscalID) {
		this.bonuscalID = bonuscalID;
	}

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


	public Double getTotal_netamt() {
		return total_netamt;
	}


	public void setTotal_netamt(Double total_netamt) {
		this.total_netamt = total_netamt;
	}


	public Integer getDepartmentId() {
		return departmentId;
	}


	public void setDepartmentId(Integer departmentId) {
		this.departmentId = departmentId;
	}


	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}


	public Date getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public Double getBonusamt() {
		return bonusamt;
	}


	public void setBonusamt(Double bonusamt) {
		this.bonusamt = bonusamt;
	}




	@Override
	public String toString() {
		return "BonusCalculation [empcode=" + empcode + ", empName=" + empName + ", total_netamt=" + total_netamt
				+ ", departmentId=" + departmentId + ", createdDate=" + createdDate + ", modifiedDate=" + modifiedDate
				+ ", bonusamt=" + bonusamt + "]";
	}

	

}
