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
import com.aspl.org.dto.EsiContributionListDTO;
import com.aspl.org.report.CrawleyESIReportGenerator;
import com.aspl.org.report.service.EsiContributionReportService;
import com.aspl.org.service.EsiContributionService;
import com.aspl.org.utils.PurchaseUtil;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

@Service
public class EsiContributionReportServiceImpl implements EsiContributionReportService {

	static Date date = new java.util.Date();
	static long time = date.getTime();
	static int randNum = (int) ((int) Math.random() + time);
	String fileName = "invReport";

	@Autowired EsiContributionService esiContributionService;
	@Autowired PurchaseUtil purchaseUtil;
	
	@Override
	public Map<String, Object> getEsiContributionReport(HttpServletRequest request, String foremployee, String month) {

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
				//writer = PdfWriter.getInstance(document, new FileOutputStream("src/main/resources/pdf/crawley_esi_contribution_"+ month+".pdf"));
				writer = PdfWriter.getInstance(document, new FileOutputStream("/home/pdf/crawley_esi_contribution_"+ month+".pdf"));
				writer.setPdfVersion(PdfWriter.VERSION_1_7);

			} catch (DocumentException e1) {

				e1.printStackTrace();

			} catch (IOException e1) {

				e1.printStackTrace();

			}

			document.open();

			//List<PayslipDTO> report = new PayslipDTO();
			EsiContributionListDTO report = new EsiContributionListDTO();
			List<EsiContributionDTO> reportLines = new ArrayList<>();
			
			if (!month.isEmpty() || month != null || month != "") {

				report = esiContributionService.getEsiContributionReport(foremployee,month);
				reportLines = report.getEsiContributionDTOList();
				//reportLines = report.getPurchaseIndentReportItemsDTO();

			}

			boolean newPage = true;

			
			int lineindex = 0;
			
				//////////////// ADVANCE PAYMENT REPORT ////////////////////////////////////
			
				/////////////////////////// For Single Page ///////////////////////
				document.newPage();

				///////////////// LEAVE APPLICATION REPORT TITLE ////////////////////////////

				// Header 1
				PdfPTable header1 = CrawleyESIReportGenerator.createHeader1();
				document.add(header1);
				
				// Header 2
				PdfPTable header2 = CrawleyESIReportGenerator.createHeader2(month);
				document.add(header2);
				
				// Description Table Head
				PdfPTable descriptionTableHead1 = CrawleyESIReportGenerator.createDescriptionTableHead1();
				document.add(descriptionTableHead1);
				
				// Description Table Data
				for(int i = 0 ; i < reportLines.size() ; i++) {
					PdfPTable listItems = CrawleyESIReportGenerator.createDescriptionTable(
							(i+1),
							reportLines.get(i).getEsino(),
							reportLines.get(i).getEmpName(),
							reportLines.get(i).getDaysforPay(),
							reportLines.get(i).getAmount(),
							reportLines.get(i).getEsicontribution()
						);
					document.add(listItems);
				}
				
				// Carry forward Line
				PdfPTable carryForwardLine = CrawleyESIReportGenerator.createCarryFwdLine(
							report.getTotalamount(),
							report.getTotaldaysforPay(),
							report.getTotalesicontribution()
						);
				document.add(carryForwardLine);
				
				//////////////// END OF ADVANCE PAYMENT REPORT ////////////////////////////////////
				
			document.close();

		} catch (Exception e) {
			
			e.printStackTrace();
		}
		returnData.put("fileName", "crawley_esi_contribution_august.pdf");
		returnData.put("status", true);
		return returnData;
	}

	

}
