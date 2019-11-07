package com.aspl.org.report.service.impl;

/***/
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.aspl.org.dto.WagessheetforWorkersDTO;

import com.aspl.org.report.CrawleyWagesSheetReportGenerator;
import com.aspl.org.report.service.WagesSheetReportService;
import com.aspl.org.service.impl.WagessheetforworkerService;
import com.aspl.org.utils.PurchaseUtil;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

@Service
public class WagesSheetReportServiceImpl implements WagesSheetReportService {

	static Date date = new java.util.Date();
	static long time = date.getTime();
	static int randNum = (int) ((int) Math.random() + time);
	String fileName = "invReport";

	@Autowired WagessheetforworkerService wagessheetforworkerService;
	@Autowired PurchaseUtil purchaseUtil;
	
	@Override
	public Map<String, Object> getWagesSheetReport(HttpServletRequest request, String foremployee, String fromDate, String toDate) {

		Map<String, String> param = new HashMap<String, String>();
		Map<String, Object> returnData = new HashMap<String, Object>();

		String RESULT_FILE = request.getServletContext().getRealPath("resources/static/pdf");

		DecimalFormat df = new DecimalFormat("#.##");
		//String totalPoQntSA = df.format(totalPoQnt);
		
		try {

			Document document = new Document();

			document.setPageSize(PageSize.A4.rotate());
			document.setMargins(15, 15, 15, 15);

			PdfWriter writer;
			System.out.println("Result path "+RESULT_FILE);
			try {
				//writer = PdfWriter.getInstance(document, new FileOutputStream("src/main/resources/pdf/crawley_wages_for_worker_"+ fromDate + "_to_"+toDate+".pdf"));
				writer = PdfWriter.getInstance(document, new FileOutputStream("/home/pdf/crawley_wages_for_worker_"+ fromDate + "_to_"+toDate+".pdf"));
				writer.setPdfVersion(PdfWriter.VERSION_1_7);

			} catch (DocumentException e1) {

				e1.printStackTrace();

			} catch (IOException e1) {

				e1.printStackTrace();

			}

			document.open();

			//List<PayslipDTO> report = new PayslipDTO();
			List<WagessheetforWorkersDTO> reportLines = new ArrayList<>();

			if (!fromDate.isEmpty() || fromDate != null || fromDate != "" || !toDate.isEmpty() || toDate != null || toDate != "") {

				reportLines = wagessheetforworkerService.getPrintwagessheetreportforworker(foremployee , fromDate, toDate);

			}

			boolean newPage = true;
			
			int TotalLinePerPage = 28;
			int numberOfPage     = reportLines.size() / TotalLinePerPage;
			int RemainderCount   = reportLines.size() % TotalLinePerPage;
			
			int lastPageLine     = reportLines.size() - (TotalLinePerPage * numberOfPage);
			
			if (RemainderCount > 0) {
				numberOfPage = numberOfPage + 1;
			}
			
			int lineindex = 0;
			
			/////// GLOBAL TOTAL VARIABLE DECL. ///////////
			Double TotalworkdaysGlobal 			= 0.0;
			Double HdGlobal 					= 0.0;
			Double LeavedayGlobal 				= 0.0;
			Double DayforpayGlobal 				= 0.0;
			Double RateperdayGlobal 			= 0.0;
			Double NormalwagesearnedGlobal		= 0.0;
			Double OThrsGlobal					= 0.0;
			Double OTamtGlobal					= 0.0;
			Double GrosswagesearnedGlobal		= 0.0;
			Double WagesAdvdeductionGlobal		= 0.0;
			Double PfAmtdeductionGlobal			= 0.0;
			Double EmpPenfunddeductionGlobal	= 0.0;
			Double ErSrpfdeductionGlobal		= 0.0;
			Double FineAmtdeductionGlobal		= 0.0;
			Double TotalDeductionGlobal			= 0.0;
			Double TotalNetpayGlobal			= 0.0;
			
			if(numberOfPage <= 1) {
				//////////////// WAGES SHEET REPORT ////////////////////////////////////
				
				/////////////////////////// For Single Page ///////////////////////
				document.newPage();

				///////////////// WAGES SHEET REPORT TITLE ////////////////////////////

				// Header 1
				PdfPTable header1 = CrawleyWagesSheetReportGenerator.createHeader1(
						 
					);
				document.add(header1);
				
				// Header 2
				PdfPTable header2 = CrawleyWagesSheetReportGenerator.createHeader2(
						fromDate, 
						toDate
					);
				document.add(header2);
				
				// Description Table Head 1
				PdfPTable descriptionTableHead1 = CrawleyWagesSheetReportGenerator.createDescriptionTableHead1(
						 
					);
				document.add(descriptionTableHead1);
				
				// Description Table Head 2
				PdfPTable descriptionTableHead2 = CrawleyWagesSheetReportGenerator.createDescriptionTableHead2(
						 
					);
				document.add(descriptionTableHead2);
				
				/////// TOTAL VARIABLE DECL. ///////////
				Double TotalworkdaysTotal 		= 0.0;
				Double HdTotal 					= 0.0;
				Double LeavedayTotal 			= 0.0;
				Double DayforpayTotal 			= 0.0;
				Double RateperdayTotal 			= 0.0;
				Double NormalwagesearnedTotal	= 0.0;
				Double OThrsTotal				= 0.0;
				Double OTamtTotal				= 0.0;
				Double GrosswagesearnedTotal	= 0.0;
				Double WagesAdvdeductionTotal	= 0.0;
				Double PfAmtdeductionTotal		= 0.0;
				Double EmpPenfunddeductionTotal	= 0.0;
				Double ErSrpfdeductionTotal		= 0.0;
				Double FineAmtdeductionTotal	= 0.0;
				Double TotalDeductionTotal		= 0.0;
				Double TotalNetpayTotal			= 0.0;
				
				for (int i = lineindex; i < reportLines.size(); i++) {
					
					WagessheetforWorkersDTO reportitems = reportLines.get(i);
					
					// Description Table Data
					PdfPTable listItems = CrawleyWagesSheetReportGenerator.createDescriptionTable(
							 i+1,
							 reportitems.getEsino(),
							 reportitems.getEmpname(),
							 df.format(reportitems.getTotalworkdays()),
							 df.format(reportitems.getHd()),
							 df.format(reportitems.getLeaveday()),
							 df.format(reportitems.getDayforpay()),
							 df.format(reportitems.getRateperday()),
							 df.format(reportitems.getNormalwagesearned()),
							 reportitems.getoThrs(),
							 df.format(reportitems.getoTamt()),
							 df.format(reportitems.getGrosswagesearned()),
							 df.format(reportitems.getWagesAdvdeduction()),
							 df.format(reportitems.getPfAmtdeduction()),
							 df.format(reportitems.getEmpPenfunddeduction()),
							 df.format(reportitems.getErSrpfdeduction()),
							 df.format(reportitems.getFineAmtdeduction()),
							 df.format(reportitems.getTotalDeduction()),
							 df.format(reportitems.getTotalNetpay())
						);
					document.add(listItems);	
					
					//////// TOTAL CALCULATION ////////////////////////////////////////
					TotalworkdaysTotal 			+= reportitems.getTotalworkdays();
				    HdTotal 					+= reportitems.getHd();
					LeavedayTotal 				+= reportitems.getLeaveday();
					DayforpayTotal 				+= reportitems.getDayforpay();
					RateperdayTotal 			+= reportitems.getRateperday();
					NormalwagesearnedTotal		+= reportitems.getNormalwagesearned();
					OThrsTotal					+= reportitems.getoThrs();
					OTamtTotal					+= reportitems.getoTamt();
					GrosswagesearnedTotal		+= reportitems.getGrosswagesearned();
					WagesAdvdeductionTotal		+= reportitems.getWagesAdvdeduction();
					PfAmtdeductionTotal			+= reportitems.getPfAmtdeduction();
					EmpPenfunddeductionTotal	+= reportitems.getEmpPenfunddeduction();
					ErSrpfdeductionTotal		+= reportitems.getErSrpfdeduction();
					FineAmtdeductionTotal		+= reportitems.getFineAmtdeduction();
					TotalDeductionTotal			+= reportitems.getTotalDeduction();
					TotalNetpayTotal			+= reportitems.getTotalNetpay();
					
				}		
				
				///// TOTAL LINE /////////////////////////////////////////
				PdfPTable totalLine = CrawleyWagesSheetReportGenerator.createTotalLine(
						df.format(TotalworkdaysTotal), df.format(HdTotal), df.format(LeavedayTotal), df.format(DayforpayTotal),
						df.format(RateperdayTotal), df.format(NormalwagesearnedTotal), OThrsTotal, df.format(OTamtTotal),
						df.format(GrosswagesearnedTotal), df.format(WagesAdvdeductionTotal), df.format(PfAmtdeductionTotal), df.format(EmpPenfunddeductionTotal),
						df.format(ErSrpfdeductionTotal), df.format(FineAmtdeductionTotal), df.format(TotalDeductionTotal), df.format(TotalNetpayTotal)
					);
				document.add(totalLine);
				
				//////////////// END OF WAGES FOR WORKER REPORT ////////////////////////////////////
			}else {
				
				for(int n = 0; n < numberOfPage ; n++) {
					
					if(n==0){
						//////////////// WAGES SHEET REPORT ////////////////////////////////////
						
						/////////////////////////// For First Page ///////////////////////
						document.newPage();

						///////////////// WAGES SHEET REPORT TITLE ////////////////////////////

						// Header 1
						PdfPTable header1 = CrawleyWagesSheetReportGenerator.createHeader1(
								 
							);
						document.add(header1);
						
						// Header 2
						PdfPTable header2 = CrawleyWagesSheetReportGenerator.createHeader2(
								fromDate, 
								toDate
							);
						document.add(header2);
						
						// Description Table Head 1
						PdfPTable descriptionTableHead1 = CrawleyWagesSheetReportGenerator.createDescriptionTableHead1(
								 
							);
						document.add(descriptionTableHead1);
						
						// Description Table Head 2
						PdfPTable descriptionTableHead2 = CrawleyWagesSheetReportGenerator.createDescriptionTableHead2(
								 
							);
						document.add(descriptionTableHead2);
						
						
						/////// TOTAL VARIABLE DECL. ///////////
						Double TotalworkdaysTotal 		= 0.0;
						Double HdTotal 					= 0.0;
						Double LeavedayTotal 			= 0.0;
						Double DayforpayTotal 			= 0.0;
						Double RateperdayTotal 			= 0.0;
						Double NormalwagesearnedTotal	= 0.0;
						Double OThrsTotal				= 0.0;
						Double OTamtTotal				= 0.0;
						Double GrosswagesearnedTotal	= 0.0;
						Double WagesAdvdeductionTotal	= 0.0;
						Double PfAmtdeductionTotal		= 0.0;
						Double EmpPenfunddeductionTotal	= 0.0;
						Double ErSrpfdeductionTotal		= 0.0;
						Double FineAmtdeductionTotal	= 0.0;
						Double TotalDeductionTotal		= 0.0;
						Double TotalNetpayTotal			= 0.0;
						
						for (int i = lineindex; i < TotalLinePerPage; i++) {
							
							WagessheetforWorkersDTO reportitems = reportLines.get(i);
							
							// Description Table Data
							PdfPTable listItems = CrawleyWagesSheetReportGenerator.createDescriptionTable(
									 i+1,
									 reportitems.getEsino(),
									 reportitems.getEmpname(),
									 df.format(reportitems.getTotalworkdays()),
									 df.format(reportitems.getHd()),
									 df.format(reportitems.getLeaveday()),
									 df.format(reportitems.getDayforpay()),
									 df.format(reportitems.getRateperday()),
									 df.format(reportitems.getNormalwagesearned()),
									 reportitems.getoThrs(),
									 df.format(reportitems.getoTamt()),
									 df.format(reportitems.getGrosswagesearned()),
									 df.format(reportitems.getWagesAdvdeduction()),
									 df.format(reportitems.getPfAmtdeduction()),
									 df.format(reportitems.getEmpPenfunddeduction()),
									 df.format(reportitems.getErSrpfdeduction()),
									 df.format(reportitems.getFineAmtdeduction()),
									 df.format(reportitems.getTotalDeduction()),
									 df.format(reportitems.getTotalNetpay())
								);
							document.add(listItems);	
							
							//////// C/F TOTAL CALCULATION ////////////////////////////////////////
							TotalworkdaysTotal 			+= reportitems.getTotalworkdays();
						    HdTotal 					+= reportitems.getHd();
							LeavedayTotal 				+= reportitems.getLeaveday();
							DayforpayTotal 				+= reportitems.getDayforpay();
							RateperdayTotal 			+= reportitems.getRateperday();
							NormalwagesearnedTotal		+= reportitems.getNormalwagesearned();
							OThrsTotal					+= reportitems.getoThrs();
							OTamtTotal					+= reportitems.getoTamt();
							GrosswagesearnedTotal		+= reportitems.getGrosswagesearned();
							WagesAdvdeductionTotal		+= reportitems.getWagesAdvdeduction();
							PfAmtdeductionTotal			+= reportitems.getPfAmtdeduction();
							EmpPenfunddeductionTotal	+= reportitems.getEmpPenfunddeduction();
							ErSrpfdeductionTotal		+= reportitems.getErSrpfdeduction();
							FineAmtdeductionTotal		+= reportitems.getFineAmtdeduction();
							TotalDeductionTotal			+= reportitems.getTotalDeduction();
							TotalNetpayTotal			+= reportitems.getTotalNetpay();
							
							//////////////////////////////////////////////////////////////////
							TotalworkdaysGlobal 		= TotalworkdaysTotal;
							HdGlobal 					= HdTotal;
							LeavedayGlobal 				= LeavedayTotal;
							DayforpayGlobal 			= DayforpayTotal;
							RateperdayGlobal 			= RateperdayTotal;
							NormalwagesearnedGlobal		= NormalwagesearnedTotal;
							OThrsGlobal					= OThrsTotal;
							OTamtGlobal					= OTamtTotal;
							GrosswagesearnedGlobal		= GrosswagesearnedTotal;
							WagesAdvdeductionGlobal		= WagesAdvdeductionTotal;
							PfAmtdeductionGlobal		= PfAmtdeductionTotal;
							EmpPenfunddeductionGlobal	= EmpPenfunddeductionTotal;
							ErSrpfdeductionGlobal		= ErSrpfdeductionTotal;
							FineAmtdeductionGlobal		= FineAmtdeductionTotal;
							TotalDeductionGlobal		= TotalDeductionTotal;
							TotalNetpayGlobal			= TotalNetpayTotal;
						}
						
						///// C/F LINE /////////////////////////////////////////
						PdfPTable cfTotalLine = CrawleyWagesSheetReportGenerator.createCFTotalLine(
								df.format(TotalworkdaysGlobal), df.format(HdGlobal), df.format(LeavedayGlobal), df.format(DayforpayGlobal),
								df.format(RateperdayGlobal), df.format(NormalwagesearnedGlobal), OThrsGlobal, df.format(OTamtGlobal),
								df.format(GrosswagesearnedGlobal), df.format(WagesAdvdeductionGlobal), df.format(PfAmtdeductionGlobal), df.format(EmpPenfunddeductionGlobal),
								df.format(ErSrpfdeductionGlobal), df.format(FineAmtdeductionGlobal), df.format(TotalDeductionGlobal), df.format(TotalNetpayGlobal)
							);
						document.add(cfTotalLine);
						
						//////////////// END OF WAGES FOR WORKER REPORT ////////////////////////////////////
					}else if(n==(numberOfPage-1)) {
						//////////////// WAGES SHEET REPORT ////////////////////////////////////
						
						/////////////////////////// For Last Page ///////////////////////
						document.newPage();

						///////////////// WAGES SHEET REPORT TITLE ////////////////////////////

						// Header 1
						PdfPTable header1 = CrawleyWagesSheetReportGenerator.createHeader1(
								 
							);
						document.add(header1);
						
						// Header 2
						PdfPTable header2 = CrawleyWagesSheetReportGenerator.createHeader2(
								fromDate, 
								toDate
							);
						document.add(header2);
						
						// Description Table Head 1
						PdfPTable descriptionTableHead1 = CrawleyWagesSheetReportGenerator.createDescriptionTableHead1(
								 
							);
						document.add(descriptionTableHead1);
						
						// Description Table Head 2
						PdfPTable descriptionTableHead2 = CrawleyWagesSheetReportGenerator.createDescriptionTableHead2(
								 
							);
						document.add(descriptionTableHead2);
						
						/////// TOTAL VARIABLE DECL. ///////////
						Double TotalworkdaysTotal 		= 0.0;
						Double HdTotal 					= 0.0;
						Double LeavedayTotal 			= 0.0;
						Double DayforpayTotal 			= 0.0;
						Double RateperdayTotal 			= 0.0;
						Double NormalwagesearnedTotal	= 0.0;
						Double OThrsTotal				= 0.0;
						Double OTamtTotal				= 0.0;
						Double GrosswagesearnedTotal	= 0.0;
						Double WagesAdvdeductionTotal	= 0.0;
						Double PfAmtdeductionTotal		= 0.0;
						Double EmpPenfunddeductionTotal	= 0.0;
						Double ErSrpfdeductionTotal		= 0.0;
						Double FineAmtdeductionTotal	= 0.0;
						Double TotalDeductionTotal		= 0.0;
						Double TotalNetpayTotal			= 0.0;
						
						///// B/F LINE /////////////////////////////////////////
						PdfPTable bfTotalLine = CrawleyWagesSheetReportGenerator.createBFTotalLine(
								df.format(TotalworkdaysGlobal), df.format(HdGlobal), df.format(LeavedayGlobal), df.format(DayforpayGlobal),
								df.format(RateperdayGlobal), df.format(NormalwagesearnedGlobal), OThrsGlobal, df.format(OTamtGlobal),
								df.format(GrosswagesearnedGlobal), df.format(WagesAdvdeductionGlobal), df.format(PfAmtdeductionGlobal), df.format(EmpPenfunddeductionGlobal),
								df.format(ErSrpfdeductionGlobal), df.format(FineAmtdeductionGlobal), df.format(TotalDeductionGlobal), df.format(TotalNetpayGlobal)
							);
						document.add(bfTotalLine);
						
						for (int i = lineindex; i < (lastPageLine+lineindex); i++) {
							
							WagessheetforWorkersDTO reportitems = reportLines.get(i);
							
							// Description Table Data
							PdfPTable listItems = CrawleyWagesSheetReportGenerator.createDescriptionTable(
									 i+1,
									 reportitems.getEsino(),
									 reportitems.getEmpname(),
									 df.format(reportitems.getTotalworkdays()),
									 df.format(reportitems.getHd()),
									 df.format(reportitems.getLeaveday()),
									 df.format(reportitems.getDayforpay()),
									 df.format(reportitems.getRateperday()),
									 df.format(reportitems.getNormalwagesearned()),
									 reportitems.getoThrs(),
									 df.format(reportitems.getoTamt()),
									 df.format(reportitems.getGrosswagesearned()),
									 df.format(reportitems.getWagesAdvdeduction()),
									 df.format(reportitems.getPfAmtdeduction()),
									 df.format(reportitems.getEmpPenfunddeduction()),
									 df.format(reportitems.getErSrpfdeduction()),
									 df.format(reportitems.getFineAmtdeduction()),
									 df.format(reportitems.getTotalDeduction()),
									 df.format(reportitems.getTotalNetpay())
								);
							document.add(listItems);
							
							//////// TOTAL CALCULATION ////////////////////////////////////////
							TotalworkdaysTotal 			+= reportitems.getTotalworkdays();
						    HdTotal 					+= reportitems.getHd();
							LeavedayTotal 				+= reportitems.getLeaveday();
							DayforpayTotal 				+= reportitems.getDayforpay();
							RateperdayTotal 			+= reportitems.getRateperday();
							NormalwagesearnedTotal		+= reportitems.getNormalwagesearned();
							OThrsTotal					+= reportitems.getoThrs();
							OTamtTotal					+= reportitems.getoTamt();
							GrosswagesearnedTotal		+= reportitems.getGrosswagesearned();
							WagesAdvdeductionTotal		+= reportitems.getWagesAdvdeduction();
							PfAmtdeductionTotal			+= reportitems.getPfAmtdeduction();
							EmpPenfunddeductionTotal	+= reportitems.getEmpPenfunddeduction();
							ErSrpfdeductionTotal		+= reportitems.getErSrpfdeduction();
							FineAmtdeductionTotal		+= reportitems.getFineAmtdeduction();
							TotalDeductionTotal			+= reportitems.getTotalDeduction();
							TotalNetpayTotal			+= reportitems.getTotalNetpay();
							
							//////////////////////////////////////////////////////////////////
							TotalworkdaysGlobal 		= TotalworkdaysTotal;
							HdGlobal 					= HdTotal;
							LeavedayGlobal 				= LeavedayTotal;
							DayforpayGlobal 			= DayforpayTotal;
							RateperdayGlobal 			= RateperdayTotal;
							NormalwagesearnedGlobal		= NormalwagesearnedTotal;
							OThrsGlobal					= OThrsTotal;
							OTamtGlobal					= OTamtTotal;
							GrosswagesearnedGlobal		= GrosswagesearnedTotal;
							WagesAdvdeductionGlobal		= WagesAdvdeductionTotal;
							PfAmtdeductionGlobal		= PfAmtdeductionTotal;
							EmpPenfunddeductionGlobal	= EmpPenfunddeductionTotal;
							ErSrpfdeductionGlobal		= ErSrpfdeductionTotal;
							FineAmtdeductionGlobal		= FineAmtdeductionTotal;
							TotalDeductionGlobal		= TotalDeductionTotal;
							TotalNetpayGlobal			= TotalNetpayTotal;
						}
						
						///// TOTAL LINE /////////////////////////////////////////
						PdfPTable totalLine = CrawleyWagesSheetReportGenerator.createTotalLine(
								df.format(TotalworkdaysGlobal), df.format(HdGlobal), df.format(LeavedayGlobal), df.format(DayforpayGlobal),
								df.format(RateperdayGlobal), df.format(NormalwagesearnedGlobal), OThrsGlobal, df.format(OTamtGlobal),
								df.format(GrosswagesearnedGlobal), df.format(WagesAdvdeductionGlobal), df.format(PfAmtdeductionGlobal), df.format(EmpPenfunddeductionGlobal),
								df.format(ErSrpfdeductionGlobal), df.format(FineAmtdeductionGlobal), df.format(TotalDeductionGlobal), df.format(TotalNetpayGlobal)
							);
						document.add(totalLine);
						
						//////////////// END OF WAGES FOR WORKER REPORT ////////////////////////////////////
					}else {
						//////////////// WAGES SHEET REPORT ////////////////////////////////////
						
						/////////////////////////// For Intermediate Page ///////////////////////
						document.newPage();

						///////////////// WAGES SHEET REPORT TITLE ////////////////////////////

						// Header 1
						PdfPTable header1 = CrawleyWagesSheetReportGenerator.createHeader1(
								 
							);
						document.add(header1);
						
						// Header 2
						PdfPTable header2 = CrawleyWagesSheetReportGenerator.createHeader2(
								fromDate, 
								toDate
							);
						document.add(header2);
						
						// Description Table Head 1
						PdfPTable descriptionTableHead1 = CrawleyWagesSheetReportGenerator.createDescriptionTableHead1(
								 
							);
						document.add(descriptionTableHead1);
						
						// Description Table Head 2
						PdfPTable descriptionTableHead2 = CrawleyWagesSheetReportGenerator.createDescriptionTableHead2(
								 
							);
						document.add(descriptionTableHead2);
						
						/////// TOTAL VARIABLE DECL. ///////////
						Double TotalworkdaysTotal 		= 0.0;
						Double HdTotal 					= 0.0;
						Double LeavedayTotal 			= 0.0;
						Double DayforpayTotal 			= 0.0;
						Double RateperdayTotal 			= 0.0;
						Double NormalwagesearnedTotal	= 0.0;
						Double OThrsTotal				= 0.0;
						Double OTamtTotal				= 0.0;
						Double GrosswagesearnedTotal	= 0.0;
						Double WagesAdvdeductionTotal	= 0.0;
						Double PfAmtdeductionTotal		= 0.0;
						Double EmpPenfunddeductionTotal	= 0.0;
						Double ErSrpfdeductionTotal		= 0.0;
						Double FineAmtdeductionTotal	= 0.0;
						Double TotalDeductionTotal		= 0.0;
						Double TotalNetpayTotal			= 0.0;
											
						///// B/F LINE /////////////////////////////////////////
						PdfPTable bfTotalLine = CrawleyWagesSheetReportGenerator.createBFTotalLine(
								df.format(TotalworkdaysGlobal), df.format(HdGlobal), df.format(LeavedayGlobal), df.format(DayforpayGlobal),
								df.format(RateperdayGlobal), df.format(NormalwagesearnedGlobal), OThrsGlobal, df.format(OTamtGlobal),
								df.format(GrosswagesearnedGlobal), df.format(WagesAdvdeductionGlobal), df.format(PfAmtdeductionGlobal), df.format(EmpPenfunddeductionGlobal),
								df.format(ErSrpfdeductionGlobal), df.format(FineAmtdeductionGlobal), df.format(TotalDeductionGlobal), df.format(TotalNetpayGlobal)
							);
						document.add(bfTotalLine);
						
						
						for (int i = lineindex; i < TotalLinePerPage; i++) {
							
							WagessheetforWorkersDTO reportitems = reportLines.get(i);
							
							// Description Table Data
							PdfPTable listItems = CrawleyWagesSheetReportGenerator.createDescriptionTable(
									 i+1,
									 reportitems.getEsino(),
									 reportitems.getEmpname(),
									 df.format(reportitems.getTotalworkdays()),
									 df.format(reportitems.getHd()),
									 df.format(reportitems.getLeaveday()),
									 df.format(reportitems.getDayforpay()),
									 df.format(reportitems.getRateperday()),
									 df.format(reportitems.getNormalwagesearned()),
									 reportitems.getoThrs(),
									 df.format(reportitems.getoTamt()),
									 df.format(reportitems.getGrosswagesearned()),
									 df.format(reportitems.getWagesAdvdeduction()),
									 df.format(reportitems.getPfAmtdeduction()),
									 df.format(reportitems.getEmpPenfunddeduction()),
									 df.format(reportitems.getErSrpfdeduction()),
									 df.format(reportitems.getFineAmtdeduction()),
									 df.format(reportitems.getTotalDeduction()),
									 df.format(reportitems.getTotalNetpay())
								);
							document.add(listItems);	
							
							//////// TOTAL CALCULATION ////////////////////////////////////////
							TotalworkdaysTotal 			+= reportitems.getTotalworkdays();
							HdTotal 					+= reportitems.getHd();
							LeavedayTotal 				+= reportitems.getLeaveday();
							DayforpayTotal 				+= reportitems.getDayforpay();
							RateperdayTotal 			+= reportitems.getRateperday();
							NormalwagesearnedTotal		+= reportitems.getNormalwagesearned();
							OThrsTotal					+= reportitems.getoThrs();
							OTamtTotal					+= reportitems.getoTamt();
							GrosswagesearnedTotal		+= reportitems.getGrosswagesearned();
							WagesAdvdeductionTotal		+= reportitems.getWagesAdvdeduction();
							PfAmtdeductionTotal			+= reportitems.getPfAmtdeduction();
							EmpPenfunddeductionTotal	+= reportitems.getEmpPenfunddeduction();
							ErSrpfdeductionTotal		+= reportitems.getErSrpfdeduction();
							FineAmtdeductionTotal		+= reportitems.getFineAmtdeduction();
							TotalDeductionTotal			+= reportitems.getTotalDeduction();
							TotalNetpayTotal			+= reportitems.getTotalNetpay();
												
							//////////////////////////////////////////////////////////////////
							TotalworkdaysGlobal 		= TotalworkdaysTotal;
							HdGlobal 					= HdTotal;
							LeavedayGlobal 				= LeavedayTotal;
							DayforpayGlobal 			= DayforpayTotal;
							RateperdayGlobal 			= RateperdayTotal;
							NormalwagesearnedGlobal		= NormalwagesearnedTotal;
							OThrsGlobal					= OThrsTotal;
							OTamtGlobal					= OTamtTotal;
							GrosswagesearnedGlobal		= GrosswagesearnedTotal;
							WagesAdvdeductionGlobal		= WagesAdvdeductionTotal;
							PfAmtdeductionGlobal		= PfAmtdeductionTotal;
							EmpPenfunddeductionGlobal	= EmpPenfunddeductionTotal;
							ErSrpfdeductionGlobal		= ErSrpfdeductionTotal;
							FineAmtdeductionGlobal		= FineAmtdeductionTotal;
							TotalDeductionGlobal		= TotalDeductionTotal;
							TotalNetpayGlobal			= TotalNetpayTotal;
												
						}
						
						///// C/F LINE /////////////////////////////////////////
						PdfPTable cfTotalLine = CrawleyWagesSheetReportGenerator.createCFTotalLine(
								df.format(TotalworkdaysGlobal), df.format(HdGlobal), df.format(LeavedayGlobal), df.format(DayforpayGlobal),
								df.format(RateperdayGlobal), df.format(NormalwagesearnedGlobal), OThrsGlobal, df.format(OTamtGlobal),
								df.format(GrosswagesearnedGlobal), df.format(WagesAdvdeductionGlobal), df.format(PfAmtdeductionGlobal), df.format(EmpPenfunddeductionGlobal),
								df.format(ErSrpfdeductionGlobal), df.format(FineAmtdeductionGlobal), df.format(TotalDeductionGlobal), df.format(TotalNetpayGlobal)
							);
						document.add(cfTotalLine);
						
						//////////////// END OF WAGES FOR WORKER REPORT ////////////////////////////////////
					}
					lineindex = TotalLinePerPage;
					
					TotalLinePerPage = TotalLinePerPage + 20;
				}
				
			}
	
			document.close();

		} catch (Exception e) {
			
			e.printStackTrace();
		}
		returnData.put("fileName", "crawley_wages_for_worker.pdf");
		returnData.put("status", true);
		return returnData;
	}

	

}
