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

public class HalfyearlyFrom23ReportGenerator {

	///////////////// GENERATED PDF PATH ///////////////////////////////////////////////////////////////////////////////////////////
	static Date date = new java.util.Date();
	
	static long time = date.getTime();
	
	static int randNum = (int) ((int) Math.random() + time);
	
	static String fileName = "crawley-advance-payment-report";
	
	//public static final String RESULT = "D:/ABHIRUP/emcee_workspace/erpa-v2/src/main/webapp/WEB-INF/pdf/" + fileName + "_" + randNum + ".pdf";
	
	public static final String RESULT = "D:/ABHIRUP/emcee_workspace/erpa-v2/src/main/webapp/WEB-INF/crawley-report/" + fileName + ".pdf";

	///////////////// HEADER CONSTANT /////////////////////////////////////////////////////////////////////////////////////////////
	
	static String head1 	= "FORM 23";
	static String head2    = "[See Clause (2) of rule 103]";
	static String head3    = "HALF-YEARLY RETURN UNDER THE WEST BENGAL FACTORIES RULES";
	static String head4    = "Period ending 31-Dec-2018";

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
		//para_1.add(new Chunk("ADVANCE FOR DATE OF " + fromDate + " TO " + toDate, Font9Bold));
		para_1.add(new Chunk(head2, Font10));
		para_1.add(Chunk.NEWLINE);
		para_1.setSpacingBefore(50);
		para_1.setSpacingAfter(50);
		
		cell_1 = new PdfPCell(para_1);
		cell_1.setPaddingTop(2);
		cell_1.setBorder(Rectangle.NO_BORDER);
		cell_1.setHorizontalAlignment(Element.ALIGN_CENTER);
		cell_1.setVerticalAlignment(Element.ALIGN_CENTER);
		table.addCell(cell_1);
		
