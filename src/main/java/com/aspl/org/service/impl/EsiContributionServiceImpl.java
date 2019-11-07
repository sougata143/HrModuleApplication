package com.aspl.org.service.impl;

import java.text.DecimalFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.aspl.org.dto.EsiContributionDTO;
import com.aspl.org.dto.EsiContributionListDTO;
import com.aspl.org.entity.EmployeeMaster;
import com.aspl.org.entity.Esientry;
import com.aspl.org.entity.Payslip;
import com.aspl.org.repository.EmployeeMasterRepo;
import com.aspl.org.repository.EsiMasterRepo;
import com.aspl.org.repository.PayslipRepo;
import com.aspl.org.service.EsiContributionService;
import com.aspl.org.service.UtilService;


@Service
@Transactional
public class EsiContributionServiceImpl implements EsiContributionService{

	@Autowired
	EsiMasterRepo esiRepo;
	
	@Autowired
	PayslipRepo payslipRepo;
	
	@Autowired
	EmployeeMasterRepo empRepo;
	@Autowired EsiContributionService esicontributionService;
	
	@Autowired UtilService utilService;
	
	@Override
	public EsiContributionListDTO  getEsiContributionReport(String foremployee,String month) throws ParseException {
		List<EsiContributionDTO> contributionDTOList = new ArrayList<>();          //1st dto
		
		EsiContributionListDTO esiContributionListDTO=new EsiContributionListDTO();   //total dto
		//List<Payslip> payslip = payslipRepo.payslipMonth(month);
      List<Payslip> payslip=new ArrayList<>();
	List<Esientry> esiSpacial=new ArrayList<>();	
	  try {
			
		if(foremployee.equalsIgnoreCase("Staff")) 
			 payslip = payslipRepo.findByForemployeeAndPayslipMonth(foremployee,month);
		
		
		 if(foremployee.equalsIgnoreCase("Worker")) 
			 payslip = payslipRepo.findByForemployeeAndPayslipMonth("House Rent",month);
		 
		 
		 String monthno=utilService.GetIntmonthFromStringmonth(month);
			System.out.println(monthno);
			List<EmployeeMaster> empEorSpEsiEntry = empRepo.findAll();
			
		for(EmployeeMaster empmastloop:empEorSpEsiEntry)
		{
			esiSpacial = esiRepo.findByempCode(empmastloop.getEmpcode(),Integer.parseInt(monthno));
			if(esiSpacial.size() > 0)
			{
				EsiContributionDTO contributionDTO = new EsiContributionDTO();
					  contributionDTO.setVoucherDate(esiSpacial.get(0).getVoucherDate());
					  contributionDTO.setEmpName(esiSpacial.get(0).getEmpName());
					  contributionDTO.setEsino(esiSpacial.get(0).getEsiNo());
					  contributionDTO.setEsicontribution(esiSpacial.get(0).getContribution());
					  contributionDTO.setAmount(esiSpacial.get(0).getAmount());
					  contributionDTO.setDaysforPay(esiSpacial.get(0).getNoofDays());
					  contributionDTOList.add(contributionDTO);
			}
				
		}
		
		
		
		DecimalFormat df = new DecimalFormat("#.##");
//		String totalPoQntSA = df.format(totalPoQnt);
		
		Integer totaldaysforPay=0;
		Double totalesicontribution=0.0;
		Double totalamount=0.0;
		
		for(Payslip ps : payslip) {
			EsiContributionDTO contributionDTO = new EsiContributionDTO();
			
			
			
			List<EmployeeMaster> empO = empRepo.findByempcode(ps.getEmployeeCode());
			EmployeeMaster emp = new EmployeeMaster();
			if(!empO.isEmpty()) {
				emp = empO.get(0);
			}
			
			
			
			
			
			//Date date = new SimpleDateFormat("MMMM").parse(month);
			
			//System.out.println(date);
			//Calendar cal = Calendar.getInstance();
			//cal.setTime(date);
			//Integer monthInt = cal.get(Calendar.MONTH)+1;
			
			//Esientry esiEnty = esiRepo.findByempCode(emp.getEmpcode(),monthInt);
			
			
			
			totaldaysforPay=totaldaysforPay+ps.getDays_for_pay();
			totalesicontribution=totalesicontribution+ps.getEsicontribution();
			totalamount=totalamount+ps.getNetamt();
			
			contributionDTO.setDaysforPay(ps.getDays_for_pay());
            if(ps.getEmpname()!=null)
			contributionDTO.setEmpName(ps.getEmpname());
			contributionDTO.setEsicontribution(Double.valueOf(df.format(ps.getEsicontribution())));
			contributionDTO.setEsino(emp.getEsino());
			contributionDTO.setAmount(Double.valueOf(df.format(ps.getNetamt())));
			
			contributionDTOList.add(contributionDTO);
			}
		
		
			/*
			 * for(EsiContributionDTO esidto: contributionDTOList) {
			 * esidto.setEmpName(esidto); }
			 */
		
		
		esiContributionListDTO.setEsiContributionDTOList(contributionDTOList);
		esiContributionListDTO.setTotaldaysforPay(totaldaysforPay);
		esiContributionListDTO.setTotalamount(Double.valueOf(df.format(totalamount)));
		esiContributionListDTO.setTotalesicontribution(Double.valueOf(df.format(totalesicontribution)));

		}catch(Exception e) {
			e.printStackTrace();
		}
		return  esiContributionListDTO;
	}

}	

	

	
		




	
	


