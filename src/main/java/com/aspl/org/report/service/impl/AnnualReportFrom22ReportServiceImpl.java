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

import com.aspl.org.entity.AnnualReport;
import com.aspl.org.report.AnnualReportFrom22ReportGenerator;
import com.aspl.org.report.service.AnnualReportFrom22ReportService;
import com.aspl.org.service.AnnualReportService;
import com.aspl.org.utils.PurchaseUtil;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

@Service
public class AnnualReportFrom22ReportServiceImpl implements AnnualReportFrom22ReportService {

	static Date date = new java.util.Date();
	static long time = date.getTime();
	static int randNum = (int) ((int) Math.random() + time);
	String fileName = "invReport";

	@Autowired AnnualReportService annualReportService;
	@Autowired PurchaseUtil purchaseUtil;
	
	@Override
	public Map<String, Object> getAnnualReportFrom22Report(HttpServletRequest request,  Integer reportId) {

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
				//writer = PdfWriter.getInstance(document, new FileOutputStream("src/main/resources/pdf/crawley_Annual_Report_from22"+".pdf"));
				writer = PdfWriter.getInstance(document, new FileOutputStream("/home/pdf/crawley_Annual_Report_from22"+".pdf"));

				writer.setPdfVersion(PdfWriter.VERSION_1_7);

			} catch (DocumentException e1) {

				e1.printStackTrace();

			} catch (IOException e1) {

				e1.printStackTrace();

			}

			document.open();

			//List<PayslipDTO> report = new PayslipDTO();
			Optional<AnnualReport> reportLines = null;

			if ( reportId != null ) {

				reportLines = annualReportService.findByreportId(reportId);
				//reportLines = report.getPurchaseIndentReportItemsDTO();

			}

			boolean newPage = true;

			
			int lineindex = 0;
			
				//////////////// ADVANCE PAYMENT REPORT ////////////////////////////////////
			
				/////////////////////////// For Single Page ///////////////////////
				document.newPage();

				///////////////// LEAVE APPLICATION REPORT TITLE ////////////////////////////

				// Header 1
				PdfPTable header1 = AnnualReportFrom22ReportGenerator.createHeader1(
						 
					);
				document.add(header1);
				
				// Header 2
				PdfPTable header2 = AnnualReportFrom22ReportGenerator.createHeader2(
						
					);
				document.add(header2);
				
				// Header 3
				PdfPTable header3 = AnnualReportFrom22ReportGenerator.createHeader3(
					
					);
				document.add(header3);
				
				// Table 1
				PdfPTable table1 = AnnualReportFrom22ReportGenerator.createTable1(reportLines.get().getClassificationCode()
					
					);
				document.add(table1);
				
				// Table 2
				PdfPTable table2 = AnnualReportFrom22ReportGenerator.createTable2(
					
					);
				document.add(table2);
				
				// Table 2
				PdfPTable table3 = AnnualReportFrom22ReportGenerator.createTable3(
					
					);
				document.add(table3);
				
				// Table 2
				PdfPTable table4 = AnnualReportFrom22ReportGenerator.createTable4(
					
					);
				document.add(table4);
				
				// Table 2
				PdfPTable table5 = AnnualReportFrom22ReportGenerator.createTable5(
					
					);
				document.add(table5);
				
				// Table 2
				PdfPTable table6 = AnnualReportFrom22ReportGenerator.createTable6(
					
					);
				document.add(table6);
				
				// Table 2
				PdfPTable table7 = AnnualReportFrom22ReportGenerator.createTable7(
					
					);
				document.add(table7);
				
				
				PdfPTable table8 = AnnualReportFrom22ReportGenerator.createTable8(
					
					);
				document.add(table8);
				
				// Header 4
				PdfPTable header4 = AnnualReportFrom22ReportGenerator.createHeader4(
					
					);
				document.add(header4);
				
				PdfPTable table9 = AnnualReportFrom22ReportGenerator.createTable9(
					
					);
				document.add(table9);
				
				
				PdfPTable table10 = AnnualReportFrom22ReportGenerator.createTable10(
					
					);
				document.add(table10);
				
				// Table 8
				PdfPTable table11 = AnnualReportFrom22ReportGenerator.createTable11(
					
					);
				document.add(table11);
				
				
				
				PdfPTable table12 = AnnualReportFrom22ReportGenerator.createTable12(
						
					);
				document.add(table12);
				
