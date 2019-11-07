package com.aspl.org.service;

import java.util.List;
import java.util.Optional;

import com.aspl.org.dto.WelfareFundDTO;
import com.aspl.org.entity.WelfareFundReport;


public interface WelfareFundReportService {

	
	
	WelfareFundReport WelfareFundReportsave(WelfareFundReport welfareFundReport);
	
	List<WelfareFundReport> welfareFundReportReportList();
	
	Optional<WelfareFundReport> findByreportId(Integer welfarefundeportId);

	List<WelfareFundDTO> welfareFundReportReportListbymonthandpaydate();

	

	
}
