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

public class CrawleyOverTimeReportGenerator {

	///////////////// GENERATED PDF PATH ///////////////// 
	///////////////////////////////////////////////////////////////////////////////////////////
	
	static Date date = new java.util.Date();

	static long time = date.getTime();

	static int randNum = (int) ((int) Math.random() + time);

	static String fileName = "crawley-over-time-report";

	// public static final String RESULT = "D:/ABHIRUP/emcee_workspace/erpa-v2/src/main/webapp/WEB-INF/pdf/" + fileName + "_" + randNum + ".pdf";

	public static final String RESULT = "D:/ABHIRUP/emcee_workspace/erpa-v2/src/main/webapp/WEB-INF/crawley-report/" + fileName + ".pdf";

	///////////////// HEADER CONSTANT ///////////////// 
	/////////////////////////////////////////////////////////////////////////////////////////////

	static String companyName = "CRAWLEY & RAY (FOUNDERS AND ENGINEERS) PRIVATE LTD.";
	static String reportName = "OVER TIME FOR DATE OF 01-06-2019 TO 30-06-2019";
	static String SectionName = "SECTION NAME : FOUNDRY";

	///////////////// END OF HEADER CONSTANT ///////////////// 
	//////////////////////////////////////////////////////////////////////////////////////

	///////////////// REQUIRED FONTS ///////////////// 
	//////////////////////////////////////////////////////////////////////////////////////////////
	
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

		document.setPageSize(PageSize.A4);
		document.setMargins(10, 10, 10, 10);

		PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream(RESULT));

		writer.setPdfVersion(PdfWriter.VERSION_1_7);

		document.open();

		int pageNo = 1;

			PdfPTable header1 = createHeader1();
			document.add(header1);
	
//			PdfPTable header2 = createHeader2();
//			document.add(header2);
	
			PdfPTable header3 = createHeader3(pageNo);
			document.add(header3);
	
			////// DEPT. 1 /////////////////////////// 
			
//			PdfPTable furnaceDept = createFurnaceDept();
//			document.add(furnaceDept);
	
			PdfPTable descriptionTableHeadDept1 = createDescriptionTableHeadDept1();
			document.add(descriptionTableHeadDept1);
	
//			PdfPTable listItems1 = createDescriptionTableDept1();
//			document.add(listItems1);
			
			
				
//			("Page no: " + pageNo);
	
		   // pageNo++ ;
	
		  //  document.newPage();


		document.close();