				PdfPTable table13 = AnnualReportFrom22ReportGenerator.createTable13(
						
					);
				document.add(table13);
				
				PdfPTable table14 = AnnualReportFrom22ReportGenerator.createTable14(
						
					);
				document.add(table14);
					
					
				PdfPTable table15 = AnnualReportFrom22ReportGenerator.createTable15(
						
					);
				document.add(table15);
				
				PdfPTable table16 = AnnualReportFrom22ReportGenerator.createTable16(
						
					);
				document.add(table16);
				
				PdfPTable table17 = AnnualReportFrom22ReportGenerator.createTable17(
						
					);
				document.add(table17);
				
				PdfPTable table18 = AnnualReportFrom22ReportGenerator.createTable18(
						
					);
				document.add(table18);
				
				PdfPTable table19 = AnnualReportFrom22ReportGenerator.createTable19(reportLines.get().getMandaysworkedformen()
						
					);
				document.add(table19);
				
				PdfPTable table20 = AnnualReportFrom22ReportGenerator.createTable20(
						
					);
				document.add(table20);
				
				PdfPTable table21 = AnnualReportFrom22ReportGenerator.createTable21(
						
					);
				document.add(table21);
				
				PdfPTable table22 = AnnualReportFrom22ReportGenerator.createTable22(
						
					);
				document.add(table22);
				
				PdfPTable table23 = AnnualReportFrom22ReportGenerator.createTable23(
						
					);
				document.add(table23);
				
				PdfPTable blankLine = AnnualReportFrom22ReportGenerator.createBlankLine();
				document.add(blankLine);
				
				PdfPTable table24 = AnnualReportFrom22ReportGenerator.createTable24(
						
					);
				document.add(table24);
				
				
				
				PdfPTable table25 = AnnualReportFrom22ReportGenerator.createTable25(
						
					);
				document.add(table25);
				
				PdfPTable table26 = AnnualReportFrom22ReportGenerator.createTable26(
						
					);
				document.add(table26);
				
				PdfPTable table27 = AnnualReportFrom22ReportGenerator.createTable27(
						
					);
				document.add(table27);
				
				PdfPTable table28 = AnnualReportFrom22ReportGenerator.createTable28(
						
					);
				document.add(table28);
				
				PdfPTable table29 = AnnualReportFrom22ReportGenerator.createTable29(
						
					);
				document.add(table29);
				
				PdfPTable table30 = AnnualReportFrom22ReportGenerator.createTable30(
						
					);
				document.add(table30);
				
				PdfPTable table31 = AnnualReportFrom22ReportGenerator.createTable31(
						
					);
				document.add(table31);
				PdfPTable table32 = AnnualReportFrom22ReportGenerator.createTable32(
						
					);
				document.add(table32);
				PdfPTable table33 = AnnualReportFrom22ReportGenerator.createTable33(
						
					);
				document.add(table33);
				PdfPTable table34 = AnnualReportFrom22ReportGenerator.createTable34(
						
					);
				document.add(table34);
				PdfPTable table35 = AnnualReportFrom22ReportGenerator.createTable35(reportLines.get().getDischargedismisquit()
						
					);
				document.add(table35);
				PdfPTable table36 = AnnualReportFrom22ReportGenerator.createTable36(reportLines.get().getNoofworkerinlieuofleave()
						
					);
				document.add(table36);
				
				PdfPTable header5 = AnnualReportFrom22ReportGenerator.createHeader5(
						 
					);
				document.add(header5);
				
				PdfPTable header6 = AnnualReportFrom22ReportGenerator.createHeader6(
						 
					);
				document.add(header6);
				
				PdfPTable table37 = AnnualReportFrom22ReportGenerator.createTable37(
						
					);
				document.add(table37);
				
				PdfPTable table38 = AnnualReportFrom22ReportGenerator.createTable38(
						
					);
				document.add(table38);
				
				PdfPTable blankLine1 = AnnualReportFrom22ReportGenerator.createBlankLine_1();
				document.add(blankLine1);
				
				PdfPTable table39 = AnnualReportFrom22ReportGenerator.createTable39(
						
					);
				document.add(table39);
				
				PdfPTable table40 = AnnualReportFrom22ReportGenerator.createTable40(
						
					);
				document.add(table40);
				
				PdfPTable table41 = AnnualReportFrom22ReportGenerator.createTable41(
						
					);
				document.add(table41);
				
