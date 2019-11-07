package com.aspl.org.service;

import java.util.List;
import java.util.Optional;

import com.aspl.org.entity.AnnualReport;



public interface AnnualReportService {

	
	
	AnnualReport AnnualReportsave(AnnualReport annualReport);
	
	List<AnnualReport> annualReportList();
	
	Optional<AnnualReport> findByreportId(Integer reportId);

	

	
}
