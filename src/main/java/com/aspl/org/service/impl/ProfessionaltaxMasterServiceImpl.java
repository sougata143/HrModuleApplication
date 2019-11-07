package com.aspl.org.service.impl;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.aspl.org.entity.ProffesionalTaxslabMst;
import com.aspl.org.repository.ProffesionalTaxslabMasterRepo;
import com.aspl.org.service.ProfessionalTaxMasterService;

@Service
@Transactional
public class ProfessionaltaxMasterServiceImpl implements ProfessionalTaxMasterService{

	@Autowired ProffesionalTaxslabMasterRepo proffesionalTaxslabMasterRepo;

	@Override
	public ProffesionalTaxslabMst getByID(Integer professionaltaxID) {
		// TODO Auto-generated method stub
		return proffesionalTaxslabMasterRepo.findById(professionaltaxID).get();
	}

	@Override
	public List<ProffesionalTaxslabMst> getallProffesionalTaxslabMst() {
		// TODO Auto-generated method stub
		return proffesionalTaxslabMasterRepo.findAll();
	}

	@Override
	public ProffesionalTaxslabMst professionalTaxslabMstsave(ProffesionalTaxslabMst proffesionalTaxslabMst) {
		// TODO Auto-generated method stub
		return proffesionalTaxslabMasterRepo.save(proffesionalTaxslabMst);
	}

	@Override
	public ProffesionalTaxslabMst findByproffesionalminmaxamt(Double basic) {
		// TODO Auto-generated method stub
		return proffesionalTaxslabMasterRepo.findByproffesionalminmaxamt(basic);
	}
	
	

	

	
	
	

}
