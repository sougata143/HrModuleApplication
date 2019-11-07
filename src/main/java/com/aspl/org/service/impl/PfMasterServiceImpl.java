package com.aspl.org.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.aspl.org.entity.PfvoucherEntry;
import com.aspl.org.repository.PfMasterRepo;
import com.aspl.org.service.PfmasterService;

@Service
@Transactional
public class PfMasterServiceImpl implements PfmasterService{
	
	@Autowired PfMasterRepo pfmasterRepo;

	@Override
	public PfvoucherEntry pfmastersave(PfvoucherEntry pfvoucherEntry) {
		// TODO Auto-generated method stub
		return pfmasterRepo.save(pfvoucherEntry);
	}

	@Override
	public void pfmasterdelete(PfvoucherEntry pfvoucherEntry) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<PfvoucherEntry> getallPfvoucherEntrylist() {
		// TODO Auto-generated method stub
		return pfmasterRepo.findAll();
	}

	@Override
	public PfvoucherEntry findbypfNo(String pfNo) {
		// TODO Auto-generated method stub
		return pfmasterRepo.findBypfNo(pfNo);
	}

	@Override
	public PfvoucherEntry PfvoucherEntryupdate(PfvoucherEntry pfvoucherEntry) {
		// TODO Auto-generated method stub
		return pfmasterRepo.save(pfvoucherEntry);
	}

	@Override
	public PfvoucherEntry getByempcode(String empcode) {
		// TODO Auto-generated method stub
		return pfmasterRepo.findByempcode(empcode);
	}

	@Override
	public PfvoucherEntry getByvoucherNo(String voucherNo) {
		// TODO Auto-generated method stub
		return pfmasterRepo.findByvoucherNo(voucherNo);
	}
	
	
	
	
	
	

}
