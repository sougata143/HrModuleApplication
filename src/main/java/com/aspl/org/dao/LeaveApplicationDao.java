package com.aspl.org.dao;

import java.util.Date;
import java.util.List;

import com.aspl.org.entity.LeaveMaster;
import com.aspl.org.entity.Leaveapplication;

public interface LeaveApplicationDao {
	
	List<LeaveMaster> findByempcode(Integer empcode);
	LeaveMaster findByempcodeandtype(Integer empcode , String leaveType);
	
	/*
	 * List<Leaveapplication> leaveapplicationdateandempcodewise(Integer empCode,
	 * String fromDate, String toDate, String approvedstatus);
	 */
	List<Leaveapplication> leaveapplicationdateandempcodewise(String empCode, Date fromDate, Date toDate,
			String approvedstatus); 

}
