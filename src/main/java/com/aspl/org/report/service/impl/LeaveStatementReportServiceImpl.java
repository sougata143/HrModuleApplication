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

import com.aspl.org.dto.EsiContributionDTO;
import com.aspl.org.dto.LeaveStatementDTO;
import com.aspl.org.report.CrawleyLeaveStatementReportGenerator;
import com.aspl.org.report.service.LeaveStatementReportService;
import com.aspl.org.service.LeaveMasterService;
import com.aspl.org.utils.PurchaseUtil;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

@Service
public class LeaveStatementReportServiceImpl implements LeaveStatementReportService {

	static Date date = new java.util.Date();
	static long time = date.getTime();
	static int randNum = (int) ((int) Math.random() + time);
	String fileName = "invReport";

	@Autowired LeaveMasterService leaveMasterService;
	@Autowired PurchaseUtil purchaseUtil;
	
	@Override
	public Map<String, Object> getLeaveStatementReport(HttpServletRequest request,  String currYear) {

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
				//writer = PdfWriter.getInstance(document, new FileOutputStream("src/main/resources/pdf/crawley_leave_statement_"+ currYear+".pdf"));
				writer = PdfWriter.getInstance(document, new FileOutputStream("/home/pdf/crawley_leave_statement_"+ currYear+".pdf"));
				writer.setPdfVersion(PdfWriter.VERSION_1_7);

			} catch (DocumentException e1) {

				e1.printStackTrace();

			} catch (IOException e1) {

				e1.printStackTrace();

			}

			document.open();

			//List<PayslipDTO> report = new PayslipDTO();
			List<LeaveStatementDTO> report = new ArrayList<>();
			List<EsiContributionDTO> reportLines = new ArrayList<>();
			
			if (!currYear.isEmpty() || currYear != null || currYear != "") {

				report = leaveMasterService.getLeaveStatementReport(currYear);
				

			}

			boolean newPage = true;

			
			int lineindex = 0;
			
				//////////////// ADVANCE PAYMENT REPORT ////////////////////////////////////
			
				/////////////////////////// For Single Page ///////////////////////
				document.newPage();

				///////////////// LEAVE APPLICATION REPORT TITLE ////////////////////////////

				// Header 1
				PdfPTable header1 = CrawleyLeaveStatementReportGenerator.createHeader1();
				document.add(header1);
				
				// Header 2
				PdfPTable header2 = CrawleyLeaveStatementReportGenerator.createHeader2();
				document.add(header2);
				
				// Description Table Head
				PdfPTable descriptionTableHead1 = CrawleyLeaveStatementReportGenerator.createDescriptionTableHead1();
				document.add(descriptionTableHead1);
				
				PdfPTable descriptionTableHead2 = CrawleyLeaveStatementReportGenerator.createDescriptionTableHead2();
				document.add(descriptionTableHead2);
				
				// Description Table Data
				for(int i = 0 ; i < report.size() ; i++) {
					PdfPTable listItems = CrawleyLeaveStatementReportGenerator.createDescriptionTable(
							report.get(i).getEmpcode(),
							report.get(i).getEmpname(),
							report.get(i).getOpeningCL(),
							report.get(i).getOpeningPL(),
							report.get(i).getOpeningSL(),
							report.get(i).getCurrentyearCL(),
							report.get(i).getCurrentyearPL(),
							report.get(i).getCurrentyearSL()
						);
					document.add(listItems);
				}
				
				
				//////////////// END OF ADVANCE PAYMENT REPORT ////////////////////////////////////
				
			document.close();

		} catch (Exception e) {
			
			e.printStackTrace();
		}
		returnData.put("fileName", "crawley_leave_statement.pdf");
		returnData.put("status", true);
		return returnData;
	}

	

}
