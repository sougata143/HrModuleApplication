package com.aspl.org.service.impl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.aspl.org.dto.PayslipDTO;
import com.aspl.org.entity.AdvancePaymentVoucher;
import com.aspl.org.entity.AttendaceGenerator;
import com.aspl.org.entity.Attendance;
import com.aspl.org.entity.CanteenVoucherEntry;
import com.aspl.org.entity.Capfile;
import com.aspl.org.entity.DepartmentMaster;
import com.aspl.org.entity.DesignationMaster;
import com.aspl.org.entity.EmployeeMaster;
import com.aspl.org.entity.Esientry;
import com.aspl.org.entity.HolidayMaster;
import com.aspl.org.entity.HouseRentRecoveryEntry;
import com.aspl.org.entity.Leaveapplication;
import com.aspl.org.entity.Payslip;
import com.aspl.org.entity.PfvoucherEntry;
import com.aspl.org.entity.ProffesionalTaxslabMst;
import com.aspl.org.repository.AttendanceRepo;
import com.aspl.org.repository.EmployeeMasterRepo;
import com.aspl.org.repository.PayslipRepo;
import com.aspl.org.service.AdvSalaryService;
import com.aspl.org.service.AttendanceGeneratorService;
import com.aspl.org.service.AttendanceService;
import com.aspl.org.service.CanteenVouMasterService;
import com.aspl.org.service.CapfileService;
import com.aspl.org.service.DepartmentMasterService;
import com.aspl.org.service.DesignationMasterService;
import com.aspl.org.service.EmployeeMasterService;
import com.aspl.org.service.EsimasterService;
import com.aspl.org.service.HolidaymasterService;
import com.aspl.org.service.HouseRentService;
import com.aspl.org.service.IncomeTaxMasterService;
import com.aspl.org.service.LeaveApplicationService;
import com.aspl.org.service.PayslipService;
import com.aspl.org.service.PfmasterService;
import com.aspl.org.service.ProfessionalTaxMasterService;
import com.aspl.org.service.UtilService;
import com.aspl.org.utils.GlobalDefine_;
import com.aspl.org.utils.Utilforhr;
@Service
@Transactional
public class PayslipServiceImpl implements PayslipService{

	
	@Autowired AttendanceRepo attendanceRepo;
	@Autowired EmployeeMasterService employeemasterService;
	@Autowired LeaveApplicationService leaveApplicationService;
	@Autowired DepartmentMasterService departmentMasterService; 
	@Autowired DesignationMasterService designationMasterService;
	@Autowired AdvSalaryService advSalaryService; 
	@Autowired PfmasterService pfmasterService; 
	@Autowired EsimasterService esimasterService;
	@Autowired IncomeTaxMasterService incomeTaxMasterService;
	@Autowired CanteenVouMasterService canteenVouMasterService;
	@Autowired HouseRentService houseRentService;
	@Autowired ProfessionalTaxMasterService professionalTaxMasterService;
	@Autowired PayslipRepo payslipRepo  ;
	@Autowired HolidaymasterService holidaymasterService; 
	@Autowired UtilService utilService;
	
	@Autowired CapfileService capfileService;
	@Autowired AttendanceGeneratorService attendanceGeneratorService;
	@Autowired AttendanceService attendanceService;
	@Autowired EmployeeMasterRepo employeeMasterRepo;
	@Autowired PayslipService payslipService;
	
	/** @param employeeType
	 * @param from_date
	 * @param to_date
	 * This method is used for generating the payslip class for Payslip generation. this method take employeeType as a param, fromDate as a param, and toDate as a param and return the payslip and save.
	 * In this method using employeeType , fromDate and toDate for filtering the advance payment voucher table and create a list of the data and using the loop get one by one data and set 
	 * in payslip and return it and set all payslip related data set into the payslip table with all calculation.
	 * 
	 * @return payslip
	 */
	
