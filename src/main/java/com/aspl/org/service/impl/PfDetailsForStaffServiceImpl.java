package com.aspl.org.service.impl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aspl.org.dto.PfReportForStaffDTO;
import com.aspl.org.dto.PfReportForWorkerDTO;
import com.aspl.org.entity.Payslip;
import com.aspl.org.repository.EmployeeMasterRepo;
import com.aspl.org.repository.PayslipRepo;
import com.aspl.org.service.PfDetailsForStaffService;

@Service
@Transactional
public class PfDetailsForStaffServiceImpl implements PfDetailsForStaffService{

	
	@Autowired PayslipRepo payslipRepo; 
	@Autowired EmployeeMasterRepo employeemasterRepo;
	
	
	@Override
	public	List<PfReportForStaffDTO> getPrintPfdetailsforStaff(String fromDate , String toDate)
	{
		Date from_date1;
		List<PfReportForStaffDTO> pfReportForStaffDTO = new ArrayList<>();
		List<PfReportForStaffDTO> pfReportForStaffDTOUpdated = new ArrayList<>();
		try {
			from_date1 = new SimpleDateFormat("dd-MM-yyyy").parse(fromDate);
			Date to_date1 = new SimpleDateFormat("dd-MM-yyyy").parse(toDate);
		
		
		
			Double totalbasicSalarycal=0.0;
			Double totalgrossSalarycal=0.0;
			Double totalpfcontributioncal=0.0;
			Double totalpensionablesalcal=0.0;
			Double totalpenfundcal=0.0;
			Double totalersrpfcal=0.0;
		List<Payslip> payslipList=payslipRepo.findByPayDateBetweenAndForemployee(from_date1, to_date1 , "Staff");
		PfReportForStaffDTO pfReportForStaff=null;
		
		
		for(Payslip payslip : payslipList)
		{
			pfReportForStaff= new PfReportForStaffDTO();
			
			pfReportForStaff.setEmpCode(payslip.getEmployeeCode());
			pfReportForStaff.setEmpName(payslip.getEmpname());
			pfReportForStaff.setBasicSalary(payslip.getBasicsalary());
			pfReportForStaff.setGrossSalary(payslip.getBasicsalary() * 1.1);
			pfReportForStaff.setPfContribution(payslip.getPfcontribution());
			pfReportForStaff.setPensionableSal(payslip.getBasicsalary());
			pfReportForStaff.setPenFund(payslip.getBasicsalary() * 0.0833);
			pfReportForStaff.setErSrPf(payslip.getBasicsalary() * 0.0367);
		
		
			
			
			
			totalbasicSalarycal+=payslip.getBasicsalary();
			totalgrossSalarycal+=(payslip.getBasicsalary() * 1.1);
			totalpfcontributioncal+=payslip.getPfcontribution();
			totalpensionablesalcal+=payslip.getBasicsalary();
			totalpenfundcal+=(payslip.getBasicsalary() * 0.0833);
			totalersrpfcal+=(payslip.getBasicsalary() * 0.0367);
			
			
		
		pfReportForStaffDTO.add(pfReportForStaff);
		
		}
		
		for(PfReportForStaffDTO pf : pfReportForStaffDTO) {
			pf.setTotalbasicSalary(totalbasicSalarycal);
			pf.setTotalgrossSalary(totalgrossSalarycal);
			pf.setTotalpfContribution(totalpfcontributioncal);
			pf.setTotalpenFund(totalpenfundcal);
			pf.setTotalpensionableSal(totalpensionablesalcal);
			pf.setTotalerSrPf(totalersrpfcal);
			
			pfReportForStaffDTOUpdated.add(pf);
		}
		
		
		
		} catch (ParseException e) {
			e.printStackTrace();
			return pfReportForStaffDTO;
		}
		
		return pfReportForStaffDTOUpdated;
	}
	
	
	