				PdfPTable table42 = AnnualReportFrom22ReportGenerator.createTable42(
						
					);
				document.add(table42);
				
				PdfPTable table43 = AnnualReportFrom22ReportGenerator.createTable43(
						
					);
				document.add(table43);
				
				PdfPTable header7 = AnnualReportFrom22ReportGenerator.createHeader7(
					 
					);
				document.add(header7);
				
				PdfPTable table44 = AnnualReportFrom22ReportGenerator.createTable44(
						
					);
				document.add(table44);
				
				PdfPTable table45 = AnnualReportFrom22ReportGenerator.createTable45(
						
					);
				document.add(table45);
				PdfPTable table46 = AnnualReportFrom22ReportGenerator.createTable46(
						
					);
				document.add(table46);
				PdfPTable table47 = AnnualReportFrom22ReportGenerator.createTable47(
						
					);
				document.add(table47);
				PdfPTable table48 = AnnualReportFrom22ReportGenerator.createTable48(
						
					);
				document.add(table48);
				PdfPTable header8 = AnnualReportFrom22ReportGenerator.createHeader8(
						 
					);
				document.add(header8);
				PdfPTable table49 = AnnualReportFrom22ReportGenerator.createTable49(
						
					);
				document.add(table49);
				PdfPTable table50 = AnnualReportFrom22ReportGenerator.createTable50(
						
					);
				document.add(table50);
				PdfPTable header9 = AnnualReportFrom22ReportGenerator.createHeader9(
						 
					);
				document.add(header9);
				PdfPTable table51 = AnnualReportFrom22ReportGenerator.createTable51(
						
					);
				document.add(table51);
				PdfPTable table52 = AnnualReportFrom22ReportGenerator.createTable52(
						
					);
				document.add(table52);
				PdfPTable header10 = AnnualReportFrom22ReportGenerator.createHeader10(
						 
					);
				document.add(header10);
				PdfPTable table53 = AnnualReportFrom22ReportGenerator.createTable53(
						
					);
				document.add(table53);
				PdfPTable table54 = AnnualReportFrom22ReportGenerator.createTable54(
						
					);
				document.add(table54);
				
				PdfPTable blankLine2 = AnnualReportFrom22ReportGenerator.createBlankLine_2();
				document.add(blankLine2);
				
				PdfPTable table55 = AnnualReportFrom22ReportGenerator.createTable55(
						
					);
				document.add(table55);
				PdfPTable table56 = AnnualReportFrom22ReportGenerator.createTable56(
						
					);
				document.add(table56);
				PdfPTable table57 = AnnualReportFrom22ReportGenerator.createTable57(
						
					);
				document.add(table57);
				PdfPTable table58 = AnnualReportFrom22ReportGenerator.createTable58(
						
					);
				document.add(table58);
				PdfPTable table59 = AnnualReportFrom22ReportGenerator.createTable59(
						
					);
				document.add(table59);
				PdfPTable table60 = AnnualReportFrom22ReportGenerator.createTable60(
						
					);
				document.add(table60);
				
				PdfPTable header11 = AnnualReportFrom22ReportGenerator.createHeader11(
						 
					);
				document.add(header11);
				
				PdfPTable header12 = AnnualReportFrom22ReportGenerator.createHeader12(
						 
					);
				document.add(header12);
				PdfPTable table61 = AnnualReportFrom22ReportGenerator.createTable61(
						
					);
				document.add(table61);
				PdfPTable table62 = AnnualReportFrom22ReportGenerator.createTable62(
						
					);
				document.add(table62);
				PdfPTable table63 = AnnualReportFrom22ReportGenerator.createTable63(reportLines.get().getFatalaccidents(),reportLines.get().getNonfatalaccidents()
						
					);
				document.add(table63);
				PdfPTable table64 = AnnualReportFrom22ReportGenerator.createTable64(
						
					);
				document.add(table64);
				PdfPTable table65 = AnnualReportFrom22ReportGenerator.createTable65(
						
					);
				document.add(table65);
				PdfPTable table66 = AnnualReportFrom22ReportGenerator.createTable66(reportLines.get().getNoofaccidents(),reportLines.get().getMandaysLost()
						
					);
				document.add(table66);
				PdfPTable table67 = AnnualReportFrom22ReportGenerator.createTable67(
						
					);
				document.add(table67);
				PdfPTable table68 = AnnualReportFrom22ReportGenerator.createTable68(
						
					);
				document.add(table68);
				PdfPTable table69 = AnnualReportFrom22ReportGenerator.createTable69(
						
					);
				document.add(table69);
				PdfPTable table70 = AnnualReportFrom22ReportGenerator.createTable70(
						
					);
				document.add(table70);
				PdfPTable header13 = AnnualReportFrom22ReportGenerator.createHeader13(
						 
					);
				document.add(header13);
				
