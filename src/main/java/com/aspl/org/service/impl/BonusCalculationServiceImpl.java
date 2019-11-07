package com.aspl.org.service.impl;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.aspl.org.dto.BonusCalculationDTO;
import com.aspl.org.entity.BonusCalculation;
import com.aspl.org.entity.DepartmentMaster;
import com.aspl.org.entity.EmployeeMaster;
import com.aspl.org.entity.Payslip;
import com.aspl.org.repository.AttendanceRepo;
import com.aspl.org.repository.BonusCalculationRepo;
import com.aspl.org.repository.EmployeeMasterRepo;
import com.aspl.org.repository.PayslipRepo;
import com.aspl.org.service.BonusCalculationService;
import com.aspl.org.service.DepartmentMasterService;
import com.aspl.org.service.EmployeeMasterService;




@Service
@Transactional
public class BonusCalculationServiceImpl implements BonusCalculationService {

	@Autowired BonusCalculationRepo bonusCalculationRepo;
    @Autowired PayslipRepo payslipRepo;
	@Autowired DepartmentMasterService  departmentMasterService;
	@Autowired AttendanceRepo attendanceRepo;
	@Autowired EmployeeMasterRepo empRepo;
	@Autowired EmployeeMasterService employeemasterService;
	
    @Override
	public BonusCalculation bonusCalculationsave(BonusCalculation bonusCalculation) {
    return bonusCalculationRepo.save(bonusCalculation);
	}

	@Override
	public  List<BonusCalculationDTO> getBonuscalculationyearwise() throws ParseException {
	List<BonusCalculationDTO> bonusCalculationDTOList = new ArrayList<>();
	Double bonusamt=0.0;
	 
	 try {
		 DateFormat df = new SimpleDateFormat("yyyy") ;
		 
	    String current_year= df.format(new Date());
		Integer curryear=Integer.valueOf(current_year);
		Integer prevyear=Integer.valueOf(curryear)-1;
		
		Date toDate = new SimpleDateFormat("yyyy-MM-dd").parse(curryear+"-09-19");
		Date fromDate = new SimpleDateFormat("yyyy-MM-dd").parse(prevyear+"-04-01");
		
     List<EmployeeMaster> elist=employeemasterService.getallEmployeemaster();
	     for(EmployeeMaster emp:elist) {
	    	 BonusCalculationDTO dto=new BonusCalculationDTO(); 
	    // System.out.println("employee code "+emp.getEmpcode());	
	     Double total_yearlysalary=0.0;	
	     Integer total_yearlypresntday=0;
		 List<Payslip> payslip = payslipRepo.getByToDateBetweenAndemployeeCode(emp.getEmpcode(), fromDate, toDate);
		// System.out.println("Total payslip for this employee "+payslip.size());
				 for(Payslip ps:payslip) { 
						 
						
						 String staff = "Staff";	
						 String worker = "Worker";
						 
						 if(ps.getForemployee().equals(staff)){
					     
							 Double basicsalary=emp.getBasic();
							 Double basicperdaysofmonth=(basicsalary/30);
							 Integer noofdayspresent=ps.getTotal_working_day();
							 Double permonthsalarystaff=basicperdaysofmonth*noofdayspresent;
		                     total_yearlysalary=total_yearlysalary+permonthsalarystaff;
		                     total_yearlypresntday=total_yearlypresntday+noofdayspresent;
							
						 
						 }else if(ps.getForemployee().equals(worker)) {
							
							 Double basicsalary=emp.getBasic();
							 Double basicperday=basicsalary;
							 Integer noofdayspresent=ps.getTotal_working_day();
							 Double permonthsalaryworker=basicperday*noofdayspresent;
							 total_yearlysalary=total_yearlysalary+permonthsalaryworker;
							 total_yearlypresntday=total_yearlypresntday+noofdayspresent;	 
							 
							  
						   }else {
								System.out.println("Bonusamt not generated"+bonusamt);
							   }
						 }
				 
				 if(total_yearlysalary >= 84000) { 
					 bonusamt = total_yearlysalary+7000;
				  }else { 
					  bonusamt = (total_yearlysalary * (8.33/100));
				  }
				  System.out.println("Staff/Workers Bonusamt generated"+bonusamt);
				 
				  dto.setBonusamt(bonusamt);
				  dto.setEmpcode(emp.getEmpcode());
				  dto.setEmpName(emp.getEmpName()); 
				  dto.setFromDate(fromDate);
				  dto.setToDate(toDate);
				  dto.setTotal_yrly_presentday(total_yearlypresntday);
				
				  dto.setTotal_yrly_bassal(total_yearlysalary);
				  
			      DepartmentMaster departmentMaster=departmentMasterService.findbyiddepartmentmaster(emp.getDepartment()).get();
				  dto.setDepartmentId(departmentMaster.getDepartmentId());
				  dto.setDepartmentname(departmentMaster.getDepartmentname());
				  bonusCalculationDTOList.add(dto); 
	     }
     }catch(Exception ex) { 
		ex.printStackTrace(); 
	  }
	  return bonusCalculationDTOList ;
	 
	}
}
	
	