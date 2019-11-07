package com.aspl.org.service;

import java.text.ParseException;

import com.aspl.org.dto.EsiContributionListDTO;

public interface EsiContributionService {

	//EsiContributionListDTO getEsiContributionReport(String month) throws ParseException;

	EsiContributionListDTO getEsiContributionReport(String foremployee, String month) throws ParseException;
	

//	List<EsiContributionDTO> getEsiContributionReport(String fromDate, String toDate);

	//List<EsiContributionDTO> getEsiContributionReport(String Foremployee, Date fromDate, Date toDate);
	
	
}
