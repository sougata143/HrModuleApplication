package com.aspl.org.report.service.impl;

/***/
import java.io.FileOutputStream;
import java.io.IOException;

import java.util.Date;
import java.util.HashMap;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.aspl.org.report.HalfyearlyFrom23ReportGenerator;
import com.aspl.org.report.service.AnnualReportFrom23ReportService;


import com.aspl.org.service.AdvSalaryService;
import com.aspl.org.utils.PurchaseUtil;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

@Service
public class HalfyearlyFrom23ReportServiceImpl implements AnnualReportFrom23ReportService {

	static Date date = new java.util.Date();
	static long time = date.getTime();
	static int randNum = (int) ((int) Math.random() + time);
	String fileName = "invReport";

	@Autowired AdvSalaryService advSalaryService;
	@Autowired PurchaseUtil purchaseUtil;
	@Autowired AnnualReportFrom23ReportService annualReportFrom23ReportService;
	
	@Override
	public Map<String, Object> getAnnualReportFrom23Report(HttpServletRequest request) {

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
				//writer = PdfWriter.getInstance(document, new FileOutputStream("src/main/resources/pdf/crawley_half_yearly_from23"+".pdf"));
				writer = PdfWriter.getInstance(document, new FileOutputStream("/home/pdf/crawley_half_yearly_from23"+".pdf"));

				writer.setPdfVersion(PdfWriter.VERSION_1_7);

			} catch (DocumentException e1) {

				e1.printStackTrace();

			} catch (IOException e1) {

				e1.printStackTrace();

			}

			document.open();

			//List<PayslipDTO> report = new PayslipDTO();
			//Map<String, Object> reportLines = null;

			

				//reportLines = annualReportFrom23ReportService.getAnnualReportFrom23Report(request);
				//reportLines = report.getPurchaseIndentReportItemsDTO();

			

			boolean newPage = true;

			
			int lineindex = 0;
			
				//////////////// ADVANCE PAYMENT REPORT ////////////////////////////////////
			
				/////////////////////////// For Single Page ///////////////////////
				document.newPage();

				///////////////// LEAVE APPLICATION REPORT TITLE ////////////////////////////

				// Header 1
				PdfPTable header1 = HalfyearlyFrom23ReportGenerator.createHeader1(
						 
					);
				document.add(header1);
				
				// Header 2
				PdfPTable header2 = HalfyearlyFrom23ReportGenerator.createHeader2(
						
					);
				document.add(header2);
				
				// Header 3
				PdfPTable header3 = HalfyearlyFrom23ReportGenerator.createHeader3(
					
					);
				document.add(header3);
				
				// Header 4
				PdfPTable header4 = HalfyearlyFrom23ReportGenerator.createHeader4(
					
					);
				document.add(header4);
				
				// Table 1
				PdfPTable table1 = HalfyearlyFrom23ReportGenerator.createTable1(
					
					);
				document.add(table1);
				
				// Table 2
				PdfPTable table2 = HalfyearlyFrom23ReportGenerator.createTable2(
					
					);
				document.add(table2);
				
				// Table 2
				PdfPTable table3 = HalfyearlyFrom23ReportGenerator.createTable3(
					
					);
				document.add(table3);
				
				// Table 2
				PdfPTable table4 = HalfyearlyFrom23ReportGenerator.createTable4(
					
					);
				document.add(table4);
				
				// Table 2
				PdfPTable table5 = HalfyearlyFrom23ReportGenerator.createTable5(
					
					);
				document.add(table5);
				
				// Table 2
				PdfPTable table6 = HalfyearlyFrom23ReportGenerator.createTable6(
					
					);
				document.add(table6);
				
				// Table 2
				PdfPTable table7 = HalfyearlyFrom23ReportGenerator.createTable7(
					
					);
				document.add(table7);
				
				
				PdfPTable table8 = HalfyearlyFrom23ReportGenerator.createTable8(
					
					);
				document.add(table8);
				
				PdfPTable table9 = HalfyearlyFrom23ReportGenerator.createTable9(
					
					);
				document.add(table9);
				
				
				PdfPTable table10 = HalfyearlyFrom23ReportGenerator.createTable10(
					
					);
				document.add(table10);
				
				// Table 8
				PdfPTable table11 = HalfyearlyFrom23ReportGenerator.createTable11(
					
					);
				document.add(table11);
				
				
				
				PdfPTable table12 = HalfyearlyFrom23ReportGenerator.createTable12(
						
					);
				document.add(table12);
				
				PdfPTable table13 = HalfyearlyFrom23ReportGenerator.createTable13(
						
					);
				document.add(table13);
				
				PdfPTable table14 = HalfyearlyFrom23ReportGenerator.createTable14(
						
					);
				document.add(table14);
					
					
				PdfPTable table15 = HalfyearlyFrom23ReportGenerator.createTable15(
						
					);
				document.add(table15);
				
				PdfPTable table16 = HalfyearlyFrom23ReportGenerator.createTable16(
						
					);
				document.add(table16);
				PdfPTable table17 = HalfyearlyFrom23ReportGenerator.createTable17(
						
					);
				document.add(table17);
				PdfPTable table18 = HalfyearlyFrom23ReportGenerator.createTable18(
						
					);
				document.add(table18);
				PdfPTable table19 = HalfyearlyFrom23ReportGenerator.createTable19(
						
					);
				document.add(table19);
				PdfPTable table20 = HalfyearlyFrom23ReportGenerator.createTable20(
						
					);
				document.add(table20);
				PdfPTable table21 = HalfyearlyFrom23ReportGenerator.createTable21(
						
					);
				document.add(table21);
				PdfPTable table22 = HalfyearlyFrom23ReportGenerator.createTable22(
						
					);
				document.add(table22);
				
				//////////////// END OF ADVANCE PAYMENT REPORT ////////////////////////////////////
				
			document.close();

		} catch (Exception e) {
			
			e.printStackTrace();
		}
		returnData.put("fileName", "advancepayment.pdf");
		returnData.put("status", true);
		return returnData;
	}

	

}
