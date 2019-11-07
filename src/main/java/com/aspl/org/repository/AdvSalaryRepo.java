package com.aspl.org.repository;



import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.aspl.org.entity.AdvancePaymentVoucher;



@Repository
public interface AdvSalaryRepo extends JpaRepository<AdvancePaymentVoucher, Integer>{


	List<AdvancePaymentVoucher> findByempcode(String empcode);
	
	List<AdvancePaymentVoucher> findByVoucherDateBetween(Date fromDate , Date toDate);
	
}
