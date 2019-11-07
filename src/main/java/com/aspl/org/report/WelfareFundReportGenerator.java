package com.aspl.org.report;

import java.io.FileOutputStream;
import java.io.IOException;
import java.time.LocalDate;
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

public class WelfareFundReportGenerator {

	///////////////// GENERATED PDF PATH ///////////////////////////////////////////////////////////////////////////////////////////
	static Date date = new java.util.Date();
	
	static long time = date.getTime();
	
	static int randNum = (int) ((int) Math.random() + time);
	
	static String fileName = "crawley-advance-payment-report";
	
	//public static final String RESULT = "D:/ABHIRUP/emcee_workspace/erpa-v2/src/main/webapp/WEB-INF/pdf/" + fileName + "_" + randNum + ".pdf";
	
	public static final String RESULT = "D:/ABHIRUP/emcee_workspace/erpa-v2/src/main/webapp/WEB-INF/crawley-report/" + fileName + ".pdf";

	///////////////// HEADER CONSTANT /////////////////////////////////////////////////////////////////////////////////////////////
	
	static String head1 	= "STATEMENT REGARDING CONTRIBUTION";
	static String head2    = "(See Rule 5)";
	static String head3    = "Sri Asish Ray, Managing Director, CRAWLEY & RAY (FOUNDERS AND ENGINEERS) Private Limited, 32 Foreshore Road, Howrah-711103";
	static String head4    = "(Here give full name of the person signing the statement with description of the position holds)";

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
		para_1.add(new Chunk(head1, Font10Bold));
		para_1.add(Chunk.NEWLINE);
		para_1.setSpacingBefore(10);
		para_1.setSpacingAfter(10);
		
		cell_1 = new PdfPCell(para_1);
		cell_1.setPaddingTop(5);
		cell_1.setBorder(Rectangle.NO_BORDER);
		cell_1.setHorizontalAlignment(Element.ALIGN_CENTER);
		cell_1.setVerticalAlignment(Element.ALIGN_CENTER);
		table.addCell(cell_1);
		
