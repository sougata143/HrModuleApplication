package com.aspl.org.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aspl.org.entity.Leaveapplication;


@Repository
public interface LeaveApplicationRepo extends JpaRepository<Leaveapplication, Integer>{

	Leaveapplication findByleaveapplicationID(Integer leaveapplicationID);
	Leaveapplication findByvoucherNo(String voucherNo);
	
	List<Leaveapplication> findByapplicationDateBetween(Date fromDate , Date toDate);
	
	
}
