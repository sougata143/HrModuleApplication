package com.aspl.org.service.impl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestParam;

import com.aspl.org.dao.LeaveApplicationDao;
import com.aspl.org.dto.LeaveApplicationRptDTO;
import com.aspl.org.entity.LeaveMaster;
import com.aspl.org.entity.Leaveapplication;
import com.aspl.org.repository.LeaveApplicationRepo;
import com.aspl.org.repository.LeaveMasterRepo;
import com.aspl.org.service.LeaveApplicationService;


@Service
@Transactional
public class LeaveApplicationServiceImpl implements LeaveApplicationService {
	
	
	@Autowired LeaveApplicationRepo leaveApplicationRepo;
	@Autowired LeaveMasterRepo leavemasterRepo;
	@Autowired LeaveApplicationDao leaveApplicationDao; 

	@Override
	public Leaveapplication leaveapplicationsave(Leaveapplication leaveapplication) {
		// TODO Auto-generated method stub
		
				
		
		String approvedstatusy="Yes"; 	
		String approvedstatusn="No";
				
		
		LeaveMaster leavemaster=leavemasterRepo.findByempcodeandtype(leaveapplication.getEmpCode(), leaveapplication.getLeaveType());
		//List<LeaveMaster> leaveMasterlist = leavemasterRepo.findByempcodelist(leaveapplication.getEmpCode());
		
		if(leavemaster!=null)
		{
			
			if(leaveapplication.getApprovedstatus().equals(approvedstatusy))
			{
			
			Integer countleave=(leavemaster.getNoofleave())-(leaveapplication.getNoofdays());
			
			leavemaster.setNoofleave(countleave);
			leavemasterRepo.save(leavemaster);
			return leaveApplicationRepo.save(leaveapplication);
			
			}else
		{
			return leaveApplicationRepo.save(leaveapplication);
		}
		}else
		{
			System.out.println("Leave Not Available");
			return leaveapplication;
		}
		
		
			
		
		
		
					
		 
	}

	@Override
	public Leaveapplication leaveapplicationupdate(Leaveapplication leaveapplication) {
		// TODO Auto-generated method stub
		
		
		
		
		return null;
	}

	@Override
	public List<Leaveapplication>  Leaveapplicationlist (@RequestParam("leaveapplicationID") Integer leaveapplicationID
			) {
		// TODO Auto-generated method stub
		
		
		
		Leaveapplication leaveapplicationbyid =leaveApplicationRepo.findByleaveapplicationID(leaveapplicationID);
		LeaveMaster leavemaster=leavemasterRepo.findByempcodeandtype(leaveapplicationbyid.getEmpCode(), leaveapplicationbyid.getLeaveType());
		
		List<Leaveapplication> leaveapplicationall=leaveApplicationRepo.findAll();
		
		if(leavemaster!=null && leaveapplicationbyid!=null)
		{
			leaveApplicationRepo.deleteById(leaveapplicationID);
			
			Integer leavemastleavecount=leavemaster.getNoofleave();
			Integer leaveappleavecount=leaveapplicationbyid.getNoofdays();
			
			leavemaster.setNoofleave(leavemastleavecount+leaveappleavecount);
			
			leavemasterRepo.save(leavemaster);
			return leaveapplicationall;	
		}

		else
		{
			System.out.println("Leave Master Or Leave application not in Database ");
			return leaveapplicationall;
		}
	}

	@Override
	public List<Leaveapplication> leaveapplicationlist() {
		// TODO Auto-generated method stub
		return leaveApplicationRepo.findAll();
	}

	@Override
	public List<Leaveapplication> leaveapplicationdateandempcodewise(String empCode, Date fromDate, Date toDate,
			String approvedstatus) {
		// TODO Auto-generated method stub
		return leaveApplicationDao.leaveapplicationdateandempcodewise(empCode, fromDate, toDate, approvedstatus);
	}


	@Override
	public LeaveMaster findByempcodeandtype(Integer empcode,  String leavetype) {
		
		
		
		return leaveApplicationDao.findByempcodeandtype(empcode, leavetype);
		
	}

	
	
	/** @param fromDate
	 * @param toDate
	 * This method is used for generating the DTO class for service order. this method take fromDate as a param, and toDate as a param and return the LeaveApplicationRptDTO.
	 * In this method using fromDate and toDate for filtering the leave application table and create a list of the data and using the loop get one by one data and set 
	 * in DTo and return it
	 * 
	 * @return LeaveApplicationRptDTO
	 */
	
	
	
	@Override
	public	List<LeaveApplicationRptDTO> findByapplicationDateBetween(String fromDate , String toDate)
	{
		Date from_date1;
		List<LeaveApplicationRptDTO> leaveApplicationRptDTO = new ArrayList<>();
		try {
			from_date1 = new SimpleDateFormat("dd-MM-yyyy").parse(fromDate);
			Date to_date1 = new SimpleDateFormat("dd-MM-yyyy").parse(toDate);
		
		
		
		
		List<Leaveapplication> leaveappList=leaveApplicationRepo.findByapplicationDateBetween(from_date1, to_date1);
		
		for(Leaveapplication leaveapp : leaveappList)
		{
			LeaveApplicationRptDTO leaveappDTO= new LeaveApplicationRptDTO();
						
			leaveappDTO.setVoucherNo(leaveapp.getVoucherNo());
			leaveappDTO.setEmpCode(leaveapp.getEmpCode());
			leaveappDTO.setEmpName(leaveapp.getEmpName());
			leaveappDTO.setLeaveType(leaveapp.getLeaveType());
			leaveappDTO.setApplicationDate(leaveapp.getApplicationDate());
			leaveappDTO.setFromDate(leaveapp.getFromDate());
			leaveappDTO.setToDate(leaveapp.getToDate());
			leaveappDTO.setNoofdays(leaveapp.getNoofdays());
						
			leaveApplicationRptDTO.add(leaveappDTO);

		}
		
		} catch (ParseException e) {
			e.printStackTrace();
			return leaveApplicationRptDTO;
		}
		
		return leaveApplicationRptDTO;
	}

}
