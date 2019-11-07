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

import com.aspl.org.dto.AdvancePayDTO;
import com.aspl.org.report.CrawleyAdvancePaymentReportGenerator;
import com.aspl.org.report.service.AdvancePaymentReportService;

import com.aspl.org.service.AdvSalaryService;
import com.aspl.org.utils.PurchaseUtil;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

@Service
public class AdvancePaymentReportServiceImpl implements AdvancePaymentReportService {

	static Date date = new java.util.Date();
	static long time = date.getTime();
	static int randNum = (int) ((int) Math.random() + time);
	String fileName = "invReport";

	@Autowired AdvSalaryService advSalaryService;
	@Autowired PurchaseUtil purchaseUtil;
	
	@Override
	public Map<String, Object> getAdvancePaymentReport(HttpServletRequest request,  String fromDate, String toDate) {

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
				//writer = PdfWriter.getInstance(document, new FileOutputStream("src/main/resources/pdf/crawley_advance_payment_"+ fromDate + "_to_"+toDate+".pdf"));
				writer = PdfWriter.getInstance(document, new FileOutputStream("/home/pdf/crawley_advance_payment_"+ fromDate + "_to_"+toDate+".pdf"));

				writer.setPdfVersion(PdfWriter.VERSION_1_7);

			} catch (DocumentException e1) {

				e1.printStackTrace();

			} catch (IOException e1) {

				e1.printStackTrace();

			}

			document.open();

			//List<PayslipDTO> report = new PayslipDTO();
			List<AdvancePayDTO> reportLines = new ArrayList<>();

			if (!fromDate.isEmpty() || fromDate != null || fromDate != "" || !toDate.isEmpty() || toDate != null || toDate != "") {

				reportLines = advSalaryService.findByVoucherDateBetween(fromDate, toDate);
				//reportLines = report.getPurchaseIndentReportItemsDTO();

			}

			boolean newPage = true;

			
			int lineindex = 0;
			
				//////////////// ADVANCE PAYMENT REPORT ////////////////////////////////////
			
				/////////////////////////// For Single Page ///////////////////////
				document.newPage();

				///////////////// LEAVE APPLICATION REPORT TITLE ////////////////////////////

				// Header 1
				PdfPTable header1 = CrawleyAdvancePaymentReportGenerator.createHeader1(
						 
					);
				document.add(header1);
				
				// Header 2
				PdfPTable header2 = CrawleyAdvancePaymentReportGenerator.createHeader2(
						fromDate, 
						toDate
					);
				document.add(header2);
				
				// Description Table Head
				PdfPTable descriptionTableHead1 = CrawleyAdvancePaymentReportGenerator.createDescriptionTableHead1(
						 
					);
				document.add(descriptionTableHead1);
				
				for (int i = lineindex; i < reportLines.size(); i++) {
					
					AdvancePayDTO reportitems = reportLines.get(i);
					
					// Description Table Data
					PdfPTable listItems = CrawleyAdvancePaymentReportGenerator.createDescriptionTable(
							 i+1,
							 reportitems.getVoucherDate(),
							 reportitems.getVoucherNo(),
							 reportitems.getEmpcode(),
							 reportitems.getEmployeeName(),
							 reportitems.getAdvamount(),
							 reportitems.getBalenceamount(),
							 reportitems.getNoofinstallments(),
							 reportitems.getInstallmentamt()
						);
					document.add(listItems);
				  
					//document.newPage(); 	
				
				}
				
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