	@Override
	public	List<PfReportForWorkerDTO> getPrintPfdetailsforWorker(String fromDate , String toDate)
	{
		Date from_date1;
		List<PfReportForWorkerDTO> pfReportForWorkerDTO = new ArrayList<>();
		List<PfReportForWorkerDTO> pfReportForWorkerDTOUpdated = new ArrayList<>();
		try {
			from_date1 = new SimpleDateFormat("dd-MM-yyyy").parse(fromDate);
			Date to_date1 = new SimpleDateFormat("dd-MM-yyyy").parse(toDate);
		
		
		
			
			
//		List<Payslip> payslipList=payslipRepo.findByFromDateAndToDateforworkerpfreport(from_date1, to_date1);
		List<Payslip> countemp=payslipRepo.findByFromDateAndToDateforworkerpfreportcountemp(from_date1, to_date1);
		PfReportForWorkerDTO pfReportForWorker=null;
		
		
		if(!countemp.isEmpty()) {
			for(Payslip payslip : countemp)
			{
				List<Payslip> payslipListEmpWise=payslipRepo.findByFromDateAndToDateforworkerpfreportcountempEmpwise(payslip.getEmployeeCode(),from_date1, to_date1);
				pfReportForWorker= new PfReportForWorkerDTO();
				
				pfReportForWorker.setEmpCode(payslip.getEmployeeCode());
				pfReportForWorker.setEmpName(payslip.getEmpname());
				
				Integer loopSize = payslipListEmpWise.size();
				
				Date firstWeekFromDate = new Date();
				Date secondWeekFromDate = new Date();
				Date thirdWeekFromDate = new Date();
				Date fourthWeekFromDate = new Date();
				Date fifthWeekFromDate = new Date();
				
				Double totalwages=0.0;
				Double totalpfemployee=0.0;
				Double totalpfemployer=0.0;
				Double totalpensionfund=0.0;
				
				
				Double firstWeekPensionFund = 0.0;
				Double secondWeekPensionFund = 0.0;
				Double thirdWeekPensionFund = 0.0;
				Double fourthWeekPensionFund = 0.0;
				Double fifthWeekPensionFund = 0.0;
				
				Double firstWeekPfEmployee = 0.0;
				Double secondWeekPfEmployee = 0.0;
				Double thirdWeekPfEmployee = 0.0;
				Double fourthWeekPfEmployee = 0.0;
				Double fifthWeekPfEmployee = 0.0;
				
				Double firstWeekPfEmployer = 0.0;
				Double secondWeekPfEmployer = 0.0;
				Double thirdWeekPfEmployer = 0.0;
				Double fourthWeekPfEmployer = 0.0;
				Double fifthWeekPfEmployer = 0.0;
				
				Date firstWeekToDate = new Date();
				Date secondWeekToDate = new Date();
				Date thirdWeekToDate = new Date();
				Date fourthWeekToDate = new Date();
				Date fifthWeekToDate = new Date();
				
				Double firstWeekWages = 0.0;
				Double secondWeekWages = 0.0;
				Double thirdWeekWages = 0.0;
				Double fourthWeekWages = 0.0;
				Double fifthWeekWages = 0.0;
				
				if(!payslipListEmpWise.isEmpty()) {
					for(int i=0; i<loopSize; i++)
						
					{
						//List<EmployeeMaster> emplist=employeemasterRepo.findByempcode(payslip.getEmployeeCode());
						if(i==0)
						{
							firstWeekFromDate = payslipListEmpWise.get(i).getFromDate();
							firstWeekPensionFund = payslipListEmpWise.get(i).getBasicsalary()*0.0833;
							firstWeekPfEmployee = payslipListEmpWise.get(i).getPfcontribution();
							firstWeekPfEmployer = payslipListEmpWise.get(i).getBasicsalary()*0.0367;
							firstWeekToDate = payslipListEmpWise.get(i).getToDate();
							firstWeekWages = payslipListEmpWise.get(i).getGrossearning();
						}else if(i==1 ) {
							secondWeekFromDate = payslipListEmpWise.get(i).getFromDate();
							secondWeekPensionFund = payslipListEmpWise.get(i).getBasicsalary()*0.0833;
							secondWeekPfEmployee = payslipListEmpWise.get(i).getPfcontribution();
							secondWeekPfEmployer = payslipListEmpWise.get(i).getBasicsalary()*0.0367;
							secondWeekToDate = payslipListEmpWise.get(i).getToDate();
							secondWeekWages = payslipListEmpWise.get(i).getGrossearning();
						}else if(i==2 ) {
							thirdWeekFromDate = payslipListEmpWise.get(i).getFromDate();
							thirdWeekPensionFund = payslipListEmpWise.get(i).getBasicsalary()*0.0833;
							thirdWeekPfEmployee = payslipListEmpWise.get(i).getPfcontribution();
							thirdWeekPfEmployer = payslipListEmpWise.get(i).getBasicsalary()*0.0367;
							thirdWeekToDate = payslipListEmpWise.get(i).getToDate();
							thirdWeekWages = payslipListEmpWise.get(i).getGrossearning();
						}else if(i==3 ) {
							fourthWeekFromDate = payslipListEmpWise.get(i).getFromDate();
							fourthWeekPensionFund = payslipListEmpWise.get(i).getBasicsalary()*0.0833;
							fourthWeekPfEmployee = payslipListEmpWise.get(i).getPfcontribution();
							fourthWeekPfEmployer = payslipListEmpWise.get(i).getBasicsalary()*0.0367;
							fourthWeekToDate = payslipListEmpWise.get(i).getToDate();
							fourthWeekWages = payslipListEmpWise.get(i).getGrossearning();
						}else if(i==4 ) {
							fifthWeekFromDate = payslipListEmpWise.get(i).getFromDate();
							fifthWeekPensionFund = payslipListEmpWise.get(i).getBasicsalary()*0.0833;
							fifthWeekPfEmployee = payslipListEmpWise.get(i).getPfcontribution();
							fifthWeekPfEmployer = payslipListEmpWise.get(i).getBasicsalary()*0.0367;
							fifthWeekToDate = payslipListEmpWise.get(i).getToDate();
							fifthWeekWages = payslipListEmpWise.get(i).getGrossearning();
						}else {
							
							pfReportForWorker.setFirstweekfromDate(payslipListEmpWise.get(0).getFromDate());
							pfReportForWorker.setFirstweekpensionfund(0.00);
							pfReportForWorker.setFirstweekpfemployee(0.00);
							pfReportForWorker.setFirstweekpfemployer(0.00);
							pfReportForWorker.setFirstweektoDate(payslipListEmpWise.get(0).getToDate());
							pfReportForWorker.setFirstweekwages(0.00);
							
							
							pfReportForWorker.setSecondweekfromDate(payslipListEmpWise.get(0).getFromDate());
							pfReportForWorker.setSecondweekpensionfund(0.00);
							pfReportForWorker.setSecondweekpfemployee(0.00);
							pfReportForWorker.setSecondweekpfemployer(0.00);
							pfReportForWorker.setSecondweektoDate(payslipListEmpWise.get(0).getToDate());
							pfReportForWorker.setSecondweekwages(0.00);
							
							
							pfReportForWorker.setThirdweekfromDate(payslipListEmpWise.get(0).getFromDate());
							pfReportForWorker.setThirdweekpensionfund(0.00);
							pfReportForWorker.setThirdweekpfemployee(0.00);
							pfReportForWorker.setThirdweekpfemployer(0.00);
							pfReportForWorker.setThirdweektoDate(payslipListEmpWise.get(0).getToDate());
							pfReportForWorker.setThirdweekwages(0.00);
							
							pfReportForWorker.setFourweekfromDate(payslipListEmpWise.get(0).getFromDate());
							pfReportForWorker.setFourweekpensionfund(0.00);
							pfReportForWorker.setFourweekpfemployee(0.00);
							pfReportForWorker.setFourweekpfemployer(0.00);
							pfReportForWorker.setFourweektoDate(payslipListEmpWise.get(0).getToDate());
							pfReportForWorker.setFourweekwages(0.00);
							
							pfReportForWorker.setFifthweekfromDate(payslipListEmpWise.get(0).getFromDate());
							pfReportForWorker.setFifthweekpensionfund(0.00);
							pfReportForWorker.setFifthweekpfemployee(0.00);
							pfReportForWorker.setFifthweekpfemployer(0.00);
							pfReportForWorker.setFifthweektoDate(payslipListEmpWise.get(0).getToDate());
							pfReportForWorker.setFifthweekwages(0.00);
							
						}
						
						pfReportForWorker.setFirstweekfromDate(firstWeekFromDate);
						pfReportForWorker.setFirstweekpensionfund(firstWeekPensionFund);
						pfReportForWorker.setFirstweekpfemployee(fifthWeekPfEmployee);
						pfReportForWorker.setFirstweekpfemployer(firstWeekPfEmployer);
						pfReportForWorker.setFirstweektoDate(firstWeekToDate);
						pfReportForWorker.setFirstweekwages(firstWeekWages);
						
						pfReportForWorker.setSecondweekfromDate(secondWeekFromDate);
						pfReportForWorker.setSecondweekpensionfund(secondWeekPensionFund);
						pfReportForWorker.setSecondweekpfemployee(secondWeekPfEmployee);
						pfReportForWorker.setSecondweekpfemployer(secondWeekPfEmployer);
						pfReportForWorker.setSecondweektoDate(secondWeekToDate);
						pfReportForWorker.setSecondweekwages(secondWeekWages);
						
						
						pfReportForWorker.setThirdweekfromDate(thirdWeekFromDate);
						pfReportForWorker.setThirdweekpensionfund(thirdWeekPensionFund);
						pfReportForWorker.setThirdweekpfemployee(thirdWeekPfEmployee);
						pfReportForWorker.setThirdweekpfemployer(thirdWeekPfEmployer);
						pfReportForWorker.setThirdweektoDate(thirdWeekToDate);
						pfReportForWorker.setThirdweekwages(thirdWeekWages);
					
					
						
						pfReportForWorker.setFourweekfromDate(fourthWeekFromDate);
						pfReportForWorker.setFourweekpensionfund(fourthWeekPensionFund);
						pfReportForWorker.setFourweekpfemployee(fourthWeekPfEmployee);
						pfReportForWorker.setFourweekpfemployer(fourthWeekPfEmployer);
						pfReportForWorker.setFourweektoDate(fourthWeekToDate);
						pfReportForWorker.setFourweekwages(fourthWeekWages);
					
					
						
						pfReportForWorker.setFifthweekfromDate(fifthWeekFromDate);
						pfReportForWorker.setFifthweekpensionfund(fifthWeekPensionFund);
						pfReportForWorker.setFifthweekpfemployee(fifthWeekPfEmployee);
						pfReportForWorker.setFifthweekpfemployer(fifthWeekPfEmployer);
						pfReportForWorker.setFifthweektoDate(fifthWeekToDate);
						pfReportForWorker.setFifthweekwages(fifthWeekWages);
					
						
						totalwages = totalwages + payslipListEmpWise.get(i).getGrossearning() ;
						totalpfemployee=payslipListEmpWise.get(0).getPfcontribution() + totalpfemployee;
						totalpfemployer=(payslipListEmpWise.get(i).getBasicsalary()*0.0367)+totalpfemployer;
						totalpensionfund=(payslipListEmpWise.get(i).getBasicsalary()*0.0833)+totalpensionfund;
						
						
					}
				}
				
				
				
				pfReportForWorker.setTotalwages(totalwages);
				pfReportForWorker.setTotalpensionfund(totalpensionfund);
				pfReportForWorker.setTotalpfemployee(totalpfemployee);
				pfReportForWorker.setTotalpfemployer(totalpfemployer);
				
				
			
				pfReportForWorkerDTO.add(pfReportForWorker);
			
			}
		}
		
			/*
			 * for(PfReportForWorkerDTO pf : pfReportForWorkerDTO) {
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
			return pfReportForWorkerDTO;
		}
		
		return pfReportForWorkerDTO;
	}
}