	@Override
	public Payslip payslipgeneration(String employeeType, String from_date, String to_date) {
		
		Payslip payslip=null;
		try {
		
		Calendar cal = Calendar.getInstance();
		
		Date from_date1 = new SimpleDateFormat("dd-MM-yyyy").parse(from_date);
		Date to_date1 = new SimpleDateFormat("dd-MM-yyyy").parse(to_date);
		String worker = "Worker";
		String staff = "Staff";
		System.out.println(to_date1);
		String blank="";
		
		
		///List<Payslip> attendancelist=attendanceRepo.Attendancebydateempcode(employeeType, from_date1, to_date1);
		
		
		List<PayslipDTO> reportLines = payslipService.getPayslipdatewise(employeeType, from_date, to_date );
		
		if(reportLines==null || reportLines.isEmpty())
		{
		
		List<Attendance> attendancelist=attendanceRepo.Attendancebydateempcode(employeeType, from_date1, to_date1);
		
	System.out.println(attendancelist);
		
		for(Attendance attlist: attendancelist)
		{
			EmployeeMaster employeemasterbyempcode=employeemasterService.findbyidempcoder(attlist.getEmp_code());
			
			DepartmentMaster departmentMaster=departmentMasterService.findbyiddepartmentmaster(employeemasterbyempcode.getDepartment()).get();
			
			DesignationMaster designationMaster=designationMasterService.findbyiddesignationmaster(employeemasterbyempcode.getDesignation()).get();
			
			PfvoucherEntry pfvoucherEntry=pfmasterService.getByempcode(attlist.getEmp_code());
			Esientry esicon=esimasterService.getByempCode(attlist.getEmp_code());
			
			
			List<AdvancePaymentVoucher> salaryAdv=advSalaryService.findByempcode(attlist.getEmp_code());
			
			Date date1;
			
				date1 = new SimpleDateFormat("dd-MM-yyyy").parse(String.valueOf(from_date));
				//cal.setTime(date1);
				LocalDate localDate = date1.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
				int month = localDate.getMonthValue();
			
				
				String monthname=Utilforhr.getMonthForInt(month - 1);
				
				/*
				 * String strDateFormat = "MMMM"; SimpleDateFormat sdf = new
				 * SimpleDateFormat(strDateFormat); sdf = new SimpleDateFormat(strDateFormat);
				 * String monthname=sdf.format(to_date);
				 */
				
				List<HolidayMaster> getallHolidaydatebetween= holidaymasterService.getallHolidaydatebetween(from_date1, to_date1); 
				//List<Attendance> attendancelist=attendanceRepo.Attendancebydateempcode(employeeType, from_date1, to_date1);	
				Integer totalholidaycount=0;
				for(HolidayMaster holidaycountdatewise: getallHolidaydatebetween)
				{
					totalholidaycount+=holidaycountdatewise.getTotalholidaydate();
				}
				
				
				//if(employeeType.equals(staff))
				//{
					//Map<String, Integer> holidaymaster=holidaymasterService.gettotalholidaymonthwise(monthname);
				//}
			
			
			CanteenVoucherEntry canVouEntry=canteenVouMasterService.findByempCodeandmonth(attlist.getEmp_code() , month);
			
			HouseRentRecoveryEntry houseRentRecoveryEntry=houseRentService.findByempCodeandhouseRentstatus(attlist.getEmp_code(), "Active");
				
			
			/*
			 * List<Leaveapplication> leaveapplication=
			 * leaveApplicationService.leaveapplicationdateandempcodewise(attlist.
			 * getEmp_code(), from_date, to_date, "Yes");
			 */
			
			
			
			
			payslip=new Payslip();
			payslip.setEmployeeCode(employeemasterbyempcode.getEmpcode());
			payslip.setEmpname(employeemasterbyempcode.getEmpName());
			payslip.setEmpCardNo(employeemasterbyempcode.getIdcardno().toString());
			
			payslip.setTotal_working_day(attlist.getTotal_working_day());
			
			int leavesum=0;
			List<Leaveapplication> leaveapplication=
					leaveApplicationService.leaveapplicationdateandempcodewise(attlist.getEmp_code(), from_date1, to_date1, "Yes");
			if(leaveapplication != null)
			{
			for(int i=0; i<=leaveapplication.size(); i++)
			{
			  
			  int leavecount=leaveapplication.get(i).getNoofdays();
			  leavesum+=leavecount;
			System.out.println("In loop :+++++"+leavesum);
			}
			}
			System.out.println("outer Loop +++++"+leavesum);
			
			
			
			
			
			payslip.setFromDate(from_date1);
			payslip.setToDate(to_date1);
			payslip.setTotalleave(leavesum);
			payslip.setTotal_working_day(attlist.getTotal_working_day());
			payslip.setTotal_absent_day(attlist.getTotal_absent_day());
			payslip.setOtHrs(attlist.getTotal_ot_hrs());
			payslip.setDept(departmentMaster.getDepartmentname());
			payslip.setDesignation(designationMaster.getDesignation());
			payslip.setPayDate(new Date());
			payslip.setEmpLocation(employeemasterbyempcode.getCurrentAdd());
			
			Integer daysForPay=0;
			
			if(getallHolidaydatebetween!= null || getallHolidaydatebetween.isEmpty())
			{
			//payslip.setHoliday(holidaymaster.get("total_no_ofdays"));
				//holidaymaster.get("total_no_ofdays")
			payslip.setHoliday(totalholidaycount);
			daysForPay= ( attlist.getTotal_working_day()+leavesum+ totalholidaycount) - attlist.getTotal_absent_day() ;
			}else
			{
				payslip.setHoliday(0);
				daysForPay=( attlist.getTotal_working_day()+leavesum+0 ) - attlist.getTotal_absent_day();
			}
			
			payslip.setPfNo(employeemasterbyempcode.getPfacno());
			
			payslip.setBasicsalary(employeemasterbyempcode.getBasic());
			Double empbasicsalary=employeemasterbyempcode.getBasic();
			
			
			//Double staffhouserent=(empbasicsalary*(10/100) );
			
			Double houserent=empbasicsalary * (employeemasterbyempcode.getHra() / 100);
			
			payslip.setNormalwagesearned(  (daysForPay)*(employeemasterbyempcode.getBasic())   );
			
			Double normalwagesforworkers=(  (daysForPay)*(employeemasterbyempcode.getBasic())   );
			payslip.setOtamount( (2*attlist.getTotal_ot_hrs())*(employeemasterbyempcode.getBasic()/8) );
			
			Double otamountforworkers=( (2*attlist.getTotal_ot_hrs())*(employeemasterbyempcode.getBasic()/8) );
			Double Totalearning= (employeemasterbyempcode.getBasic()) + ((daysForPay)*(employeemasterbyempcode.getBasic()) ) + ( (2*attlist.getTotal_ot_hrs())*(employeemasterbyempcode.getBasic()/8)) ;
			
			payslip.setGrossearning(Totalearning);
			
			
				/*-----Start PF Calculation-*/
			
			Double pfconemployee = 0.00;
			if(employeeType.equals(worker))
			{
			payslip.setPfcontribution(normalwagesforworkers * (employeemasterbyempcode.getPf() / 100) );
			
			pfconemployee=(normalwagesforworkers * (employeemasterbyempcode.getPf() / 100) );
			}
			else if (employeeType.equals(staff))
			{
				payslip.setPfcontribution(empbasicsalary * (employeemasterbyempcode.getPf() / 100) );
				
				pfconemployee=(empbasicsalary * (employeemasterbyempcode.getPf() / 100) );
				
			}else
			{
				payslip.setPfcontribution(normalwagesforworkers * (employeemasterbyempcode.getPf() / 100) );
				
				pfconemployee=(normalwagesforworkers * (employeemasterbyempcode.getPf() / 100) );
			}
			
			/*-----End PF Calculation-*/
			
			/*//payslip.setEsicontribution(esicontribution);*/
			
			
			Double basicsalary=employeemasterbyempcode.getBasic();
			
			//IncomeTaxslabMst incomeTaxslabMs=incomeTaxMasterService.findByincomeminmaxamt(basicsalary);
			
			ProffesionalTaxslabMst proffesionalTaxslabMst=professionalTaxMasterService.findByproffesionalminmaxamt(basicsalary);
			
			payslip.setProfTax(proffesionalTaxslabMst.getRate());
			
			Double canteenchangeemp=null;
			if(canVouEntry!=null)
			{
				payslip.setCanteenCharge(canVouEntry.getCharge());
				canteenchangeemp=canVouEntry.getCharge();
			}else
			{
				payslip.setCanteenCharge(0.00);
				canteenchangeemp=0.00;
			}
			
			
			
			//Double canteenchangeemp=canVouEntry.getCharge();
			
			Double advancepay=0.00;
			for(AdvancePaymentVoucher adpay: salaryAdv)
			{
				if (adpay.getAdvamount()==adpay.getPayamount())
				{
					advancepay=0.00;
										
				}else
				{
					advancepay+=adpay.getInstallmentamt();
					
					
					
				}
				adpay.setPayamount(adpay.getPayamount() + adpay.getInstallmentamt());
				advSalaryService.AdvancePaymentVouchersave(adpay);
				
				
			}
			payslip.setSalaryAdv(advancepay);
			Double advsalaryforemp=advancepay;
			
			
			
			
			
			
			
			
			
			if(month==6 || month==12)
			{
				payslip.setWelFund(3.00);
			}else
			{
				payslip.setWelFund(0.00);
			}
			
			Double houseRentRecoveryEntryresult=null;
			if(houseRentRecoveryEntry!=null)
			{
			payslip.setHrRecovary(houseRentRecoveryEntry.getRatepermonth());
			houseRentRecoveryEntryresult=houseRentRecoveryEntry.getRatepermonth();
			}else
			{
				payslip.setHrRecovary(0.00);
				houseRentRecoveryEntryresult=0.00;
			}
			
			
			payslip.setBankAcNo(employeemasterbyempcode.getBankacno());
			payslip.setBankName(employeemasterbyempcode.getBankname());
			payslip.setBankifsccode(employeemasterbyempcode.getIfsccode());
			
			payslip.setCreatedDate(new Date());
			payslip.setDateofjoining(employeemasterbyempcode.getDateofjoining());
			payslip.setDays_for_pay(daysForPay);
			payslip.setForemployee(attlist.getEmployeeType());
			payslip.setEsiNo(employeemasterbyempcode.getEsino());
			
			payslip.setFineAmount(attlist.getFine_amt());
			
			Double fineamount=attlist.getFine_amt();
			payslip.setPayslipMonth(monthname);
			payslip.setPayslipYear(LocalDate.now().getYear());
			
			
			
			
			//String houserent = "Worker HouseRent";
			
			if(employeeType.equals(worker))
			{
				
				
				payslip.setGenerationfor("Worker Payslip");
				payslip.setHouserentforworker(0.00);
				
				Double empesicontri=(empbasicsalary * (employeemasterbyempcode.getEsi() / 100) );
				payslip.setEsicontribution((empbasicsalary * (employeemasterbyempcode.getEsi() / 100) ));
				
				
				payslip.setGrossearning(normalwagesforworkers+otamountforworkers);
				
				Double Grossearning=(normalwagesforworkers+otamountforworkers);
				
				payslip.setGrossdeduction(advsalaryforemp + pfconemployee + fineamount);
				
				Double grossdeduction=(advsalaryforemp + pfconemployee + fineamount);
				
				payslip.setNetamt(Grossearning - grossdeduction);
				
			}else if (employeeType.equals(staff))
			{
				payslip.setHouserentforworker(houserent);
				payslip.setGenerationfor("Staff Payslip");
				
				payslip.setGrossearning(empbasicsalary+houserent+otamountforworkers);
				Double staffgrossearning=(empbasicsalary+houserent+otamountforworkers);
				
				
				Double empesicontri=(staffgrossearning * (employeemasterbyempcode.getEsi() / 100) );
				payslip.setEsicontribution((staffgrossearning * (employeemasterbyempcode.getEsi() / 100) ));
				
				
				Double grossdeduct=0.00;
				
				if(month==6 || month==12)
				{
					grossdeduct=(empesicontri+advsalaryforemp+pfconemployee+(proffesionalTaxslabMst.getRate()) + (canteenchangeemp) + 3.00 + houseRentRecoveryEntryresult + fineamount);
					payslip.setGrossdeduction(empesicontri+advsalaryforemp+pfconemployee+(proffesionalTaxslabMst.getRate()) + (canteenchangeemp) + 3.00 + houseRentRecoveryEntryresult + fineamount);
				}else
				{
					grossdeduct = (empesicontri+advsalaryforemp+pfconemployee+(proffesionalTaxslabMst.getRate()) + (canteenchangeemp) + 0.00 + houseRentRecoveryEntryresult + fineamount) ;
					payslip.setGrossdeduction(empesicontri+advsalaryforemp+pfconemployee+(proffesionalTaxslabMst.getRate()) + (canteenchangeemp) + 0.00 + houseRentRecoveryEntryresult + fineamount) ;
				}
				Double checkgrossdeduct=grossdeduct;
				
				payslip.setNetamt(staffgrossearning - checkgrossdeduct);
				
				
				
				
			}else
			{
				payslip.setGenerationfor("Worker HouseRent");
				
				
				payslip.setHouserentforworker((normalwagesforworkers * (employeemasterbyempcode.getHra() / 100))) ;
				
				Double houserentwhr=((normalwagesforworkers * (employeemasterbyempcode.getHra() / 100)));
				
				payslip.setTotalforesiworkers(houserentwhr + normalwagesforworkers);
				
				Double workerhouserentesi= ( (houserentwhr + normalwagesforworkers) * (employeemasterbyempcode.getEsi() / 100) );
				payslip.setEsicontribution(workerhouserentesi);
				
				Double grossdeduct=0.00;
				
				if(month==6 || month==12)
				{
					
					grossdeduct=(  workerhouserentesi + canteenchangeemp + (proffesionalTaxslabMst.getRate()) + 3.00 + (houseRentRecoveryEntryresult) + fineamount);
					payslip.setGrossdeduction(  workerhouserentesi + canteenchangeemp + (proffesionalTaxslabMst.getRate()) + 3.00 + (houseRentRecoveryEntryresult) + fineamount);
					
					
				}else
				{
					grossdeduct=(  workerhouserentesi + canteenchangeemp + (proffesionalTaxslabMst.getRate()) + 0.00 + (houseRentRecoveryEntryresult) + fineamount);
					payslip.setGrossdeduction(  workerhouserentesi + canteenchangeemp + (proffesionalTaxslabMst.getRate()) + 0.00 + (houseRentRecoveryEntryresult)  + fineamount);
					
					
				}
				
				Double checkgrossdeduct=grossdeduct;
				
				payslip.setNetamt(houserentwhr - checkgrossdeduct);
				
			}
			
			//payslip.setCanteenCharge(canteenCharge);
			
			payslipRepo.save(payslip);
			
		}
		
		
		 
		
		
	}else
	{
		System.out.println("This PAyslip Details Already Generated ");
	}
		
		
		
		} catch (ParseException e) {
			e.printStackTrace();
			return payslip;
		}
		return payslip;
		  
		
	}






