package com.aspl.org.service.impl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aspl.org.dto.OverTimeDTO;
import com.aspl.org.dto.OverTimeDepertmentWiseDTO;
import com.aspl.org.dto.OverTimeDepertmentWiseEmpDetailsDTO;
import com.aspl.org.entity.Attendance;
import com.aspl.org.entity.DepartmentMaster;
import com.aspl.org.entity.EmployeeMaster;
import com.aspl.org.repository.AttendanceRepo;
import com.aspl.org.repository.EmployeeMasterRepo;
import com.aspl.org.service.DepartmentMasterService;
import com.aspl.org.service.OverTimeReportService;


@Service
@Transactional
public class OverTimeReportServiceImpl implements OverTimeReportService{

	
	@Autowired AttendanceRepo attendanceRepo;
	@Autowired EmployeeMasterRepo employeeMasterRepo;
	@Autowired DepartmentMasterService departmentMasterService;
	
	@Override
	public	List<OverTimeDTO> getOverTimedetails(String fromDate , String toDate)
	{
		Date from_date1;
		List<OverTimeDTO> overTimeDTO = new ArrayList<>();
		List<OverTimeDTO> overTimeDTOUpdated = new ArrayList<>();
		try {
			from_date1 = new SimpleDateFormat("dd-MM-yyyy").parse(fromDate);
			Date to_date1 = new SimpleDateFormat("dd-MM-yyyy").parse(toDate);
		
		
		
			Double Total_ot_hrs=0.0;
			
		List<Attendance> attendanceList=attendanceRepo.Attendancebydatebetween(from_date1, to_date1);
		OverTimeDTO overTimeDTO1=null;
		
		
		for(Attendance attendance : attendanceList)
		{
			overTimeDTO1= new OverTimeDTO();
			
			overTimeDTO1.setEmpCode(attendance.getEmp_code());
			
			List<EmployeeMaster> emplist= employeeMasterRepo.findByempcode(attendance.getEmp_code());
			
			
			overTimeDTO1.setEmpName(emplist.get(0).getEmpName());
			overTimeDTO1.setOtHrs(attendance.getTotal_ot_hrs());
			overTimeDTO1.setReportFromDate(from_date1);
			overTimeDTO1.setReportToDate(to_date1);
			
			
			Total_ot_hrs+=attendance.getTotal_ot_hrs();
			
			
			
		
			overTimeDTO.add(overTimeDTO1);
		
		}
		
		for(OverTimeDTO ot : overTimeDTO) {
			ot.setTotalothouse(Total_ot_hrs);
			overTimeDTOUpdated.add(ot);
		}
		
		
		
		} catch (ParseException e) {
			e.printStackTrace();
			return overTimeDTOUpdated;
		}
		
		return overTimeDTOUpdated;
	}
	
	
	
	
	  @Override 
	  public List<OverTimeDepertmentWiseDTO> getOverTimedetailsdepartmentwise(String fromDate , String toDate) 
	  {
		  Date   from_date1; 
		  List<OverTimeDepertmentWiseDTO> overTimedeptwiseDTOList = new ArrayList<>();
		  List<OverTimeDepertmentWiseDTO> overTimedeptwiseDTOUpdated = new ArrayList<>();
		 
		  try {
			  
			  from_date1 = new SimpleDateFormat("dd-MM-yyyy").parse(fromDate); 
			  Date  to_date1 = new SimpleDateFormat("dd-MM-yyyy").parse(toDate);
			  
			  
			  
			  Double Total_ot_hrs=0.0; Double Total_ot_amt=0.0;
			  
//			  List<Attendance>  attendanceList=attendanceRepo.Attendancebydatebetween(from_date1, to_date1);
			  List<Attendance>  attendanceList=attendanceRepo.findByFromDateBetweenAndToDateBetween(from_date1, to_date1, from_date1, to_date1);
			  
			  List<DepartmentMaster> deptlist=departmentMasterService.getallDeptMaster();
			  
			  for(int i=0; i<deptlist.size(); i++)
			  {
				  OverTimeDepertmentWiseDTO overTimedeptwiseDTO = new OverTimeDepertmentWiseDTO();
				  
				  overTimedeptwiseDTO.setDepartmentName(deptlist.get(i).getDepartmentname());
				  overTimedeptwiseDTO.setDepartmentId(deptlist.get(i).getDepartmentId());
				  
				  overTimedeptwiseDTO.setReportFromDate(from_date1);
				  overTimedeptwiseDTO.setReportToDate(to_date1);
				  
				  List<EmployeeMaster> emplist=employeeMasterRepo.findByDepartment(deptlist.get(i).getDepartmentId());
				  
				  List<OverTimeDepertmentWiseEmpDetailsDTO> otDepertmentWiseEmpDetailsDTOAttn = new ArrayList<>();
				  List<OverTimeDepertmentWiseEmpDetailsDTO> otDepertmentWiseEmpDetailsDTO = new ArrayList<>();
				  start: for(int j = 0 ; j <attendanceList.size() ; j++)
				  {
					  
					  
					  OverTimeDepertmentWiseEmpDetailsDTO otAttn = new OverTimeDepertmentWiseEmpDetailsDTO();
					  
					  String empCode = "0";
					  String empName = null;
					  Double otHrs = 0.0;
					  Double otAmt = 0.0;
					  
					  for(int k = 0 ; k < emplist.size() ; k++)
					  {
						  
						  OverTimeDepertmentWiseEmpDetailsDTO depertmentWiseEmpDetailsDTO = new OverTimeDepertmentWiseEmpDetailsDTO();
						  
						  if(attendanceList.get(j).getEmp_code().equals(emplist.get(k).getEmpcode()))
						  {
//							 System.out.println("attn :: "+attendanceList.get(j).getEmp_code());
//							 System.out.println("emp :: "+emplist.get(k).getEmpcode());
							  empCode = emplist.get(k).getEmpcode();
							  empName = emplist.get(k).getEmpName();
							  otHrs = otHrs + attendanceList.get(j).getTotal_ot_hrs();
							  otAmt = otAmt + (emplist.get(k).getBasic())* (attendanceList.get(j).getTotal_ot_hrs() * 2) ;
							  
							  depertmentWiseEmpDetailsDTO.setEmpCode(emplist.get(k).getEmpcode());
							  depertmentWiseEmpDetailsDTO.setEmpName(emplist.get(k).getEmpName());
							  depertmentWiseEmpDetailsDTO.setOtHrs(attendanceList.get(j).getTotal_ot_hrs());
							  depertmentWiseEmpDetailsDTO.setOtamount((emplist.get(k).getBasic())* (attendanceList.get(j).getTotal_ot_hrs() * 2) );
							  
							  depertmentWiseEmpDetailsDTO.setTotalOtamt(otAmt);
							  depertmentWiseEmpDetailsDTO.setTotalOthrs(otHrs);
							  System.out.println("emp :: "+depertmentWiseEmpDetailsDTO.getEmpCode());
//							  System.out.println(empCode);
							  otDepertmentWiseEmpDetailsDTO.add(depertmentWiseEmpDetailsDTO);
							  overTimedeptwiseDTO.setOtDepertmentWiseEmpDetailsDTO(otDepertmentWiseEmpDetailsDTO); 
							  continue start;
							  
						  }
//						  depertmentWiseEmpDetailsDTO.setEmpCode(empCode);
//						  depertmentWiseEmpDetailsDTO.setEmpName(empName);
//						  depertmentWiseEmpDetailsDTO.setOtHrs(otHrs);
//						  depertmentWiseEmpDetailsDTO.setOtamount(otAmt);
						  
						 
					  }
					  
					  
//					  System.out.println("otDepertmentWiseEmpDetailsDTO ::: "+otDepertmentWiseEmpDetailsDTO);
					  
					 
					  
//					  System.out.println("overTimedeptwiseDTO ::: "+overTimedeptwiseDTO);
					 
				  }
				  overTimedeptwiseDTOList.add(overTimedeptwiseDTO);
			  }
			  
			  
	  } catch (ParseException e) { 
		  e.printStackTrace(); 
		  return overTimedeptwiseDTOList; 
	  }
	  
	  return overTimedeptwiseDTOList; 
	  }
	 
	
	
	
	
}
