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


import com.aspl.org.dto.PfReportForWorkerDTO;
import com.aspl.org.report.CrawleyPFForWorkerReportGenerator;
import com.aspl.org.report.service.PFDetailsForWorkerReportService;
import com.aspl.org.service.LeaveApplicationService;
import com.aspl.org.service.PfDetailsForStaffService;
import com.aspl.org.utils.PurchaseUtil;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

@Service
public class PFDetailsForWorkerReportServiceImpl implements PFDetailsForWorkerReportService {

	static Date date = new java.util.Date();
	static long time = date.getTime();
	static int randNum = (int) ((int) Math.random() + time);
	String fileName = "invReport";

	@Autowired
	LeaveApplicationService leaveApplicationService;
	@Autowired
	PurchaseUtil purchaseUtil;
	@Autowired
	PfDetailsForStaffService pfDetailsForStaffService;

	@Override
	public Map<String, Object> getPFDetailsReportforworker(HttpServletRequest request, String fromDate, String toDate) {

		Map<String, String> param = new HashMap<String, String>();
		Map<String, Object> returnData = new HashMap<String, Object>();

		String RESULT_FILE = request.getServletContext().getRealPath("resources/static/pdf");

		try {

			Document document = new Document();

			document.setPageSize(PageSize.A4.rotate());
			document.setMargins(15, 15, 15, 15);

			PdfWriter writer;
			System.out.println("Result path " + RESULT_FILE);
			try {
				//writer = PdfWriter.getInstance(document, new FileOutputStream("src/main/resources/pdf/crawley_pf_details_report_worker.pdf"));
				writer = PdfWriter.getInstance(document, new FileOutputStream("/home/pdf/crawley_pf_details_report_worker.pdf"));
				writer.setPdfVersion(PdfWriter.VERSION_1_7);

			} catch (DocumentException e1) {

				e1.printStackTrace();

			} catch (IOException e1) {

				e1.printStackTrace();

			}

			document.open();

			DecimalFormat df = new DecimalFormat("#.##");

			// List<PayslipDTO> report = new PayslipDTO();
			List<PfReportForWorkerDTO> reportLines = new ArrayList<>();

			if (!fromDate.isEmpty() || fromDate != null || fromDate != "" || !toDate.isEmpty() || toDate != null || toDate != "") {

				reportLines = pfDetailsForStaffService.getPrintPfdetailsforWorker(fromDate, toDate);
			}

			boolean newPage = true;

			/*
			 * int TotalLinePerPage = 20; int numberOfPage = reportLines.size() /
			 * TotalLinePerPage; int RemainderCount = numberOfPage % TotalLinePerPage;
			 * 
			 * int lastPageLine = reportLines.size() - (TotalLinePerPage * numberOfPage);
			 * 
			 * if (RemainderCount > 0) { numberOfPage = numberOfPage + 1; }
			 * 
			 * 
			 * 
			 * int lineindex = 0;
			 * 
			 * System.out.println("numberOfLines :::::::::::::" + reportLines.size());
			 * System.out.println("numberOfPage :::::::::::::" + numberOfPage);
			 * System.out.println("RemainderCount :::::::::::::" + RemainderCount);
			 * 
			 * Double basicTotalSalGlobal = 0.0; Double grossTotalSalGlobal = 0.0; Double
			 * pfContTotalSalGlobal = 0.0; Double penTotalSalGlobal = 0.0; Double
			 * penFundTotalSalGlobal = 0.0; Double ersrpfTotalSalGlobal = 0.0;
			 */

			// if(numberOfPage<=1) {

			//////////////// PF DETAILS FOR STAFF REPORT
			//////////////// ////////////////////////////////////

			// Header 1
			PdfPTable header1 = CrawleyPFForWorkerReportGenerator.createHeader1(

			);
			document.add(header1);

			// Header 2
			PdfPTable header2 = CrawleyPFForWorkerReportGenerator.createHeader2(
					fromDate,
					toDate
			);		
			document.add(header2);

			// Description Table Head 1
			PdfPTable descriptionTableHead1 = CrawleyPFForWorkerReportGenerator.createDescriptionTableHead1(

			);
			document.add(descriptionTableHead1);
			
			// Description Table Head 2
			PdfPTable descriptionTableHead2 = CrawleyPFForWorkerReportGenerator.createDescriptionTableHead2(

			);
			document.add(descriptionTableHead2);
			
			int lineindex = 0;
			
			Double basicTotalSal = 0.0;
			Double grossTotalSal = 0.0;
			Double pfContTotalSal = 0.0;
			Double penTotalSal = 0.0;
			Double penFundTotalSal = 0.0;
			Double ersrpfTotalSal = 0.0;

			for (int i = lineindex; i < reportLines.size(); i++) {
				PfReportForWorkerDTO reportitems = reportLines.get(i);

				// Description Table Data
				PdfPTable listItems = CrawleyPFForWorkerReportGenerator.createDescriptionTable(
						//i + 1,
						reportitems.getEmpCode(), 
						reportitems.getEmpName(), 
						df.format(reportitems.getFirstweekwages()),
						df.format(reportitems.getFirstweekpfemployer()), 
						df.format(reportitems.getFirstweekpfemployee()),
						df.format(reportitems.getFirstweekpensionfund()), 
						
						df.format(reportitems.getSecondweekwages()),
						df.format(reportitems.getSecondweekpfemployer()),
						df.format(reportitems.getSecondweekpfemployee()),
						df.format(reportitems.getSecondweekpensionfund()),
						
						df.format(reportitems.getThirdweekwages()),
						df.format(reportitems.getThirdweekpfemployer()),
						df.format(reportitems.getThirdweekpfemployee()),
						df.format(reportitems.getThirdweekpensionfund()),
						
						df.format(reportitems.getFourweekwages()),
						df.format(reportitems.getFourweekpfemployer()),
						df.format(reportitems.getFourweekpfemployee()),
						df.format(reportitems.getFourweekpensionfund()),
						
						df.format(reportitems.getFifthweekwages()),
						df.format(reportitems.getFifthweekpfemployer()),
						df.format(reportitems.getFifthweekpfemployee()),
						df.format(reportitems.getFifthweekpensionfund()),
						
						df.format(reportitems.getTotalwages()),
						df.format(reportitems.getTotalpfemployer()),
						df.format(reportitems.getTotalpfemployee()),
						df.format(reportitems.getTotalpensionfund())
				);
				document.add(listItems);

				/*basicTotalSal += reportitems.getBasicSalary();
				grossTotalSal += reportitems.getGrossSalary();
				pfContTotalSal += reportitems.getPfContribution();
				penTotalSal += reportitems.getPensionableSal();
				penFundTotalSal += reportitems.getPenFund();
				ersrpfTotalSal += reportitems.getErSrPf();*/

				/*
				 * System.out.println("basicTotalSal ::::::::::::: " + basicTotalSal);
				 * System.out.println("grossTotalSal ::::::::::::: " + grossTotalSal);
				 * System.out.println("pfContTotalSal ::::::::::::: " + pfContTotalSal);
				 * System.out.println("penTotalSal ::::::::::::: " + penTotalSal);
				 * System.out.println("penFundTotalSal ::::::::::::: " + penFundTotalSal);
				 * System.out.println("ersrpfTotalSal ::::::::::::: " + ersrpfTotalSal);
				 */

			}

			System.out.println("TOTAL LINE ///////////////// " + basicTotalSal);

			///////////// TOTAL LINE //////////////////////////////////////////////
			/*PdfPTable totalLine = CrawleyPFForWorkerReportGenerator.createTotalLine(
					df.format(basicTotalSal),
					df.format(grossTotalSal), 
					df.format(pfContTotalSal), 
					df.format(penTotalSal),
					df.format(penFundTotalSal), 
					df.format(ersrpfTotalSal));
			document.add(totalLine);*/

			//////////////// END OF PF DETAILS FOR STAFF REPORT
			//////////////// ////////////////////////////////////

			/*
			 * }else {
			 * 
			 * for(int n = 0; n < numberOfPage ; n++) {
			 * 
			 * if(n==0){ ////////////// FIRST PAGE //////////////////
			 * 
			 * ////////////////PF DETAILS FOR STAFF REPORT
			 * ////////////////////////////////////
			 * 
			 * // Header 1 PdfPTable header1 =
			 * CrawleyPFForWorkerReportGenerator.createHeader1(
			 * 
			 * ); document.add(header1);
			 * 
			 * // Header 2 PdfPTable header2 =
			 * CrawleyPFForWorkerReportGenerator.createHeader2(
			 * reportLines.get(0).getFromDate(), reportLines.get(0).getToDate() );
			 * document.add(header2);
			 * 
			 * // Description Table Head PdfPTable descriptionTableHead1 =
			 * CrawleyPFForWorkerReportGenerator.createDescriptionTableHead1(
			 * 
			 * ); document.add(descriptionTableHead1);
			 * 
			 * Double basicTotalSal = 0.0; Double grossTotalSal = 0.0; Double pfContTotalSal
			 * = 0.0; Double penTotalSal = 0.0; Double penFundTotalSal = 0.0; Double
			 * ersrpfTotalSal = 0.0;
			 * 
			 * for (int i = lineindex; i < TotalLinePerPage; i++) { PfReportForStaffDTO
			 * reportitems = reportLines.get(i);
			 * 
			 * // Description Table Data PdfPTable listItems =
			 * CrawleyPFForWorkerReportGenerator.createDescriptionTable( i + 1,
			 * reportitems.getEmpCode(), reportitems.getEmpName(),
			 * df.format(reportitems.getBasicSalary()),
			 * df.format(reportitems.getGrossSalary()),
			 * df.format(reportitems.getPfContribution()),
			 * df.format(reportitems.getPensionableSal()),
			 * df.format(reportitems.getPenFund()), df.format(reportitems.getErSrPf()));
			 * document.add(listItems);
			 * 
			 * basicTotalSal += reportitems.getBasicSalary(); grossTotalSal +=
			 * reportitems.getGrossSalary(); pfContTotalSal +=
			 * reportitems.getPfContribution(); penTotalSal +=
			 * reportitems.getPensionableSal(); penFundTotalSal += reportitems.getPenFund();
			 * ersrpfTotalSal += reportitems.getErSrPf();
			 * 
			 * basicTotalSalGlobal = basicTotalSal; grossTotalSalGlobal = grossTotalSal;
			 * pfContTotalSalGlobal = pfContTotalSal; penTotalSalGlobal = penTotalSal;
			 * penFundTotalSalGlobal = penFundTotalSal; ersrpfTotalSalGlobal =
			 * ersrpfTotalSal;
			 * 
			 * 
			 * System.out.println("basicTotalSal ::::::::::::: " + basicTotalSal);
			 * System.out.println("grossTotalSal ::::::::::::: " + grossTotalSal);
			 * System.out.println("pfContTotalSal ::::::::::::: " + pfContTotalSal);
			 * System.out.println("penTotalSal ::::::::::::: " + penTotalSal);
			 * System.out.println("penFundTotalSal ::::::::::::: " + penFundTotalSal);
			 * System.out.println("ersrpfTotalSal ::::::::::::: " + ersrpfTotalSal); }
			 * 
			 * System.out.println("TOTAL LINE ///////////////// " + basicTotalSal);
			 * 
			 * ///////////// CARRY FWD LINE //////////////////////////////////////////////
			 * PdfPTable cfTotalLine = CrawleyPFForWorkerReportGenerator.createCFTotalLine(
			 * df.format(basicTotalSal), df.format(grossTotalSal),
			 * df.format(pfContTotalSal), df.format(penTotalSal),
			 * df.format(penFundTotalSal), df.format(ersrpfTotalSal) );
			 * document.add(cfTotalLine);
			 * 
			 * //////////////// END OF PF DETAILS FOR STAFF REPORT
			 * ////////////////////////////////////
			 * 
			 * }else if(n==(numberOfPage-1)) { ///////////// LAST PAGE ///////////////////
			 * document.newPage(); ////////////////PF DETAILS FOR STAFF REPORT
			 * ////////////////////////////////////
			 * 
			 * // Header 1 PdfPTable header1 =
			 * CrawleyPFForWorkerReportGenerator.createHeader1(
			 * 
			 * ); document.add(header1);
			 * 
			 * // Header 2 PdfPTable header2 =
			 * CrawleyPFForWorkerReportGenerator.createHeader2(
			 * reportLines.get(0).getFromDate(), reportLines.get(0).getToDate() );
			 * document.add(header2);
			 * 
			 * // Description Table Head PdfPTable descriptionTableHead1 =
			 * CrawleyPFForWorkerReportGenerator.createDescriptionTableHead1(
			 * 
			 * ); document.add(descriptionTableHead1);
			 * 
			 * Double basicTotalSal = 0.0; Double grossTotalSal = 0.0; Double pfContTotalSal
			 * = 0.0; Double penTotalSal = 0.0; Double penFundTotalSal = 0.0; Double
			 * ersrpfTotalSal = 0.0;
			 * 
			 * ///////////// BROUGHT FWD LINE //////////////////////////////////////////////
			 * PdfPTable bfTotalLine = CrawleyPFForWorkerReportGenerator.createBFTotalLine(
			 * df.format(basicTotalSalGlobal), df.format(grossTotalSalGlobal),
			 * df.format(pfContTotalSalGlobal), df.format(penTotalSalGlobal),
			 * df.format(penFundTotalSalGlobal), df.format(ersrpfTotalSalGlobal) );
			 * document.add(bfTotalLine);
			 * 
			 * for (int i = lineindex; i < (lastPageLine+lineindex); i++) {
			 * PfReportForStaffDTO reportitems = new PfReportForStaffDTO();
			 * 
			 * reportitems = reportLines.get(i);
			 * 
			 * // Description Table Data PdfPTable listItems =
			 * CrawleyPFForWorkerReportGenerator.createDescriptionTable( i + 1,
			 * reportitems.getEmpCode(), reportitems.getEmpName(),
			 * df.format(reportitems.getBasicSalary()),
			 * df.format(reportitems.getGrossSalary()),
			 * df.format(reportitems.getPfContribution()),
			 * df.format(reportitems.getPensionableSal()),
			 * df.format(reportitems.getPenFund()), df.format(reportitems.getErSrPf()));
			 * document.add(listItems);
			 * 
			 * basicTotalSal += reportitems.getBasicSalary(); grossTotalSal +=
			 * reportitems.getGrossSalary(); pfContTotalSal +=
			 * reportitems.getPfContribution(); penTotalSal +=
			 * reportitems.getPensionableSal(); penFundTotalSal += reportitems.getPenFund();
			 * ersrpfTotalSal += reportitems.getErSrPf();
			 * 
			 * basicTotalSalGlobal += basicTotalSal; grossTotalSalGlobal += grossTotalSal;
			 * pfContTotalSalGlobal += pfContTotalSal; penTotalSalGlobal += penTotalSal;
			 * penFundTotalSalGlobal += penFundTotalSal; ersrpfTotalSalGlobal +=
			 * ersrpfTotalSal;
			 * 
			 * System.out.println("basicTotalSal ::::::::::::: " + basicTotalSal);
			 * System.out.println("grossTotalSal ::::::::::::: " + grossTotalSal);
			 * System.out.println("pfContTotalSal ::::::::::::: " + pfContTotalSal);
			 * System.out.println("penTotalSal ::::::::::::: " + penTotalSal);
			 * System.out.println("penFundTotalSal ::::::::::::: " + penFundTotalSal);
			 * System.out.println("ersrpfTotalSal ::::::::::::: " + ersrpfTotalSal); }
			 * 
			 * ///////////// TOTAL LINE //////////////////////////////////////////////
			 * PdfPTable totalLine = CrawleyPFForWorkerReportGenerator.createTotalLine(
			 * df.format(basicTotalSalGlobal), df.format(grossTotalSalGlobal),
			 * df.format(pfContTotalSalGlobal), df.format(penTotalSalGlobal),
			 * df.format(penFundTotalSalGlobal), df.format(ersrpfTotalSalGlobal) );
			 * document.add(totalLine);
			 * 
			 * System.out.println("TOTAL LINE ///////////////// " + basicTotalSal);
			 * 
			 * //////////////// END OF PF DETAILS FOR STAFF REPORT
			 * ////////////////////////////////////
			 * 
			 * }else { //////////// INTERMEDIATE PAGE /////////// document.newPage();
			 * ////////////////PF DETAILS FOR STAFF REPORT
			 * ////////////////////////////////////
			 * 
			 * // Header 1 PdfPTable header1 =
			 * CrawleyPFForWorkerReportGenerator.createHeader1(
			 * 
			 * ); document.add(header1);
			 * 
			 * // Header 2 PdfPTable header2 =
			 * CrawleyPFForWorkerReportGenerator.createHeader2(
			 * reportLines.get(0).getFromDate(), reportLines.get(0).getToDate() );
			 * document.add(header2);
			 * 
			 * // Description Table Head PdfPTable descriptionTableHead1 =
			 * CrawleyPFForWorkerReportGenerator.createDescriptionTableHead1(
			 * 
			 * ); document.add(descriptionTableHead1);
			 * 
			 * Double basicTotalSal = 0.0; Double grossTotalSal = 0.0; Double pfContTotalSal
			 * = 0.0; Double penTotalSal = 0.0; Double penFundTotalSal = 0.0; Double
			 * ersrpfTotalSal = 0.0;
			 * 
			 * ///////////// BROUGHT FWD LINE //////////////////////////////////////////////
			 * PdfPTable bfTotalLine = CrawleyPFForWorkerReportGenerator.createBFTotalLine(
			 * df.format(basicTotalSalGlobal), df.format(grossTotalSalGlobal),
			 * df.format(pfContTotalSalGlobal), df.format(penTotalSalGlobal),
			 * df.format(penFundTotalSalGlobal), df.format(ersrpfTotalSalGlobal) );
			 * document.add(bfTotalLine);
			 * 
			 * for (int i = lineindex; i < TotalLinePerPage; i++) { PfReportForStaffDTO
			 * reportitems = reportLines.get(i);
			 * 
			 * // Description Table Data PdfPTable listItems =
			 * CrawleyPFForWorkerReportGenerator.createDescriptionTable( i + 1,
			 * reportitems.getEmpCode(), reportitems.getEmpName(),
			 * df.format(reportitems.getBasicSalary()),
			 * df.format(reportitems.getGrossSalary()),
			 * df.format(reportitems.getPfContribution()),
			 * df.format(reportitems.getPensionableSal()),
			 * df.format(reportitems.getPenFund()), df.format(reportitems.getErSrPf()));
			 * document.add(listItems);
			 * 
			 * basicTotalSal += reportitems.getBasicSalary(); grossTotalSal +=
			 * reportitems.getGrossSalary(); pfContTotalSal +=
			 * reportitems.getPfContribution(); penTotalSal +=
			 * reportitems.getPensionableSal(); penFundTotalSal += reportitems.getPenFund();
			 * ersrpfTotalSal += reportitems.getErSrPf();
			 * 
			 * basicTotalSalGlobal += basicTotalSal; grossTotalSalGlobal += grossTotalSal;
			 * pfContTotalSalGlobal += pfContTotalSal; penTotalSalGlobal += penTotalSal;
			 * penFundTotalSalGlobal += penFundTotalSal; ersrpfTotalSalGlobal +=
			 * ersrpfTotalSal;
			 * 
			 * System.out.println("basicTotalSal ::::::::::::: " + basicTotalSal);
			 * System.out.println("grossTotalSal ::::::::::::: " + grossTotalSal);
			 * System.out.println("pfContTotalSal ::::::::::::: " + pfContTotalSal);
			 * System.out.println("penTotalSal ::::::::::::: " + penTotalSal);
			 * System.out.println("penFundTotalSal ::::::::::::: " + penFundTotalSal);
			 * System.out.println("ersrpfTotalSal ::::::::::::: " + ersrpfTotalSal); }
			 * 
			 * ///////////// CARRY FWD LINE //////////////////////////////////////////////
			 * PdfPTable cfTotalLine = CrawleyPFForWorkerReportGenerator.createCFTotalLine(
			 * df.format(basicTotalSalGlobal), df.format(grossTotalSalGlobal),
			 * df.format(pfContTotalSalGlobal), df.format(penTotalSalGlobal),
			 * df.format(penFundTotalSalGlobal), df.format(ersrpfTotalSalGlobal) );
			 * document.add(cfTotalLine);
			 * 
			 * System.out.println("TOTAL LINE ///////////////// " + basicTotalSal);
			 * 
			 * //////////////// END OF PF DETAILS FOR STAFF REPORT
			 * ////////////////////////////////////
			 * 
			 * }
			 * 
			 * lineindex = TotalLinePerPage;
			 * 
			 * TotalLinePerPage = TotalLinePerPage + 20; } }
			 */
			document.close();

		} catch (Exception e) {

			e.printStackTrace();
		}
		returnData.put("fileName", "pf_details_for_worker.pdf");
		returnData.put("status", true);
		return returnData;
	}

}
