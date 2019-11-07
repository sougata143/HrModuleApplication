package com.aspl.org.report;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

public class CrawleyPFForWorkerReportGenerator {

	///////////////// GENERATED PDF PATH ///////////////////////////////////////////////////////////////////////////////////////////
	static Date date = new java.util.Date();
	
	static long time = date.getTime();
	
	static int randNum = (int) ((int) Math.random() + time);
	
	static String fileName = "crawley-worker-pf-report";
	
	//public static final String RESULT = "D:/ABHIRUP/emcee_workspace/erpa-v2/src/main/webapp/WEB-INF/pdf/" + fileName + "_" + randNum + ".pdf";
	
	public static final String RESULT = "D:/ABHIRUP/ABHIRUP_WORKSPACE/21-08-2019/ERPBootApplication/src/main/resources/pdf/" + fileName + ".pdf";

	///////////////// HEADER CONSTANT /////////////////////////////////////////////////////////////////////////////////////////////
	
	static String companyName 	= "CRAWLEY & RAY (FOUNDERS AND ENGINEERS) PRIVATE LTD.";
	static String reportName    = "WORKER PF FOR THE MONTH OF JUN 2019. FROM 01-01-2016 TO 31-12-2019";

	///////////////// END OF HEADER CONSTANT //////////////////////////////////////////////////////////////////////////////////////

	///////////////// REQUIRED FONTS //////////////////////////////////////////////////////////////////////////////////////////////
	private static Font Font5 = new Font(Font.FontFamily.HELVETICA, 5, Font.NORMAL);
	private static Font Font5Bold = new Font(Font.FontFamily.HELVETICA, 5, Font.BOLD);
	private static Font Font6 = new Font(Font.FontFamily.HELVETICA, 6, Font.NORMAL);
	private static Font Font6Bold = new Font(Font.FontFamily.HELVETICA, 6, Font.BOLD);
	private static Font Font7 = new Font(Font.FontFamily.HELVETICA, 7, Font.NORMAL);
	private static Font Font7Bold = new Font(Font.FontFamily.HELVETICA, 7, Font.BOLD);
	private static Font Font8 = new Font(Font.FontFamily.HELVETICA, 8, Font.NORMAL);
	private static Font Font8Bold = new Font(Font.FontFamily.HELVETICA, 8, Font.BOLD);
	private static Font Font9 = new Font(Font.FontFamily.HELVETICA, 9, Font.NORMAL);
	private static Font Font9Bold = new Font(Font.FontFamily.HELVETICA, 9, Font.BOLD);
	private static Font Font10 = new Font(Font.FontFamily.HELVETICA, 10, Font.NORMAL);
	private static Font Font10Bold = new Font(Font.FontFamily.HELVETICA, 10, Font.BOLD);
	private static Font Font12Red = new Font(Font.FontFamily.HELVETICA, 12, Font.NORMAL, BaseColor.RED);
	private static Font Font12Bold = new Font(Font.FontFamily.HELVETICA, 12, Font.BOLD);
	
	public static void main(String[] args) throws DocumentException, IOException {
		
		Document document = new Document();

		document.setPageSize(PageSize.A4.rotate());
		document.setMargins(10, 10, 10, 10);

		PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream(RESULT));

		writer.setPdfVersion(PdfWriter.VERSION_1_7);

		document.open();
		
		/*PdfPTable header1 = createHeader1();
		document.add(header1);
		
		PdfPTable header2 = createHeader2();
		document.add(header2);
		
		PdfPTable descriptionTableHead1 = createDescriptionTableHead1();
		document.add(descriptionTableHead1);
		
		PdfPTable descriptionTableHead2 = createDescriptionTableHead2();
		document.add(descriptionTableHead2);
		
		PdfPTable listItems = createDescriptionTable(); document.add(listItems);*/
		
		document.close();
		
