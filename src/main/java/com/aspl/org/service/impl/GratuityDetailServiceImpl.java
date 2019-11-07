package com.aspl.org.service.impl;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.expression.ParseException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.aspl.org.dto.GratuityDetailsDTO;
import com.aspl.org.entity.EmployeeMaster;
import com.aspl.org.entity.Payslip;
import com.aspl.org.repository.EmployeeMasterRepo;
import com.aspl.org.repository.EsiMasterRepo;
import com.aspl.org.repository.PayslipRepo;
import com.aspl.org.service.GratuityDetailService;

@Service
@Transactional
public class GratuityDetailServiceImpl implements GratuityDetailService{

	@Autowired GratuityDetailService gratuitydetailService;
	@Autowired PayslipRepo payslipRepo;
	@Autowired EmployeeMasterRepo empRepo;
	@Autowired EsiMasterRepo esiRepo;
	
	static Integer policyNo=0;
	static Integer licid=0;
	private static final DateTimeFormatter formatter     = DateTimeFormatter.ofPattern("uuuu-MM-dd HH:mm:ss");
	
	@Override
	public  List<GratuityDetailsDTO> getGratuityDetailReport(String month) throws ParseException{
		List<GratuityDetailsDTO> gratuityDetailsDTOList=new ArrayList<>();
		
		Double Basic=0.0;
		try {
		
		List<Payslip> payslip = payslipRepo.findBypayslipMonth(month);
	    for(Payslip ps:payslip) {
			
		GratuityDetailsDTO dto=new GratuityDetailsDTO();
		dto.setBasic(ps.getBasicsalary());
		
		List<EmployeeMaster> emp = empRepo.findByempcode(ps.getEmployeeCode());
				
		
		dto.setLicid(licid);
		dto.setPolicyNo(policyNo);
		dto.setEmpname(emp.get(0).getEmpName());
		dto.setDob(emp.get(0).getDateofbirth());
		dto.setDoa(emp.get(0).getDateofjoining());
		
			
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		String dateofbirth = dateFormat.format(emp.get(0).getDateofbirth());
		//String currentDateString = emp.getDateofbirth();
	    LocalDateTime dateTime = LocalDateTime.parse(dateofbirth, formatter);
	    dateTime = dateTime.plusYears(58);
	    String fiftyeightYearsAfterString = dateTime.format(formatter);
	    System.out.println(fiftyeightYearsAfterString);
			
			
		dto.setDor(fiftyeightYearsAfterString);
		
		gratuityDetailsDTOList.add(dto);
		
		}
		
		}catch(Exception ex) {
			ex.printStackTrace();
		return gratuityDetailsDTOList;
		}
		
		return gratuityDetailsDTOList;
		
	}
}
