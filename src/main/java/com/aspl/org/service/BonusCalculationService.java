package com.aspl.org.service;

import java.text.ParseException;
import java.util.List;

import org.springframework.stereotype.Service;

import com.aspl.org.dto.BonusCalculationDTO;
import com.aspl.org.entity.BonusCalculation;


@Service
public interface BonusCalculationService {
	
	BonusCalculation bonusCalculationsave(BonusCalculation bonusCalculation);

	//List<BonusCalculationDTO> getBonuscalculationyearwise(String year) throws ParseException;

	List<BonusCalculationDTO> getBonuscalculationyearwise() throws ParseException;

	//List<BonusCalculationDTO> getBonuscalculationyearwise(String foremployee, String currentyear) throws ParseException;



	
}