package com.aspl.org.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.aspl.org.dto.WelfareFundDTO;
import com.aspl.org.entity.EmployeeMaster;
import com.aspl.org.entity.Payslip;
import com.aspl.org.entity.WelfareFundReport;
import com.aspl.org.repository.EmployeeMasterRepo;
import com.aspl.org.repository.PayslipRepo;
import com.aspl.org.repository.WelfareFundReportRepo;
import com.aspl.org.service.WelfareFundReportService;


@Service
@Transactional
public class WelfareFundReportServiceImpl implements WelfareFundReportService{
	
	
	@Autowired WelfareFundReportRepo welfareFundReportRepo;
	@Autowired EmployeeMasterRepo employeeMasterRepo;
	@Autowired PayslipRepo payslipRepo; 
	@Override
	public WelfareFundReport WelfareFundReportsave(WelfareFundReport welfareFundReport) {
		// TODO Auto-generated method stub
		return welfareFundReportRepo.save(welfareFundReport);
	}

	@Override
	public List<WelfareFundReport> welfareFundReportReportList() {
		// TODO Auto-generated method stub
		return welfareFundReportRepo.findAll();
	}

	@Override
	public Optional<WelfareFundReport> findByreportId(Integer welfarefundeportId) {
		// TODO Auto-generated method stub
		return welfareFundReportRepo.findById(welfarefundeportId);
	}

	
	
	
	@Override
	public List<WelfareFundDTO> welfareFundReportReportListbymonthandpaydate() {
		// TODO Auto-generated method stub
		
		
		List<WelfareFundDTO> welfareFundDTO = new ArrayList<>();
		
		List<EmployeeMaster> emplist= employeeMasterRepo.findAll();
		
		WelfareFundDTO welfareFundDTO1=new WelfareFundDTO();
		
		for(EmployeeMaster empmst : emplist)
	{
			List<Payslip> WelfareFundReportfrompayslip=payslipRepo.welfareFundReportReportListbymonthandpaydate(empmst.getEmpcode());
			if(!WelfareFundReportfrompayslip.isEmpty())
		{
			for(Payslip payslipempmst: WelfareFundReportfrompayslip)
			{
				welfareFundDTO1.setEmpoyeeName(payslipempmst.getEmpname());	
				welfareFundDTO1.setDesignation(payslipempmst.getDesignation());
				welfareFundDTO1.setGrossWages(payslipempmst.getNetamt());
				welfareFundDTO1.setContributiontolabourwelfarefund(payslipempmst.getWelFund());				
			}
			
		}
			welfareFundDTO.add(welfareFundDTO1);
			
	}
		Double grosscontribution=0.00;
		for(WelfareFundDTO weldto : welfareFundDTO)
		{
			
			grosscontribution+=weldto.getContributiontolabourwelfarefund();
			
		}
		
		welfareFundDTO1.setTotalcontributiontolabourwelfarefund(grosscontribution);
		welfareFundDTO.add(welfareFundDTO1);
		
		return welfareFundDTO;
	}
	
}
