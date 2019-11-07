package com.aspl.org.dto;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class EsiContributionDTO {
	
	private String esino;
	private String empName;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private Date voucherDate;
    
    private Integer daysforPay;
    private Double esicontribution;
    private Double amount;
    
   
	public String getEsino() {
		return esino;
	}
	public void setEsino(String esino) {
		this.esino = esino;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public Date getVoucherDate() {
		return voucherDate;
	}
	public void setVoucherDate(Date voucherDate) {
		this.voucherDate = voucherDate;
	}
	public Integer getDaysforPay() {
		return daysforPay;
	}
	public void setDaysforPay(Integer daysforPay) {
		this.daysforPay = daysforPay;
	}
	public Double getEsicontribution() {
		return esicontribution;
	}
	public void setEsicontribution(Double esicontribution) {
		this.esicontribution = esicontribution;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	
    
	
    
   
    
  

}