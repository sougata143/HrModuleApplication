package com.aspl.org.dto;

import java.util.List;

public class EsiContributionListDTO {

	private List<EsiContributionDTO> esiContributionDTOList;
	 private Integer totaldaysforPay;
	    private Double totalamount;
	    private Double totalesicontribution;
		public List<EsiContributionDTO> getEsiContributionDTOList() {
			return esiContributionDTOList;
		}
		public void setEsiContributionDTOList(List<EsiContributionDTO> esiContributionDTOList) {
			this.esiContributionDTOList = esiContributionDTOList;
		}
		public Integer getTotaldaysforPay() {
			return totaldaysforPay;
		}
		public void setTotaldaysforPay(Integer totaldaysforPay) {
			this.totaldaysforPay = totaldaysforPay;
		}
		public Double getTotalamount() {
			return totalamount;
		}
		public void setTotalamount(Double totalamount) {
			this.totalamount = totalamount;
		}
		public Double getTotalesicontribution() {
			return totalesicontribution;
		}
		public void setTotalesicontribution(Double totalesicontribution) {
			this.totalesicontribution = totalesicontribution;
		}
	    
	    
	    
}