	/**
	 * This method is used for the show all details of the payslip table and its return the full data with table
	 * 
	 * @return payslip list
	 */
	@Override
	public List<Payslip> getallPaysliplist() {
		// TODO Auto-generated method stub
		return payslipRepo.findAll();
	}


	/**
	 * @param from_date,
	 * @param to_date
	 * 
	 * This method is used for the show all details of the payslip respect to the given two date from_date nad to_date
	 * 
	 * @return paysliplist
	 */
	@Override
	public List<Payslip> findbyPayslip(String from_date, String to_date) throws ParseException {
		// TODO Auto-generated method stub
		Date from_dateD = new SimpleDateFormat("yyyy-MM-dd").parse(from_date);
		Date to_dateD = new SimpleDateFormat("yyyy-MM-dd").parse(to_date);
		return payslipRepo.findByFromDateAndToDate(from_dateD, to_dateD);
	}


	/**
	 * @param from_date,
	 * @param to_date
	 * @param Foremployee
	 * 
	 * This method is used for the show all details of the payslip respect to the given two date
	 * which greter than from_date and less than to_date
	 * 
	 * @return paysliplist
	 */
	@Override
	public  List<PayslipDTO> getPayslipdatewise(String Foremployee, String fromDate, String toDate) {
		// TODO Auto-generated method stub
		
		Date from_date1;
		/* List<PayslipDTO> payslipDTO; */
		List<PayslipDTO> payslipDTO = new ArrayList<>();
		try {
			from_date1 = new SimpleDateFormat("dd-MM-yyyy").parse(fromDate);
			Date to_date1 = new SimpleDateFormat("dd-MM-yyyy").parse(toDate);
		
		
		List<Payslip> payslip = payslipRepo.findByForemployeeAndFromDateGreaterThanEqualAndToDateLessThanEqual(Foremployee,from_date1,to_date1);
		
		for(Payslip ps : payslip) {
			PayslipDTO dto = new PayslipDTO();
			
			dto.setAmountinwords(ps.getAmountinwords());
			dto.setBankAcNo(ps.getBankAcNo());
			dto.setPayslipId(ps.getPayslipId());
			dto.setEmployeeCode(ps.getEmployeeCode());
			dto.setEmpname(ps.getEmpname());
			dto.setEmpCardNo(ps.getEmpCardNo());
			dto.setBankName(ps.getBankName());
			dto.setPfNo(ps.getPfNo());
			dto.setEsiNo(ps.getEsiNo());
			dto.setHoliday(ps.getHoliday());
			   dto.setEmpLocation(ps.getEmpLocation());
			   dto.setTotal_working_day(ps.getTotal_working_day());
			   dto.setTotal_absent_day(ps.getTotal_absent_day());
			   dto.setTotalleave(ps.getTotalleave());
			   dto.setOtHrs(ps.getOtHrs());
			   dto.setDays_for_pay(ps.getDays_for_pay());
			   dto.setDept(ps.getDept());
			   dto.setDesignation(ps.getDesignation());
			   
			   if(ps.getBasicsalary()!=null)
				   dto.setBasicsalary(utilService.RoundOffDouble(ps.getBasicsalary(), GlobalDefine_.decimal2));
			   else
				   dto.setBasicsalary(utilService.RoundOffDouble(0.0, GlobalDefine_.decimal2));
			   
			   if(ps.getNormalwagesearned()!=null)
				   dto.setNormalwagesearned(utilService.RoundOffDouble(ps.getNormalwagesearned(), GlobalDefine_.decimal2));
			   else
				   dto.setNormalwagesearned(utilService.RoundOffDouble(0.0, GlobalDefine_.decimal2));
			   
			   if(ps.getEarningRateperday()!=null)
				   dto.setEarningRateperday(utilService.RoundOffDouble(ps.getEarningRateperday(), GlobalDefine_.decimal2));
			   else
				   dto.setEarningRateperday(utilService.RoundOffDouble(0.0, GlobalDefine_.decimal2));
			   
			   if(ps.getOtamount()!=null)
				   dto.setOtamount(utilService.RoundOffDouble(ps.getOtamount(), GlobalDefine_.decimal2));
			   else
				   dto.setOtamount(utilService.RoundOffDouble(0.0, GlobalDefine_.decimal2));
			   
			   if(ps.getGrossearning()!=null)
				   dto.setGrossearning(utilService.RoundOffDouble(ps.getGrossearning(), GlobalDefine_.decimal2));
			   else
				   dto.setGrossearning(utilService.RoundOffDouble(0.0, GlobalDefine_.decimal2));
			   
			   if(ps.getPfcontribution()!=null)
				   dto.setPfcontribution(utilService.RoundOffDouble(ps.getPfcontribution(), GlobalDefine_.decimal2));
			   else
				   dto.setPfcontribution(utilService.RoundOffDouble(0.0, GlobalDefine_.decimal2));
			   
			   if(ps.getEsicontribution()!=null)
				   dto.setEsicontribution(utilService.RoundOffDouble(ps.getEsicontribution(), GlobalDefine_.decimal2));
			   else
				   dto.setEsicontribution(utilService.RoundOffDouble(0.0, GlobalDefine_.decimal2));
			   
			   if(ps.getIncTax()!=null)
				   dto.setIncTax(utilService.RoundOffDouble(ps.getIncTax(), GlobalDefine_.decimal2));
			   else
				   dto.setIncTax(utilService.RoundOffDouble(0.0, GlobalDefine_.decimal2));
			   
			   if(ps.getCanteenCharge()!=null)
				   dto.setCanteenCharge(utilService.RoundOffDouble(ps.getCanteenCharge(), GlobalDefine_.decimal2));
			   else
				   dto.setCanteenCharge(utilService.RoundOffDouble(0.0, GlobalDefine_.decimal2));
			   
			   if(ps.getWelFund()!=null)
				   dto.setWelFund(utilService.RoundOffDouble(ps.getWelFund(), GlobalDefine_.decimal2));
			   else
				   dto.setWelFund(utilService.RoundOffDouble(0.0, GlobalDefine_.decimal2));
			   
			   if(ps.getHrRecovary()!=null)
				   dto.setHrRecovary(utilService.RoundOffDouble(ps.getHrRecovary(), GlobalDefine_.decimal2));
			   else
				   dto.setHrRecovary(utilService.RoundOffDouble(0.0, GlobalDefine_.decimal2));
			   
			   if(ps.getFineAmount()!=null)
				   dto.setFineAmount(utilService.RoundOffDouble(ps.getFineAmount(), GlobalDefine_.decimal2));
			   else
				   dto.setFineAmount(utilService.RoundOffDouble(0.0, GlobalDefine_.decimal2));
			   
			   if(ps.getGrossdeduction()!=null)
				   dto.setGrossdeduction(utilService.RoundOffDouble(ps.getGrossdeduction(), GlobalDefine_.decimal0));
			   else
				   dto.setGrossdeduction(utilService.RoundOffDouble(0.0, GlobalDefine_.decimal0));
			   
			   if(ps.getNetamt()!=null)
				   dto.setNetamt(utilService.RoundOffDouble(ps.getNetamt(), GlobalDefine_.decimal0));
			   else
				   dto.setNetamt(utilService.RoundOffDouble(0.0, GlobalDefine_.decimal0));
			   
			   dto.setCreatedDate(ps.getCreatedDate());
			   dto.setModifyedDate(ps.getModifyedDate());
			   dto.setPayDate(ps.getPayDate());
			   dto.setForemployee(ps.getForemployee());
			   dto.setFromDate(ps.getFromDate());
			   dto.setToDate(ps.getToDate());
			   dto.setPayslipMonth(ps.getPayslipMonth());
			   dto.setPayslipYear(ps.getPayslipYear());
			   
			   if(ps.getHouserentforworker()!=null)
				   dto.setHouserentforworker(utilService.RoundOffDouble(ps.getHouserentforworker(), GlobalDefine_.decimal0));
			   else
				   dto.setHouserentforworker(utilService.RoundOffDouble(0.0, GlobalDefine_.decimal0));
			   
			   if(ps.getTotalforesiworkers()!=null)
				   dto.setTotalforesiworkers(utilService.RoundOffDouble(ps.getTotalforesiworkers(), GlobalDefine_.decimal0));
			   else
				   dto.setTotalforesiworkers(utilService.RoundOffDouble(0.0, GlobalDefine_.decimal0));
			   
			   dto.setDateofjoining(ps.getDateofjoining());
			   
			   if(ps.getSalaryAdv()!=null)
				   dto.setSalaryAdv(utilService.RoundOffDouble(ps.getSalaryAdv(), GlobalDefine_.decimal0));
			   else
				   dto.setSalaryAdv(utilService.RoundOffDouble(0.0, GlobalDefine_.decimal0));
			   
			   if(ps.getProfTax()!=null)
				   dto.setProfTax(utilService.RoundOffDouble(ps.getProfTax(), GlobalDefine_.decimal2));
			   else
				   dto.setProfTax(utilService.RoundOffDouble(0.0, GlobalDefine_.decimal2));
		    
			payslipDTO.add(dto);
		}
		} catch (ParseException e) {
			e.printStackTrace();
			return payslipDTO;
		}
		
		System.out.println(payslipDTO);
		
		return payslipDTO;
	}







