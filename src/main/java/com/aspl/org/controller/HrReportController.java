package com.aspl.org.controller;
import java.text.ParseException;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aspl.org.dto.AdvancePayDTO;
import com.aspl.org.dto.LeaveApplicationRptDTO;
import com.aspl.org.dto.OverTimeDTO;
import com.aspl.org.dto.PfReportForWorkerDTO;
import com.aspl.org.dto.StaffRetirementDTO;
import com.aspl.org.dto.WagessheetforWorkersDTO;
import com.aspl.org.dto.WelfareFundDTO;
import com.aspl.org.entity.AnnualReport;
import com.aspl.org.entity.BonusCalculation;
import com.aspl.org.entity.WelfareFundReport;
import com.aspl.org.report.service.AdvancePaymentReportService;
import com.aspl.org.report.service.AnnualReportFrom22ReportService;
import com.aspl.org.report.service.AnnualReportFrom23ReportService;
import com.aspl.org.report.service.EsiContributionReportService;
import com.aspl.org.report.service.GratuityReportService;
import com.aspl.org.report.service.LeaveApplicationReportService;
import com.aspl.org.report.service.LeaveStatementReportService;
import com.aspl.org.report.service.OverTimeReportPDFService;
import com.aspl.org.report.service.OvertimeDeptWiseReportService;
import com.aspl.org.report.service.PFDetailsForStaffReportService;
import com.aspl.org.report.service.PFDetailsForWorkerReportService;
import com.aspl.org.report.service.RetirementReportService;
import com.aspl.org.report.service.StatementOfEmployeesLabourWelfareFundContributionReportService;
import com.aspl.org.report.service.WagesSheetReportService;
import com.aspl.org.report.service.WelfareFundStatementReportService;
import com.aspl.org.service.AdvSalaryService;
import com.aspl.org.service.AnnualReportService;
import com.aspl.org.service.BonusCalculationService;
import com.aspl.org.service.EsiContributionService;
import com.aspl.org.service.GratuityDetailService;
import com.aspl.org.service.LeaveApplicationService;
import com.aspl.org.service.LeaveMasterService;
import com.aspl.org.service.OverTimeReportService;
import com.aspl.org.service.PfDetailsForStaffService;
import com.aspl.org.service.StaffRetirementService;
import com.aspl.org.service.WelfareFundReportService;
import com.aspl.org.service.impl.WagessheetforworkerService;

