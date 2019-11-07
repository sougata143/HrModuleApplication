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

import com.aspl.org.dto.LeaveApplicationRptDTO;
import com.aspl.org.report.CrawleyLeaveApplicationReportGenerator;
import com.aspl.org.report.service.LeaveApplicationReportService;
import com.aspl.org.service.LeaveApplicationService;
import com.aspl.org.utils.PurchaseUtil;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

@Service
public class LeaveApplicationReportServiceImpl implements LeaveApplicationReportService {

	static Date date = new java.util.Date();
	static long time = date.getTime();
	static int randNum = (int) ((int) Math.random() + time);
	String fileName = "invReport";

	@Autowired LeaveApplicationService leaveApplicationService;
	@Autowired PurchaseUtil purchaseUtil;
	
	
	
	
	/** @param fromDate
	 * @param toDate
	 * @param request
	 * This method is used for generating the DTO class for service order. this method take fromDate as a param, and toDate as a param and return the AdvancePayDTO.
	 * In this method using fromDate and toDate for filtering the advance payment voucher table and create a list of the data and using the loop get one by one data and set 
	 * in DTo and return it
	 * 
	 * @return advancePaymentDTO
	 */
	
	@Override
	public Map<String, Object> getLeaveApplicationReport(HttpServletRequest request,  String fromDate, String toDate) {

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
				//writer = PdfWriter.getInstance(document, new FileOutputStream("src/main/resources/pdf/crawley_leave_application_"+ fromDate + "_to_"+toDate+".pdf"));
				writer = PdfWriter.getInstance(document, new FileOutputStream("/home/pdf/crawley_leave_application_"+ fromDate + "_to_"+toDate+".pdf"));
				writer.setPdfVersion(PdfWriter.VERSION_1_7);

			} catch (DocumentException e1) {

				e1.printStackTrace();

			} catch (IOException e1) {

				e1.printStackTrace();

			}

			document.open();

			//List<PayslipDTO> report = new PayslipDTO();
			List<LeaveApplicationRptDTO> reportLines = new ArrayList<>();

			if (!fromDate.isEmpty() || fromDate != null || fromDate != "" || !toDate.isEmpty() || toDate != null || toDate != "") {

				reportLines = leaveApplicationService.findByapplicationDateBetween(fromDate , toDate );
				//reportLines = report.getPurchaseIndentReportItemsDTO();

			}

			boolean newPage = true;

			
			int lineindex = 0;
			
				//////////////// LEAVE APPLICATION REPORT ////////////////////////////////////
			
				/////////////////////////// For Single Page ///////////////////////
				document.newPage();

				///////////////// LEAVE APPLICATION REPORT TITLE ////////////////////////////

				// Header 1
				PdfPTable header1 = CrawleyLeaveApplicationReportGenerator.createHeader1(
						 
					);
				document.add(header1);
				
				// Header 2
				PdfPTable header2 = CrawleyLeaveApplicationReportGenerator.createHeader2(
						fromDate , toDate 
					);
				document.add(header2);
				
				// Description Table Head
				PdfPTable descriptionTableHead1 = CrawleyLeaveApplicationReportGenerator.createDescriptionTableHead1(
						 
					);
				document.add(descriptionTableHead1);
				
				for (int i = lineindex; i < reportLines.size(); i++) {
					
					LeaveApplicationRptDTO reportitems = reportLines.get(i);
					
					// Description Table Data
					PdfPTable listItems = CrawleyLeaveApplicationReportGenerator.createDescriptionTable(
							 i+1,
							 reportitems.getVoucherNo(),
							 reportitems.getEmpCode(),
							 reportitems.getEmpName(),
							 reportitems.getLeaveType(),
							 reportitems.getApplicationDate(),
							 reportitems.getFromDate(),
							 reportitems.getToDate(),
							 reportitems.getNoofdays()
						);
					document.add(listItems);
				  
					//document.newPage(); 	
				
				}
				
				//////////////// END OF LEAVE APPLICATION REPORT ////////////////////////////////////
				
			document.close();

		} catch (Exception e) {
			
			e.printStackTrace();
		}
		returnData.put("fileName", "leaveapplication.pdf");
		returnData.put("status", true);
		return returnData;
	}

	

}
