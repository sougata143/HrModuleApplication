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

public class CrawleyOverTimeAllReportGenerator {

	///////////////// GENERATED PDF PATH ///////////////////////////////////////////////////////////////////////////////////////////
	static Date date = new java.util.Date();
	
	static long time = date.getTime();
	
	static int randNum = (int) ((int) Math.random() + time);
	
	static String fileName = "crawley-over-time-all-report";
	
	//public static final String RESULT = "D:/ABHIRUP/emcee_workspace/erpa-v2/src/main/webapp/WEB-INF/pdf/" + fileName + "_" + randNum + ".pdf";
	
	public static final String RESULT = "D:/ABHIRUP/emcee_workspace/erpa-v2/src/main/webapp/WEB-INF/crawley-report/" + fileName + ".pdf";

	///////////////// HEADER CONSTANT /////////////////////////////////////////////////////////////////////////////////////////////
	
	static String companyName 	= "CRAWLEY & RAY (FOUNDERS AND ENGINEERS) PRIVATE LTD.";
	static String reportName    = "OVER TIME FOR DATE OF 01-06-2019 TO 30-06-2019";

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

		document.setPageSize(PageSize.A4);
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
		
		PdfPTable listItems = createDescriptionTable();
		document.add(listItems);*/
		
		document.close();
		
//		("Report Name : " + reportName + "\nPDF has been generated successfully in this path : \n" + RESULT);
		
	}
	
	public static PdfPTable createHeader1() throws DocumentException {
		PdfPTable table = new PdfPTable(1);

		table.setTotalWidth(550);
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
	
	public static PdfPTable createHeader2(String reportFromDate, String reportToDate) throws DocumentException {
		PdfPTable table = new PdfPTable(1);

		table.setTotalWidth(550);
		table.setLockedWidth(true);
		table.setWidths(new float[]{1});
		
		PdfPCell cell_2;
		
		Paragraph para_1 = new Paragraph();
		para_1.add(new Chunk("OVER TIME FOR DATE OF " + reportFromDate + " TO " + reportToDate, Font8Bold));
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
		PdfPTable dataTable = new PdfPTable(5);

		dataTable.setTotalWidth(550);
		dataTable.setLockedWidth(true);
		dataTable.setWidths(new float[]{1, 2, 2, 4, 2});
		
		String[] headersLabels = {"SNo","Date","Emp Code","Name","O.T.Hrs."};
		
		for (int index = 0; index < headersLabels.length ; index++) {
			
    		PdfPCell cell;
			
			Paragraph headerParagraph = new Paragraph(headersLabels[index], Font7Bold);
			
			cell = new PdfPCell(headerParagraph);
			cell.setPadding(3);
			if(index == 3) {
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
	
	public static PdfPTable createDescriptionTable(int i, String Fromdate, String Todate, String empCode, String empName, Double otHrs) throws DocumentException {
		PdfPTable dataTable = new PdfPTable(5);

		
		
		
		
		
		dataTable.setTotalWidth(550);
		dataTable.setLockedWidth(true);
		dataTable.setWidths(new float[]{1, 2, 2, 4, 2});
		
		PdfPCell cell;
		
		////////////// OVER TIME DETAILS //////////////////////////////////
		//////////////////////////////////////////////////////////////////
			
		cell_1: {

			Paragraph para_2 = new Paragraph();
			para_2.add(new Chunk(i + "", Font7));
			cell = new PdfPCell(para_2);
			cell.setPadding(3);
			// cell.setBorder(Rectangle.NO_BORDER);
			cell.setHorizontalAlignment(Element.ALIGN_CENTER);
			cell.setVerticalAlignment(Element.ALIGN_CENTER);
			dataTable.addCell(cell);

		}

		cell_2: {

			Paragraph para_2 = new Paragraph();
			para_2.add(new Chunk(String.valueOf(Fromdate + " to "+Todate ), Font7));
			cell = new PdfPCell(para_2);
			cell.setPadding(3);
			// cell.setBorder(Rectangle.NO_BORDER);
			cell.setHorizontalAlignment(Element.ALIGN_CENTER);
			cell.setVerticalAlignment(Element.ALIGN_CENTER);
			dataTable.addCell(cell);

		}

		cell_3: {

			Paragraph para_2 = new Paragraph();
			para_2.add(new Chunk(String.valueOf(empCode), Font7));
			cell = new PdfPCell(para_2);
			cell.setPadding(3);
			// cell.setBorder(Rectangle.NO_BORDER);
			cell.setHorizontalAlignment(Element.ALIGN_CENTER);
			cell.setVerticalAlignment(Element.ALIGN_CENTER);
			dataTable.addCell(cell);

		}

		cell_4: {

			Paragraph para_2 = new Paragraph();
			para_2.add(new Chunk(String.valueOf(empName), Font7));
			cell = new PdfPCell(para_2);
			cell.setPadding(3);
			// cell.setBorder(Rectangle.NO_BORDER);
			cell.setHorizontalAlignment(Element.ALIGN_LEFT);
			cell.setVerticalAlignment(Element.ALIGN_CENTER);
			dataTable.addCell(cell);

		}

		cell_5: {

			Paragraph para_2 = new Paragraph();
			para_2.add(new Chunk(String.valueOf(otHrs), Font7));
			cell = new PdfPCell(para_2);
			cell.setPadding(3);
			// cell.setBorder(Rectangle.NO_BORDER);
			cell.setHorizontalAlignment(Element.ALIGN_CENTER);
			cell.setVerticalAlignment(Element.ALIGN_CENTER);
			dataTable.addCell(cell);

		}

		return dataTable;
	}
	
	public static PdfPTable createTotalOTHours(Double totalothouse) throws DocumentException {
		PdfPTable dataTable = new PdfPTable(5);

		dataTable.setTotalWidth(550);
		dataTable.setLockedWidth(true);
		dataTable.setWidths(new float[]{1, 2, 2, 4, 2});
		
		PdfPCell cell;
		
		////////////// OVER TIME DETAILS //////////////////////////////////
		//////////////////////////////////////////////////////////////////
			
		cell_1: {

			Paragraph para_2 = new Paragraph();
			para_2.add(new Chunk("TOTAL", Font8Bold));
			cell = new PdfPCell(para_2);
			cell.setPadding(3);
			cell.setColspan(4);
			// cell.setBorder(Rectangle.NO_BORDER);
			cell.setHorizontalAlignment(Element.ALIGN_RIGHT);
			cell.setVerticalAlignment(Element.ALIGN_CENTER);
			dataTable.addCell(cell);

		}

		cell_2: {

			Paragraph para_2 = new Paragraph();
			para_2.add(new Chunk(String.valueOf(totalothouse), Font8Bold));
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
