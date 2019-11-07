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


import com.aspl.org.dto.WelfareFundDTO;
import com.aspl.org.report.StatementOfEmployeesLabourWelfareFundContributionReportGenerator;
import com.aspl.org.report.service.StatementOfEmployeesLabourWelfareFundContributionReportService;
import com.aspl.org.service.WelfareFundReportService;
import com.aspl.org.utils.PurchaseUtil;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

@Service
public class StatementOfEmployeesLabourWelfareFundContributionReportServiceImpl implements StatementOfEmployeesLabourWelfareFundContributionReportService {

	static Date date = new java.util.Date();
	static long time = date.getTime();
	static int randNum = (int) ((int) Math.random() + time);
	String fileName = "invReport";

	@Autowired WelfareFundReportService welfareFundReportService;
	@Autowired PurchaseUtil purchaseUtil;
	
	@Override
	public Map<String, Object> getStatementOfEmployeesLabourWelfareFundContributionReport(HttpServletRequest request) {

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
				//writer = PdfWriter.getInstance(document, new FileOutputStream("src/main/resources/pdf/crawley_Statement_Of_Employees_Labour_Welfare_Fund_Contribution.pdf"));
				writer = PdfWriter.getInstance(document, new FileOutputStream("/home/pdf/crawley_Statement_Of_Employees_Labour_Welfare_Fund_Contribution.pdf"));

				writer.setPdfVersion(PdfWriter.VERSION_1_7);

			} catch (DocumentException e1) {

				e1.printStackTrace();

			} catch (IOException e1) {

				e1.printStackTrace();

			}

			document.open();

			//List<PayslipDTO> report = new PayslipDTO();
			List<WelfareFundDTO> reportLines = new ArrayList<>();

			

			reportLines = welfareFundReportService.welfareFundReportReportListbymonthandpaydate();
			//reportLines = report.getPurchaseIndentReportItemsDTO();

			

			boolean newPage = true;
			
			int TotalLinePerPage = 39;
			int numberOfPage     = reportLines.size() / TotalLinePerPage; // 2
			int RemainderCount   = reportLines.size() % TotalLinePerPage; // 3
			
			//int lastPageLine     = reportLines.size() - (TotalLinePerPage * numberOfPage);
			
			
			
			if (RemainderCount > 0) {
				numberOfPage = numberOfPage + 1;
			}
			
			int lineindex = 0;
			
			int totloop = 0;
			
			int k=0;
			
			/*System.out.println(reportLines.size());
			System.out.println(numberOfPage);
			System.out.println(RemainderCount);*/
			
			String empoyeeName="";
			String designation="";
			Double grossWages=0.0;
			Double contributiontolabourwelfarefund=0.0;
			
			for(int i=0;i<numberOfPage;i++)
			{
				document.newPage();
				// Header 1
				PdfPTable header1 = StatementOfEmployeesLabourWelfareFundContributionReportGenerator.createHeader1(
						 
					);
				document.add(header1);
				
				// Header 2
				PdfPTable header2 = StatementOfEmployeesLabourWelfareFundContributionReportGenerator.createHeader2(
						
					);
				document.add(header2);
				
				// Header 3
				PdfPTable header3 = StatementOfEmployeesLabourWelfareFundContributionReportGenerator.createHeader3(
					
					);
				document.add(header3);
				PdfPTable table1 = StatementOfEmployeesLabourWelfareFundContributionReportGenerator.createTable1(
						
						);
					document.add(table1);
					
				if(i<numberOfPage-1)
				{
					totloop = TotalLinePerPage;
				}
				else
				{
					if(RemainderCount==0)
					{
						totloop = TotalLinePerPage;
					}
					else
					{
						totloop = RemainderCount;
					}
					
				}
				
				for(int j=0;j<totloop;j++)
				{
					
					PdfPTable table2 = StatementOfEmployeesLabourWelfareFundContributionReportGenerator.createTable2(
							k+1,
							reportLines.get(k).getEmpoyeeName(),
							reportLines.get(k).getDesignation(),
							reportLines.get(k).getGrossWages(),
							reportLines.get(k).getContributiontolabourwelfarefund()
							
							
						);
					document.add(table2);
					k++;
				}
				
			}
			
			PdfPTable table3 = StatementOfEmployeesLabourWelfareFundContributionReportGenerator.createTable3(
					
					reportLines.get(0).getTotalcontributiontolabourwelfarefund()
					
				);
			document.add(table3);
				
			document.close();

		} catch (Exception e) {
			
			e.printStackTrace();
		}
		returnData.put("fileName", "advancepayment.pdf");
		returnData.put("status", true);
		return returnData;
	}

	

}
