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


import com.aspl.org.dto.OverTimeDTO;
import com.aspl.org.report.CrawleyOverTimeAllReportGenerator;
import com.aspl.org.report.service.OverTimeReportPDFService;

import com.aspl.org.service.OverTimeReportService;
import com.aspl.org.service.UtilService;
import com.aspl.org.utils.GlobalDefine_;
import com.aspl.org.utils.PurchaseUtil;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

@Service

public class OverTimeReportServiceReportImpl implements OverTimeReportPDFService {

	static Date date = new java.util.Date();
	static long time = date.getTime();
	static int randNum = (int) ((int) Math.random() + time);
	String fileName = "invReport";

	@Autowired OverTimeReportService overTimeReportService;
	@Autowired PurchaseUtil purchaseUtil;
	@Autowired UtilService utilService;
	
	@Override
	public Map<String, Object> getOverTimeDetailsReport(HttpServletRequest request,  String fromDate, String toDate) {

		Map<String, String> param = new HashMap<String, String>();
		Map<String, Object> returnData = new HashMap<String, Object>();

		String RESULT_FILE = request.getServletContext().getRealPath("resources/static/pdf");
		
		try {
			
			Document document = new Document();

			document.setPageSize(PageSize.A4);
			document.setMargins(15, 15, 15, 15);

			PdfWriter writer;
			System.out.println("Result path " + RESULT_FILE);
			try {
				//writer = PdfWriter.getInstance(document, new FileOutputStream("src/main/resources/pdf/crawley_overtime_report_"+ fromDate + "_to_"+toDate+".pdf"));
				writer = PdfWriter.getInstance(document, new FileOutputStream("/home/pdf/crawley_overtime_report_"+ fromDate + "_to_"+toDate+".pdf"));
				writer.setPdfVersion(PdfWriter.VERSION_1_7);

			} catch (DocumentException e1) {

				e1.printStackTrace();

			} catch (IOException e1) {

				e1.printStackTrace();

			}

			document.open();

			List<OverTimeDTO> reportLines = new ArrayList<>();

			if (!fromDate.isEmpty() || fromDate != null || fromDate != "" || !toDate.isEmpty() || toDate != null || toDate != "") {

				reportLines = overTimeReportService.getOverTimedetails(fromDate, toDate);
			}

			boolean newPage = true;

			
			int lineindex = 0;
			
				//////////////// ADVANCE PAYMENT REPORT ////////////////////////////////////
			
				/////////////////////////// For Single Page ///////////////////////
				document.newPage();

				///////////////// LEAVE APPLICATION REPORT TITLE ////////////////////////////

				// Header 1
				PdfPTable header1 = CrawleyOverTimeAllReportGenerator.createHeader1(
						 
					);
				document.add(header1);
				
				// Header 2
				PdfPTable header2 = CrawleyOverTimeAllReportGenerator.createHeader2(
						fromDate, 
						toDate
					);
				document.add(header2);
				
				// Description Table Head
				PdfPTable descriptionTableHead1 = CrawleyOverTimeAllReportGenerator.createDescriptionTableHead1(
						 
					);
				document.add(descriptionTableHead1);
				OverTimeDTO reportitems = null;
				for (int i = lineindex; i < reportLines.size(); i++) {
					
					reportitems = reportLines.get(i);
					
					// Description Table Data
					String fromdatereport= utilService.dateFormatConversion(reportitems.getReportFromDate(), GlobalDefine_.dateFormat);
					String todatereport=utilService.dateFormatConversion(reportitems.getReportToDate(), GlobalDefine_.dateFormat);
					PdfPTable listItems = CrawleyOverTimeAllReportGenerator.createDescriptionTable(
							
							
							
							 i+1,
							 fromdatereport ,
							 todatereport ,
							 reportitems.getEmpCode(),
							 reportitems.getEmpName(),
							 reportitems.getOtHrs()
						);
					document.add(listItems);
				  
					//document.newPage(); 	
				
				}
				
				PdfPTable totalOTHours = CrawleyOverTimeAllReportGenerator.createTotalOTHours(
					 	reportLines.get(0).getTotalothouse()
					);
				document.add(totalOTHours);
				
				//////////////// END OF OVER TIME REPORT ////////////////////////////////////
				
			document.close();

		} catch (Exception e) {
			
			e.printStackTrace();
		}
		returnData.put("fileName", "overtime-all-report.pdf");
		returnData.put("status", true);
		return returnData;
	}

	

}