	/**
	 * 
	 * This method is used for the save all data into the payslip table
	 * 
	 * @return payslip save
	 */
	@Override
	public Payslip payslipsave(Payslip payslip) {
		// TODO Auto-generated method stub
		return payslipRepo.save(payslip);
	}

	
	
	/**
	 * 
	 * This method is used for the extract Data from the CAP file and save into the capfile table.
	 * 
	 * @return capfile
	 */
	
	@Override
	public Payslip TestReadFile(String filepath) {

		

			String fileName = filepath;

	
			
			try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {

				   String strCurrentLine;

				   while ((strCurrentLine = br.readLine()) != null) {
					   
					    System.out.println(strCurrentLine);
				    
				    Path path = Paths.get(fileName);
				    System.out.println(Files.lines(path).count());
				    
				  // for(int i=0; i<Files.lines(path).count(); i++)
				  //  {
				    	
				    	String Date=strCurrentLine.substring(4, 12);
				    	System.out.println(Date);
				    	String dateapp=strCurrentLine.substring(6, 8)+"-"+strCurrentLine.substring(4, 6)+"-"+strCurrentLine.substring(8, 12);
				    	System.out.println(dateapp);
				    	Date inDate=utilService.stringToDateConversion(dateapp, GlobalDefine_.dateFormat);
				    	System.out.println(inDate);
				    	String time=strCurrentLine.substring(12, 16);
				    	
				    	String indatetime=strCurrentLine.substring(6, 8)+"-"+strCurrentLine.substring(4, 6)+"-"+strCurrentLine.substring(8, 12)+" "+strCurrentLine.substring(12, 14)+":"+strCurrentLine.substring(14, 16)+":"+00;
				    	Date inDatetimecheck=utilService.stringToDateConversion(indatetime, GlobalDefine_.dateFormat3);
				    	System.out.println(inDatetimecheck);
				    	String employeeCode=strCurrentLine.substring(16, 24);
				    	System.out.println(employeeCode);
				    	
				    	Capfile capfile=new Capfile();
				    	capfile.setEmpCode(employeeCode);
				    	capfile.setInoutDatetime(inDatetimecheck);
				    	
				    	capfileService.capfilesave(capfile);
				    }
				    
				    
				  // }

				  } catch (IOException e) {
				   e.printStackTrace();
				  }
			
			return null;

		

	}



	
	
	
	/**
	 
	 * This method is used for the extract Data from the CAP file , Generate per day wise for all staff, worker 
	 * attendace details , like intime, out time, total working hrs., total working day, total absent hrs using 
	 * capfile detils. 
	 * 
	 * @return AttendaceGenerate
	 */
	
