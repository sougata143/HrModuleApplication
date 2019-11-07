package com.aspl.org.report.service.impl;

/***/
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aspl.org.dto.PayslipDTO;
import com.aspl.org.report.CrawleyHouseRentGenerator;
import com.aspl.org.report.service.WorkerHouseRentReportService;
import com.aspl.org.service.PayslipService;
import com.aspl.org.utils.PurchaseUtil;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

@Service
public class WorkerHouseRentReportServiceImpl implements WorkerHouseRentReportService {

	static Date date = new java.util.Date();
	static long time = date.getTime();
	static int randNum = (int) ((int) Math.random() + time);
	String fileName = "invReport";

	@Autowired
	PayslipService payslipService;
	@Autowired PurchaseUtil purchaseUtil;
	
	@Override
	public Map<String, Object> getWorkerHouseRentPayslipReport(HttpServletRequest request, String Foremployee, String fromDate, String toDate) {

		Map<String, String> param = new HashMap<String, String>();
		Map<String, Object> returnData = new HashMap<String, Object>();

		String RESULT_FILE = request.getServletContext().getRealPath("resources/static/pdf");

		
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

			

				/////////////////////////// For Single Page ///////////////////////
				document.newPage();

				///////////////// TAX INVOICE TITLE ////////////////////////

				// INVOICE TITLE
				for (int i = lineindex; i < reportLines.size(); i++) {
					
					PayslipDTO reportitems = reportLines.get(i);
					
					// Header 1
					PdfPTable header1 = CrawleyHouseRentGenerator.createHeader1(
							 
						);
					document.add(header1);
					
					// Header 2
				/*
				 * PdfPTable header2 = CrawleyPayslipGenerator.createHeader2(
				 * reportitems.getFromDate(), reportitems.getFromDate(),
				 * reportitems.getPayslipMonth(), reportitems.getPayslipYear() );
				 * document.add(header2);
				 */
					
					/////////////////////// CREATE BLANK LINE ///////////////////////
					////////////////////////////////////////////////////////////////

				/*
				 * PdfPTable blankLine1 = CrawleyPayslipGenerator.createBlankLine();
				 * document.add(blankLine1);
				 */

					//////////////////// EMPLOYEE DETAILS TABLE ////////////////////
					///////////////////////////////////////////////////////////////
					
				/*
				 * PdfPTable employeeDetailsLine1 =
				 * CrawleyPayslipGenerator.createEmployeeDetailsLine1( i+1,
				 * reportitems.getEmpname() ); document.add(employeeDetailsLine1);
				 * 
				 * PdfPTable employeeDetailsLine2 =
				 * CrawleyPayslipGenerator.createEmployeeDetailsLine2(
				 * reportitems.getEmployeeCode(), reportitems.getBankName() );
				 * document.add(employeeDetailsLine2);
				 * 
				 * PdfPTable employeeDetailsLine3 =
				 * CrawleyPayslipGenerator.createEmployeeDetailsLine3( reportitems.getPfNo(),
				 * reportitems.getBankAcNo() ); document.add(employeeDetailsLine3);
				 * 
				 * PdfPTable employeeDetailsLine4 =
				 * CrawleyPayslipGenerator.createEmployeeDetailsLine4(
				 * reportitems.getDateofjoining(), reportitems.getEsiNo() );
				 * document.add(employeeDetailsLine4);
				 * 
				 * PdfPTable employeeDetailsLine5 =
				 * CrawleyPayslipGenerator.createEmployeeDetailsLine5( reportitems.getHoliday(),
				 * reportitems.getEmpLocation() ); document.add(employeeDetailsLine5);
				 * 
				 * PdfPTable employeeDetailsLine6 =
				 * CrawleyPayslipGenerator.createEmployeeDetailsLine6(
				 * reportitems.getTotal_working_day(), reportitems.getTotalleave() );
				 * document.add(employeeDetailsLine6);
				 * 
				 * PdfPTable employeeDetailsLine7 =
				 * CrawleyPayslipGenerator.createEmployeeDetailsLine7(
				 * reportitems.getDays_for_pay() ); document.add(employeeDetailsLine7);
				 * 
				 * PdfPTable employeeDetailsLine8 =
				 * CrawleyPayslipGenerator.createEmployeeDetailsLine8( reportitems.getDept(),
				 * reportitems.getDesignation() ); document.add(employeeDetailsLine8);
				 */
					
					/////////////////////// CREATE BLANK LINE ///////////////////////
					////////////////////////////////////////////////////////////////
					
				/*
				 * PdfPTable blankLine2 = CrawleyPayslipGenerator.createBlankLine();
				 * document.add(blankLine2);
				 */
					
					////////////////// EARNINGS & DEDUCTIONS TABLE //////////////////
					/////////////////////////////////////////////////////////////////
					
				
				/*
				 * PdfPTable earningTableHead = CrawleyPayslipGenerator.createEarningTableHead(
				 * 
				 * ); document.add(earningTableHead);
				 * 
				 * PdfPTable earningDetailsLine1 =
				 * CrawleyPayslipGenerator.createEarningDetailsLine1(
				 * reportitems.getBasicsalary(), reportitems.getEsicontribution() );
				 * document.add(earningDetailsLine1);
				 * 
				 * PdfPTable earningDetailsLine2 =
				 * CrawleyPayslipGenerator.createEarningDetailsLine2(
				 * reportitems.getHouserentforworker(), reportitems.getSalaryAdv() );
				 * document.add(earningDetailsLine2);
				 * 
				 * PdfPTable earningDetailsLine3 =
				 * CrawleyPayslipGenerator.createEarningDetailsLine3( reportitems.getOtamount(),
				 * reportitems.getPfcontribution() ); document.add(earningDetailsLine3);
				 * 
				 * PdfPTable earningDetailsLine4 =
				 * CrawleyPayslipGenerator.createEarningDetailsLine4( reportitems.getIncTax() );
				 * document.add(earningDetailsLine4);
				 * 
				 * PdfPTable earningDetailsLine5 =
				 * CrawleyPayslipGenerator.createEarningDetailsLine5(
				 * reportitems.getCanteenCharge() ); document.add(earningDetailsLine5);
				 * 
				 * PdfPTable earningDetailsLine6 =
				 * CrawleyPayslipGenerator.createEarningDetailsLine6( reportitems.getProfTax()
				 * ); document.add(earningDetailsLine6);
				 * 
				 * PdfPTable earningDetailsLine7 =
				 * CrawleyPayslipGenerator.createEarningDetailsLine7( reportitems.getWelFund()
				 * ); document.add(earningDetailsLine7);
				 * 
				 * PdfPTable earningDetailsLine8 =
				 * CrawleyPayslipGenerator.createEarningDetailsLine8(
				 * reportitems.getHrRecovary() ); document.add(earningDetailsLine8);
				 * 
				 * PdfPTable earningDetailsLine9 =
				 * CrawleyPayslipGenerator.createEarningDetailsLine9(
				 * reportitems.getFineAmount() ); document.add(earningDetailsLine9);
				 * 
				 * PdfPTable grossEarningDetailsLine =
				 * CrawleyPayslipGenerator.createGrossEarningDetailsLine(
				 * reportitems.getGrossearning(), reportitems.getGrossdeduction() );
				 * document.add(grossEarningDetailsLine);
				 * 
				 * PdfPTable netPayAmtLine = CrawleyPayslipGenerator.createNetPayAmtLine(
				 * reportitems.getNetamt() ); document.add(netPayAmtLine);
				 */
				  
					//PdfPTable netPayamtInWordsLine = CrawleyPayslipGenerator.createNetPayamtInWordsLine(
							// purchaseUtil.convertLessThanOneThousand(45879) // NEED TO CHANGE FROM INT TO DOUBLE :(
							//"SIXTEEN THOUSAND THREE HUNDRED FIFTY THREE"
						 // );	
					//document.add(netPayamtInWordsLine);
				  
				/*
				 * PdfPTable paymentDateLine = CrawleyPayslipGenerator.createPaymentDateLine(
				 * reportitems.getPayDate() ); document.add(paymentDateLine);
				 */
				  
					document.newPage(); 	
				
				}
				
				
			document.close();

		} catch (Exception e) {
			
			e.printStackTrace();
		}
		returnData.put("fileName", "Invoice_.pdf");
		returnData.put("status", true);
		return returnData;
	}

	

}