//		("Report Name : " + reportName + "\nPDF has been generated successfully in this path : \n" + RESULT);

	}

	public static PdfPTable createHeader1() throws DocumentException {
		PdfPTable table = new PdfPTable(1);

		table.setTotalWidth(550);
		table.setLockedWidth(true);
		table.setWidths(new float[] { 1 });

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

	public static PdfPTable createHeader2(String fromDate, String toDate) throws DocumentException {
		PdfPTable table = new PdfPTable(1);

		table.setTotalWidth(550);
		table.setLockedWidth(true);
		table.setWidths(new float[] { 1 });

		PdfPCell cell_2;

		Paragraph para_1 = new Paragraph();
		para_1.add(new Chunk(reportName, Font8Bold));
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

	public static PdfPTable createHeader3(int pageNo) throws DocumentException {
		PdfPTable table = new PdfPTable(2);

		table.setTotalWidth(550);
		table.setLockedWidth(true);
		table.setWidths(new float[] { 7, 1 });

		PdfPCell cell_1;

		cell_1: {
			Paragraph para_1 = new Paragraph();
			para_1.add(new Chunk(SectionName, Font8Bold));
			para_1.add(Chunk.NEWLINE);
			para_1.setSpacingBefore(10);
			para_1.setSpacingAfter(10);

			cell_1 = new PdfPCell(para_1);
			cell_1.setPadding(6);
			cell_1.setBorder(Rectangle.NO_BORDER);
			cell_1.setHorizontalAlignment(Element.ALIGN_LEFT);
			cell_1.setVerticalAlignment(Element.ALIGN_CENTER);
			table.addCell(cell_1);
		}

		cell_2: {
			Paragraph para_1 = new Paragraph();
			para_1.add(new Chunk("Page No. " + pageNo, Font7Bold));
			para_1.add(Chunk.NEWLINE);
			para_1.setSpacingBefore(10);
			para_1.setSpacingAfter(10);

			cell_1 = new PdfPCell(para_1);
			cell_1.setPadding(6);
			cell_1.setBorder(Rectangle.NO_BORDER);
			cell_1.setHorizontalAlignment(Element.ALIGN_RIGHT);
			cell_1.setVerticalAlignment(Element.ALIGN_CENTER);
			table.addCell(cell_1);
		}

		return table;
	}

	///////////// DEPARTMENT 1 : FURNACE //////////////////////////////////////
	//////////////////////////////////////////////////////////////////////////

	public static PdfPTable createFurnaceDept(String deptName) throws DocumentException {
		PdfPTable table = new PdfPTable(1);

		table.setTotalWidth(550);
		table.setLockedWidth(true);
		table.setWidths(new float[] { 1 });

		PdfPCell cell_2;

		Paragraph para_1 = new Paragraph();
		para_1.add(new Chunk("DEPARTMENT NAME : "+deptName, Font8Bold));
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

	public static PdfPTable createDescriptionTableHeadDept1() throws DocumentException {
		PdfPTable dataTable = new PdfPTable(5);

		dataTable.setTotalWidth(550);
		dataTable.setLockedWidth(true);
		dataTable.setWidths(new float[] { 1, 2, 4, 2, 2 });

		String[] headersLabels = {"Sl No", "Emp Code", "Emp Name", "OT Hrs.", "OT Amt." };

		for (int index = 0; index < headersLabels.length; index++) {

			PdfPCell cell;

			Paragraph headerParagraph = new Paragraph(headersLabels[index], Font7Bold);

			cell = new PdfPCell(headerParagraph);
			cell.setPadding(3);
			if (index == 1) {
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
			} else {
				cell.setHorizontalAlignment(Element.ALIGN_CENTER);
			}
			cell.setVerticalAlignment(Element.ALIGN_CENTER);
			cell.setBorder(Rectangle.LEFT | Rectangle.RIGHT | Rectangle.TOP);

			dataTable.addCell(cell);

		}

		return dataTable;
	}

	public static PdfPTable createDescriptionTableDept1(Integer i, String empCode, String empName, Double otHrs, Double otAmt) throws DocumentException {
		PdfPTable dataTable = new PdfPTable(5);

		dataTable.setTotalWidth(550);
		dataTable.setLockedWidth(true);
		dataTable.setWidths(new float[] {1, 2, 4, 2, 2 });

		PdfPCell cell;

		////////////// OT DETAILS ////////////////////////////////////
		/////////////////////////////////////////////////////////////
			
			  cell_1: {
			  
			  Paragraph para_2 = new Paragraph(); para_2.add(new Chunk(""+ i, Font7));
			  cell = new PdfPCell(para_2); cell.setPadding(3);
			  //cell.setBorder(Rectangle.NO_BORDER);
			  cell.setHorizontalAlignment(Element.ALIGN_CENTER);
			  cell.setVerticalAlignment(Element.ALIGN_CENTER); dataTable.addCell(cell);
			  
			  }
			 

			cell_2: {

				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk(String.valueOf(empCode), Font7));
				cell = new PdfPCell(para_2);
				cell.setPadding(3);
				// cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_CENTER);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				dataTable.addCell(cell);

			}

			cell_3: {

				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk(empName, Font7));
				cell = new PdfPCell(para_2);
				cell.setPadding(3);
				// cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				dataTable.addCell(cell);

			}

			cell_4: {

				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk(String.valueOf(otHrs), Font7));
				cell = new PdfPCell(para_2);
				cell.setPadding(3);
				// cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_CENTER);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				dataTable.addCell(cell);

			}

			cell_5: {

				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk(String.valueOf(otAmt), Font7));
				cell = new PdfPCell(para_2);
				cell.setPadding(3);
				// cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_CENTER);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				dataTable.addCell(cell);

			}

		return dataTable;
	}

}
