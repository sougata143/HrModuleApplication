package com.aspl.org.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.aspl.org.entity.CanteenVoucherEntry;


@Repository
public interface CanteenVouMasterRepo extends JpaRepository<CanteenVoucherEntry, Integer>{

	Optional<CanteenVoucherEntry> findByvoucherNo(String voucherNo);
	
	Optional<CanteenVoucherEntry> findByempCode(String empCode);
	
	@Query(value="select * from canteenvouchermst as l where l.emp_code=?1 and MONTH(voucher_date)=?2 " , nativeQuery = true)
	CanteenVoucherEntry findByempCodeandmonth(String empCode , Integer month);
	
	
}