				PdfPTable table71 = AnnualReportFrom22ReportGenerator.createTable71(
						
					);
				document.add(table71);
				PdfPTable table72 = AnnualReportFrom22ReportGenerator.createTable72(
						
					);
				document.add(table72);
				PdfPTable table73 = AnnualReportFrom22ReportGenerator.createTable73(
						
					);
				document.add(table73);
				PdfPTable table74 = AnnualReportFrom22ReportGenerator.createTable74(
						
					);
				document.add(table74);
				PdfPTable table75 = AnnualReportFrom22ReportGenerator.createTable75(
						
					);
				document.add(table75);
				PdfPTable table76 = AnnualReportFrom22ReportGenerator.createTable76(
						
					);
				document.add(table76);
				PdfPTable table77 = AnnualReportFrom22ReportGenerator.createTable77(
						
					);
				document.add(table77);
				PdfPTable table78 = AnnualReportFrom22ReportGenerator.createTable78(
						
					);
				document.add(table78);
				PdfPTable table79 = AnnualReportFrom22ReportGenerator.createTable79(
						
					);
				document.add(table79);
				PdfPTable table80 = AnnualReportFrom22ReportGenerator.createTable80(
						
					);
				document.add(table80);
				PdfPTable header14 = AnnualReportFrom22ReportGenerator.createHeader14(
						 
					);
				document.add(header14);
				PdfPTable header15 = AnnualReportFrom22ReportGenerator.createHeader15(
						 
						);
				document.add(header15);
				PdfPTable table81 = AnnualReportFrom22ReportGenerator.createTable81(
						
					);
				document.add(table81);
				PdfPTable table82 = AnnualReportFrom22ReportGenerator.createTable82(
						
					);
				document.add(table82);
				PdfPTable table83 = AnnualReportFrom22ReportGenerator.createTable83(
						
					);
				document.add(table83);
				PdfPTable table84 = AnnualReportFrom22ReportGenerator.createTable84(
						
					);
				document.add(table84);
				PdfPTable table85 = AnnualReportFrom22ReportGenerator.createTable85(
						
					);
				document.add(table85);
				PdfPTable header16 = AnnualReportFrom22ReportGenerator.createHeader16(
						 
						);
				document.add(header16);
				PdfPTable header17 = AnnualReportFrom22ReportGenerator.createHeader17(
						 
						);
				document.add(header17);
				PdfPTable header18 = AnnualReportFrom22ReportGenerator.createHeader18(
						 
						);
				document.add(header18);
				PdfPTable table86 = AnnualReportFrom22ReportGenerator.createTable86(
						
					);
				document.add(table86);
				PdfPTable header19 = AnnualReportFrom22ReportGenerator.createHeader19(
						 
						);
				document.add(header19);
				PdfPTable table87 = AnnualReportFrom22ReportGenerator.createTable87(
						
					);
				document.add(table87);
				PdfPTable table88 = AnnualReportFrom22ReportGenerator.createTable88(
						
					);
				document.add(table88);
				PdfPTable table89 = AnnualReportFrom22ReportGenerator.createTable89(
						
					);
				document.add(table89);
				PdfPTable table90 = AnnualReportFrom22ReportGenerator.createTable90(
						
					);
				document.add(table90);
				PdfPTable table91 = AnnualReportFrom22ReportGenerator.createTable91(
						
					);
				document.add(table91);
				PdfPTable table92 = AnnualReportFrom22ReportGenerator.createTable92(
					
					);
				document.add(table92);
				PdfPTable table93 = AnnualReportFrom22ReportGenerator.createTable93(
						
					);
				document.add(table93);
				PdfPTable table94 = AnnualReportFrom22ReportGenerator.createTable94(
						
					);
				document.add(table94);
				PdfPTable table95 = AnnualReportFrom22ReportGenerator.createTable95(
						
					);
				document.add(table95);
				PdfPTable table96 = AnnualReportFrom22ReportGenerator.createTable96(
						
					);
				document.add(table96);
				PdfPTable table97 = AnnualReportFrom22ReportGenerator.createTable97(
						
					);
				document.add(table97);
				PdfPTable table98 = AnnualReportFrom22ReportGenerator.createTable98(
						
					);
				document.add(table98);
				PdfPTable table99 = AnnualReportFrom22ReportGenerator.createTable99(
						
					);
				document.add(table99);
				PdfPTable table100 = AnnualReportFrom22ReportGenerator.createTable100(reportLines.get().getProfitsharingbonus()
						
					);
				document.add(table100);
				PdfPTable table101 = AnnualReportFrom22ReportGenerator.createTable101(
						
					);
				document.add(table101);
				PdfPTable table102 = AnnualReportFrom22ReportGenerator.createTable102(reportLines.get().getNonprofitsharingbonus()
						
					);
				document.add(table102);
				PdfPTable table103 = AnnualReportFrom22ReportGenerator.createTable103(
						
					);
				document.add(table103);
				PdfPTable table104 = AnnualReportFrom22ReportGenerator.createTable104(reportLines.get().getArrearsofpay()
						
					);
				document.add(table104);
				PdfPTable table105 = AnnualReportFrom22ReportGenerator.createTable105(reportLines.get().getProfitsharingbonus(),reportLines.get().getNonprofitsharingbonus(),reportLines.get().getArrearsofpay()
						
					);
				document.add(table105);
				PdfPTable table106 = AnnualReportFrom22ReportGenerator.createTable106(
						
					);
				document.add(table106);
				PdfPTable table107 = AnnualReportFrom22ReportGenerator.createTable107(
						
					);
				document.add(table107);
				PdfPTable table108 = AnnualReportFrom22ReportGenerator.createTable108(
						
					);
				document.add(table108);
				PdfPTable table109 = AnnualReportFrom22ReportGenerator.createTable109(
						
					);
				document.add(table109);
				PdfPTable table110 = AnnualReportFrom22ReportGenerator.createTable110(
						
					);
				document.add(table110);
				PdfPTable table111 = AnnualReportFrom22ReportGenerator.createTable111(
					
					);
				document.add(table111);
				PdfPTable header20 = AnnualReportFrom22ReportGenerator.createHeader20(
						 
						);
				document.add(header20);
				PdfPTable header21 = AnnualReportFrom22ReportGenerator.createHeader21(
						 
						);
				document.add(header21);
				PdfPTable table112 = AnnualReportFrom22ReportGenerator.createTable112(
						
					);
				document.add(table112);
				PdfPTable table113 = AnnualReportFrom22ReportGenerator.createTable113(
						
					);
				document.add(table113);
				PdfPTable table114 = AnnualReportFrom22ReportGenerator.createTable114(
						
					);
				document.add(table114);
				PdfPTable table115 = AnnualReportFrom22ReportGenerator.createTable115(
						
					);
				document.add(table115);
				PdfPTable table116 = AnnualReportFrom22ReportGenerator.createTable116(
						
					);
				document.add(table116);
				PdfPTable table117 = AnnualReportFrom22ReportGenerator.createTable117(
						
					);
				document.add(table117);
				PdfPTable table118 = AnnualReportFrom22ReportGenerator.createTable118(
						
					);
				document.add(table118);
				PdfPTable table119 = AnnualReportFrom22ReportGenerator.createTable119(
						
					);
				document.add(table119);
				PdfPTable table120 = AnnualReportFrom22ReportGenerator.createTable120(
						
					);
				document.add(table120);
				PdfPTable table121 = AnnualReportFrom22ReportGenerator.createTable121(
						
					);
				document.add(table121);
				PdfPTable table122 = AnnualReportFrom22ReportGenerator.createTable122(
						
					);
				document.add(table122);
				PdfPTable table123 = AnnualReportFrom22ReportGenerator.createTable123(
						
					);
				document.add(table123);
				PdfPTable table124 = AnnualReportFrom22ReportGenerator.createTable124(
						
					);
				document.add(table124);
				PdfPTable table125 = AnnualReportFrom22ReportGenerator.createTable125(
						
					);
				document.add(table125);
				PdfPTable table126 = AnnualReportFrom22ReportGenerator.createTable126(
						
					);
				document.add(table126);
				PdfPTable table127 = AnnualReportFrom22ReportGenerator.createTable127(
						
					);
				document.add(table127);
				PdfPTable table128 = AnnualReportFrom22ReportGenerator.createTable128(
						
					);
				document.add(table128);
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
