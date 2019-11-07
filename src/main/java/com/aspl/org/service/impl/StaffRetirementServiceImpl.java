package com.aspl.org.service.impl;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.aspl.org.dto.StaffRetirementDTO;
import com.aspl.org.entity.EmployeeMaster;
import com.aspl.org.repository.EmployeeMasterRepo;
import com.aspl.org.service.StaffRetirementService;
@Service
@Transactional
public  class StaffRetirementServiceImpl implements StaffRetirementService{

	@Autowired StaffRetirementService staffRetirementService;
	@Autowired EmployeeMasterRepo empRepo;

	
	private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
	
	@Override
	public  List<StaffRetirementDTO> getRetirementDetailReport(){
		List<StaffRetirementDTO> staffRetirementDTO=new ArrayList<>();
		
	     try {
			//List<Payslip> payslip = payslipRepo.findByForemployee("Staff");
			List<EmployeeMaster> employee = empRepo.findByemptype("Staff");
			//for(Payslip ps:payslip) {
	         for(EmployeeMaster emp:employee) {
			    StaffRetirementDTO dto=new StaffRetirementDTO();
			      
			   				
				dto.setEmpcode(emp.getEmpcode());
				dto.setName(emp.getEmpName());
				dto.setDateofbirth(emp.getDateofbirth());
				dto.setDateofjoin(emp.getDateofjoining());
			
				DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
				String dateofbirth = dateFormat.format(emp.getDateofbirth());
				LocalDate localDate = LocalDate.parse(dateofbirth);
				localDate = localDate.plusYears(58);
			    String fiftyeightYearsAfterString = localDate.format(formatter);
			  
					
					
				dto.setRetirementdate(dateFormat.parse(fiftyeightYearsAfterString));
				
				staffRetirementDTO.add(dto);
		
		}
		}catch(Exception ex) {
			ex.printStackTrace();
		
		}
		
		
		return staffRetirementDTO;

	}

	
}
