package com.aspl.org.report.service.impl;

/***/
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aspl.org.entity.WelfareFundReport;
import com.aspl.org.report.WelfareFundReportGenerator;
import com.aspl.org.report.service.WelfareFundStatementReportService;
import com.aspl.org.service.WelfareFundReportService;
import com.aspl.org.utils.PurchaseUtil;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

@Service
public class WelfareFundStatementReportServiceImpl implements WelfareFundStatementReportService {

	static Date date = new java.util.Date();
	static long time = date.getTime();
	static int randNum = (int) ((int) Math.random() + time);
	String fileName = "invReport";

	@Autowired WelfareFundReportService welfareFundReportService;
	@Autowired PurchaseUtil purchaseUtil;
	
	@Override
	public Map<String, Object> getWelfareFundStatementReport(HttpServletRequest request,  Integer welfarefundeportId) {

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
				//writer = PdfWriter.getInstance(document, new FileOutputStream("src/main/resources/pdf/crawley_Welfare_fund_statement.pdf"));
				writer = PdfWriter.getInstance(document, new FileOutputStream("/home/pdf/crawley_Welfare_fund_statement.pdf"));

				writer.setPdfVersion(PdfWriter.VERSION_1_7);

			} catch (DocumentException e1) {

				e1.printStackTrace();

			} catch (IOException e1) {

				e1.printStackTrace();

			}

			document.open();

			//List<PayslipDTO> report = new PayslipDTO();
			Optional<WelfareFundReport> reportLines = null;

			if ( welfarefundeportId != null ) {

				reportLines = welfareFundReportService.findByreportId(welfarefundeportId);
				//reportLines = report.getPurchaseIndentReportItemsDTO();

			}

			boolean newPage = true;

			
			int lineindex = 0;
			
				//////////////// ADVANCE PAYMENT REPORT ////////////////////////////////////
			
				/////////////////////////// For Single Page ///////////////////////
				document.newPage();

				///////////////// LEAVE APPLICATION REPORT TITLE ////////////////////////////

				// Header 1
				PdfPTable header1 = WelfareFundReportGenerator.createHeader1(
						 
					);
				document.add(header1);
				
				// Header 2
				PdfPTable header2 = WelfareFundReportGenerator.createHeader2(
						
					);
				document.add(header2);
				
				// Header 3
				PdfPTable header3 = WelfareFundReportGenerator.createHeader3(
					
					);
				document.add(header3);
				
				// Header 4
				PdfPTable header4 = WelfareFundReportGenerator.createHeader4(
					
					);
				document.add(header4);
				
				// Table 1
				PdfPTable table1 = WelfareFundReportGenerator.createTable1(
					
					);
				document.add(table1);
				PdfPTable table2 = WelfareFundReportGenerator.createTable2(
						
					);
				document.add(table2);
				PdfPTable table3 = WelfareFundReportGenerator.createTable3(
						
					);
				document.add(table3);
				PdfPTable table4 = WelfareFundReportGenerator.createTable4(
						
					);
				document.add(table4);
				PdfPTable table5 = WelfareFundReportGenerator.createTable5(
						
					);
				document.add(table5);
				PdfPTable table6 = WelfareFundReportGenerator.createTable6(
						
					);
				document.add(table6);
				PdfPTable table7 = WelfareFundReportGenerator.createTable7(
						
					);
				document.add(table7);
				PdfPTable table8 = WelfareFundReportGenerator.createTable8(
						
					);
				document.add(table8);
				PdfPTable table9 = WelfareFundReportGenerator.createTable9(
						
					);
				document.add(table9);
				PdfPTable table10 = WelfareFundReportGenerator.createTable10(
						
					);
				document.add(table10);
				PdfPTable table11 = WelfareFundReportGenerator.createTable11(
						
					);
				document.add(table11);
				PdfPTable table12 = WelfareFundReportGenerator.createTable12(
						
					);
				document.add(table12);
				PdfPTable table13 = WelfareFundReportGenerator.createTable13(reportLines.get().getTotalNoOfEmp()
						
					);
				document.add(table13);
				PdfPTable table14 = WelfareFundReportGenerator.createTable14(reportLines.get().getNoOfEmpContributionDeducted()
						
					);
				document.add(table14);
				
				PdfPTable table15 = WelfareFundReportGenerator.createTable15(reportLines.get().getNoOfEmployefromconTender()
						
					);
				document.add(table15);
				PdfPTable table16 = WelfareFundReportGenerator.createTable16(reportLines.get().getTotalAmtofEmpFromContriTender()
						
					);
				document.add(table16);
				PdfPTable table17 = WelfareFundReportGenerator.createTable17(reportLines.get().getToAmtofContractorLabour()
						
					);
				document.add(table17);
				PdfPTable table18 = WelfareFundReportGenerator.createTable18(reportLines.get().getGrandTotal()
						
					);
				document.add(table18);
				PdfPTable table19 = WelfareFundReportGenerator.createTable19(
						
					);
				document.add(table19);
				PdfPTable table20 = WelfareFundReportGenerator.createTable20(reportLines.get().getChequeCash(),reportLines.get().getChequeDate(),reportLines.get().getBranch()
						
					);
				document.add(table20);
				PdfPTable table21 = WelfareFundReportGenerator.createTable21(
						
					);
				document.add(table21);
				PdfPTable table22 = WelfareFundReportGenerator.createTable22(
						
					);
				document.add(table22);
				PdfPTable table23 = WelfareFundReportGenerator.createTable23(
						
					);
				document.add(table23);
				PdfPTable table24 = WelfareFundReportGenerator.createTable24(
						
					);
				document.add(table24);
				PdfPTable table25 = WelfareFundReportGenerator.createTable25(
						
					);
				document.add(table25);
				
				
				
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
