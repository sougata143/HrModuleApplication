package com.aspl.org.service;



import java.text.ParseException;
import java.util.List;

import com.aspl.org.dto.PayslipDTO;
import com.aspl.org.entity.Payslip;


public interface PayslipService {

	
	/*
	 * Payslip payslipgeneration(String employeeType, String from_date, String
	 * to_date);
	 */
	
	Payslip payslipsave(Payslip payslip);



	Payslip payslipgeneration(String employeeType, String from_date, String to_date);
	
	
	List<PayslipDTO> getPayslipdatewise(String employeeType, String from_date, String to_date);



	List<Payslip> getallPaysliplist();



	List<Payslip> findbyPayslip(String from_date, String to_date) throws ParseException;



	Payslip TestReadFile(String filepath);
	
	//Payslip attendancePrepair(String employeeType, String from_date, String to_date);



	//Payslip attendancePrepair(String from_date, String to_date);



	void AttendaceGenerate() throws Exception;



	Payslip attendancePrepair(String forEmployee, String from_date, String to_date);
	
		
}
