package com.aspl.org.service;

import java.util.Date;
import java.util.List;

import com.aspl.org.dto.LeaveApplicationRptDTO;
import com.aspl.org.entity.LeaveMaster;
import com.aspl.org.entity.Leaveapplication;

public interface LeaveApplicationService {

	
	
	Leaveapplication leaveapplicationupdate(Leaveapplication leaveapplication);

	Leaveapplication leaveapplicationsave(Leaveapplication leaveapplication);

	//List<Leaveapplication> leaveapplicationdelete(Leaveapplication leaveapplication);
	
	List<Leaveapplication> leaveapplicationlist();


	/*
	 * List<Leaveapplication> leaveapplicationdateandempcodewise(Integer empCode,
	 * String fromDate, String toDate, String approvedstatus);
	 */
	/*
	 * List<Leaveapplication> Leaveapplicationlist(Integer leaveapplicationID,
	 * Integer empCode, String leaveType, Integer getNoofdays);
	 */

	List<Leaveapplication> leaveapplicationdateandempcodewise(String empCode, Date fromDate, Date toDate,
			String approvedstatus);

	List<Leaveapplication> Leaveapplicationlist(Integer leaveapplicationID);

	LeaveMaster findByempcodeandtype(Integer empcode, String leaveType);

	

	List<LeaveApplicationRptDTO> findByapplicationDateBetween(String fromDate, String toDate);

	//List<Leaveapplication> leaveapplicationdateandempcodewise(String empCode, Date fromDate, Date toDate,
			//String approvedstatus);
	
	
}
