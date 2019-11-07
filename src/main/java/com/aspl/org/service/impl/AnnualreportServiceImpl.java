package com.aspl.org.service.impl;


import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aspl.org.entity.AnnualReport;
import com.aspl.org.repository.AnnualReportRepo;
import com.aspl.org.service.AnnualReportService;

@Service
@Transactional
public class AnnualreportServiceImpl implements AnnualReportService{

	@Autowired AnnualReportRepo annualReportRepo;

	@Override
	public AnnualReport AnnualReportsave(AnnualReport annualReport) {
		return annualReportRepo.save(annualReport);
	}

	@Override
	public List<AnnualReport> annualReportList() {
		return annualReportRepo.findAll();
	}

	@Override
	public Optional<AnnualReport> findByreportId(Integer reportId) {
	
		return annualReportRepo.findById(reportId);
	} 
	


	
	

}
