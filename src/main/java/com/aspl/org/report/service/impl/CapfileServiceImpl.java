package com.aspl.org.report.service.impl;
import java.util.List;

import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aspl.org.entity.Capfile;
import com.aspl.org.repository.CapfileRepo;
import com.aspl.org.service.CapfileService;

@Service
@Transactional
public class CapfileServiceImpl implements CapfileService{

	@Autowired CapfileRepo capfileRepo; 

	
	@Override
	public Capfile capfilesave(Capfile capfile) {
		return capfileRepo.save(capfile);
	}

	@Override
	public Capfile getBycapfileid(Integer capfileid) {
		return capfileRepo.getOne(capfileid);
	}

	@Override
	public List<Capfile> getallCapfileEntry() {
		return capfileRepo.findAll();
	}

	@Override
	public List<Capfile> findByempCode(String empCode) {
		return capfileRepo.findByEmpCode(empCode);
	}



	@Override
    @Transactional
    public void truncateCapfile() {
		capfileRepo.truncatecapfile();
    }







}
