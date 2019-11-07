package com.aspl.org.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.aspl.org.entity.CanteenVoucherEntry;
import com.aspl.org.repository.CanteenVouMasterRepo;
import com.aspl.org.service.CanteenVouMasterService;

@Service
@Transactional
public class CanteenVouMasterServiceImpl implements CanteenVouMasterService{
	
	
	@Autowired CanteenVouMasterRepo canteenVouMasterRepo; 
	

	@Override
	public CanteenVoucherEntry getBycanvouID(Integer canvouID) {
		return canteenVouMasterRepo.findById(canvouID).get();
	}

	@Override
	public List<CanteenVoucherEntry> getallCanteenVoucherEntry() {
		return canteenVouMasterRepo.findAll();
	}

	@Override
	public Optional<CanteenVoucherEntry> findbyvoucherNo(String voucherNo) {
		return canteenVouMasterRepo.findByvoucherNo(voucherNo);
	}

	@Override
	public CanteenVoucherEntry CanteenVoucherEntrysave(CanteenVoucherEntry canteenVoucherEntry) {
		return canteenVouMasterRepo.save(canteenVoucherEntry);
	}

	@Override
	public Optional<CanteenVoucherEntry> findByempCode(String empCode) {
		return canteenVouMasterRepo.findByempCode(empCode);
	}

	
	@Override
	public CanteenVoucherEntry findByempCodeandmonth(String empCode , Integer month) {
		return canteenVouMasterRepo.findByempCodeandmonth(empCode, month);
	}

	

}