		return table;
	}
	
	public static PdfPTable createHeader3() throws DocumentException {
		PdfPTable table = new PdfPTable(1);

		table.setTotalWidth(550);
		table.setLockedWidth(true);
		table.setWidths(new float[]{1});
		
		PdfPCell cell_1;
		
		Paragraph para_1 = new Paragraph();
		para_1.add(new Chunk(head3, Font12Bold));
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
		cell_1.setPaddingTop(2);
		cell_1.setPaddingBottom(5);
		cell_1.setBorder(Rectangle.NO_BORDER);
		cell_1.setHorizontalAlignment(Element.ALIGN_CENTER);
		cell_1.setVerticalAlignment(Element.ALIGN_CENTER);
		table.addCell(cell_1);
		
		return table;
	}
	
	public static PdfPTable createTable1() throws DocumentException {
		PdfPTable table = new PdfPTable(2);

		table.setTotalWidth(550);
		table.setLockedWidth(true);
		table.setWidths(new float[]{1, 1});
		
		PdfPCell cell;
		
		////////////// EMPLOYEE DETAILS LINE 1 ////////////////////////////////////
		//////////////////////////////////////////////////////////////////////////
			
			cell_1: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("Registration No. \t\t\t\t\t\t\t\t 24-HW/X/86", Font9));
				cell = new PdfPCell(para_2);
				cell.setPadding(5);
				cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
			
			cell_2: {
			
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("Classification Code No. \t\t\t\t\t\t\t\t 27310", Font9));
				cell = new PdfPCell(para_2);
				cell.setPadding(5);
				cell.setPaddingRight(25);
				cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_RIGHT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
		
		return table;
	}
	
	
	
	public static PdfPTable createTable2() throws DocumentException {
		PdfPTable table = new PdfPTable(2);

		table.setTotalWidth(550);
		table.setLockedWidth(true);
		table.setWidths(new float[]{3, 7});
		
		PdfPCell cell;
		
		////////////// EMPLOYEE DETAILS LINE 1 ////////////////////////////////////
		//////////////////////////////////////////////////////////////////////////
			
			cell_1: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("Name of Factory", Font9));
				cell = new PdfPCell(para_2);
				cell.setPadding(4);
				cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
			
			cell_2: {
			
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk(": \t\t\t\t CRAWLEY & RAY (FOUNDERS AND ENGINEERS) PVT. LTD.", Font9));
				cell = new PdfPCell(para_2);
				cell.setPadding(4);
				cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
		
		return table;
	}
	
	public static PdfPTable createTable3() throws DocumentException {
		PdfPTable table = new PdfPTable(2);

		table.setTotalWidth(550);
		table.setLockedWidth(true);
		table.setWidths(new float[]{3, 7});
		
		PdfPCell cell;
		
		////////////// EMPLOYEE DETAILS LINE 1 ////////////////////////////////////
		//////////////////////////////////////////////////////////////////////////
			
			cell_1: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("Name of Occupier", Font9));
				cell = new PdfPCell(para_2);
				cell.setPadding(4);
				cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
			
			cell_2: {
			
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk(": \t\t\t\t MR. ASISH RAY", Font9));
				cell = new PdfPCell(para_2);
				cell.setPadding(4);
				cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
		
		return table;
	}
	
	public static PdfPTable createTable4() throws DocumentException {
		PdfPTable table = new PdfPTable(2);

		table.setTotalWidth(550);
		table.setLockedWidth(true);
		table.setWidths(new float[]{3, 7});
		
		PdfPCell cell;
		
		////////////// EMPLOYEE DETAILS LINE 1 ////////////////////////////////////
		//////////////////////////////////////////////////////////////////////////
			
			cell_1: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("Name of Manager", Font9));
				cell = new PdfPCell(para_2);
				cell.setPadding(4);
				cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
			
			cell_2: {
			
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk(": \t\t\t\t MR. MALAY RAY", Font9));
				cell = new PdfPCell(para_2);
				cell.setPadding(4);
				cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
		
		return table;
	}
	
	public static PdfPTable createTable5() throws DocumentException {
		PdfPTable table = new PdfPTable(2);

		table.setTotalWidth(550);
		table.setLockedWidth(true);
		table.setWidths(new float[]{3, 7});
		
		PdfPCell cell;
		
		////////////// EMPLOYEE DETAILS LINE 1 ////////////////////////////////////
		//////////////////////////////////////////////////////////////////////////
			
			cell_1: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("1. \t\t District", Font9));
				cell = new PdfPCell(para_2);
				cell.setPadding(4);
				cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
			
			cell_2: {
			
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk(": \t\t\t\t HOWRAH", Font9));
				cell = new PdfPCell(para_2);
				cell.setPadding(4);
				cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
		
		return table;
	}
	
	public static PdfPTable createTable6() throws DocumentException {
		PdfPTable table = new PdfPTable(2);

		table.setTotalWidth(550);
		table.setLockedWidth(true);
		table.setWidths(new float[]{3, 7});
		
		PdfPCell cell;
		
		////////////// EMPLOYEE DETAILS LINE 1 ////////////////////////////////////
		//////////////////////////////////////////////////////////////////////////
			
			cell_1: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("2. \t\t Postal Address", Font9));
				cell = new PdfPCell(para_2);
				cell.setPadding(4);
				cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
			
			cell_2: {
			
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk(": \t\t\t\t 25, Foreshore Road, P.O. Botanic Garden, Howrah-711103", Font9));
				cell = new PdfPCell(para_2);
				cell.setPadding(4);
				cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
		
		return table;
	}
	
	public static PdfPTable createTable7() throws DocumentException {
		PdfPTable table = new PdfPTable(2);

		table.setTotalWidth(550);
		table.setLockedWidth(true);
		table.setWidths(new float[]{3, 7});
		
		PdfPCell cell;
		
		////////////// EMPLOYEE DETAILS LINE 1 ////////////////////////////////////
		//////////////////////////////////////////////////////////////////////////
			
			cell_1: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("3. \t\t Nature of Industry", Font9));
				cell = new PdfPCell(para_2);
				cell.setPadding(4);
				cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
			
			cell_2: {
			
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk(": \t\t\t\t  FOUNDRY", Font9));
				cell = new PdfPCell(para_2);
				cell.setPadding(4);
				cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
		
		return table;
	}
	
	
	public static PdfPTable createTable8() throws DocumentException {
		PdfPTable table = new PdfPTable(2);

		table.setTotalWidth(550);
		table.setLockedWidth(true);
		table.setWidths(new float[]{7, 3});
		
		PdfPCell cell;
		
		////////////// EMPLOYEE DETAILS LINE 1 ////////////////////////////////////
		//////////////////////////////////////////////////////////////////////////
			
			cell_1: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("4. \t\t Number of days worked during the half -year ending 31-Dec-2018", Font9));
				cell = new PdfPCell(para_2);
				cell.setPadding(4);
				cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
			
			cell_2: {
			
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk(": \t\t\t\t  299", Font9));
				cell = new PdfPCell(para_2);
				cell.setPadding(4);
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
				para_2.add(new Chunk("5. \t\t Number of man-days worked during the half-year ending 31-Dec-2018", Font9));
				cell = new PdfPCell(para_2);
				cell.setPadding(4);
				cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
			
		
		return table;
	}
	
	public static PdfPTable createTable10() throws DocumentException {
		PdfPTable table = new PdfPTable(3);

		table.setTotalWidth(550);
		table.setLockedWidth(true);
		table.setWidths(new float[]{1, 1, 1});
		
		PdfPCell cell;
		
		////////////// EMPLOYEE DETAILS LINE 1 ////////////////////////////////////
		//////////////////////////////////////////////////////////////////////////
			
			cell_1: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("    \t\t Adults-Men", Font9));
				cell = new PdfPCell(para_2);
				cell.setPadding(4);
				cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
			
			cell_2: {
			
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk(": \t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t  1 \t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t Women", Font9));
				cell = new PdfPCell(para_2);
				cell.setPadding(4);
				cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
			
			cell_3: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk(": \t\t\t\t  ", Font9));
				cell = new PdfPCell(para_2);
				cell.setPadding(4);
				cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
		
		return table;
	}
	
	public static PdfPTable createTable11() throws DocumentException {
		PdfPTable table = new PdfPTable(3);

		table.setTotalWidth(550);
		table.setLockedWidth(true);
		table.setWidths(new float[]{1, 1, 1});
		
		PdfPCell cell;
		
		////////////// EMPLOYEE DETAILS LINE 1 ////////////////////////////////////
		//////////////////////////////////////////////////////////////////////////
			
			cell_1: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("    \t\t Adolescents-Male", Font9));
				cell = new PdfPCell(para_2);
				cell.setPadding(4);
				cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
			
			cell_2: {
			
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk(": \t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t  X \t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t Female", Font9));
				cell = new PdfPCell(para_2);
				cell.setPadding(4);
				cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
			
			cell_3: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk(": \t\t\t\t  X", Font9));
				cell = new PdfPCell(para_2);
				cell.setPadding(4);
				cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
		
		return table;
	}
	
	public static PdfPTable createTable12() throws DocumentException {
		PdfPTable table = new PdfPTable(3);

		table.setTotalWidth(550);
		table.setLockedWidth(true);
		table.setWidths(new float[]{1, 1, 1});
		
		PdfPCell cell;
		
		////////////// EMPLOYEE DETAILS LINE 1 ////////////////////////////////////
		//////////////////////////////////////////////////////////////////////////
			
			cell_1: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("    \t\t Children-Boys", Font9));
				cell = new PdfPCell(para_2);
				cell.setPadding(4);
				cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
			
			cell_2: {
			
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk(": \t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t  X \t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t Girls", Font9));
				cell = new PdfPCell(para_2);
				cell.setPadding(4);
				cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
			
			cell_3: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk(": \t\t\t\t  X", Font9));
				cell = new PdfPCell(para_2);
				cell.setPadding(4);
				cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
		
		return table;
	}
	
	///////////////////
	
	public static PdfPTable createTable13() throws DocumentException {
		PdfPTable table = new PdfPTable(1);

		table.setTotalWidth(550);
		table.setLockedWidth(true);
		table.setWidths(new float[]{1});
		
		PdfPCell cell;
		
		////////////// EMPLOYEE DETAILS LINE 1 ////////////////////////////////////
		//////////////////////////////////////////////////////////////////////////
			
			cell_1: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("6.\t\t* Average number of workers employed daily", Font9));
				cell = new PdfPCell(para_2);
				cell.setPadding(4);
				cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
		
		return table;
	}
	
	public static PdfPTable createTable14() throws DocumentException {
		PdfPTable table = new PdfPTable(3);

		table.setTotalWidth(550);
		table.setLockedWidth(true);
		table.setWidths(new float[]{1, 1, 1});
		
		PdfPCell cell;
		
		////////////// EMPLOYEE DETAILS LINE 1 ////////////////////////////////////
		//////////////////////////////////////////////////////////////////////////
			
			cell_1: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("    \t\t Adults-Men", Font9));
				cell = new PdfPCell(para_2);
				cell.setPadding(4);
				cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
			
			cell_2: {
			
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk(": \t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t  0 \t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t Women", Font9));
				cell = new PdfPCell(para_2);
				cell.setPadding(4);
				cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
			
			cell_3: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk(": \t\t\t\t  ", Font9));
				cell = new PdfPCell(para_2);
				cell.setPadding(4);
				cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
		
		return table;
	}
	
	public static PdfPTable createTable15() throws DocumentException {
		PdfPTable table = new PdfPTable(3);

		table.setTotalWidth(550);
		table.setLockedWidth(true);
		table.setWidths(new float[]{1, 1, 1});
		
		PdfPCell cell;
		
		////////////// EMPLOYEE DETAILS LINE 1 ////////////////////////////////////
		//////////////////////////////////////////////////////////////////////////
			
			cell_1: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("    \t\t Adolescents-Male", Font9));
				cell = new PdfPCell(para_2);
				cell.setPadding(4);
				cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
			
			cell_2: {
			
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk(": \t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t  X \t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t Female", Font9));
				cell = new PdfPCell(para_2);
				cell.setPadding(4);
				cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
			
			cell_3: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk(": \t\t\t\t  X", Font9));
				cell = new PdfPCell(para_2);
				cell.setPadding(4);
				cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
		
		return table;
	}
	
	public static PdfPTable createTable16() throws DocumentException {
		PdfPTable table = new PdfPTable(3);

		table.setTotalWidth(550);
		table.setLockedWidth(true);
		table.setWidths(new float[]{1, 1, 1});
		
		PdfPCell cell;
		
		////////////// EMPLOYEE DETAILS LINE 1 ////////////////////////////////////
		//////////////////////////////////////////////////////////////////////////
			
			cell_1: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("    \t\t Children-Boys", Font9));
				cell = new PdfPCell(para_2);
				cell.setPadding(4);
				cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
			
			cell_2: {
			
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk(": \t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t  X \t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t Girls", Font9));
				cell = new PdfPCell(para_2);
				cell.setPadding(4);
				cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
			
			cell_3: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk(": \t\t\t\t  X", Font9));
				cell = new PdfPCell(para_2);
				cell.setPadding(4);
				cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
		
		return table;
	}
	
	public static PdfPTable createTable17() throws DocumentException {
		PdfPTable table = new PdfPTable(1);

		table.setTotalWidth(550);
		table.setLockedWidth(true);
		table.setWidths(new float[]{1});
		
		PdfPCell cell;
		
		////////////// EMPLOYEE DETAILS LINE 1 ////////////////////////////////////
		//////////////////////////////////////////////////////////////////////////
			
			cell_1: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("Certified that the information furnished above is, to the best of my knowledge and belief, correct.", Font9));
				cell = new PdfPCell(para_2);
				cell.setPaddingTop(5);
				cell.setPaddingBottom(25);
				cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
		
		return table;
	}
	
	public static PdfPTable createTable18() throws DocumentException {
		PdfPTable table = new PdfPTable(1);

		table.setTotalWidth(550);
		table.setLockedWidth(true);
		table.setWidths(new float[]{1});
		
		PdfPCell cell;
		
		////////////// EMPLOYEE DETAILS LINE 1 ////////////////////////////////////
		//////////////////////////////////////////////////////////////////////////
			
			cell_1: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("Signature of Manager", Font9));
				cell = new PdfPCell(para_2);
				cell.setPaddingTop(5);
				cell.setPaddingBottom(10);
				cell.setPaddingRight(10);
				cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_RIGHT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
		
		return table;
	}
	
	public static PdfPTable createTable19() throws DocumentException {
		PdfPTable table = new PdfPTable(1);

		table.setTotalWidth(550);
		table.setLockedWidth(true);
		table.setWidths(new float[]{1});
		
		PdfPCell cell;
		
		////////////// EMPLOYEE DETAILS LINE 1 ////////////////////////////////////
		//////////////////////////////////////////////////////////////////////////
			
			cell_1: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("Date  ........................................", Font9));
				cell = new PdfPCell(para_2);
				cell.setPaddingTop(5);
				cell.setPaddingBottom(10);
				cell.setPaddingRight(10);
				cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_RIGHT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
		
		return table;
	}
	
	public static PdfPTable createTable20() throws DocumentException {
		PdfPTable table = new PdfPTable(1);

		table.setTotalWidth(550);
		table.setLockedWidth(true);
		table.setWidths(new float[]{1});
		
		PdfPCell cell;
		
		////////////// EMPLOYEE DETAILS LINE 1 ////////////////////////////////////
		//////////////////////////////////////////////////////////////////////////
			
			cell_1: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("The Return should be sent to the chief Inspector of Factories by 15th July of the current year", Font9Bold));
				cell = new PdfPCell(para_2);
				cell.setPaddingTop(5);
				cell.setPaddingBottom(10);
				cell.setPaddingLeft(25);
				cell.setBorder(Rectangle.TOP);
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
		
		return table;
	}
	
	public static PdfPTable createTable21() throws DocumentException {
		PdfPTable table = new PdfPTable(1);

		table.setTotalWidth(550);
		table.setLockedWidth(true);
		table.setWidths(new float[]{1});
		
		PdfPCell cell;
		
		////////////// EMPLOYEE DETAILS LINE 1 ////////////////////////////////////
		//////////////////////////////////////////////////////////////////////////
			
			cell_1: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("* The average daily number should be calculated by dividing the aggregate number of attendances on working days by the number of during the half-year.In reckoning attendances, attendance by temporary as well as permanent employees should be counted and a employees (including apprentices) should be counted and all employees should be included whether they are employed directly or un Attendance on separate shifts (e.g. night and day shifts) should be counted separately. Days on which the factory was closed for w and days on which the manufacturing processes were not carried on, should not be treated as working days. However, if more than 50 employed (on the previous day) attend to repair, maintenance or other such work on closed days, such days should be treated as w", Font9));
				cell = new PdfPCell(para_2);
				cell.setPaddingBottom(10);
				cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
		
		return table;
	}
	
	public static PdfPTable createTable22() throws DocumentException {
		PdfPTable table = new PdfPTable(1);

		table.setTotalWidth(550);
		table.setLockedWidth(true);
		table.setWidths(new float[]{1});
		
		PdfPCell cell;
		
		////////////// EMPLOYEE DETAILS LINE 1 ////////////////////////////////////
		//////////////////////////////////////////////////////////////////////////
			
			cell_1: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("'Partial attendance for less than half a shift of working day should be neglected and attendance for half a shift or more should be treat attendance.'", Font9));
				cell = new PdfPCell(para_2);
				cell.setPaddingBottom(10);
				cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
		
		return table;
	}
	
	
}