	@Override
	public void AttendaceGenerate() throws Exception
	{	
		List<EmployeeMaster> employlist=employeeMasterRepo.findAll();
		
		
		List<Capfile> caplistall=capfileService.getallCapfileEntry();
		
		for(EmployeeMaster emplist: employlist)
		{
			List<Capfile> caplistbyempcode=capfileService.findByempCode(emplist.getIdcardno());
			
			AttendaceGenerator attendancegen=new AttendaceGenerator();
			EmployeeMaster employeemastrfindbyidcardno=employeeMasterRepo.findByidcardno(emplist.getIdcardno());
			if(caplistbyempcode.size()!=0)
			{
			
				
			
			if(caplistbyempcode.size() ==2 || caplistbyempcode.size() ==3 || caplistbyempcode.size() ==4 )
			{
								
				attendancegen.setAttendaceinDatetime(caplistbyempcode.get(0).getInoutDatetime());
				attendancegen.setAttendaceoutDatetime(caplistbyempcode.get(1).getInoutDatetime());
				attendancegen.setEmp_code(caplistbyempcode.get(0).getEmpCode());
				//attendancegen.set
				attendancegen.setEmpName(employeemastrfindbyidcardno.getEmpName());
				Date d1 = null;
				Date d2 = null;
				
				
				//SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
				//String intime=utilService.dateFormatConversion(caplistbyempcode.get(0).getInoutDatetime(), GlobalDefine_.dateFormat3);
				//String outTime=utilService.dateFormatConversion(caplistbyempcode.get(1).getInoutDatetime(), GlobalDefine_.dateFormat3);
				//Date outTime=caplistbyempcode.get(1).getInoutDatetime();
				
				//d1 = format.parse(intime);
				//d2 = format.parse(outTime);
				
				d1=caplistbyempcode.get(0).getInoutDatetime();
				d2=caplistbyempcode.get(1).getInoutDatetime();
				
				long diff = d2.getTime() - d1.getTime();
				System.out.println(diff);
				
				long diffSeconds = diff / 1000 % 60;
				long diffMinutes = diff / (60 * 1000) % 60;
				long diffHours = diff / (60 * 60 * 1000) % 24;
				
				
				System.out.print(diffHours + " hours " + diffMinutes +" minutes");
				
				String difftime=diffHours+"."+diffMinutes;
				
				attendancegen.setTotal_working_hrs(Double.parseDouble(difftime));
				
				Double toworkinghrs=Double.parseDouble(difftime);
				if(toworkinghrs>0)
				{				
				attendancegen.setTotal_working_day(1);
				}else
				{
				attendancegen.setTotal_working_day(0);
				}
				attendancegen.setTotal_ot_hrs(0.00);
								
				attendancegen.setTotal_absent_day(0);
				attendancegen.setTotal_absent_hrs(0.00);
				attendancegen.setEmployeeType(emplist.getEmptype());
				
				
				
				
				
			}else if(caplistbyempcode.size() ==1)
			{
				
				attendancegen.setAttendaceinDatetime(caplistbyempcode.get(0).getInoutDatetime());
				attendancegen.setAttendaceoutDatetime(utilService.stringToDateConversion("1999-01-01 00:00:00", GlobalDefine_.dateFormat3));
				attendancegen.setEmp_code(caplistbyempcode.get(0).getEmpCode());
				//attendancegen.set
				attendancegen.setEmpName(employeemastrfindbyidcardno.getEmpName());
				
				attendancegen.setTotal_working_hrs(Double.parseDouble("0.00"));
				
				Double toworkinghrs=Double.parseDouble("0.00");
				if(toworkinghrs>0)
				{				
				attendancegen.setTotal_working_day(0);
				}
				attendancegen.setTotal_working_day(0);
				attendancegen.setTotal_ot_hrs(0.00);
				
				
				
				attendancegen.setTotal_absent_day(0);
				attendancegen.setTotal_absent_hrs(0.00);
				attendancegen.setEmployeeType(emplist.getEmptype());
				
				
				
				
				
				
			}
			
			
		}else
			{
				
				attendancegen.setAttendaceinDatetime(utilService.stringToDateConversion("1999-01-01 00:00:00", GlobalDefine_.dateFormat3));
				attendancegen.setAttendaceoutDatetime(utilService.stringToDateConversion("1999-01-01 00:00:00", GlobalDefine_.dateFormat3));
				attendancegen.setEmp_code(emplist.getIdcardno());
				
				attendancegen.setEmpName(employeemastrfindbyidcardno.getEmpName());
				//attendancegen.set
				Date d1 = null;
				Date d2 = null;
			
				
				attendancegen.setTotal_working_hrs(Double.parseDouble("0.00"));
				
				Double toworkinghrs=Double.parseDouble("0.00");
				if(toworkinghrs>0)
				{				
				attendancegen.setTotal_working_day(0);
				}
				attendancegen.setTotal_working_day(0);
				attendancegen.setTotal_ot_hrs(0.00);
				
				
				
				attendancegen.setTotal_absent_day(0);
//				attendancegen.setTotal_absent_hrs(0.00);
				attendancegen.setEmployeeType(emplist.getEmptype());
				
			}
			
			
			
			attendanceGeneratorService.AttendaceGeneratorsave(attendancegen);
			
		}
		
			
		
		capfileService.truncateCapfile();
		 
	
	}
	
	
	
	
	
	
	
	