    	System.out.println("Report Name : " + reportName + "\nPDF has been generated successfully in this path : \n" + RESULT);
		
	}
	
	public static PdfPTable createHeader1() throws DocumentException {
		PdfPTable table = new PdfPTable(1);

		table.setTotalWidth(800);
		table.setLockedWidth(true);
		table.setWidths(new float[]{1});
		
		PdfPCell cell_1;
		
		Paragraph para_1 = new Paragraph();
		para_1.add(new Chunk(companyName, Font10Bold));
		para_1.add(Chunk.NEWLINE);
		para_1.setSpacingBefore(10);
		para_1.setSpacingAfter(10);
		
		cell_1 = new PdfPCell(para_1);
		cell_1.setPadding(2);
		cell_1.setBorder(Rectangle.NO_BORDER);
		cell_1.setHorizontalAlignment(Element.ALIGN_CENTER);
		cell_1.setVerticalAlignment(Element.ALIGN_CENTER);
		table.addCell(cell_1);
		
		return table;
	}
	
	public static PdfPTable createHeader2(String reportfromDate, String reporttoDate) throws DocumentException {
		PdfPTable table = new PdfPTable(1);

		table.setTotalWidth(800);
		table.setLockedWidth(true);
		table.setWidths(new float[]{1});
		
		PdfPCell cell_2;
		
		Paragraph para_1 = new Paragraph();
		para_1.add(new Chunk("WORKER PF  FROM " + reportfromDate + " TO " + reporttoDate, Font8Bold));
		para_1.add(Chunk.NEWLINE);
		para_1.setSpacingBefore(50);
		para_1.setSpacingAfter(50);
		
		cell_2 = new PdfPCell(para_1);
		cell_2.setPadding(6);
		cell_2.setBorder(Rectangle.NO_BORDER);
		cell_2.setHorizontalAlignment(Element.ALIGN_CENTER);
		cell_2.setVerticalAlignment(Element.ALIGN_CENTER);
		table.addCell(cell_2);
		
		return table;
	}
	
	public static PdfPTable createDescriptionTableHead1() throws DocumentException {
		PdfPTable dataTable = new PdfPTable(26);

		dataTable.setTotalWidth(800);
		dataTable.setLockedWidth(true);
		dataTable.setWidths(new float[]{2, 5, 2, 3, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2});
		
		PdfPCell cell;
		
		////////////// WEEK DETAILS ////////////////////////////////////
	   ///////////////////////////////////////////////////////////////////
			
			cell_1: {
			
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("Emp", Font6));
				cell = new PdfPCell(para_2);
				cell.setPadding(3);
				//cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_CENTER);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				dataTable.addCell(cell);
			
			}
			
			cell_2: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("", Font6));
				cell = new PdfPCell(para_2);
				cell.setPadding(3);
				//cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				dataTable.addCell(cell);
			
			}
			
			cell_3: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("Week 1", Font6));
				cell = new PdfPCell(para_2);
				cell.setPadding(3);
				cell.setColspan(4);
				//cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_CENTER);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				dataTable.addCell(cell);
			
			}
			
			cell_4: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("Week 2", Font6));
				cell = new PdfPCell(para_2);
				cell.setPadding(3);
				cell.setColspan(4);
				//cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_CENTER);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				dataTable.addCell(cell);
			
			}
			
			cell_5: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("Week 3", Font6));
				cell = new PdfPCell(para_2);
				cell.setPadding(3);
				cell.setColspan(4);
				//cell.setBorder(Rectangle.RIGHT);
				cell.setHorizontalAlignment(Element.ALIGN_CENTER);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				dataTable.addCell(cell);
			
			}
			
			cell_6: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("Week 4", Font6));
				cell = new PdfPCell(para_2);
				cell.setPadding(3);
				cell.setColspan(4);
				//cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_CENTER);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				dataTable.addCell(cell);
			
			}
			
			cell_7: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("Week 5", Font6));
				cell = new PdfPCell(para_2);
				cell.setPadding(3);
				cell.setColspan(4);
				//cell.setBorder(Rectangle.RIGHT);
				cell.setHorizontalAlignment(Element.ALIGN_CENTER);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				dataTable.addCell(cell);
			
			}
			
			cell_8: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("TOTAL", Font6));
				cell = new PdfPCell(para_2);
				cell.setPadding(3);
				cell.setColspan(4);
				//cell.setBorder(Rectangle.RIGHT);
				cell.setHorizontalAlignment(Element.ALIGN_CENTER);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				dataTable.addCell(cell);
			
			}

		return dataTable;
	}
	
	public static PdfPTable createDescriptionTableHead2() throws DocumentException {
		PdfPTable dataTable = new PdfPTable(26);

		dataTable.setTotalWidth(800);
		dataTable.setLockedWidth(true);
		//dataTable.setWidths(new float[]{2, 5, (float)2.5, 3, (float)2.5, 2, (float)2.5, 3, (float)2.5, 2, (float)2.5, 3, (float)2.5, 2, (float)2.5, 3, (float)2.5, 2, (float)2.5, 3, (float)2.5, 2, (float)2.5, 3, (float)2.5, 2});
		dataTable.setWidths(new float[]{2, 5, 2, 3, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2});
		
		String[] headersLabels = {"Code","Name","Wages","PF \nEmplr's","PF \nEmpls","Pen \nFund","Wages","PF \nEmplr's","PF \nEmpls","Pen \nFund","Wages","PF \nEmplr's","PF \nEmpls","Pen \nFund","Wages","PF \nEmplr's","PF \nEmpls","Pen \nFund","Wages","PF \nEmplr's","PF \nEmpls","Pen \nFund","Wages","PF \nEmplr's","PF \nEmpls","Pen \nFund"};
		
		for (int index = 0; index < headersLabels.length ; index++) {
			
    		PdfPCell cell;
			
			Paragraph headerParagraph = new Paragraph(headersLabels[index], Font6Bold);
			
			cell = new PdfPCell(headerParagraph);
			cell.setPadding(3);
			if(index == 1) {
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
			}
			else{
				cell.setHorizontalAlignment(Element.ALIGN_CENTER);
			}
			cell.setVerticalAlignment(Element.ALIGN_CENTER);
			cell.setBorder(Rectangle.LEFT | Rectangle.RIGHT | Rectangle.TOP);
			
			dataTable.addCell(cell);
			
		}
		
		return dataTable;
	}
	
	public static PdfPTable createDescriptionTable(String empCode, String empName, String firstweekwages, String firstweekpfemployer, String firstweekpfemployee, String firstweekpensionfund, String secondweekwages, String secondweekpfemployer, String secondweekpfemployee, String secondweekpensionfund, String thirdweekwages, String thirdweekpfemployer, String thirdweekpfemployee, String thirdweekpensionfund, String fourweekwages, String fourweekpfemployer, String fourweekpfemployee, String fourweekpensionfund, String fifthweekwages, String fifthweekpfemployer, String fifthweekpfemployee, String fifthweekpensionfund, String totalwages, String totalpfemployer, String totalpfemployee, String totalpensionfund) throws DocumentException {
		PdfPTable dataTable = new PdfPTable(26);

		dataTable.setTotalWidth(800);
		dataTable.setLockedWidth(true);
		dataTable.setWidths(new float[]{2, 5, 2, 3, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2});
		
		PdfPCell cell;
		
		////////////// WEEK DETAILS ////////////////////////////////////
		///////////////////////////////////////////////////////////////
		
		
			
			cell_1: {
			
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk(String.valueOf(empCode), Font6));
				cell = new PdfPCell(para_2);
				cell.setPadding(3);
				//cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_CENTER);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				dataTable.addCell(cell);
			
			}
			
			cell_2: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk(empName, Font6));
				cell = new PdfPCell(para_2);
				cell.setPadding(3);
				//cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				dataTable.addCell(cell);
			
			}
			
			cell_3: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk(firstweekwages, Font6));
				cell = new PdfPCell(para_2);
				cell.setPadding(3);
				//cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_CENTER);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				dataTable.addCell(cell);
			
			}
			
			cell_4: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk(firstweekpfemployer, Font6));
				cell = new PdfPCell(para_2);
				cell.setPadding(3);
				//cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_CENTER);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				dataTable.addCell(cell);
			
			}
			
			cell_5: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk(firstweekpfemployee, Font6));
				cell = new PdfPCell(para_2);
				cell.setPadding(3);
				//cell.setBorder(Rectangle.RIGHT);
				cell.setHorizontalAlignment(Element.ALIGN_CENTER);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				dataTable.addCell(cell);
			
			}
			
			cell_6: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk(firstweekpensionfund, Font6));
				cell = new PdfPCell(para_2);
				cell.setPadding(3);
				//cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_CENTER);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				dataTable.addCell(cell);
			
			}
			
			cell_7: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk(secondweekwages, Font6));
				cell = new PdfPCell(para_2);
				cell.setPadding(3);
				//cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_CENTER);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				dataTable.addCell(cell);
			
			}
			
			cell_8: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk(secondweekpfemployer, Font6));
				cell = new PdfPCell(para_2);
				cell.setPadding(3);
				//cell.setBorder(Rectangle.RIGHT);
				cell.setHorizontalAlignment(Element.ALIGN_CENTER);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				dataTable.addCell(cell);
			
			}
			
			cell_9: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk(secondweekpfemployee, Font6));
				cell = new PdfPCell(para_2);
				cell.setPadding(3);
				//cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_CENTER);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				dataTable.addCell(cell);
			
			}
			
			cell_10: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk(secondweekpensionfund, Font6));
				cell = new PdfPCell(para_2);
				cell.setPadding(3);
				//cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_CENTER);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				dataTable.addCell(cell);
			
			}
			
			cell_11: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk(thirdweekwages, Font6));
				cell = new PdfPCell(para_2);
				cell.setPadding(3);
				//cell.setBorder(Rectangle.RIGHT);
				cell.setHorizontalAlignment(Element.ALIGN_CENTER);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				dataTable.addCell(cell);
			
			}
			
			cell_12: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk(thirdweekpfemployer, Font6));
				cell = new PdfPCell(para_2);
				cell.setPadding(3);
				//cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_CENTER);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				dataTable.addCell(cell);
			
			}
			
			cell_13: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk(thirdweekpfemployee, Font6));
				cell = new PdfPCell(para_2);
				cell.setPadding(3);
				//cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_CENTER);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				dataTable.addCell(cell);
			
			}
			
			cell_14: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk(thirdweekpensionfund, Font6));
				cell = new PdfPCell(para_2);
				cell.setPadding(3);
				//cell.setBorder(Rectangle.RIGHT);
				cell.setHorizontalAlignment(Element.ALIGN_CENTER);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				dataTable.addCell(cell);
			
			}
			
			cell_15: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk(fourweekwages, Font6));
				cell = new PdfPCell(para_2);
				cell.setPadding(3);
				//cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_CENTER);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				dataTable.addCell(cell);
			
			}
			
			cell_16: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk(fourweekpfemployer, Font6));
				cell = new PdfPCell(para_2);
				cell.setPadding(3);
				//cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_CENTER);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				dataTable.addCell(cell);
			
			}
			
			cell_17: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk(fourweekpfemployee, Font6));
				cell = new PdfPCell(para_2);
				cell.setPadding(3);
				//cell.setBorder(Rectangle.RIGHT);
				cell.setHorizontalAlignment(Element.ALIGN_CENTER);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				dataTable.addCell(cell);
			
			}
			
			cell_18: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk(fourweekpensionfund, Font6));
				cell = new PdfPCell(para_2);
				cell.setPadding(3);
				//cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_CENTER);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				dataTable.addCell(cell);
			
			}
			
			cell_19: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk(fifthweekwages, Font6));
				cell = new PdfPCell(para_2);
				cell.setPadding(3);
				//cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_CENTER);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				dataTable.addCell(cell);
			
			}
			
			cell_20: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk(fifthweekpfemployer, Font6));
				cell = new PdfPCell(para_2);
				cell.setPadding(3);
				//cell.setBorder(Rectangle.RIGHT);
				cell.setHorizontalAlignment(Element.ALIGN_CENTER);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				dataTable.addCell(cell);
			
			}
			
			cell_21: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk(fifthweekpfemployee, Font6));
				cell = new PdfPCell(para_2);
				cell.setPadding(3);
				//cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_CENTER);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				dataTable.addCell(cell);
			
			}
			
			cell_22: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk(fifthweekpensionfund, Font6));
				cell = new PdfPCell(para_2);
				cell.setPadding(3);
				//cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_CENTER);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				dataTable.addCell(cell);
			
			}
			
			cell_23: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk(totalwages, Font6));
				cell = new PdfPCell(para_2);
				cell.setPadding(3);
				//cell.setBorder(Rectangle.RIGHT);
				cell.setHorizontalAlignment(Element.ALIGN_CENTER);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				dataTable.addCell(cell);
			
			}
			
			cell_24: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk(totalpfemployer, Font6));
				cell = new PdfPCell(para_2);
				cell.setPadding(3);
				//cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_CENTER);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				dataTable.addCell(cell);
			
			}
			
			cell_25: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk(totalpfemployee, Font6));
				cell = new PdfPCell(para_2);
				cell.setPadding(3);
				//cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_CENTER);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				dataTable.addCell(cell);
			
			}
			
			cell_26: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk(totalpensionfund, Font6));
				cell = new PdfPCell(para_2);
				cell.setPadding(3);
				//cell.setBorder(Rectangle.RIGHT);
				cell.setHorizontalAlignment(Element.ALIGN_CENTER);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				dataTable.addCell(cell);
			
			}
		
		

		return dataTable;
	}
	
}
