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

import com.aspl.org.dto.OverTimeDepertmentWiseDTO;
import com.aspl.org.dto.OverTimeDepertmentWiseEmpDetailsDTO;
import com.aspl.org.report.CrawleyOverTimeReportGenerator;
import com.aspl.org.report.service.OvertimeDeptWiseReportService;
import com.aspl.org.service.OverTimeReportService;
import com.aspl.org.utils.PurchaseUtil;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

@Service
public class OvertimeDeptWiseReportServiceImpl implements OvertimeDeptWiseReportService {

	static Date date = new java.util.Date();
	static long time = date.getTime();
	static int randNum = (int) ((int) Math.random() + time);
	String fileName = "invReport";

	@Autowired OverTimeReportService overTimeReportService;
	@Autowired PurchaseUtil purchaseUtil;
	
	@Override
	public Map<String, Object> OvertimeDeptWiseReport(HttpServletRequest request,  String fromDate, String toDate) {

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
				//writer = PdfWriter.getInstance(document, new FileOutputStream("src/main/resources/pdf/crawley_overtime_deptwise_"+ fromDate + "_to_"+toDate+".pdf"));
				writer = PdfWriter.getInstance(document, new FileOutputStream("/home/pdf/crawley_overtime_deptwise_"+ fromDate + "_to_"+toDate+".pdf"));
				writer.setPdfVersion(PdfWriter.VERSION_1_7);

			} catch (DocumentException e1) {

				e1.printStackTrace();

			} catch (IOException e1) {

				e1.printStackTrace();

			}

			document.open();

			List<OverTimeDepertmentWiseDTO> report = new ArrayList<>();
			List<OverTimeDepertmentWiseEmpDetailsDTO> reportLines = new ArrayList<>();

			if (!fromDate.isEmpty() || fromDate != null || fromDate != "" || !toDate.isEmpty() || toDate != null || toDate != "") {

				report = overTimeReportService.getOverTimedetailsdepartmentwise(fromDate, toDate);
				//reportLines = report.getPurchaseIndentReportItemsDTO();
				System.out.println(report);
			}

			boolean newPage = true;

			
			int lineindex = 0;
			
				//////////////// ADVANCE PAYMENT REPORT ////////////////////////////////////
			
				/////////////////////////// For Single Page ///////////////////////
				document.newPage();

				///////////////// LEAVE APPLICATION REPORT TITLE ////////////////////////////

				// Header 1
				PdfPTable header1 = CrawleyOverTimeReportGenerator.createHeader1(
						 
					);
				document.add(header1);
				
				// Header 2
				PdfPTable header2 = CrawleyOverTimeReportGenerator.createHeader2(
						fromDate, 
						toDate
					);
				document.add(header2);
				
				for(int i = 0 ; i < report.size() ; i++) {
					PdfPTable furnaceDept = CrawleyOverTimeReportGenerator.createFurnaceDept(
								report.get(i).getDepartmentName()
							);
					document.add(furnaceDept);
			
					PdfPTable descriptionTableHeadDept1 = CrawleyOverTimeReportGenerator.createDescriptionTableHeadDept1();
					document.add(descriptionTableHeadDept1);
			
					reportLines = report.get(i).getOtDepertmentWiseEmpDetailsDTO();
					
					
					if(reportLines!=null) {
						for (int j = lineindex; j < reportLines.size(); j++) {
							
							// Description Table Data
							PdfPTable listItems = CrawleyOverTimeReportGenerator.createDescriptionTableDept1(
										j+1,
										reportLines.get(j).getEmpCode(),
										reportLines.get(j).getEmpName(),
										reportLines.get(j).getOtHrs(),
										reportLines.get(j).getOtamount()
									);
							document.add(listItems);
							
						  
							//document.newPage(); 	
						
						}
					}
					
				}
				
				//////////////// END OF ADVANCE PAYMENT REPORT ////////////////////////////////////
				
			document.close();

		} catch (Exception e) {
			
			e.printStackTrace();
		}
		returnData.put("fileName", "crawley_overtime_deptwise_.pdf");
		returnData.put("status", true);
		return returnData;
	}

	

}
