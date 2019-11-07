package com.aspl.org.report.service.impl;

/***/
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aspl.org.dto.PayslipDTO;
import com.aspl.org.report.CrawleyPayslipGenerator;
import com.aspl.org.report.CrawleyHouseRentGenerator;
import com.aspl.org.report.CrawleyWagesSheetGenerator;
import com.aspl.org.report.service.StaffPayslipReportService;
import com.aspl.org.service.PayslipService;
import com.aspl.org.service.UtilService;
import com.aspl.org.utils.GlobalDefine_;
import com.aspl.org.utils.PurchaseUtil;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

@Service
public class StaffPayslipReportServiceImpl implements StaffPayslipReportService {

	static Date date = new java.util.Date();
	static long time = date.getTime();
	static int randNum = (int) ((int) Math.random() + time);
	String fileName = "invReport";

	@Autowired
	PayslipService payslipService;
	@Autowired PurchaseUtil purchaseUtil;
	@Autowired UtilService utilService;
	@Override
	public Map<String, Object> getStaffPayslipReport(HttpServletRequest request, String Foremployee, String fromDate, String toDate) {

		Map<String, String> param = new HashMap<String, String>();
		Map<String, Object> returnData = new HashMap<String, Object>();

		String RESULT_FILE = request.getServletContext().getRealPath("resources/static/pdf");

		//DecimalFormat df = new DecimalFormat("#.##");

		try {

			Document document = new Document();

			document.setPageSize(PageSize.A4);
			document.setMargins(15, 15, 15, 15);

			PdfWriter writer;
			System.out.println("Result path "+RESULT_FILE);
			try {
				//writer = PdfWriter.getInstance(document, new FileOutputStream("src/main/resources/pdf/crawley_payslip_"+ Foremployee + ".pdf"));
				writer = PdfWriter.getInstance(document, new FileOutputStream("/home/pdf/crawley_payslip_"+ Foremployee + ".pdf"));
				writer.setPdfVersion(PdfWriter.VERSION_1_7);

			} catch (DocumentException e1) {

				e1.printStackTrace();

			} catch (IOException e1) {

				e1.printStackTrace();

			}

			document.open();

			//List<PayslipDTO> report = new PayslipDTO();
			List<PayslipDTO> reportLines = new ArrayList<>();

			if (!Foremployee.isEmpty() || Foremployee != null || Foremployee != "" || 
					!fromDate.isEmpty() || fromDate != null || fromDate != "" || !toDate.isEmpty() || toDate != null || toDate != "") {

				reportLines = payslipService.getPayslipdatewise(Foremployee ,fromDate , toDate );
				//reportLines = report.getPurchaseIndentReportItemsDTO();

			}

			boolean newPage = true;

			
			int lineindex = 0;
			
			String reportTypeHouseRent 	= "House Rent";
			String reportTypeWorker		= "Worker";
			String reportTypeStaff		= "Staff";

				if(Foremployee.equals(reportTypeStaff)) {
				//////////////// STAFF PAYSLIP ////////////////////////////////////
			
				/////////////////////////// For Single Page ///////////////////////
				document.newPage();

				///////////////// STAFF PAYSLIP TITLE ////////////////////////

				// STAFF PAYSLIP TITLE
				for (int i = lineindex; i < reportLines.size(); i++) {
					
					PayslipDTO reportitems = reportLines.get(i);
					
					///// Formatted Dates /////////////////////
					SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
					String fromDate1 = formatter.format(reportitems.getFromDate());
					String toDate1   = formatter.format(reportitems.getToDate());
					String doj1      = formatter.format(reportitems.getDateofjoining());
					String payDate1  = formatter.format(reportitems.getPayDate());
					
					// Header 1
					PdfPTable header1 = CrawleyPayslipGenerator.createHeader1(
							 
						);
					document.add(header1);
					
					// Header 2 
					PdfPTable header2 = CrawleyPayslipGenerator.createHeader2(
							 fromDate1,
							 toDate1,
							 reportitems.getPayslipMonth(),
							 reportitems.getPayslipYear()
						);
					document.add(header2);
					
					/////////////////////// CREATE BLANK LINE ///////////////////////
					////////////////////////////////////////////////////////////////

					PdfPTable blankLine1 = CrawleyPayslipGenerator.createBlankLine();
					document.add(blankLine1);

					//////////////////// EMPLOYEE DETAILS TABLE ////////////////////
					///////////////////////////////////////////////////////////////
					
					PdfPTable employeeDetailsLine1 = CrawleyPayslipGenerator.createEmployeeDetailsLine1(
								i+1,
								reportitems.getEmpname()
						);
					document.add(employeeDetailsLine1);
					
					PdfPTable employeeDetailsLine2 = CrawleyPayslipGenerator.createEmployeeDetailsLine2(
								reportitems.getEmployeeCode(),
								reportitems.getBankName()
						);
					document.add(employeeDetailsLine2);
					
					PdfPTable employeeDetailsLine3 = CrawleyPayslipGenerator.createEmployeeDetailsLine3(
								reportitems.getPfNo(),
								reportitems.getBankAcNo()
						);
					document.add(employeeDetailsLine3);
					
					PdfPTable employeeDetailsLine4 = CrawleyPayslipGenerator.createEmployeeDetailsLine4(
							    doj1,
								reportitems.getEsiNo()
						);
					document.add(employeeDetailsLine4);
					
					PdfPTable employeeDetailsLine5 = CrawleyPayslipGenerator.createEmployeeDetailsLine5(
							reportitems.getHoliday(),
							reportitems.getEmpLocation()
						);
					document.add(employeeDetailsLine5);
					
					PdfPTable employeeDetailsLine6 = CrawleyPayslipGenerator.createEmployeeDetailsLine6(
							reportitems.getTotal_working_day(),
							reportitems.getTotalleave()
						);
					document.add(employeeDetailsLine6);
					
					PdfPTable employeeDetailsLine7 = CrawleyPayslipGenerator.createEmployeeDetailsLine7(
							reportitems.getDays_for_pay()
						);
					document.add(employeeDetailsLine7);
					
					PdfPTable employeeDetailsLine8 = CrawleyPayslipGenerator.createEmployeeDetailsLine8(
							reportitems.getDept(),
							reportitems.getDesignation()
						);
					document.add(employeeDetailsLine8);
					
					/////////////////////// CREATE BLANK LINE ///////////////////////
					////////////////////////////////////////////////////////////////
					
					PdfPTable blankLine2 = CrawleyPayslipGenerator.createBlankLine();
					document.add(blankLine2);
					
					////////////////// EARNINGS & DEDUCTIONS TABLE //////////////////
					/////////////////////////////////////////////////////////////////
					
				
					PdfPTable earningTableHead = CrawleyPayslipGenerator.createEarningTableHead(
							
						); 
					document.add(earningTableHead);
				  
					PdfPTable earningDetailsLine1 = CrawleyPayslipGenerator.createEarningDetailsLine1(
							utilService.RoundOffDouble(reportitems.getBasicsalary(), GlobalDefine_.decimal2) ,
							utilService.RoundOffDouble(reportitems.getEsicontribution(), GlobalDefine_.decimal2)
						);
					document.add(earningDetailsLine1);
				  
					PdfPTable earningDetailsLine2 = CrawleyPayslipGenerator.createEarningDetailsLine2(
							utilService.RoundOffDouble(reportitems.getHouserentforworker(), GlobalDefine_.decimal2),
							utilService.RoundOffDouble(reportitems.getSalaryAdv(), GlobalDefine_.decimal2)
					   );
					document.add(earningDetailsLine2);
				  
					PdfPTable earningDetailsLine3 = CrawleyPayslipGenerator.createEarningDetailsLine3(
							utilService.RoundOffDouble(reportitems.getOtamount(), GlobalDefine_.decimal2),
							utilService.RoundOffDouble(reportitems.getPfcontribution(), GlobalDefine_.decimal2)
					  );
					document.add(earningDetailsLine3);
				    
					PdfPTable earningDetailsLine4 = null;
					if(reportitems.getIncTax() == null) {
						
						 earningDetailsLine4 = CrawleyPayslipGenerator.createEarningDetailsLine4(
						
						utilService.RoundOffDouble(0.00, GlobalDefine_.decimal2)
						
					    );
					}else {
						 earningDetailsLine4 = CrawleyPayslipGenerator.createEarningDetailsLine4(
								
						utilService.RoundOffDouble(reportitems.getIncTax(), GlobalDefine_.decimal2)
								
						);
					}	
					document.add(earningDetailsLine4);
				  
					PdfPTable earningDetailsLine5 = CrawleyPayslipGenerator.createEarningDetailsLine5(
							utilService.RoundOffDouble(reportitems.getCanteenCharge(), GlobalDefine_.decimal2)  
					  );
					document.add(earningDetailsLine5);
				  
					PdfPTable earningDetailsLine6 = CrawleyPayslipGenerator.createEarningDetailsLine6(
							utilService.RoundOffDouble(reportitems.getProfTax(), GlobalDefine_.decimal2)  
					  );
					document.add(earningDetailsLine6);
				  
					PdfPTable earningDetailsLine7 = CrawleyPayslipGenerator.createEarningDetailsLine7(
							utilService.RoundOffDouble(reportitems.getWelFund(), GlobalDefine_.decimal2) 
					   );
					document.add(earningDetailsLine7);
				  
					PdfPTable earningDetailsLine8 = CrawleyPayslipGenerator.createEarningDetailsLine8(
							utilService.RoundOffDouble(reportitems.getHrRecovary(), GlobalDefine_.decimal2)
					    );
					document.add(earningDetailsLine8);
				  
					PdfPTable earningDetailsLine9 = CrawleyPayslipGenerator.createEarningDetailsLine9(
							utilService.RoundOffDouble(reportitems.getFineAmount(), GlobalDefine_.decimal2)
						);
					document.add(earningDetailsLine9);
				  
					PdfPTable grossEarningDetailsLine = CrawleyPayslipGenerator.createGrossEarningDetailsLine(
							utilService.RoundOffDouble(reportitems.getGrossearning(), GlobalDefine_.decimal2),
							utilService.RoundOffDouble(reportitems.getGrossdeduction(), GlobalDefine_.decimal2)
						 );
					document.add(grossEarningDetailsLine);
				  
					PdfPTable netPayAmtLine = CrawleyPayslipGenerator.createNetPayAmtLine(
							utilService.RoundOffDouble(reportitems.getNetamt(), GlobalDefine_.decimal2)
						  ); 
					document.add(netPayAmtLine);
				  
					PdfPTable netPayamtInWordsLine = CrawleyPayslipGenerator.createNetPayamtInWordsLine(
							// purchaseUtil.convertLessThanOneThousand(45879) // NEED TO CHANGE FROM INT TO DOUBLE :(
					/* "SIXTEEN THOUSAND THREE HUNDRED FIFTY THREE" */
							
							 //long netamt = (new Double(reportitems.getNetamt())).longValue();
							
							PurchaseUtil.convertToWords(reportitems.getNetamt()).toUpperCase()
							//PurchaseUtil.convertToWords(189937.0)
						  );	
					document.add(netPayamtInWordsLine);
				  
					PdfPTable paymentDateLine = CrawleyPayslipGenerator.createPaymentDateLine(
							 payDate1
						  );
					document.add(paymentDateLine);
				  
					document.newPage(); 	
				
				}
				
				//////////////// END OF STAFF PAYSLIP ////////////////////////////////////
				
				}else if (Foremployee.equals(reportTypeHouseRent)){
					
					//////////////// WORKER HOUSE RENT ////////////////////////////////////
					
					/////////////////////////// For Single Page ///////////////////////
					document.newPage();

					///////////////// WORKER HOUSE TITLE ////////////////////////

					// WORKER HOUSE TITLE
					for (int i = lineindex; i < reportLines.size(); i++) {
						
						PayslipDTO reportitems = reportLines.get(i);
						
						///// Formatted Dates /////////////////////
						SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
						String fromDate2 = formatter.format(reportitems.getFromDate());  
						String toDate2   = formatter.format(reportitems.getToDate()); 
						String doj2      = formatter.format(reportitems.getDateofjoining());  
						String payDate2  = formatter.format(reportitems.getPayDate()); 
						
						// Header 1
						PdfPTable header1 = CrawleyHouseRentGenerator.createHeader1(
								 
							);
						document.add(header1);
						
						// Header 2
						PdfPTable header2 = CrawleyHouseRentGenerator.createHeader2(
								 fromDate2,
								 toDate2,
								 reportitems.getPayslipMonth(),
								 reportitems.getPayslipYear()
							);
						document.add(header2);
						
						/////////////////////// CREATE BLANK LINE ///////////////////////
						////////////////////////////////////////////////////////////////

						PdfPTable blankLine1 = CrawleyHouseRentGenerator.createBlankLine();
						document.add(blankLine1);

						//////////////////// EMPLOYEE DETAILS TABLE ////////////////////
						///////////////////////////////////////////////////////////////
						
						PdfPTable employeeDetailsLine1 = CrawleyHouseRentGenerator.createEmployeeDetailsLine1(
									i+1,
									reportitems.getEmpname()
							);
						document.add(employeeDetailsLine1);
						
						PdfPTable employeeDetailsLine2 = CrawleyHouseRentGenerator.createEmployeeDetailsLine2(
									reportitems.getEmployeeCode(),
									reportitems.getBankName()
							);
						document.add(employeeDetailsLine2);
						
						PdfPTable employeeDetailsLine3 = CrawleyHouseRentGenerator.createEmployeeDetailsLine3(
									reportitems.getPfNo(),
									reportitems.getBankAcNo()
							);
						document.add(employeeDetailsLine3);
						
						PdfPTable employeeDetailsLine4 = CrawleyHouseRentGenerator.createEmployeeDetailsLine4(
								    doj2,
									reportitems.getEsiNo()
							);
						document.add(employeeDetailsLine4);
						
						PdfPTable employeeDetailsLine5 = CrawleyHouseRentGenerator.createEmployeeDetailsLine5(
								reportitems.getHoliday(),
								reportitems.getEmpLocation()
							);
						document.add(employeeDetailsLine5);
						
						PdfPTable employeeDetailsLine6 = CrawleyHouseRentGenerator.createEmployeeDetailsLine6(
								reportitems.getTotal_working_day(),
								reportitems.getTotalleave()
							);
						document.add(employeeDetailsLine6);
						
						PdfPTable employeeDetailsLine7 = CrawleyHouseRentGenerator.createEmployeeDetailsLine7(
								reportitems.getOtHrs(),
								reportitems.getDays_for_pay()
							);
						document.add(employeeDetailsLine7);
						
						PdfPTable employeeDetailsLine8 = CrawleyHouseRentGenerator.createEmployeeDetailsLine8(
								reportitems.getDept(),
								reportitems.getDesignation()
							);
						document.add(employeeDetailsLine8);
						
						/////////////////////// CREATE BLANK LINE ///////////////////////
						////////////////////////////////////////////////////////////////
						
						PdfPTable blankLine2 = CrawleyHouseRentGenerator.createBlankLine();
						document.add(blankLine2);
						
						////////////////// EARNINGS & DEDUCTIONS TABLE //////////////////
						/////////////////////////////////////////////////////////////////
						
					
						PdfPTable earningTableHead = CrawleyHouseRentGenerator.createEarningTableHead(
								
							); 
						document.add(earningTableHead);
					  
						PdfPTable earningDetailsLine1 = CrawleyHouseRentGenerator.createEarningDetailsLine1(
							   reportitems.getBasicsalary(),
							   reportitems.getNormalwagesearned(),
							   reportitems.getHouserentforworker()
							);
						document.add(earningDetailsLine1);
					  
						PdfPTable earningDetailsLine2 = CrawleyHouseRentGenerator.createEarningDetailsLine2(
							  	reportitems.getNormalwagesearned(),
							  	reportitems.getEsicontribution()
						   );
						document.add(earningDetailsLine2);
					  
						PdfPTable earningDetailsLine3 = CrawleyHouseRentGenerator.createEarningDetailsLine3(
								reportitems.getOtamount(),
								reportitems.getCanteenCharge()
						  );
						document.add(earningDetailsLine3);
					  
						PdfPTable earningDetailsLine4 = CrawleyHouseRentGenerator.createEarningDetailsLine4(
							    reportitems.getProfTax() 	
						  );
						document.add(earningDetailsLine4);
					  
						PdfPTable earningDetailsLine5 = CrawleyHouseRentGenerator.createEarningDetailsLine5(
							    reportitems.getWelFund()  
						  );
						document.add(earningDetailsLine5);
					  
						PdfPTable earningDetailsLine6 = CrawleyHouseRentGenerator.createEarningDetailsLine6(
							    reportitems.getHrRecovary()
						  );
						document.add(earningDetailsLine6);
					  
						PdfPTable grossEarningDetailsLine = CrawleyHouseRentGenerator.createGrossEarningDetailsLine(
							    reportitems.getHouserentforworker(),
							  	reportitems.getGrossdeduction()
							 );
						document.add(grossEarningDetailsLine);
					  
						PdfPTable netPayAmtLine = CrawleyHouseRentGenerator.createNetPayAmtLine(
							  	reportitems.getNetamt()
							  ); 
						document.add(netPayAmtLine);
					  
						PdfPTable netPayamtInWordsLine = CrawleyHouseRentGenerator.createNetPayamtInWordsLine(
								// purchaseUtil.convertLessThanOneThousand(45879) // NEED TO CHANGE FROM INT TO DOUBLE :(
								//"SIXTEEN THOUSAND THREE HUNDRED FIFTY THREE"
								
								// PurchaseUtil.convertToWords(189937.0)
								PurchaseUtil.convertToWords(reportitems.getNetamt()).toUpperCase()
							  );	
						document.add(netPayamtInWordsLine);
					  
						PdfPTable paymentDateLine = CrawleyHouseRentGenerator.createPaymentDateLine(
								    payDate2
							  );
						document.add(paymentDateLine);
					  
						document.newPage(); 	
					
					}
					
					//////////////// END OF WORKER HOUSE RENT ////////////////////////////////////
					
					}else {
						
						//////////////// WORKER PAYSLIP ////////////////////////////////////
						
						/////////////////////////// For Single Page ///////////////////////
						document.newPage();

						///////////////// WORKER PAYSLIP TITLE ////////////////////////

						// WORKER PAYSLIP TITLE
						for (int i = lineindex; i < reportLines.size(); i++) {
							
							PayslipDTO reportitems = reportLines.get(i);
							
						    ///// Formatted Dates /////////////////////
							SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
							String fromDate3 = formatter.format(reportitems.getFromDate());  
							String toDate3   = formatter.format(reportitems.getToDate()); 
							String doj3      = formatter.format(reportitems.getDateofjoining());  
							String payDate3  = formatter.format(reportitems.getPayDate()); 
							
							// Header 1
							PdfPTable header1 = CrawleyWagesSheetGenerator.createHeader1(
									 
								);
							document.add(header1);
							
							// Header 2
							PdfPTable header2 = CrawleyWagesSheetGenerator.createHeader2(
									 fromDate3,
									 toDate3,
									 reportitems.getPayslipMonth(),
									 reportitems.getPayslipYear()
								);
							document.add(header2);
							
							/////////////////////// CREATE BLANK LINE ///////////////////////
							////////////////////////////////////////////////////////////////

							PdfPTable blankLine1 = CrawleyWagesSheetGenerator.createBlankLine();
							document.add(blankLine1);

							//////////////////// EMPLOYEE DETAILS TABLE ////////////////////
							///////////////////////////////////////////////////////////////
							
							PdfPTable employeeDetailsLine1 = CrawleyWagesSheetGenerator.createEmployeeDetailsLine1(
										i+1,
										reportitems.getEmpname()
								);
							document.add(employeeDetailsLine1);
							
							PdfPTable employeeDetailsLine2 = CrawleyWagesSheetGenerator.createEmployeeDetailsLine2(
										reportitems.getEmployeeCode(),
										reportitems.getBankName()
								);
							document.add(employeeDetailsLine2);
							
							PdfPTable employeeDetailsLine3 = CrawleyWagesSheetGenerator.createEmployeeDetailsLine3(
										reportitems.getPfNo(),
										reportitems.getBankAcNo()
								);
							document.add(employeeDetailsLine3);
							
							PdfPTable employeeDetailsLine4 = CrawleyWagesSheetGenerator.createEmployeeDetailsLine4(
									    doj3,
										reportitems.getEsiNo()
								);
							document.add(employeeDetailsLine4);
							
							PdfPTable employeeDetailsLine5 = CrawleyWagesSheetGenerator.createEmployeeDetailsLine5(
									reportitems.getHoliday(),
									reportitems.getEmpLocation()
								);
							document.add(employeeDetailsLine5);
							
							PdfPTable employeeDetailsLine6 = CrawleyWagesSheetGenerator.createEmployeeDetailsLine6(
									reportitems.getTotal_working_day(),
									reportitems.getTotalleave()
								);
							document.add(employeeDetailsLine6);
							
							PdfPTable employeeDetailsLine7 = CrawleyWagesSheetGenerator.createEmployeeDetailsLine7(
									reportitems.getOtHrs(),
									reportitems.getDays_for_pay()
								);
							document.add(employeeDetailsLine7);
							
							PdfPTable employeeDetailsLine8 = CrawleyWagesSheetGenerator.createEmployeeDetailsLine8(
									reportitems.getDept(),
									reportitems.getDesignation()
								);
							document.add(employeeDetailsLine8);
							
							/////////////////////// CREATE BLANK LINE ///////////////////////
							////////////////////////////////////////////////////////////////
							
							PdfPTable blankLine2 = CrawleyWagesSheetGenerator.createBlankLine();
							document.add(blankLine2);
							
							////////////////// EARNINGS & DEDUCTIONS TABLE //////////////////
							/////////////////////////////////////////////////////////////////
							
						
							PdfPTable earningTableHead = CrawleyWagesSheetGenerator.createEarningTableHead(
									
								); 
							document.add(earningTableHead);
						  
							PdfPTable earningDetailsLine1 = CrawleyWagesSheetGenerator.createEarningDetailsLine1(
								   reportitems.getBasicsalary(),
								   reportitems.getSalaryAdv()
								);
							document.add(earningDetailsLine1);
						  
							PdfPTable earningDetailsLine2 = CrawleyWagesSheetGenerator.createEarningDetailsLine2(
								  	reportitems.getNormalwagesearned(),
								  	reportitems.getPfcontribution()
							   );
							document.add(earningDetailsLine2);
						  
							PdfPTable earningDetailsLine3 = CrawleyWagesSheetGenerator.createEarningDetailsLine3(
									reportitems.getOtamount(), 
									reportitems.getFineAmount()
							  );
							document.add(earningDetailsLine3);
						  
							PdfPTable earningDetailsLine4 = CrawleyWagesSheetGenerator.createEarningDetailsLine4(
								     	
							  );
							document.add(earningDetailsLine4);
						  
							PdfPTable grossEarningDetailsLine = CrawleyWagesSheetGenerator.createGrossEarningDetailsLine(
								    reportitems.getGrossearning(),
								  	reportitems.getGrossdeduction()
								 );
							document.add(grossEarningDetailsLine);
						  
							PdfPTable netPayAmtLine = CrawleyWagesSheetGenerator.createNetPayAmtLine(
								  	reportitems.getNetamt()
								  ); 
							document.add(netPayAmtLine);
						  
							PdfPTable netPayamtInWordsLine = CrawleyWagesSheetGenerator.createNetPayamtInWordsLine(
									// purchaseUtil.convertLessThanOneThousand(45879) // NEED TO CHANGE FROM INT TO DOUBLE :(
									// "SIXTEEN THOUSAND THREE HUNDRED FIFTY THREE"
									
									PurchaseUtil.convertToWords(reportitems.getNetamt()).toUpperCase()
									//PurchaseUtil.convertToWords(189937.0)
								  );	
							document.add(netPayamtInWordsLine);
						  
							PdfPTable paymentDateLine = CrawleyWagesSheetGenerator.createPaymentDateLine(
									   payDate3
								  );
							document.add(paymentDateLine);
						  
							document.newPage(); 	
						
						}
						
						//////////////// END OF WORKER PAYSLIP ////////////////////////////////////
						}
				
				
				
				
			document.close();

		} catch (Exception e) {
			
			e.printStackTrace();
		}
		returnData.put("fileName", "payslip.pdf");
		returnData.put("status", true);
		return returnData;
	}

	

}
