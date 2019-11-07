package com.aspl.org.service.impl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.aspl.org.dto.AdvancePayDTO;

import com.aspl.org.entity.AdvancePaymentVoucher;
import com.aspl.org.repository.AdvSalaryRepo;
import com.aspl.org.service.AdvSalaryService;

@Service
@Transactional
public class AdvSalaryServiceImpl implements AdvSalaryService{
	
	
	@Autowired AdvSalaryRepo advSalaryRepo; 

	@Override
	public AdvancePaymentVoucher getByadvVouID(Integer advSalaryvouID) {
		return advSalaryRepo.findById(advSalaryvouID).get();
	}

	@Override
	public List<AdvancePaymentVoucher> getalladvAdvancePaymentVouchers() {
		return advSalaryRepo.findAll();
	}

	@Override
	public List<AdvancePaymentVoucher> findByempcode(String empcode) {
		
		return advSalaryRepo.findByempcode(empcode);
	}

	@Override
	public AdvancePaymentVoucher AdvancePaymentVouchersave(AdvancePaymentVoucher advancePaymentVoucher) {
		return advSalaryRepo.save(advancePaymentVoucher);
	} 
	

	
	/** @param fromDate
	 * @param toDate
	 * This method is used for generating the DTO class for service order. this method take fromDate as a param, and toDate as a param and return the AdvancePayDTO.
	 * In this method using fromDate and toDate for filtering the advance payment voucher table and create a list of the data and using the loop get one by one data and set 
	 * in DTo and return it
	 * 
	 * @return advancePaymentDTO
	 */
	@Override
	public	List<AdvancePayDTO> findByVoucherDateBetween(String  fromDate , String toDate)
	{
		Date from_date1;
		List<AdvancePayDTO> advancePaymentDTO = new ArrayList<>();
		try {
			from_date1 = new SimpleDateFormat("dd-MM-yyyy").parse(fromDate);
			Date to_date1 = new SimpleDateFormat("dd-MM-yyyy").parse(toDate);
		
		
		
		
		List<AdvancePaymentVoucher> advpayList=advSalaryRepo.findByVoucherDateBetween(from_date1, to_date1);
		
		for(AdvancePaymentVoucher advpay : advpayList)
		{
			AdvancePayDTO advancePayDTO= new AdvancePayDTO();
						
			advancePayDTO.setUserfromDate(from_date1);
			advancePayDTO.setUsertoDate(to_date1);
			advancePayDTO.setVoucherNo(advpay.getVoucherNo());
			advancePayDTO.setEmpcode(advpay.getEmpcode());
			advancePayDTO.setEmployeeName(advpay.getEmployeeName());
			advancePayDTO.setAdvamount(advpay.getAdvamount());
			advancePayDTO.setPayamount(advpay.getPayamount());
			advancePayDTO.setNoofinstallments(advpay.getNoofinstallments());
			advancePayDTO.setInstallmentamt(advpay.getInstallmentamt());
			advancePayDTO.setBalenceamount(advpay.getAdvamount() - advpay.getPayamount());		
			advancePayDTO.setVoucherDate(advpay.getVoucherDate());
			advancePaymentDTO.add(advancePayDTO);

		}
		
		} catch (ParseException e) {
			e.printStackTrace();
			return advancePaymentDTO;
		}
		
		
		return advancePaymentDTO;
			
	}
	
	


	
	
	
	
	
	
	
	
	
	
	
	
	

	
	
	

}
