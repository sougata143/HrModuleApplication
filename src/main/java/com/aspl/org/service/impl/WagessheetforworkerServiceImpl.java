package com.aspl.org.service.impl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.aspl.org.dto.WagessheetforWorkersDTO;
import com.aspl.org.entity.Payslip;
import com.aspl.org.repository.EmployeeMasterRepo;
import com.aspl.org.repository.PayslipRepo;
@Service
@Transactional
public class WagessheetforworkerServiceImpl implements WagessheetforworkerService{

	@Autowired PayslipRepo payslipRepo; 
	@Autowired EmployeeMasterRepo employeemasterRepo;
	
	
	@Override
	public	List<WagessheetforWorkersDTO> getPrintwagessheetreportforworker(String foremployee , String fromDate , String toDate)
	{
		Date from_date1;
		List<WagessheetforWorkersDTO> wagessheetforWorkersDTO = new ArrayList<>();
		List<WagessheetforWorkersDTO> wagessheetforWorkersDTOupdate = new ArrayList<>();
		try {
			from_date1 = new SimpleDateFormat("dd-MM-yyyy").parse(fromDate);
			Date to_date1 = new SimpleDateFormat("dd-MM-yyyy").parse(toDate);
		
		
		
			Double totalbasicSalarycal=0.0;
			Double totalgrossSalarycal=0.0;
			Double totalpfcontributioncal=0.0;
			Double totalpensionablesalcal=0.0;
			Double totalpenfundcal=0.0;
			Double totalersrpfcal=0.0;
		//List<Payslip> payslipList=payslipRepo.findBypayDateBetween(from_date1, to_date1);
		List<Payslip>  payslipList=payslipRepo.findByFromDateBetweenAndToDateBetweenAndForemployee( from_date1, to_date1, from_date1, to_date1, foremployee);
		WagessheetforWorkersDTO wagessheetforWorkersDTO1=null;
		
		
		for(Payslip payslip : payslipList)
		{
			wagessheetforWorkersDTO1= new WagessheetforWorkersDTO();
			
			wagessheetforWorkersDTO1.setEsino(payslip.getEsiNo());
			wagessheetforWorkersDTO1.setEmpname(payslip.getEmpname());
			wagessheetforWorkersDTO1.setTotalworkdays(payslip.getTotal_working_day());
		    wagessheetforWorkersDTO1.setHd(0.00);	
		    wagessheetforWorkersDTO1.setLeaveday(payslip.getTotalleave());
		    wagessheetforWorkersDTO1.setDayforpay(payslip.getDays_for_pay());
		    wagessheetforWorkersDTO1.setRateperday(payslip.getBasicsalary());
		    wagessheetforWorkersDTO1.setNormalwagesearned(payslip.getNormalwagesearned());
		    wagessheetforWorkersDTO1.setoThrs(payslip.getOtHrs());
		    wagessheetforWorkersDTO1.setoTamt(payslip.getOtamount());
		    wagessheetforWorkersDTO1.setGrosswagesearned(payslip.getGrossearning());
		    wagessheetforWorkersDTO1.setWagesAdvdeduction(payslip.getSalaryAdv());
		    wagessheetforWorkersDTO1.setPfAmtdeduction(payslip.getPfcontribution());
		    wagessheetforWorkersDTO1.setEmpPenfunddeduction(payslip.getBasicsalary() * 0.0833);
		    wagessheetforWorkersDTO1.setErSrpfdeduction(payslip.getBasicsalary() * 0.0367);
		    wagessheetforWorkersDTO1.setFineAmtdeduction(payslip.getFineAmount());
		    wagessheetforWorkersDTO1.setTotalDeduction(payslip.getGrossdeduction());
		    wagessheetforWorkersDTO1.setTotalNetpay(payslip.getNetamt());
		    
		    
		    
		    
		
			
			
			
			//totalbasicSalarycal+=payslip.getBasicsalary();
			//totalgrossSalarycal+=(payslip.getBasicsalary() * 1.1);
				/*
				 * totalpfcontributioncal+=payslip.getPfcontribution();
				 * totalpensionablesalcal+=payslip.getBasicsalary();
				 * totalpenfundcal+=(payslip.getBasicsalary() * 0.833); tot
				 alersrpfcal+=(payslip.getBasicsalary() * 0.0367);*/
			
			
		
		    wagessheetforWorkersDTO.add(wagessheetforWorkersDTO1);
		
		}
		
			/*
			 * for(PfReportForStaffDTO pf : pfReportForStaffDTO) {
			 * pf.setTotalbasicSalary(totalbasicSalarycal);
			 * pf.setGrossSalary(totalgrossSalarycal);
			 * pf.setPfContribution(totalpfcontributioncal);
			 * pf.setTotalpenFund(totalpenfundcal);
			 * pf.setTotalpensionableSal(totalpensionablesalcal);
			 * pf.setErSrPf(totalersrpfcal);
			 * 
			 * pfReportForStaffDTOUpdated.add(pf); }
			 */
		
		
		
		} catch (ParseException e) {
			e.printStackTrace();
			return wagessheetforWorkersDTO;
		}
		
		return wagessheetforWorkersDTO;
	}
}