	/**
	 * @param from_date
	 * @param to_date
	 * This method is used for the generate Attendace Monthly and Weekly wise attendace ready for the generate payslip
	 * fo weekly and monthly
	 * 
	 * @return AttendaceGenerate
	 */
	
	@Override
	public Payslip attendancePrepair(String forEmployee, String from_date, String to_date)  {
		// TODO Auto-generated method stub
		try {
		Date from_date1;
	
		from_date1 = new SimpleDateFormat("dd-MM-yyyy").parse(from_date);
		
		Date to_date1 = new SimpleDateFormat("dd-MM-yyyy").parse(to_date);
		
		
		
		if(forEmployee.equals("House Rent"))
		{
			List<EmployeeMaster> emplist=employeemasterService.findByemptype("Worker");
			
			for(EmployeeMaster empmastlist: emplist)
			{
				Integer totalabsentday=0;
				double totalabsenthrs=0.00;
				double totalothrs=0.00;
				Integer totalworkingday=0;
				double totalworkinghrs=0.00;
				List<AttendaceGenerator> attendaceGeneratorlist=
						attendanceGeneratorService.AttendaceGeneratorbydateempcode(empmastlist.getIdcardno(), from_date1, to_date1);
				
				if(attendaceGeneratorlist!=null)
				{
				Attendance attendance=new Attendance();
				for(AttendaceGenerator attgenlist:attendaceGeneratorlist)
				{
					
					totalabsentday+=attgenlist.getTotal_absent_day();
					totalabsenthrs+=attgenlist.getTotal_absent_hrs();
					totalothrs+=attgenlist.getTotal_ot_hrs();
					totalworkingday+=attgenlist.getTotal_working_day();
					totalworkinghrs+=attgenlist.getTotal_working_hrs();
					
					
					
				}
				attendance.setEmpName(empmastlist.getEmpName());
				attendance.setTotal_absent_day(totalabsentday);
				attendance.setTotal_absent_hrs(totalabsenthrs);
				attendance.setTotal_ot_hrs(totalothrs);
				attendance.setTotal_working_day(totalworkingday);
				attendance.setTotal_working_hrs(totalworkinghrs);
				attendance.setEmp_code(empmastlist.getEmpcode());
				attendance.setFromDate(from_date1);
				attendance.setToDate(to_date1);
				attendance.setEmployeeType("House Rent");
				attendance.setFine_amt(0.00);
				attendanceService.attendacesave(attendance);
				
				
				
				
				
			}else
			{
				System.out.println("Employee Code not match with the attendacegenerator table");
			}
		}
			
			
			
			
			
		}else
		{
			
		
		
		List<EmployeeMaster> emplist=employeemasterService.findByemptype(forEmployee);
		
		for(EmployeeMaster empmastlist: emplist)
		{
			Integer totalabsentday=0;
			double totalabsenthrs=0.00;
			double totalothrs=0.00;
			Integer totalworkingday=0;
			double totalworkinghrs=0.00;
			List<AttendaceGenerator> attendaceGeneratorlist=
					attendanceGeneratorService.AttendaceGeneratorbydateempcode(empmastlist.getIdcardno(), from_date1, to_date1);
			
			if(attendaceGeneratorlist!=null)
			{
			Attendance attendance=new Attendance();
			for(AttendaceGenerator attgenlist:attendaceGeneratorlist)
			{
				
				totalabsentday+=attgenlist.getTotal_absent_day();
				totalabsenthrs+=attgenlist.getTotal_absent_hrs();
				totalothrs+=attgenlist.getTotal_ot_hrs();
				totalworkingday+=attgenlist.getTotal_working_day();
				totalworkinghrs+=attgenlist.getTotal_working_hrs();
				
				
				
			}
			attendance.setEmpName(empmastlist.getEmpName());
			attendance.setTotal_absent_day(totalabsentday);
			attendance.setTotal_absent_hrs(totalabsenthrs);
			attendance.setTotal_ot_hrs(totalothrs);
			attendance.setTotal_working_day(totalworkingday);
			attendance.setTotal_working_hrs(totalworkinghrs);
			attendance.setEmp_code(empmastlist.getEmpcode());
			attendance.setFromDate(from_date1);
			attendance.setToDate(to_date1);
			attendance.setEmployeeType(forEmployee);
			attendance.setFine_amt(0.00);
			attendanceService.attendacesave(attendance);
			
			
			
			
			
		}else
		{
			System.out.println("Employee Code not match with the attendacegenerator table");
		}
	}
		}	
		
		
		
		
		
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		
		
		return null;
	}









	
	
	
}