@RestController
@RequestMapping(path = "/HrReport")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class HrReportController {

	
	@Autowired AdvSalaryService advSalaryService;
	@Autowired LeaveApplicationService leaveApplicationService;
	@Autowired LeaveApplicationReportService leaveApplicationReportService;
	@Autowired AdvancePaymentReportService advancePaymentReportService;

	@Autowired PfDetailsForStaffService pfDetailsForStaffService;
	@Autowired OverTimeReportService overTimeReportService;
	@Autowired	EsiContributionService esicontributionService;
	@Autowired	LeaveMasterService leaveMasterService;
	@Autowired PFDetailsForStaffReportService pFDetailsForStaffReportService;
	@Autowired PFDetailsForWorkerReportService pFDetailsForWorkerReportService;
	@Autowired
	EsiContributionReportService esiContributionReportService;
	@Autowired
	LeaveStatementReportService leaveStatementReportService;
	@Autowired
	GratuityDetailService gratuityDetailService;
	@Autowired
	GratuityReportService gratuityReportService;
	@Autowired
	OvertimeDeptWiseReportService overtimeDeptWiseReportService; 
	
	@Autowired StaffRetirementService staffRetirementService;
	@Autowired WagessheetforworkerService wagessheetforworkerService;
	@Autowired OverTimeReportPDFService overTimeReportPDFService;
	@Autowired RetirementReportService retirementReportService;
	@Autowired WagesSheetReportService wagesSheetReportService;
	@Autowired BonusCalculationService bonusCalculationService;
	@Autowired AnnualReportFrom22ReportService annualReportFrom22ReportService;
	@Autowired AnnualReportFrom23ReportService annualReportFrom23ReportService;
	@Autowired WelfareFundStatementReportService welfareFundStatementReportService;
	
	@Autowired AnnualReportService annualReportService;
	@Autowired WelfareFundReportService welfareFundReportService;
	
	@Autowired StatementOfEmployeesLabourWelfareFundContributionReportService statementOfEmployeesLabourWelfareFundContributionReportService;
	
	
	/*-findByVoucherDateBetween Method Use for the Advance Payment Voucher Details info get date between -*/
	
	
	@GetMapping("findByVoucherDateBetween/{fromDate}/{toDate}")
	
	public List<AdvancePayDTO> findByVoucherDateBetween(@PathVariable("fromDate") String fromDate, @PathVariable("toDate") String toDate)
	{
		return advSalaryService.findByVoucherDateBetween(fromDate, toDate);
		
	}
	
	/*-findByApplicationDateBetween Method Use for the Leave Application Details info get date between -*/
	
	@GetMapping("findByApplicationDateBetween/{fromDate}/{toDate}")
	
	public List<LeaveApplicationRptDTO> findByApplicationDateBetween(@PathVariable("fromDate") String fromDate, @PathVariable("toDate") String toDate)
	{
		return leaveApplicationService.findByapplicationDateBetween(fromDate, toDate);
		
	}
	
	
	/*-getPrintLeaveApplicationDateBetween Method Use for the Print Leave Application Details info get date between -*/
	@GetMapping("getPrintLeaveApplicationDateBetween/{fromDate}/{toDate}")
	
	public Map<String, Object> getPrintLeaveApplicationDateBetween(HttpServletRequest request,  @PathVariable("fromDate") String fromDate, @PathVariable("toDate") String toDate)
	{
		return leaveApplicationReportService.getLeaveApplicationReport(request, fromDate, toDate);
		
	}
	/*-getPrintLeaveApplicationDateBetween Method Use for the Print Leave Application Details info get date between -*/
	@GetMapping("getPrintAdvancePaymentDateBetweenDetails/{fromDate}/{toDate}")
	
	public Map<String, Object> getPrintAdvancePaymentDateBetweenDetails(HttpServletRequest request, @PathVariable("fromDate") String fromDate, @PathVariable("toDate") String toDate)
	{
		return advancePaymentReportService.getAdvancePaymentReport(request, fromDate, toDate);
		
	}
	
	/*-getPrintPfdetailsforStaff Method Use for the Print Pf Details info get date between -*/
	@GetMapping("getPrintPfdetailsforStaff/{fromDate}/{toDate}")
	
	public Map<String, Object> getPrintPfdetailsforStaff(HttpServletRequest request,  @PathVariable("fromDate") String fromDate, @PathVariable("toDate") String toDate)
	{
		return pFDetailsForStaffReportService.getPFDetailsReport(request, fromDate, toDate);
		
	}
	
	
	/*-getPrintPfdetailsforStaff Method Use for the Print Pf Details  for worker info get date between -*/
	@GetMapping("getPrintPfdetailsforWorkerGeneration/{fromDate}/{toDate}")
	
	public List<PfReportForWorkerDTO> getPrintPfdetailsforWorker(  @PathVariable("fromDate") String fromDate, @PathVariable("toDate") String toDate)
	{
		return pfDetailsForStaffService.getPrintPfdetailsforWorker(fromDate, toDate);
		
	}
	
	/*-getovertimedetils Method Use for the get over time Details  for worker info get date between -*/
	@GetMapping("getovertimedetils/{fromDate}/{toDate}")
	
	public List<OverTimeDTO> getovertimedetils(  @PathVariable("fromDate") String fromDate, @PathVariable("toDate") String toDate)
	{
		return overTimeReportService.getOverTimedetails(fromDate, toDate);
		
	}
	
	/*-getLeaveStatementReport Method Use for the Leave Statement Report Details  for Current Year -*/
	@GetMapping("/getLeaveStatementReport/{currentyear}")
	public Map<String, Object> getLeaveStatementReport(HttpServletRequest request, @PathVariable("currentyear") String currentyear) throws ParseException{
		return leaveStatementReportService.getLeaveStatementReport(request, currentyear);
	}
		
	/*-getOtdeptwise Method Use for the Over tIme Depertment wise  Report Details  for Entered Two Date -*/
	@GetMapping("/getOtdeptwise/{fromDate}/{toDate}")
	public Map<String, Object> getOtdeptwise(HttpServletRequest request, @PathVariable("fromDate") String fromDate, @PathVariable("toDate") String toDate) throws ParseException{
		return overtimeDeptWiseReportService.OvertimeDeptWiseReport(request, fromDate, toDate);
	}
	
	/*-getEsiContributionReportstaff Method Use for the Over tIme Depertment wise  Report Details  for Entered Two Date -*/
	@GetMapping("/getpfcontributionreportstaff/{fromDate}/{toDate}")
	public Map<String, Object> getEsiContributionReportstaff (HttpServletRequest request,  @PathVariable("fromDate") String fromDate, @PathVariable("toDate") String toDate) throws ParseException{
		return pFDetailsForStaffReportService.getPFDetailsReport(request, fromDate, toDate);
	}
	
	/*-getPrintPfdetailsforWorkerforPdf Method Use for the print pf details for worker  Report Details  for Entered Two Date between -*/
	@GetMapping("getPrintPfdetailsforWorkerforPdf/{fromDate}/{toDate}")
	public Map<String, Object> getPrintPfdetailsforWorkerforPdf(HttpServletRequest request,  @PathVariable("fromDate") String fromDate, @PathVariable("toDate") String toDate)
	{
		return pFDetailsForWorkerReportService.getPFDetailsReportforworker(request, fromDate, toDate);
		
	}
	
	/*
	 * @GetMapping("/getwagessheetforworker/{fromDate}/{toDate}") public
	 * List<WagessheetforWorkersDTO>
	 * getwagessheetforworker( @PathVariable("fromDate") String
	 * fromDate, @PathVariable("toDate") String toDate) throws ParseException{
	 * return overTimeReportService.getOverTimedetailsdepartmentwise(fromDate,
	 * toDate); }
	 */
	
	/*-getwagessheetforworker Method Use for Wages Sheet details for worker  Report Details  for Entered Two Date between -*/
	@GetMapping("/getwagessheetforworker/{fromDate}/{toDate}")
	public List<WagessheetforWorkersDTO> getwagessheetforworker(@PathVariable("foremployee") String foremployee, @PathVariable("fromDate") String fromDate,
			@PathVariable("toDate") String toDate) throws ParseException {
		return wagessheetforworkerService.getPrintwagessheetreportforworker(foremployee , fromDate, toDate);
	}
	
	
	/*-getwagessheetforworker Method Use for the print of Wages Sheet details for worker  Report Details  for Entered Two Date between -*/
	@GetMapping("/getwagessheetreport/{foremployee}/{fromDate}/{toDate}")
	public Map<String, Object> getwagessheetreport(HttpServletRequest request, @PathVariable("foremployee") String foremployee, @PathVariable("fromDate") String fromDate,
			@PathVariable("toDate") String toDate) throws ParseException {
		return wagesSheetReportService.getWagesSheetReport(request,foremployee, fromDate, toDate);
	}
	
	/*-getwagessheetforworker Method Use for the print of Wages Sheet details for worker  Report Details  for Entered Two Date between -*/
	@GetMapping("/getGratuityDetail/{month}")
	public Map<String, Object> getGratuityDetailReport(HttpServletRequest request, @PathVariable("month") String month) throws ParseException{
		return gratuityReportService.getGratuityReport(request, month);
	}
	
	/*-getRetirementDetailReport Method Use for the get Retirement Detail details for staff  Report Details -*/
	@GetMapping("/Retirementdetails")
	public List<StaffRetirementDTO>  getRetirementDetailReport() throws ParseException{
		return staffRetirementService.getRetirementDetailReport();
	}
	
	/*-getRetirementDetailReport Method Use for the get Retirement Detail details for staff  Report Details -*/
	@GetMapping("/RetirementdetailsforPDF")
	public Map<String, Object>  RetirementdetailsforPDF(HttpServletRequest request) throws ParseException{
		return retirementReportService.getReirementReport(request);
	}
	
	
	/*-getOtdetails Method Use for the get Over Time Detail details for Worker  Details -*/
	@GetMapping("/getOtdetails/{fromDate}/{toDate}")
	public List<OverTimeDTO> getOtdetails( @PathVariable("fromDate") String fromDate, @PathVariable("toDate") String toDate) throws ParseException{
		return overTimeReportService.getOverTimedetails(fromDate, toDate);
	}
	
	/*-getReportOtdetails Method Use for the get Over Time Detail details for Worker  Report -*/
	@GetMapping("/getReportOtdetails/{fromDate}/{toDate}")
	public Map<String, Object> getReportOtdetails(HttpServletRequest request, @PathVariable("fromDate") String fromDate, @PathVariable("toDate") String toDate) throws ParseException{
		return overTimeReportPDFService.getOverTimeDetailsReport(request, fromDate, toDate);
	}
	
	@PostMapping("/bonuscalculationsave")
	public BonusCalculation bonusCalculationsave(@RequestBody BonusCalculation bonusCalculation)
	{
		return bonusCalculationService.bonusCalculationsave(bonusCalculation);
	}
	
	/*
	 * @GetMapping("/getBonusCalculationyearwise/year") public ResponseDetails
	 * getBonusCalculationyearwise(@RequestBody PayslipDTO
	 * payslipDTO, @PathVariable("employeeType") String
	 * employeeType, @PathVariable("fromDate") String
	 * fromDate, @PathVariable("toDate") String toDate, @PathVariable("year") String
	 * year) throws ParseException{ return
	 * bonusCalculationService.getBonusCalculationyearwise( employeeType, fromDate,
	 * toDate, year, payslipDTO); }
	 */
	
	@GetMapping(path="/getannualReportgeneratorbyId/{reportId}"  , produces = "application/json")
	public Map<String, Object> annualreportbyreportId(HttpServletRequest request,@PathVariable("reportId") Integer reportId)
	
	{
		return annualReportFrom22ReportService.getAnnualReportFrom22Report(request, reportId);
	}
	@GetMapping(path="/gethalfyearlyReportgenerator"  , produces = "application/json")
	public Map<String, Object> getAnnualReportFrom23Report(HttpServletRequest request)
	{
		return annualReportFrom23ReportService.getAnnualReportFrom23Report(request);
	}
	
	
	@GetMapping(path="/getwelfarefundStatementReportgenerator/{welfarefundeportId}"  , produces = "application/json")
	public Map<String, Object> getwelfarefundStatementReportgenerator(HttpServletRequest request , @PathVariable("welfarefundeportId") Integer welfarefundeportId)
	{
		return welfareFundStatementReportService.getWelfareFundStatementReport(request, welfarefundeportId);
	}
	
	@GetMapping(path="/getstatementofemployeeslabourwelfarefundcontributionReportgenerator"  , produces = "application/json")
	public Map<String, Object> getstatementofemployeeslabourwelfarefundcontributionReportgenerator(HttpServletRequest request)
	{
		return statementOfEmployeesLabourWelfareFundContributionReportService.getStatementOfEmployeesLabourWelfareFundContributionReport(request);
	}
	
	
	/*-getEsiContributionReport Method Use for the ESI Contribution Report Details  for Entered Month -*/
	 @GetMapping("/esicontribution/{foremployee}/{month}")
	public Map<String, Object> getEsiContributionReport(HttpServletRequest request,@PathVariable("foremployee") String foremployee, @PathVariable("month") String month) throws ParseException{
		return esiContributionReportService.getEsiContributionReport(request,foremployee, month);
	}
	 
	 /* ............  Annual report Entry Controller Start ........ */
		
		@PostMapping("/annualReportSave")
		public AnnualReport annualreportsave(@RequestBody AnnualReport annualReport)
		
		{
			return annualReportService.AnnualReportsave(annualReport);
		}
		
		
		@GetMapping("/annualReportList")
		public List<AnnualReport> annualreportList()
		
		{
			return annualReportService.annualReportList();
		}
		
		
		@GetMapping(path="/getannualReportbyId/{reportId}"  , produces = "application/json")
		public Optional<AnnualReport> annualreportbyreportId(@PathVariable("reportId") Integer reportId)
		
		{
			return annualReportService.findByreportId(reportId);
		}
		
		/* ............  Annual report Entry Controller End ........ */
		
		
		
	/* ............  Welfare Fund report Entry Controller Start ........ */
		
		@PostMapping("/welfarefundReportSave")
		public WelfareFundReport welfareFundReportsave(@RequestBody WelfareFundReport welfareFundReport)
		
		{
			return welfareFundReportService.WelfareFundReportsave(welfareFundReport);
		}
		
		
		@GetMapping("/welfareFundReportList")
		public List<WelfareFundReport> WelfareFundReportList()
		
		{
			return welfareFundReportService.welfareFundReportReportList();
		}
		
		
		@GetMapping(path="/getWelfareFundReportbyId/{welfarefundeportId}"  , produces = "application/json")
		public Optional<WelfareFundReport> welfareFundReportbyreportId(@PathVariable("welfarefundeportId") Integer welfarefundeportId)
		
		{
			return welfareFundReportService.findByreportId(welfarefundeportId);
		}
		
		@GetMapping(path="/getWelfareFundReportcontribution"  , produces = "application/json")
		public List<WelfareFundDTO> getWelfareFundReportcontribution()
		{
			return welfareFundReportService.welfareFundReportReportListbymonthandpaydate();
		}
		
		
		/* ............  Welfare Fund report Entry Controller End ........ */
		
}
