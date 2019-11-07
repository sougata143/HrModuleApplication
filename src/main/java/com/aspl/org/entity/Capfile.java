package com.aspl.org.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name="capfile")
public class Capfile {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	private Integer capfileid;
	private String empCode;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
	private Date inoutDatetime;

	/**
	 * @return the capfileid
	 */
	public Integer getCapfileid() {
		return capfileid;
	}

	/**
	 * @param capfileid the capfileid to set
	 */
	public void setCapfileid(Integer capfileid) {
		this.capfileid = capfileid;
	}

	/**
	 * @return the empCode
	 */
	public String getEmpCode() {
		return empCode;
	}

	/**
	 * @param empCode the empCode to set
	 */
	public void setEmpCode(String empCode) {
		this.empCode = empCode;
	}

	/**
	 * @return the inoutDatetime
	 */
	public Date getInoutDatetime() {
		return inoutDatetime;
	}

	/**
	 * @param inoutDatetime the inoutDatetime to set
	 */
	public void setInoutDatetime(Date inoutDatetime) {
		this.inoutDatetime = inoutDatetime;
	}
	

	
}