		return table;
	}
	
	public static PdfPTable createHeader2() throws DocumentException {
		PdfPTable table = new PdfPTable(1);

		table.setTotalWidth(550);
		table.setLockedWidth(true);
		table.setWidths(new float[]{1});
		
		PdfPCell cell_1;
		
		Paragraph para_1 = new Paragraph();
		para_1.add(new Chunk(head2, Font10));
		para_1.add(Chunk.NEWLINE);
		para_1.setSpacingBefore(50);
		para_1.setSpacingAfter(50);
		
		cell_1 = new PdfPCell(para_1);
		cell_1.setPaddingTop(5);
		cell_1.setBorder(Rectangle.NO_BORDER);
		cell_1.setHorizontalAlignment(Element.ALIGN_CENTER);
		cell_1.setVerticalAlignment(Element.ALIGN_CENTER);
		table.addCell(cell_1);
		
		return table;
	}
	
	public static PdfPTable createHeader3() throws DocumentException {
		PdfPTable table = new PdfPTable(1);

		table.setTotalWidth(450);
		table.setLockedWidth(true);
		table.setWidths(new float[]{1});
		
		PdfPCell cell_1;
		
		Paragraph para_1 = new Paragraph();
		para_1.add(new Chunk(head3, Font10));
		para_1.add(Chunk.NEWLINE);
		para_1.setSpacingBefore(20);
		para_1.setSpacingAfter(10);
		
		cell_1 = new PdfPCell(para_1);
		cell_1.setPaddingTop(5);
		cell_1.setPaddingBottom(5);
		cell_1.setBorder(Rectangle.NO_BORDER);
		cell_1.setHorizontalAlignment(Element.ALIGN_CENTER);
		cell_1.setVerticalAlignment(Element.ALIGN_CENTER);
		table.addCell(cell_1);
		
		return table;
	}
	
	public static PdfPTable createHeader4() throws DocumentException {
		PdfPTable table = new PdfPTable(1);

		table.setTotalWidth(550);
		table.setLockedWidth(true);
		table.setWidths(new float[]{1});
		
		PdfPCell cell_1;
		
		Paragraph para_1 = new Paragraph();
		para_1.add(new Chunk(head4, Font10));
		para_1.add(Chunk.NEWLINE);
		para_1.setSpacingBefore(50);
		para_1.setSpacingAfter(50);
		
		cell_1 = new PdfPCell(para_1);
		cell_1.setPaddingTop(5);
		cell_1.setPaddingBottom(5);
		cell_1.setBorder(Rectangle.NO_BORDER);
		cell_1.setHorizontalAlignment(Element.ALIGN_CENTER);
		cell_1.setVerticalAlignment(Element.ALIGN_CENTER);
		table.addCell(cell_1);
		
		return table;
	}
	
	public static PdfPTable createTable1() throws DocumentException {
		PdfPTable table = new PdfPTable(1);

		table.setTotalWidth(550);
		table.setLockedWidth(true);
		table.setWidths(new float[]{1});
		
		PdfPCell cell;
		
		////////////// EMPLOYEE DETAILS LINE 1 ////////////////////////////////////
		//////////////////////////////////////////////////////////////////////////
			
			cell_1: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("To", Font9));
				cell = new PdfPCell(para_2);
				cell.setPadding(1);
				cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
		
		return table;
	}
	
	public static PdfPTable createTable2() throws DocumentException {
		PdfPTable table = new PdfPTable(1);

		table.setTotalWidth(550);
		table.setLockedWidth(true);
		table.setWidths(new float[]{1});
		
		PdfPCell cell;
		
		////////////// EMPLOYEE DETAILS LINE 1 ////////////////////////////////////
		//////////////////////////////////////////////////////////////////////////
			
			cell_1: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("The Welfare Commissioner,", Font9));
				cell = new PdfPCell(para_2);
				cell.setPadding(1);
				cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
		
		return table;
	}
	
	public static PdfPTable createTable3() throws DocumentException {
		PdfPTable table = new PdfPTable(1);

		table.setTotalWidth(550);
		table.setLockedWidth(true);
		table.setWidths(new float[]{1});
		
		PdfPCell cell;
		
		////////////// EMPLOYEE DETAILS LINE 1 ////////////////////////////////////
		//////////////////////////////////////////////////////////////////////////
			
			cell_1: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("West Bengal Labour Welfare Board,", Font9));
				cell = new PdfPCell(para_2);
				cell.setPadding(1);
				cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
		
		return table;
	}
	
	public static PdfPTable createTable4() throws DocumentException {
		PdfPTable table = new PdfPTable(1);

		table.setTotalWidth(550);
		table.setLockedWidth(true);
		table.setWidths(new float[]{1});
		
		PdfPCell cell;
		
		////////////// EMPLOYEE DETAILS LINE 1 ////////////////////////////////////
		//////////////////////////////////////////////////////////////////////////
			
			cell_1: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("Shramik Kalyan Bhawan,", Font9));
				cell = new PdfPCell(para_2);
				cell.setPadding(1);
				cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
		
		return table;
	}
	
	public static PdfPTable createTable5() throws DocumentException {
		PdfPTable table = new PdfPTable(1);

		table.setTotalWidth(550);
		table.setLockedWidth(true);
		table.setWidths(new float[]{1});
		
		PdfPCell cell;
		
		////////////// EMPLOYEE DETAILS LINE 1 ////////////////////////////////////
		//////////////////////////////////////////////////////////////////////////
			
			cell_1: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("p-3, CIT Scheme --VII --M,", Font9));
				cell = new PdfPCell(para_2);
				cell.setPadding(1);
				cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
		
		return table;
	}
	
	public static PdfPTable createTable6() throws DocumentException {
		PdfPTable table = new PdfPTable(1);

		table.setTotalWidth(550);
		table.setLockedWidth(true);
		table.setWidths(new float[]{1});
		
		PdfPCell cell;
		
		////////////// EMPLOYEE DETAILS LINE 1 ////////////////////////////////////
		//////////////////////////////////////////////////////////////////////////
			
			cell_1: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("Kakurgachi,", Font9));
				cell = new PdfPCell(para_2);
				cell.setPadding(1);
				cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
		
		return table;
	}
	
	public static PdfPTable createTable7() throws DocumentException {
		PdfPTable table = new PdfPTable(1);

		table.setTotalWidth(550);
		table.setLockedWidth(true);
		table.setWidths(new float[]{1});
		
		PdfPCell cell;
		
		////////////// EMPLOYEE DETAILS LINE 1 ////////////////////////////////////
		//////////////////////////////////////////////////////////////////////////
			
			cell_1: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("Kolkata - 700051.", Font9));
				cell = new PdfPCell(para_2);
				cell.setPadding(1);
				cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
		
		return table;
	}
	
	public static PdfPTable createTable8() throws DocumentException {
		PdfPTable table = new PdfPTable(1);

		table.setTotalWidth(550);
		table.setLockedWidth(true);
		table.setWidths(new float[]{1});
		
		PdfPCell cell;
		
		////////////// EMPLOYEE DETAILS LINE 1 ////////////////////////////////////
		//////////////////////////////////////////////////////////////////////////
			
			cell_1: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("---------------------------------------------------------", Font6));
				cell = new PdfPCell(para_2);
				cell.setPadding(1);
				cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
		
		return table;
	}
	
	public static PdfPTable createTable9() throws DocumentException {
		PdfPTable table = new PdfPTable(1);

		table.setTotalWidth(550);
		table.setLockedWidth(true);
		table.setWidths(new float[]{1});
		
		PdfPCell cell;
		
		////////////// EMPLOYEE DETAILS LINE 1 ////////////////////////////////////
		//////////////////////////////////////////////////////////////////////////
			
			cell_1: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("As required under Rule 5 of the West Bengal Welfare Fund Rules, 1976 I am furnishing below the necessary particulars in relation to the amount of Rs. 3.00 ( Three only )\ntendered herewith as the total amount payable by the establishment both as employees and as well as employer's contribution for the period from 1st Jan to 31-Dec-"+LocalDate.now().getYear()+". A separate list containing the names of employees engaged for the above period and amount of them is attached herewith. A list of exempted employees and a separate list containing the name of contractors labours engaged for the above period and amount of them is also enclosed.", Font9));
				cell = new PdfPCell(para_2);
				cell.setPadding(1);
				cell.setPaddingTop(5);
				cell.setPaddingBottom(5);
				cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
		
		return table;
	}
	
	public static PdfPTable createTable10() throws DocumentException {
		PdfPTable table = new PdfPTable(2);

		table.setTotalWidth(550);
		table.setLockedWidth(true);
		table.setWidths(new float[]{1, 1});
		
		PdfPCell cell;
		
		////////////// EMPLOYEE DETAILS LINE 1 ////////////////////////////////////
		//////////////////////////////////////////////////////////////////////////
			
			cell_1: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("PARTICULARS", Font10));
				cell = new PdfPCell(para_2);
				cell.setPadding(1);
				cell.setPaddingTop(10);
				cell.setPaddingBottom(5);
				cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_CENTER);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
		
			cell_2: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("CODE NO : C--42", Font10));
				cell = new PdfPCell(para_2);
				cell.setPadding(1);
				cell.setPaddingTop(10);
				cell.setPaddingBottom(5);
				cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_CENTER);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
		
		return table;
	}
	
	public static PdfPTable createTable11() throws DocumentException {
		PdfPTable table = new PdfPTable(3);

		table.setTotalWidth(550);
		table.setLockedWidth(true);
		table.setWidths(new float[]{1, 9, 10});
		
		PdfPCell cell;
		
		////////////// EMPLOYEE DETAILS LINE 1 ////////////////////////////////////
		//////////////////////////////////////////////////////////////////////////
			
			cell_1: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("1.", Font10));
				cell = new PdfPCell(para_2);
				cell.setPadding(1);
				cell.setPaddingTop(5);
				cell.setPaddingBottom(5);
				cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
			cell_2: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("Name of the establishment with full address", Font10));
				cell = new PdfPCell(para_2);
				cell.setPadding(1);
				cell.setPaddingTop(5);
				cell.setPaddingBottom(5);
				cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
		
			cell_3: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("CRAWLEY & RAY (FOUNDERS AND ENGINEERS) Pvt. Ltd., 32, Foreshore Road, Howrah-3", Font9));
				cell = new PdfPCell(para_2);
				cell.setPadding(1);
				cell.setPaddingTop(5);
				cell.setPaddingBottom(5);
				cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_CENTER);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
		
		return table;
	}
	
	public static PdfPTable createTable12() throws DocumentException {
		PdfPTable table = new PdfPTable(3);

		table.setTotalWidth(550);
		table.setLockedWidth(true);
		table.setWidths(new float[]{1, 9, 10});
		
		PdfPCell cell;
		
		////////////// EMPLOYEE DETAILS LINE 1 ////////////////////////////////////
		//////////////////////////////////////////////////////////////////////////
			
			cell_1: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("2.", Font10));
				cell = new PdfPCell(para_2);
				cell.setPadding(1);
				cell.setPaddingTop(5);
				cell.setPaddingBottom(5);
				cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
		
		cell_2: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("Whether a Factory/Tramway of motor transport under taking/commercial establishment of any other cases of establishment specified by a Government notification.", Font10));
				cell = new PdfPCell(para_2);
				cell.setPadding(1);
				cell.setPaddingTop(5);
				cell.setPaddingBottom(5);
				cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
		
			cell_3: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("FACTORY", Font10));
				cell = new PdfPCell(para_2);
				cell.setPadding(1);
				cell.setPaddingTop(5);
				cell.setPaddingBottom(5);
				cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_CENTER);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
		
		return table;
	}
	
	public static PdfPTable createTable13(Integer totalNoOfEmp) throws DocumentException {
		PdfPTable table = new PdfPTable(3);

		table.setTotalWidth(550);
		table.setLockedWidth(true);
		table.setWidths(new float[]{1, 9, 10});
		
		PdfPCell cell;
		
		////////////// EMPLOYEE DETAILS LINE 1 ////////////////////////////////////
		//////////////////////////////////////////////////////////////////////////
			
			cell_1: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("3.", Font10));
				cell = new PdfPCell(para_2);
				cell.setPadding(1);
				cell.setPaddingTop(5);
				cell.setPaddingBottom(5);
				cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
		
			cell_2: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("Total number of employees employed on proceeding 31-Dec-"+LocalDate.now().getYear()+" (as the case may be)", Font10));
				cell = new PdfPCell(para_2);
				cell.setPadding(1);
				cell.setPaddingTop(5);
				cell.setPaddingBottom(5);
				cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
		
			cell_3: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk(String.valueOf(totalNoOfEmp), Font10));
				cell = new PdfPCell(para_2);
				cell.setPadding(1);
				cell.setPaddingTop(5);
				cell.setPaddingBottom(5);
				cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_CENTER);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
		
		return table;
	}
	
	public static PdfPTable createTable14(Integer noOfEmpContributionDeducted) throws DocumentException {
		PdfPTable table = new PdfPTable(3);

		table.setTotalWidth(550);
		table.setLockedWidth(true);
		table.setWidths(new float[]{1, 9, 10});
		
		PdfPCell cell;
		
		////////////// EMPLOYEE DETAILS LINE 1 ////////////////////////////////////
		//////////////////////////////////////////////////////////////////////////
			
			cell_1: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("4.", Font10));
				cell = new PdfPCell(para_2);
				cell.setPadding(1);
				cell.setPaddingTop(5);
				cell.setPaddingBottom(5);
				cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
		
			cell_2: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("Total number of employees from whom contribution has been deducted for the period.", Font10));
				cell = new PdfPCell(para_2);
				cell.setPadding(1);
				cell.setPaddingTop(5);
				cell.setPaddingBottom(5);
				cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
		
			cell_3: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk(String.valueOf(noOfEmpContributionDeducted), Font10));
				cell = new PdfPCell(para_2);
				cell.setPadding(1);
				cell.setPaddingTop(5);
				cell.setPaddingBottom(5);
				cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_CENTER);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
		
		return table;
	}
	
	public static PdfPTable createTable15(Integer noOfEmployefromconTender) throws DocumentException {
		PdfPTable table = new PdfPTable(3);

		table.setTotalWidth(550);
		table.setLockedWidth(true);
		table.setWidths(new float[]{1, 9, 10});
		
		PdfPCell cell;
		
		////////////// EMPLOYEE DETAILS LINE 1 ////////////////////////////////////
		//////////////////////////////////////////////////////////////////////////
			
			cell_1: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("5.", Font10));
				cell = new PdfPCell(para_2);
				cell.setPadding(1);
				cell.setPaddingTop(5);
				cell.setPaddingBottom(5);
				cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
		
			cell_2: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("Total number of employees from contribution tendered for the period ment notification.", Font10));
				cell = new PdfPCell(para_2);
				cell.setPadding(1);
				cell.setPaddingTop(5);
				cell.setPaddingBottom(5);
				cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
		
			cell_3: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk(String.valueOf(noOfEmployefromconTender), Font10));
				cell = new PdfPCell(para_2);
				cell.setPadding(1);
				cell.setPaddingTop(5);
				cell.setPaddingBottom(5);
				cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_CENTER);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
		
		return table;
	}
	
	public static PdfPTable createTable16(Integer totalAmtofEmpFromContriTender) throws DocumentException {
		PdfPTable table = new PdfPTable(3);

		table.setTotalWidth(550);
		table.setLockedWidth(true);
		table.setWidths(new float[]{1, 9, 10});
		
		PdfPCell cell;
		
		////////////// EMPLOYEE DETAILS LINE 1 ////////////////////////////////////
		//////////////////////////////////////////////////////////////////////////
			
			cell_1: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("6.", Font10));
				cell = new PdfPCell(para_2);
				cell.setPadding(1);
				cell.setPaddingTop(5);
				cell.setPaddingBottom(5);
				cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
		
			cell_2: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("Total amount of employer's from contribution tendered for the period.", Font10));
				cell = new PdfPCell(para_2);
				cell.setPadding(1);
				cell.setPaddingTop(5);
				cell.setPaddingBottom(5);
				cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
		
			cell_3: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk(String.valueOf(totalAmtofEmpFromContriTender), Font10));
				cell = new PdfPCell(para_2);
				cell.setPadding(1);
				cell.setPaddingTop(5);
				cell.setPaddingBottom(5);
				cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_CENTER);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
		
		return table;
	}
	
	public static PdfPTable createTable17(Integer toAmtofContractorLabour) throws DocumentException {
		PdfPTable table = new PdfPTable(3);

		table.setTotalWidth(550);
		table.setLockedWidth(true);
		table.setWidths(new float[]{1, 9, 10});
		
		PdfPCell cell;
		
		////////////// EMPLOYEE DETAILS LINE 1 ////////////////////////////////////
		//////////////////////////////////////////////////////////////////////////
			
			cell_1: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("7.", Font10));
				cell = new PdfPCell(para_2);
				cell.setPadding(1);
				cell.setPaddingTop(5);
				cell.setPaddingBottom(5);
				cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
		
			cell_2: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("Total amount of Contractor labour's contribution tendered for the period.", Font10));
				cell = new PdfPCell(para_2);
				cell.setPadding(1);
				cell.setPaddingTop(5);
				cell.setPaddingBottom(5);
				cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
		
			cell_3: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk(String.valueOf(toAmtofContractorLabour), Font10));
				cell = new PdfPCell(para_2);
				cell.setPadding(1);
				cell.setPaddingTop(5);
				cell.setPaddingBottom(5);
				cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_CENTER);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
		
		return table;
	}
	
	public static PdfPTable createTable18(Integer grandTotal) throws DocumentException {
		PdfPTable table = new PdfPTable(3);

		table.setTotalWidth(550);
		table.setLockedWidth(true);
		table.setWidths(new float[]{1, 9, 10});
		
		PdfPCell cell;
		
		////////////// EMPLOYEE DETAILS LINE 1 ////////////////////////////////////
		//////////////////////////////////////////////////////////////////////////
			
			cell_1: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("8.", Font10));
				cell = new PdfPCell(para_2);
				cell.setPadding(1);
				cell.setPaddingTop(5);
				cell.setPaddingBottom(5);
				cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
		
			cell_2: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("Grand Total of the both employees as well as employer's and contractor labours contribution deducted and tendered respectively for the period.", Font10));
				cell = new PdfPCell(para_2);
				cell.setPadding(1);
				cell.setPaddingTop(5);
				cell.setPaddingBottom(5);
				cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
		
			cell_3: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk(String.valueOf(grandTotal), Font10));
				cell = new PdfPCell(para_2);
				cell.setPadding(1);
				cell.setPaddingTop(5);
				cell.setPaddingBottom(5);
				cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_CENTER);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
		
		return table;
	}
	
	public static PdfPTable createTable19() throws DocumentException {
		PdfPTable table = new PdfPTable(3);

		table.setTotalWidth(550);
		table.setLockedWidth(true);
		table.setWidths(new float[]{1, 9, 10});
		
		PdfPCell cell;
		
		////////////// EMPLOYEE DETAILS LINE 1 ////////////////////////////////////
		//////////////////////////////////////////////////////////////////////////
			
			cell_1: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("9.", Font10));
				cell = new PdfPCell(para_2);
				cell.setPadding(1);
				cell.setPaddingTop(5);
				cell.setPaddingBottom(5);
				cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
		
			cell_2: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("Whether full payment of the amount due for period has been tendered.", Font10));
				cell = new PdfPCell(para_2);
				cell.setPadding(1);
				cell.setPaddingTop(5);
				cell.setPaddingBottom(5);
				cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
		
			cell_3: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("", Font10));
				cell = new PdfPCell(para_2);
				cell.setPadding(1);
				cell.setPaddingTop(5);
				cell.setPaddingBottom(5);
				cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_CENTER);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
		
		return table;
	}
	
	public static PdfPTable createTable20(String chequeCash,Date chequeDate,String branch) throws DocumentException {
		PdfPTable table = new PdfPTable(3);

		table.setTotalWidth(550);
		table.setLockedWidth(true);
		table.setWidths(new float[]{1, 9, 10});
		
		PdfPCell cell;
		
		////////////// EMPLOYEE DETAILS LINE 1 ////////////////////////////////////
		//////////////////////////////////////////////////////////////////////////
			
			cell_1: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("10.", Font10));
				cell = new PdfPCell(para_2);
				cell.setPadding(1);
				cell.setPaddingTop(5);
				cell.setPaddingBottom(5);
				cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
		
			cell_2: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("Amount of unpaid balance if any, and reasons thereof", Font10));
				cell = new PdfPCell(para_2);
				cell.setPadding(1);
				cell.setPaddingTop(5);
				cell.setPaddingBottom(5);
				cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
		
			cell_3: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("Cheque/Cash : "+chequeCash+"\n\nDate : "+String.valueOf(chequeDate).split("\\s")[0]+"\n\nBranch : "+branch, Font10));
				cell = new PdfPCell(para_2);
				cell.setPadding(1);
				cell.setPaddingTop(5);
				cell.setPaddingBottom(5);
				cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_CENTER);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
		
		return table;
	}
	
	public static PdfPTable createTable21() throws DocumentException {
		PdfPTable table = new PdfPTable(3);

		table.setTotalWidth(550);
		table.setLockedWidth(true);
		table.setWidths(new float[]{1, 9, 10});
		
		PdfPCell cell;
		
		////////////// EMPLOYEE DETAILS LINE 1 ////////////////////////////////////
		//////////////////////////////////////////////////////////////////////////
			
			cell_1: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("11.", Font10));
				cell = new PdfPCell(para_2);
				cell.setPadding(1);
				cell.setPaddingTop(5);
				cell.setPaddingBottom(5);
				cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
		
			cell_2: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("Mode of payment whether in cash or bank cheque or money order, if by money order, mention postal receipt number and date thereof. If any bank cheque mention name, branch and address of the bank on which drawn, Cheque number and date.", Font10));
				cell = new PdfPCell(para_2);
				cell.setPadding(1);
				cell.setPaddingTop(5);
				cell.setPaddingBottom(5);
				cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
		
			cell_3: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("", Font10));
				cell = new PdfPCell(para_2);
				cell.setPadding(1);
				cell.setPaddingTop(5);
				cell.setPaddingBottom(5);
				cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_CENTER);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
		
		return table;
	}
	
	public static PdfPTable createTable22() throws DocumentException {
		PdfPTable table = new PdfPTable(3);

		table.setTotalWidth(550);
		table.setLockedWidth(true);
		table.setWidths(new float[]{1, 9, 10});
		
		PdfPCell cell;
		
		////////////// EMPLOYEE DETAILS LINE 1 ////////////////////////////////////
		//////////////////////////////////////////////////////////////////////////
			
			cell_1: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("12.", Font10));
				cell = new PdfPCell(para_2);
				cell.setPadding(1);
				cell.setPaddingTop(5);
				cell.setPaddingBottom(5);
				cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
		
			cell_2: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("Remarks if any", Font10));
				cell = new PdfPCell(para_2);
				cell.setPadding(1);
				cell.setPaddingTop(5);
				cell.setPaddingBottom(5);
				cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
		
			cell_3: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("", Font10));
				cell = new PdfPCell(para_2);
				cell.setPadding(1);
				cell.setPaddingTop(5);
				cell.setPaddingBottom(5);
				cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_CENTER);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
		
		return table;
	}
	
	public static PdfPTable createTable23() throws DocumentException {
		PdfPTable table = new PdfPTable(1);

		table.setTotalWidth(550);
		table.setLockedWidth(true);
		table.setWidths(new float[]{1});
		
		PdfPCell cell;
		
		////////////// EMPLOYEE DETAILS LINE 1 ////////////////////////////////////
		//////////////////////////////////////////////////////////////////////////
			
			cell_1: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("I hereby declare that the before mentioned particulars are true and correct to the best of my knowledge and belief.", Font10));
				cell = new PdfPCell(para_2);
				cell.setPadding(1);
				cell.setPaddingTop(5);
				cell.setPaddingBottom(35);
				cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
		
		return table;
	}
	
	public static PdfPTable createTable24() throws DocumentException {
		PdfPTable table = new PdfPTable(1);

		table.setTotalWidth(550);
		table.setLockedWidth(true);
		table.setWidths(new float[]{1});
		
		PdfPCell cell;
		
		////////////// EMPLOYEE DETAILS LINE 1 ////////////////////////////////////
		//////////////////////////////////////////////////////////////////////////
			
			cell_1: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("..................................................................", Font10));
				cell = new PdfPCell(para_2);
				cell.setPadding(1);
				cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
		
		return table;
	}
	
	public static PdfPTable createTable25() throws DocumentException {
		PdfPTable table = new PdfPTable(1);

		table.setTotalWidth(550);
		table.setLockedWidth(true);
		table.setWidths(new float[]{1});
		
		PdfPCell cell;
		
		////////////// EMPLOYEE DETAILS LINE 1 ////////////////////////////////////
		//////////////////////////////////////////////////////////////////////////
			
			cell_1: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("(Signature with designation or description \n of the post held official seal)", Font10));
				cell = new PdfPCell(para_2);
				cell.setPadding(1);
				cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
		
		return table;
	}
	
	
}
