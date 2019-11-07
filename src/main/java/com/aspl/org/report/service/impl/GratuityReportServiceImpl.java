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

import com.aspl.org.dto.GratuityDetailsDTO;
import com.aspl.org.report.CrawleyGratuityDetailsReportGenerator;
import com.aspl.org.report.service.GratuityReportService;
import com.aspl.org.service.GratuityDetailService;
import com.aspl.org.utils.PurchaseUtil;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

@Service
public class GratuityReportServiceImpl implements GratuityReportService {

	static Date date = new java.util.Date();
	static long time = date.getTime();
	static int randNum = (int) ((int) Math.random() + time);
	String fileName = "invReport";

	@Autowired GratuityDetailService gratuityDetailService;
	@Autowired PurchaseUtil purchaseUtil;
	
	@Override
	public Map<String, Object> getGratuityReport(HttpServletRequest request,  String month) {

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
				//writer = PdfWriter.getInstance(document, new FileOutputStream("src/main/resources/pdf/crawley_gratuity_"+ month+".pdf"));
				writer = PdfWriter.getInstance(document, new FileOutputStream("/home/pdf/crawley_gratuity_"+ month+".pdf"));
				writer.setPdfVersion(PdfWriter.VERSION_1_7);

			} catch (DocumentException e1) {

				e1.printStackTrace();

			} catch (IOException e1) {

				e1.printStackTrace();

			}

			document.open();

			//List<PayslipDTO> report = new PayslipDTO();
			List<GratuityDetailsDTO> report =  new ArrayList<>();
			
			if (!month.isEmpty() || month != null || month != "") {

				report = gratuityDetailService.getGratuityDetailReport(month);
				
				//reportLines = report.getPurchaseIndentReportItemsDTO();

			}

			boolean newPage = true;

			
			int lineindex = 0;
			
				//////////////// ADVANCE PAYMENT REPORT ////////////////////////////////////
			
				/////////////////////////// For Single Page ///////////////////////
				document.newPage();

				///////////////// LEAVE APPLICATION REPORT TITLE ////////////////////////////

				// Header 1
				PdfPTable header1 = CrawleyGratuityDetailsReportGenerator.createHeader1();
				document.add(header1);
				
				// Header 2
				PdfPTable header2 = CrawleyGratuityDetailsReportGenerator.createHeader2(month);
				document.add(header2);
				
				// Description Table Head
				PdfPTable descriptionTableHead1 = CrawleyGratuityDetailsReportGenerator.createDescriptionTableHead1();
				document.add(descriptionTableHead1);
				
				// Description Table Data
				for(int i = 0 ; i < report.size() ; i++) {
					PdfPTable listItems = CrawleyGratuityDetailsReportGenerator.createDescriptionTable(
							(i+1),
							report.get(i).getPolicyNo(),
							report.get(i).getLicid(),
							report.get(i).getEmpname(),
							report.get(i).getDob(),
							report.get(i).getDoa(),
							report.get(i).getDor(),
							report.get(i).getBasic()
						);
					document.add(listItems);
				}
				
				
				//////////////// END OF ADVANCE PAYMENT REPORT ////////////////////////////////////
				
			document.close();

		} catch (Exception e) {
			
			e.printStackTrace();
		}
		returnData.put("fileName", "crawley_gratuity.pdf");
		returnData.put("status", true);
		return returnData;
	}

	

}
