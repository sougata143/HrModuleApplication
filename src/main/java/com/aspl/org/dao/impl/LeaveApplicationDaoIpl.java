package com.aspl.org.dao.impl;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.aspl.org.dao.LeaveApplicationDao;
import com.aspl.org.entity.LeaveMaster;
import com.aspl.org.entity.Leaveapplication;

@Repository
public class LeaveApplicationDaoIpl implements LeaveApplicationDao{

	@Override
	public List<LeaveMaster> findByempcode(Integer empcode) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Query("select * from leavemaster l where l.empcode=:empcode and l.leavetype=:leavetype" )
	public LeaveMaster findByempcodeandtype(@Param("empcode")Integer empcode, @Param("leavetype") String leavetype) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Query("select * from leaveapplication l where l.emp_code=:empCode and l.from_date between (:fromDate and :toDate)"
			+ "and l.approvedstatus=:approvedstatus")
	public List<Leaveapplication> leaveapplicationdateandempcodewise(String empCode, Date fromDate, Date toDate,
			String approvedstatus) {
		// TODO Auto-generated method stub
		return null;
	}

}
