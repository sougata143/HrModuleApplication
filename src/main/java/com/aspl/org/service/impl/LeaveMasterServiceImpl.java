package com.aspl.org.service.impl;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.aspl.org.dto.LeaveStatementDTO;
import com.aspl.org.entity.EmployeeMaster;
import com.aspl.org.entity.LeaveMaster;
import com.aspl.org.repository.EmployeeMasterRepo;
import com.aspl.org.repository.LeaveMasterRepo;
import com.aspl.org.service.EmployeeMasterService;
import com.aspl.org.service.LeaveMasterService;

@Service
@Transactional
public class LeaveMasterServiceImpl implements LeaveMasterService{
	
	
	@Autowired LeaveMasterRepo  leaveMasterRepo;
	@Autowired EmployeeMasterService employeemasterservice;
	@Autowired EmployeeMasterRepo employeemasterRepo;

	@Override
	public LeaveMaster getByleavetype(String leavetype) {
		// TODO Auto-generated method stub
		return leaveMasterRepo.findByleavetype(leavetype).get(0);
	}

	@Override
	public List<LeaveMaster> getallLeavemaster() {
		// TODO Auto-generated method stub
		return leaveMasterRepo.findAll();
	}

	@Override
	public Optional<LeaveMaster> findbyidleaveMaster(Integer leaveID) {
		// TODO Auto-generated method stub
		return leaveMasterRepo.findById(leaveID);
	}

	@Override
	public LeaveMaster leavemastersave(LeaveMaster leaveMaster) {
		// TODO Auto-generated method stub
		return leaveMasterRepo.save(leaveMaster);
	}

	@Override
	public List<LeaveMaster> getByleavetypelist(String leavetype) {
		// TODO Auto-generated method stub
		
		List<LeaveMaster> leavemasterlistbyleavetype=leaveMasterRepo.findByleavetype(leavetype);
		
		return leavemasterlistbyleavetype;
	}

	@Override
	public List<LeaveMaster> findByempcode(String empcode) {
		// TODO Auto-generated method stub
		return leaveMasterRepo.findByempcode(empcode);
	}

	
	@Override
	public List<LeaveStatementDTO> getLeaveStatementReport(String currentyear) {
		
		List<LeaveStatementDTO> leavestatementDTOList = new ArrayList<>();
		
		try {
			
			Integer openningPL =0;
			Integer openningCL= 0;
			Integer openningSL=0;
			
			Integer prev3Year = Integer.valueOf(currentyear)-3;
			Integer prevYear = Integer.valueOf(currentyear)-1;

			Date currStartDate = new SimpleDateFormat("yyyy-MM-dd").parse(currentyear+"-01-01");
			Date currEndDate = new SimpleDateFormat("yyyy-MM-dd").parse(currentyear+"-12-31");
			
			List<LeaveMaster> leavemasterByDate = leaveMasterRepo.findByEffectenddateBetween(currStartDate, currEndDate);
			
			
			for(LeaveMaster lm : leavemasterByDate) {
				
				LeaveStatementDTO dto = new LeaveStatementDTO();
				
				dto.setEmpcode(lm.getEmpcode());
				EmployeeMaster employeemaster=employeemasterservice.findbyidempcoder(lm.getEmpcode());
				dto.setEmpname(employeemaster.getEmpName());
				
				List<LeaveMaster> leavemasterCurrYear = 
						leaveMasterRepo.findByEffectenddateBetweenAndEmpcode(currStartDate, currEndDate, lm.getEmpcode());
				
				Date prevStartDate = new SimpleDateFormat("yyyy-MM-dd").parse(String.valueOf(prev3Year)+"-01-01");
				Date prevEndDate = new SimpleDateFormat("yyyy-MM-dd").parse(String.valueOf(prevYear)+"-12-31");
				
				List<LeaveMaster> leavemasterPrevYear = 
						leaveMasterRepo.findByEffectenddateBetweenAndEmpcode(prevStartDate, prevEndDate, lm.getEmpcode());
			
				for(LeaveMaster lm1 : leavemasterCurrYear) {
					if(lm1.getLeavetype().equalsIgnoreCase("CL"))
						dto.setCurrentyearCL(lm1.getNoofleave());
					
					if(lm1.getLeavetype().equalsIgnoreCase("PL"))
						dto.setCurrentyearPL(lm1.getNoofleave());
					
					if(lm1.getLeavetype().equalsIgnoreCase("SL"))
						dto.setCurrentyearSL(lm1.getNoofleave());
				}
				
				
				for(LeaveMaster lm2 : leavemasterPrevYear) {
					
					if(lm2.getLeavetype().equalsIgnoreCase("CL")) {
						openningCL = openningCL + lm2.getNoofleave();
					}
					
					if(lm2.getLeavetype().equalsIgnoreCase("PL")) {
						openningPL = openningPL + lm2.getNoofleave();
					}

					if(lm2.getLeavetype().equalsIgnoreCase("SL")) {
						openningSL = openningSL + lm2.getNoofleave();
					}
					
				}
				
				dto.setOpeningCL(openningCL);
				dto.setOpeningPL(openningPL);
				dto.setOpeningSL(openningSL);
				
		
				leavestatementDTOList.add(dto);
		}
			
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		return leavestatementDTOList;
	}

	
	
	

}
