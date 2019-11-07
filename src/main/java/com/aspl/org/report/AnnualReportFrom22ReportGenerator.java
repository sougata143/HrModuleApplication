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

public class AnnualReportFrom22ReportGenerator {

	///////////////// GENERATED PDF PATH ///////////////////////////////////////////////////////////////////////////////////////////
	static Date date = new java.util.Date();
	
	static long time = date.getTime();
	
	static int randNum = (int) ((int) Math.random() + time);
	
	static String fileName = "AnnualReportFrom22Report";
	
	//public static final String RESULT = "D:/ABHIRUP/emcee_workspace/erpa-v2/src/main/webapp/WEB-INF/pdf/" + fileName + "_" + randNum + ".pdf";
	
	public static final String RESULT = "D:/ABHIRUP/emcee_workspace/erpa-v2/src/main/webapp/WEB-INF/crawley-report/" + fileName + ".pdf";

	///////////////// HEADER CONSTANT /////////////////////////////////////////////////////////////////////////////////////////////
	
	static String head1 	= "FORM 22";
	static String head2    = "[See Clause (1) of rule 103]";
	static String head3    = "ANNUAL RETURN UNDER THE WEST BENGAL FACTORIES RULES";
	static String head4    = "\t\t\t\t\t\t\t\t Number of workers and particulars of employment";

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
	
	public static PdfPTable createTable1(String classificationCode) throws DocumentException {
		PdfPTable table = new PdfPTable(2);

		table.setTotalWidth(550);
		table.setLockedWidth(true);
		table.setWidths(new float[]{1, 1});
		
		PdfPCell cell;
		
		////////////// EMPLOYEE DETAILS LINE 1 ////////////////////////////////////
		//////////////////////////////////////////////////////////////////////////
			
			cell_1: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("Year ending 31st December, " + LocalDate.now().getYear(), Font9));
				cell = new PdfPCell(para_2);
				cell.setPadding(5);
				cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
			
			cell_2: {
			
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("Classification Code No. \t\t\t\t : \t\t\t\t "+ classificationCode, Font9));
				cell = new PdfPCell(para_2);
				cell.setPadding(5);
				cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
		
		return table;
	}
	
	public static PdfPTable createTable2() throws DocumentException {
		PdfPTable table = new PdfPTable(2);

		table.setTotalWidth(550);
		table.setLockedWidth(true);
		table.setWidths(new float[]{1, 1});
		
		PdfPCell cell;
		
		////////////// EMPLOYEE DETAILS LINE 1 ////////////////////////////////////
		//////////////////////////////////////////////////////////////////////////
			
			cell_1: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("1. \t\t Resignation Number of Factory", Font9));
				cell = new PdfPCell(para_2);
				cell.setPadding(4);
				cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
			
			cell_2: {
			
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk(": \t\t\t\t 24-HW/X/86", Font9));
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
		table.setWidths(new float[]{1, 1});
		
		PdfPCell cell;
		
		////////////// EMPLOYEE DETAILS LINE 1 ////////////////////////////////////
		//////////////////////////////////////////////////////////////////////////
			
			cell_1: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("2. \t\t Name of Factory", Font9));
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
	
	public static PdfPTable createTable4() throws DocumentException {
		PdfPTable table = new PdfPTable(2);

		table.setTotalWidth(550);
		table.setLockedWidth(true);
		table.setWidths(new float[]{1, 1});
		
		PdfPCell cell;
		
		////////////// EMPLOYEE DETAILS LINE 1 ////////////////////////////////////
		//////////////////////////////////////////////////////////////////////////
			
			cell_1: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("3. \t\t Name of Occupier", Font9));
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
	
	public static PdfPTable createTable5() throws DocumentException {
		PdfPTable table = new PdfPTable(2);

		table.setTotalWidth(550);
		table.setLockedWidth(true);
		table.setWidths(new float[]{1, 1});
		
		PdfPCell cell;
		
		////////////// EMPLOYEE DETAILS LINE 1 ////////////////////////////////////
		//////////////////////////////////////////////////////////////////////////
			
			cell_1: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("4. \t\t Name of Manager", Font9));
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
	
	public static PdfPTable createTable6() throws DocumentException {
		PdfPTable table = new PdfPTable(2);

		table.setTotalWidth(550);
		table.setLockedWidth(true);
		table.setWidths(new float[]{1, 1});
		
		PdfPCell cell;
		
		////////////// EMPLOYEE DETAILS LINE 1 ////////////////////////////////////
		//////////////////////////////////////////////////////////////////////////
			
			cell_1: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("5. \t\t District", Font9));
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
	
	public static PdfPTable createTable7() throws DocumentException {
		PdfPTable table = new PdfPTable(2);

		table.setTotalWidth(550);
		table.setLockedWidth(true);
		table.setWidths(new float[]{1, 1});
		
		PdfPCell cell;
		
		////////////// EMPLOYEE DETAILS LINE 1 ////////////////////////////////////
		//////////////////////////////////////////////////////////////////////////
			
			cell_1: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("6. \t\t Full Postal Address of Factory", Font9));
				cell = new PdfPCell(para_2);
				cell.setPadding(4);
				cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
			
			cell_2: {
			
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk(": \t\t\t\t 32, Foreshore Road, P.O. Botanic Garden, Howrah-711103", Font9));
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
		table.setWidths(new float[]{1, 1});
		
		PdfPCell cell;
		
		////////////// EMPLOYEE DETAILS LINE 1 ////////////////////////////////////
		//////////////////////////////////////////////////////////////////////////
			
			cell_1: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("7. \t\t Nature of Industry", Font9));
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
	
	
	
	public static PdfPTable createHeader4() throws DocumentException {
		PdfPTable table = new PdfPTable(1);

		table.setTotalWidth(550);
		table.setLockedWidth(true);
		table.setWidths(new float[]{1});
		
		PdfPCell cell_1;
		
		Paragraph para_1 = new Paragraph();
		para_1.add(new Chunk(head4, Font9Bold));
		para_1.add(Chunk.NEWLINE);
		para_1.setSpacingBefore(10);
		para_1.setSpacingAfter(10);
		
		cell_1 = new PdfPCell(para_1);
		cell_1.setPadding(10);
		cell_1.setBorder(Rectangle.NO_BORDER);
		cell_1.setHorizontalAlignment(Element.ALIGN_LEFT);
		cell_1.setVerticalAlignment(Element.ALIGN_CENTER);
		table.addCell(cell_1);
		
		return table;
	}
	
	public static PdfPTable createTable9() throws DocumentException {
		PdfPTable table = new PdfPTable(2);

		table.setTotalWidth(550);
		table.setLockedWidth(true);
		table.setWidths(new float[]{1, 1});
		
		PdfPCell cell;
		
		////////////// EMPLOYEE DETAILS LINE 1 ////////////////////////////////////
		//////////////////////////////////////////////////////////////////////////
			
			cell_1: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("8. \t\t Number of days worked in the year", Font9));
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
				para_2.add(new Chunk("9. \t\t Number of mandays worked during the year", Font9));
				cell = new PdfPCell(para_2);
				cell.setPadding(4);
				cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
			
			cell_2: {
			
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
				para_2.add(new Chunk(": \t\t\t\t  271", Font9));
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
	
	public static PdfPTable createTable13() throws DocumentException {
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
	
	public static PdfPTable createTable14() throws DocumentException {
		PdfPTable table = new PdfPTable(1);

		table.setTotalWidth(550);
		table.setLockedWidth(true);
		table.setWidths(new float[]{1});
		
		PdfPCell cell;
		
		////////////// EMPLOYEE DETAILS LINE 1 ////////////////////////////////////
		//////////////////////////////////////////////////////////////////////////
			
			cell_1: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("10.\t\t* Average number of workers employed daily (See explanatory note) :", Font9));
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
				para_2.add(new Chunk(": \t\t\t\t  1", Font9));
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
	
	public static PdfPTable createTable17() throws DocumentException {
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
	
	public static PdfPTable createTable18() throws DocumentException {
		PdfPTable table = new PdfPTable(2);

		table.setTotalWidth(550);
		table.setLockedWidth(true);
		table.setWidths(new float[]{1, 1});
		
		PdfPCell cell;
		
		////////////// EMPLOYEE DETAILS LINE 1 ////////////////////////////////////
		//////////////////////////////////////////////////////////////////////////
			
			cell_1: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("11.\t\tTotal number of manhours worked including overtime", Font9));
				cell = new PdfPCell(para_2);
				cell.setPadding(4);
				cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
			
			cell_2: {
			
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
	
	public static PdfPTable createTable19(String mandaysworkedformen) throws DocumentException {
		PdfPTable table = new PdfPTable(4);

		table.setTotalWidth(550);
		table.setLockedWidth(true);
		table.setWidths(new float[]{1, 1, 1, 1});
		
		PdfPCell cell;
		
		////////////// EMPLOYEE DETAILS LINE 1 ////////////////////////////////////
		//////////////////////////////////////////////////////////////////////////
			
			cell_1: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("    \t\t Men", Font9));
				cell = new PdfPCell(para_2);
				cell.setPadding(4);
				cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
			
			cell_2: {
			
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk(": \t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t  "+mandaysworkedformen+" \t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t Women", Font9));
				cell = new PdfPCell(para_2);
				cell.setPadding(4);
				cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
			
			cell_3: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk(": \t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t  2392 \t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t Children", Font9));
				cell = new PdfPCell(para_2);
				cell.setPadding(4);
				cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
			
			cell_4: {
				
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
				para_2.add(new Chunk("12.\t\tAverage number of hours worked per week (See explanatory note) :", Font9));
				cell = new PdfPCell(para_2);
				cell.setPadding(4);
				cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
		
		return table;
	}
	
	public static PdfPTable createTable21() throws DocumentException {
		PdfPTable table = new PdfPTable(4);

		table.setTotalWidth(550);
		table.setLockedWidth(true);
		table.setWidths(new float[]{1, 1, 1, 1});
		
		PdfPCell cell;
		
		////////////// EMPLOYEE DETAILS LINE 1 ////////////////////////////////////
		//////////////////////////////////////////////////////////////////////////
			
			cell_1: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("    \t\t Men", Font9));
				cell = new PdfPCell(para_2);
				cell.setPadding(4);
				cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
			
			cell_2: {
			
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk(": \t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t  8 \t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t Women", Font9));
				cell = new PdfPCell(para_2);
				cell.setPadding(4);
				cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
			
			cell_3: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk(": \t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t  2168 \t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t Children", Font9));
				cell = new PdfPCell(para_2);
				cell.setPadding(4);
				cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
			
			cell_4: {
				
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
				para_2.add(new Chunk("13.\t\t(a) Does the factory carry on any process or operation declared as dangerous under Section 87? \t\t\t\t (See Rule 94)", Font9));
				
				cell = new PdfPCell(para_2);
				cell.setPadding(4);
				cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
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
				
				para_2.add(new Chunk("    \t\t (c) If so, give the following information :", Font9));
				cell = new PdfPCell(para_2);
				cell.setPadding(4);
				cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
		
		return table;
	}
	
	public static PdfPTable createBlankLine() throws DocumentException {
		PdfPTable table = new PdfPTable(1);

		table.setTotalWidth(550);
		table.setLockedWidth(true);
		table.setWidths(new float[]{1});
		
		PdfPCell cell_1;
		
		Paragraph para_1 = new Paragraph();
		para_1.add(new Chunk("", Font10Bold));
		para_1.add(Chunk.NEWLINE);
		para_1.setSpacingBefore(50);
		para_1.setSpacingAfter(50);
		
		cell_1 = new PdfPCell(para_1);
		cell_1.setPadding(2);
		cell_1.setBorder(Rectangle.NO_BORDER);
		cell_1.setHorizontalAlignment(Element.ALIGN_CENTER);
		cell_1.setVerticalAlignment(Element.ALIGN_CENTER);
		table.addCell(cell_1);
		
		return table;
	}
	
	public static PdfPTable createTable24() throws DocumentException {
		PdfPTable table = new PdfPTable(2);

		table.setTotalWidth(550);
		table.setLockedWidth(true);
		table.setWidths(new float[]{1, 1});
		
		PdfPCell cell;
		
		////////////// EMPLOYEE DETAILS LINE 1 ////////////////////////////////////
		//////////////////////////////////////////////////////////////////////////
			
			cell_1: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("Name of the dangerous processes or Operations carried on", Font9));
				cell = new PdfPCell(para_2);
				cell.setPadding(4);
				//cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_CENTER);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
			
			cell_2: {
			
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("Average number of persons employed daily in each of the processis or operations given in column 1", Font9));
				cell = new PdfPCell(para_2);
				cell.setPadding(4);
				//cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_CENTER);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
		
		return table;
	}
	
	public static PdfPTable createTable25() throws DocumentException {
		PdfPTable table = new PdfPTable(2);

		table.setTotalWidth(550);
		table.setLockedWidth(true);
		table.setWidths(new float[]{1, 1});
		
		PdfPCell cell;
		
		////////////// EMPLOYEE DETAILS LINE 1 ////////////////////////////////////
		//////////////////////////////////////////////////////////////////////////
			
			cell_1: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("1", Font9));
				cell = new PdfPCell(para_2);
				cell.setPadding(4);
				//cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_CENTER);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
			
			cell_2: {
			
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("2", Font9));
				cell = new PdfPCell(para_2);
				cell.setPadding(4);
				//cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_CENTER);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
		
		return table;
	}
	
	public static PdfPTable createTable26() throws DocumentException {
		PdfPTable table = new PdfPTable(2);

		table.setTotalWidth(550);
		table.setLockedWidth(true);
		table.setWidths(new float[]{1, 1});
		
		PdfPCell cell;
		
		////////////// EMPLOYEE DETAILS LINE 1 ////////////////////////////////////
		//////////////////////////////////////////////////////////////////////////
			
			cell_1: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("(i)", Font9));
				cell = new PdfPCell(para_2);
				cell.setPadding(4);
				//cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
			
			cell_2: {
			
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("", Font9));
				cell = new PdfPCell(para_2);
				cell.setPadding(4);
				//cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
		
		return table;
	}
	
	public static PdfPTable createTable27() throws DocumentException {
		PdfPTable table = new PdfPTable(2);

		table.setTotalWidth(550);
		table.setLockedWidth(true);
		table.setWidths(new float[]{1, 1});
		
		PdfPCell cell;
		
		////////////// EMPLOYEE DETAILS LINE 1 ////////////////////////////////////
		//////////////////////////////////////////////////////////////////////////
			
			cell_1: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("(ii)", Font9));
				cell = new PdfPCell(para_2);
				cell.setPadding(4);
				//cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
			
			cell_2: {
			
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("", Font9));
				cell = new PdfPCell(para_2);
				cell.setPadding(4);
				//cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
		
		return table;
	}
	
	public static PdfPTable createTable28() throws DocumentException {
		PdfPTable table = new PdfPTable(2);

		table.setTotalWidth(550);
		table.setLockedWidth(true);
		table.setWidths(new float[]{1, 1});
		
		PdfPCell cell;
		
		////////////// EMPLOYEE DETAILS LINE 1 ////////////////////////////////////
		//////////////////////////////////////////////////////////////////////////
			
			cell_1: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("(iii)", Font9));
				cell = new PdfPCell(para_2);
				cell.setPadding(4);
				//cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
			
			cell_2: {
			
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("", Font9));
				cell = new PdfPCell(para_2);
				cell.setPadding(4);
				//cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
		
		return table;
	}
	
	public static PdfPTable createTable29() throws DocumentException {
		PdfPTable table = new PdfPTable(2);

		table.setTotalWidth(550);
		table.setLockedWidth(true);
		table.setWidths(new float[]{1, 1});
		
		PdfPCell cell;
		
		////////////// EMPLOYEE DETAILS LINE 1 ////////////////////////////////////
		//////////////////////////////////////////////////////////////////////////
			
			cell_1: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("14.\t\tTotal number of workers employed during the year :", Font9));
				cell = new PdfPCell(para_2);
				cell.setPadding(4);
				cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
			
			cell_2: {
			
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk(" \t\t\t\t  ", Font9));
				cell = new PdfPCell(para_2);
				cell.setPadding(4);
				cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
		
		return table;
	}
	
	public static PdfPTable createTable30() throws DocumentException {
		PdfPTable table = new PdfPTable(4);

		table.setTotalWidth(550);
		table.setLockedWidth(true);
		table.setWidths(new float[]{1, 1, 1, 1});
		
		PdfPCell cell;
		
		////////////// EMPLOYEE DETAILS LINE 1 ////////////////////////////////////
		//////////////////////////////////////////////////////////////////////////
			
			cell_1: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("    \t\t Men", Font9));
				cell = new PdfPCell(para_2);
				cell.setPadding(4);
				cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
			
			cell_2: {
			
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk(": \t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t  82 \t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t Women", Font9));
				cell = new PdfPCell(para_2);
				cell.setPadding(4);
				cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
			
			cell_3: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk(": \t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t  1 \t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t Children", Font9));
				cell = new PdfPCell(para_2);
				cell.setPadding(4);
				cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
			
			cell_4: {
				
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
	
	public static PdfPTable createTable31() throws DocumentException {
		PdfPTable table = new PdfPTable(1);

		table.setTotalWidth(550);
		table.setLockedWidth(true);
		table.setWidths(new float[]{1});
		
		PdfPCell cell;
		
		////////////// EMPLOYEE DETAILS LINE 1 ////////////////////////////////////
		//////////////////////////////////////////////////////////////////////////
			
			cell_1: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("15.\t\tNumber of workers who were entitled to annual leave with wages during the year :", Font9));
				cell = new PdfPCell(para_2);
				cell.setPadding(4);
				cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
			
			
		
		return table;
	}
	
	public static PdfPTable createTable32() throws DocumentException {
		PdfPTable table = new PdfPTable(4);

		table.setTotalWidth(550);
		table.setLockedWidth(true);
		table.setWidths(new float[]{1, 1, 1, 1});
		
		PdfPCell cell;
		
		////////////// EMPLOYEE DETAILS LINE 1 ////////////////////////////////////
		//////////////////////////////////////////////////////////////////////////
			
			cell_1: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("    \t\t Men", Font9));
				cell = new PdfPCell(para_2);
				cell.setPadding(4);
				cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
			
			cell_2: {
			
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk(": \t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t  82 \t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t Women", Font9));
				cell = new PdfPCell(para_2);
				cell.setPadding(4);
				cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
			
			cell_3: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk(": \t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t  1 \t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t Children", Font9));
				cell = new PdfPCell(para_2);
				cell.setPadding(4);
				cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
			
			cell_4: {
				
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
	
	public static PdfPTable createTable33() throws DocumentException {
		PdfPTable table = new PdfPTable(1);

		table.setTotalWidth(550);
		table.setLockedWidth(true);
		table.setWidths(new float[]{1});
		
		PdfPCell cell;
		
		////////////// EMPLOYEE DETAILS LINE 1 ////////////////////////////////////
		//////////////////////////////////////////////////////////////////////////
			
			cell_1: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("16.\t\tThe number of workers who were granted leave during the year :", Font9));
				cell = new PdfPCell(para_2);
				cell.setPadding(4);
				cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
		
		return table;
	}
	
	public static PdfPTable createTable34() throws DocumentException {
		PdfPTable table = new PdfPTable(4);

		table.setTotalWidth(550);
		table.setLockedWidth(true);
		table.setWidths(new float[]{1, 1, 1, 1});
		
		PdfPCell cell;
		
		////////////// EMPLOYEE DETAILS LINE 1 ////////////////////////////////////
		//////////////////////////////////////////////////////////////////////////
			
			cell_1: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("    \t\t Men", Font9));
				cell = new PdfPCell(para_2);
				cell.setPadding(4);
				cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
			
			cell_2: {
			
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk(": \t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t  82 \t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t Women", Font9));
				cell = new PdfPCell(para_2);
				cell.setPadding(4);
				cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
			
			cell_3: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk(": \t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t  1 \t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t Children", Font9));
				cell = new PdfPCell(para_2);
				cell.setPadding(4);
				cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
			
			cell_4: {
				
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
	
	public static PdfPTable createTable35(String dischargedismisquit) throws DocumentException {
		PdfPTable table = new PdfPTable(1);

		table.setTotalWidth(550);
		table.setLockedWidth(true);
		table.setWidths(new float[]{1});
		
		PdfPCell cell;
		
		////////////// EMPLOYEE DETAILS LINE 1 ////////////////////////////////////
		//////////////////////////////////////////////////////////////////////////
			
			cell_1: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("17.\t\t(a) Number of workers who were discharged, or dismissed from the service, or quit employment, or were superannuated, or who \n\t\t\t\t\t\t\t\t\t\t\t died while in service during the year : "+dischargedismisquit, Font9));
				
				cell = new PdfPCell(para_2);
				cell.setPadding(4);
				cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
		
		return table;
	}
	
	
	
	public static PdfPTable createTable36(String noofworkerinlieuofleave) throws DocumentException {
		PdfPTable table = new PdfPTable(1);

		table.setTotalWidth(550);
		table.setLockedWidth(true);
		table.setWidths(new float[]{1});
		
		PdfPCell cell;
		
		////////////// EMPLOYEE DETAILS LINE 1 ////////////////////////////////////
		//////////////////////////////////////////////////////////////////////////
			
			cell_1: {
				
				Paragraph para_2 = new Paragraph();
				
				para_2.add(new Chunk("    \t\t  (c) Number of such workers in respect of whom wages in lieu of leave were paid : "+noofworkerinlieuofleave, Font9));
				cell = new PdfPCell(para_2);
				cell.setPaddingTop(4);
				cell.setPaddingBottom(80);
				cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
		
		return table;
	}
	
	public static PdfPTable createHeader5() throws DocumentException {
		PdfPTable table = new PdfPTable(1);

		table.setTotalWidth(550);
		table.setLockedWidth(true);
		table.setWidths(new float[]{1});
		
		PdfPCell cell_1;
		
		Paragraph para_1 = new Paragraph();
		para_1.add(new Chunk("(2)", Font9));
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
	
	public static PdfPTable createHeader6() throws DocumentException {
		PdfPTable table = new PdfPTable(1);

		table.setTotalWidth(550);
		table.setLockedWidth(true);
		table.setWidths(new float[]{1});
		
		PdfPCell cell_1;
		
		Paragraph para_1 = new Paragraph();
		para_1.add(new Chunk("Safety Officers", Font10Bold));
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
	
	public static PdfPTable createTable37() throws DocumentException {
		PdfPTable table = new PdfPTable(1);

		table.setTotalWidth(550);
		table.setLockedWidth(true);
		table.setWidths(new float[]{1});
		
		PdfPCell cell;
		
		////////////// EMPLOYEE DETAILS LINE 1 ////////////////////////////////////
		//////////////////////////////////////////////////////////////////////////
			
			cell_1: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("18.\t\t(a) Number or safety Officers required to be appointed as per Notificationunder Section 40B", Font9));
				
				cell = new PdfPCell(para_2);
				cell.setPadding(4);
				cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
		
		return table;
	}
	
	
	
	public static PdfPTable createTable38() throws DocumentException {
		PdfPTable table = new PdfPTable(1);

		table.setTotalWidth(550);
		table.setLockedWidth(true);
		table.setWidths(new float[]{1});
		
		PdfPCell cell;
		
		////////////// EMPLOYEE DETAILS LINE 1 ////////////////////////////////////
		//////////////////////////////////////////////////////////////////////////
			
			cell_1: {
				
				Paragraph para_2 = new Paragraph();
				
				para_2.add(new Chunk("    \t\t (b) Details Of Safety Officers appointed :", Font9));
				cell = new PdfPCell(para_2);
				cell.setPadding(4);
				cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
		
		return table;
	}
	
	public static PdfPTable createBlankLine_1() throws DocumentException {
		PdfPTable table = new PdfPTable(1);

		table.setTotalWidth(550);
		table.setLockedWidth(true);
		table.setWidths(new float[]{1});
		
		PdfPCell cell_1;
		
		Paragraph para_1 = new Paragraph();
		para_1.add(new Chunk("", Font10Bold));
		para_1.add(Chunk.NEWLINE);
		para_1.setSpacingBefore(50);
		para_1.setSpacingAfter(50);
		
		cell_1 = new PdfPCell(para_1);
		cell_1.setPadding(2);
		cell_1.setBorder(Rectangle.NO_BORDER);
		cell_1.setHorizontalAlignment(Element.ALIGN_CENTER);
		cell_1.setVerticalAlignment(Element.ALIGN_CENTER);
		table.addCell(cell_1);
		
		return table;
	}
	
	public static PdfPTable createTable39() throws DocumentException {
		PdfPTable table = new PdfPTable(6);

		table.setTotalWidth(550);
		table.setLockedWidth(true);
		table.setWidths(new float[]{1, 1, 1, 1, 1, 1});
		
		PdfPCell cell;
		
		////////////// EMPLOYEE DETAILS LINE 1 ////////////////////////////////////
		//////////////////////////////////////////////////////////////////////////
			
			cell_1: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("Name of Safety Officer", Font9));
				cell = new PdfPCell(para_2);
				cell.setPadding(4);
				//cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_CENTER);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
			
			cell_2: {
			
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("Date of Appointment", Font9));
				cell = new PdfPCell(para_2);
				cell.setPadding(4);
				//cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_CENTER);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
			
			cell_3: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("Qualification", Font9));
				cell = new PdfPCell(para_2);
				cell.setPadding(4);
				//cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_CENTER);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
			
			cell_4: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("Name of the Institution from which he obtained a degree or diploma or a certificate in Industrial Safety", Font9));
				cell = new PdfPCell(para_2);
				cell.setPadding(4);
				//cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_CENTER);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
			
			cell_5: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("**Name Of the Institution from Which through Knowledge in Bengali was acquired and the examination passed", Font9));
				cell = new PdfPCell(para_2);
				cell.setPadding(4);
				//cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_CENTER);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
			
			cell_6: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("Date of passing the Viva Voce Test under Clause(d) of Rule 4 of the West Bengal Factories (Safely Officers) Rules", Font9));
				cell = new PdfPCell(para_2);
				cell.setPadding(4);
				//cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_CENTER);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
		
		return table;
	}
	
	public static PdfPTable createTable40() throws DocumentException {
		PdfPTable table = new PdfPTable(6);

		table.setTotalWidth(550);
		table.setLockedWidth(true);
		table.setWidths(new float[]{1, 1, 1, 1, 1, 1});
		
		PdfPCell cell;
		
		////////////// EMPLOYEE DETAILS LINE 1 ////////////////////////////////////
		//////////////////////////////////////////////////////////////////////////
			
			cell_1: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("1", Font9));
				cell = new PdfPCell(para_2);
				cell.setPadding(4);
				//cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_CENTER);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
			
			cell_2: {
			
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("2", Font9));
				cell = new PdfPCell(para_2);
				cell.setPadding(4);
				//cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_CENTER);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
			
			cell_3: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("3", Font9));
				cell = new PdfPCell(para_2);
				cell.setPadding(4);
				//cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_CENTER);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
			
			cell_4: {
			
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("4", Font9));
				cell = new PdfPCell(para_2);
				cell.setPadding(4);
				//cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_CENTER);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
			
			cell_5: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("5", Font9));
				cell = new PdfPCell(para_2);
				cell.setPadding(4);
				//cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_CENTER);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
			
			cell_6: {
			
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("6", Font9));
				cell = new PdfPCell(para_2);
				cell.setPadding(4);
				//cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_CENTER);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
		
		return table;
	}
	
	public static PdfPTable createTable41() throws DocumentException {
		PdfPTable table = new PdfPTable(6);

		table.setTotalWidth(550);
		table.setLockedWidth(true);
		table.setWidths(new float[]{1, 1, 1, 1, 1, 1});
		
		PdfPCell cell;
		
		////////////// EMPLOYEE DETAILS LINE 1 ////////////////////////////////////
		//////////////////////////////////////////////////////////////////////////
			
			cell_1: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("(i)", Font9));
				cell = new PdfPCell(para_2);
				cell.setPadding(4);
				//cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
			
			cell_2: {
			
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("", Font9));
				cell = new PdfPCell(para_2);
				cell.setPadding(4);
				//cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
			
			cell_3: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("", Font9));
				cell = new PdfPCell(para_2);
				cell.setPadding(4);
				//cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
			
			cell_4: {
			
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("", Font9));
				cell = new PdfPCell(para_2);
				cell.setPadding(4);
				//cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
			
			cell_5: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("", Font9));
				cell = new PdfPCell(para_2);
				cell.setPadding(4);
				//cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
			
			cell_6: {
			
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("", Font9));
				cell = new PdfPCell(para_2);
				cell.setPadding(4);
				//cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
		
		return table;
	}
	
	public static PdfPTable createTable42() throws DocumentException {
		PdfPTable table = new PdfPTable(6);

		table.setTotalWidth(550);
		table.setLockedWidth(true);
		table.setWidths(new float[]{1, 1, 1, 1, 1, 1});
		
		PdfPCell cell;
		
		////////////// EMPLOYEE DETAILS LINE 1 ////////////////////////////////////
		//////////////////////////////////////////////////////////////////////////
			
			cell_1: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("(ii)", Font9));
				cell = new PdfPCell(para_2);
				cell.setPadding(4);
				//cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
			
			cell_2: {
			
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("", Font9));
				cell = new PdfPCell(para_2);
				cell.setPadding(4);
				//cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
			
			cell_3: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("", Font9));
				cell = new PdfPCell(para_2);
				cell.setPadding(4);
				//cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
			
			cell_4: {
			
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("", Font9));
				cell = new PdfPCell(para_2);
				cell.setPadding(4);
				//cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
			
			cell_5: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("", Font9));
				cell = new PdfPCell(para_2);
				cell.setPadding(4);
				//cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
			
			cell_6: {
			
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("", Font9));
				cell = new PdfPCell(para_2);
				cell.setPadding(4);
				//cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
		
		return table;
	}
	
	public static PdfPTable createTable43() throws DocumentException {
		PdfPTable table = new PdfPTable(6);

		table.setTotalWidth(550);
		table.setLockedWidth(true);
		table.setWidths(new float[]{1, 1, 1, 1, 1, 1});
		
		PdfPCell cell;
		
		////////////// EMPLOYEE DETAILS LINE 1 ////////////////////////////////////
		//////////////////////////////////////////////////////////////////////////
			
			cell_1: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("(iii)", Font9));
				cell = new PdfPCell(para_2);
				cell.setPadding(4);
				//cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
			
			cell_2: {
			
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("", Font9));
				cell = new PdfPCell(para_2);
				cell.setPadding(4);
				//cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
			
			cell_3: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("", Font9));
				cell = new PdfPCell(para_2);
				cell.setPadding(4);
				//cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
			
			cell_4: {
			
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("", Font9));
				cell = new PdfPCell(para_2);
				cell.setPadding(4);
				//cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
			
			cell_5: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("", Font9));
				cell = new PdfPCell(para_2);
				cell.setPadding(4);
				//cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
			
			cell_6: {
			
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("", Font9));
				cell = new PdfPCell(para_2);
				cell.setPadding(4);
				//cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
		
		return table;
	}
	
	public static PdfPTable createHeader7() throws DocumentException {
		PdfPTable table = new PdfPTable(1);

		table.setTotalWidth(550);
		table.setLockedWidth(true);
		table.setWidths(new float[]{1});
		
		PdfPCell cell_1;
		
		Paragraph para_1 = new Paragraph();
		para_1.add(new Chunk("Ambulance Room", Font10));
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
	
	public static PdfPTable createTable44() throws DocumentException {
		PdfPTable table = new PdfPTable(1);

		table.setTotalWidth(550);
		table.setLockedWidth(true);
		table.setWidths(new float[]{1});
		
		PdfPCell cell;
		
		////////////// EMPLOYEE DETAILS LINE 1 ////////////////////////////////////
		//////////////////////////////////////////////////////////////////////////
			
			cell_1: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("19.   Is there as Ambulance Room provided in the factory as required under Section 45?", Font9));
				
				cell = new PdfPCell(para_2);
				cell.setPadding(4);
				cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
		
		return table;
	}
	
	public static PdfPTable createTable45() throws DocumentException {
		PdfPTable table = new PdfPTable(1);

		table.setTotalWidth(550);
		table.setLockedWidth(true);
		table.setWidths(new float[]{1});
		
		PdfPCell cell;
		
		////////////// EMPLOYEE DETAILS LINE 1 ////////////////////////////////////
		//////////////////////////////////////////////////////////////////////////
			
			cell_1: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("20.\t\t(a) No. of Canteens provided in the factory as required under Section 46", Font9));
				
				cell = new PdfPCell(para_2);
				cell.setPadding(4);
				cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
		
		return table;
	}
	
	
	
	public static PdfPTable createTable46() throws DocumentException {
		PdfPTable table = new PdfPTable(1);

		table.setTotalWidth(550);
		table.setLockedWidth(true);
		table.setWidths(new float[]{1});
		
		PdfPCell cell;
		
		////////////// EMPLOYEE DETAILS LINE 1 ////////////////////////////////////
		//////////////////////////////////////////////////////////////////////////
			
			cell_1: {
				
				Paragraph para_2 = new Paragraph();
				
				para_2.add(new Chunk("    \t\t (b) Is the Canteen provided managed/run :", Font9));
				cell = new PdfPCell(para_2);
				cell.setPadding(4);
				cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
		
		return table;
	}
	
	public static PdfPTable createTable47() throws DocumentException {
		PdfPTable table = new PdfPTable(1);

		table.setTotalWidth(550);
		table.setLockedWidth(true);
		table.setWidths(new float[]{1});
		
		PdfPCell cell;
		
		////////////// EMPLOYEE DETAILS LINE 1 ////////////////////////////////////
		//////////////////////////////////////////////////////////////////////////
			
			cell_1: {
				
				Paragraph para_2 = new Paragraph();
				
				para_2.add(new Chunk("    \t\t\t\t\t\t\t\t (iii) departmentally,or", Font9));
				cell = new PdfPCell(para_2);
				cell.setPadding(4);
				cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
		
		return table;
	}
	
	public static PdfPTable createTable48() throws DocumentException {
		PdfPTable table = new PdfPTable(1);

		table.setTotalWidth(550);
		table.setLockedWidth(true);
		table.setWidths(new float[]{1});
		
		PdfPCell cell;
		
		////////////// EMPLOYEE DETAILS LINE 1 ////////////////////////////////////
		//////////////////////////////////////////////////////////////////////////
			
			cell_1: {
				
				Paragraph para_2 = new Paragraph();
				
				para_2.add(new Chunk("    \t\t\t\t\t\t\t\t (iv) through contractor? :\t\t\t\t\t\t\t\t Contractor", Font9));
				cell = new PdfPCell(para_2);
				cell.setPadding(4);
				cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
		
		return table;
	}
	
	public static PdfPTable createHeader8() throws DocumentException {
		PdfPTable table = new PdfPTable(1);

		table.setTotalWidth(550);
		table.setLockedWidth(true);
		table.setWidths(new float[]{1});
		
		PdfPCell cell_1;
		
		Paragraph para_1 = new Paragraph();
		para_1.add(new Chunk("Shelters or Rest Roams and Lunch Rooms", Font10));
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
	
	public static PdfPTable createTable49() throws DocumentException {
		PdfPTable table = new PdfPTable(1);

		table.setTotalWidth(550);
		table.setLockedWidth(true);
		table.setWidths(new float[]{1});
		
		PdfPCell cell;
		
		////////////// EMPLOYEE DETAILS LINE 1 ////////////////////////////////////
		//////////////////////////////////////////////////////////////////////////
			
			cell_1: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("21.\t\t(a) No. of Shelters or Rest Rooms provided in the factory as required under Section 47", Font9));
				
				cell = new PdfPCell(para_2);
				cell.setPadding(4);
				cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
		
		return table;
	}
	
	
	
	public static PdfPTable createTable50() throws DocumentException {
		PdfPTable table = new PdfPTable(1);

		table.setTotalWidth(550);
		table.setLockedWidth(true);
		table.setWidths(new float[]{1});
		
		PdfPCell cell;
		
		////////////// EMPLOYEE DETAILS LINE 1 ////////////////////////////////////
		//////////////////////////////////////////////////////////////////////////
			
			cell_1: {
				
				Paragraph para_2 = new Paragraph();
				
				para_2.add(new Chunk("    \t\t (b) No. Of Lunch Rooms Provided in the factory as required under Section 47", Font9));
				cell = new PdfPCell(para_2);
				cell.setPadding(4);
				cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
		
		return table;
	}
	
	public static PdfPTable createHeader9() throws DocumentException {
		PdfPTable table = new PdfPTable(1);

		table.setTotalWidth(550);
		table.setLockedWidth(true);
		table.setWidths(new float[]{1});
		
		PdfPCell cell_1;
		
		Paragraph para_1 = new Paragraph();
		para_1.add(new Chunk("Creches", Font10));
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
	
	public static PdfPTable createTable51() throws DocumentException {
		PdfPTable table = new PdfPTable(1);

		table.setTotalWidth(550);
		table.setLockedWidth(true);
		table.setWidths(new float[]{1});
		
		PdfPCell cell;
		
		////////////// EMPLOYEE DETAILS LINE 1 ////////////////////////////////////
		//////////////////////////////////////////////////////////////////////////
			
			cell_1: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("22.\t\t(a) No. of Creches provided in the factory as required under Section 48", Font9));
				
				cell = new PdfPCell(para_2);
				cell.setPadding(4);
				cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
		
		return table;
	}
	
	
	
	public static PdfPTable createTable52() throws DocumentException {
		PdfPTable table = new PdfPTable(1);

		table.setTotalWidth(550);
		table.setLockedWidth(true);
		table.setWidths(new float[]{1});
		
		PdfPCell cell;
		
		////////////// EMPLOYEE DETAILS LINE 1 ////////////////////////////////////
		//////////////////////////////////////////////////////////////////////////
			
			cell_1: {
				
				Paragraph para_2 = new Paragraph();
				
				para_2.add(new Chunk("    \t\t (b) No. of children utilizing the creche", Font9));
				cell = new PdfPCell(para_2);
				cell.setPadding(4);
				cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
		
		return table;
	}
	
	public static PdfPTable createHeader10() throws DocumentException {
		PdfPTable table = new PdfPTable(1);

		table.setTotalWidth(550);
		table.setLockedWidth(true);
		table.setWidths(new float[]{1});
		
		PdfPCell cell_1;
		
		Paragraph para_1 = new Paragraph();
		para_1.add(new Chunk("Welfare Officers", Font10));
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
	
	public static PdfPTable createTable53() throws DocumentException {
		PdfPTable table = new PdfPTable(1);

		table.setTotalWidth(550);
		table.setLockedWidth(true);
		table.setWidths(new float[]{1});
		
		PdfPCell cell;
		
		////////////// EMPLOYEE DETAILS LINE 1 ////////////////////////////////////
		//////////////////////////////////////////////////////////////////////////
			
			cell_1: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("23.\t\t(a) Number of Welfare Officers to be appointed as required under Section 49", Font9));
				
				cell = new PdfPCell(para_2);
				cell.setPadding(4);
				cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
		
		return table;
	}
	
	
	
	public static PdfPTable createTable54() throws DocumentException {
		PdfPTable table = new PdfPTable(1);

		table.setTotalWidth(550);
		table.setLockedWidth(true);
		table.setWidths(new float[]{1});
		
		PdfPCell cell;
		
		////////////// EMPLOYEE DETAILS LINE 1 ////////////////////////////////////
		//////////////////////////////////////////////////////////////////////////
			
			cell_1: {
				
				Paragraph para_2 = new Paragraph();
				
				para_2.add(new Chunk("    \t\t (b) Details or Welfare Officers appointed :", Font9));
				cell = new PdfPCell(para_2);
				cell.setPadding(4);
				cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
		
		return table;
	}
	
	public static PdfPTable createBlankLine_2() throws DocumentException {
		PdfPTable table = new PdfPTable(1);

		table.setTotalWidth(550);
		table.setLockedWidth(true);
		table.setWidths(new float[]{1});
		
		PdfPCell cell_1;
		
		Paragraph para_1 = new Paragraph();
		para_1.add(new Chunk("", Font10Bold));
		para_1.add(Chunk.NEWLINE);
		para_1.setSpacingBefore(50);
		para_1.setSpacingAfter(50);
		
		cell_1 = new PdfPCell(para_1);
		cell_1.setPadding(2);
		cell_1.setBorder(Rectangle.NO_BORDER);
		cell_1.setHorizontalAlignment(Element.ALIGN_CENTER);
		cell_1.setVerticalAlignment(Element.ALIGN_CENTER);
		table.addCell(cell_1);
		
		return table;
	}
	
	public static PdfPTable createTable55() throws DocumentException {
		PdfPTable table = new PdfPTable(6);

		table.setTotalWidth(550);
		table.setLockedWidth(true);
		table.setWidths(new float[]{1, 1, 1, 1, 1, 1});
		
		PdfPCell cell;
		
		////////////// EMPLOYEE DETAILS LINE 1 ////////////////////////////////////
		//////////////////////////////////////////////////////////////////////////
			
			cell_1: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("Name of Welfare Officer", Font9));
				cell = new PdfPCell(para_2);
				cell.setPadding(4);
				//cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_CENTER);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
			
			cell_2: {
			
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("Date of Appointment", Font9));
				cell = new PdfPCell(para_2);
				cell.setPadding(4);
				//cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_CENTER);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
			
			cell_3: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("Name of the Institution from which he obtained a degree or diploma in Labour and Social Welfare or when he passed the L.W.O. Training Course of the Govt. of West Bengal*", Font9));
				cell = new PdfPCell(para_2);
				cell.setPadding(4);
				//cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_CENTER);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
			
			cell_4: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("**Name Of the Institution from Which through Knowledge in Bengali was acquired and the examination passed", Font9));
				cell = new PdfPCell(para_2);
				cell.setPadding(4);
				//cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_CENTER);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
			
			cell_5: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("Date of passing the Viva Voce Test under Clause(d) of Rule 5 of the West Bengal Factories (Welfare Officers) Rules", Font9));
				cell = new PdfPCell(para_2);
				cell.setPadding(4);
				//cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_CENTER);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
			
			cell_6: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("Grade and scale of pay", Font9));
				cell = new PdfPCell(para_2);
				cell.setPadding(4);
				//cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_CENTER);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
		
		return table;
	}
	
	public static PdfPTable createTable56() throws DocumentException {
		PdfPTable table = new PdfPTable(6);

		table.setTotalWidth(550);
		table.setLockedWidth(true);
		table.setWidths(new float[]{1, 1, 1, 1, 1, 1});
		
		PdfPCell cell;
		
		////////////// EMPLOYEE DETAILS LINE 1 ////////////////////////////////////
		//////////////////////////////////////////////////////////////////////////
			
			cell_1: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("1", Font9));
				cell = new PdfPCell(para_2);
				cell.setPadding(4);
				//cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_CENTER);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
			
			cell_2: {
			
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("2", Font9));
				cell = new PdfPCell(para_2);
				cell.setPadding(4);
				//cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_CENTER);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
			
			cell_3: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("3", Font9));
				cell = new PdfPCell(para_2);
				cell.setPadding(4);
				//cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_CENTER);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
			
			cell_4: {
			
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("4", Font9));
				cell = new PdfPCell(para_2);
				cell.setPadding(4);
				//cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_CENTER);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
			
			cell_5: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("5", Font9));
				cell = new PdfPCell(para_2);
				cell.setPadding(4);
				//cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_CENTER);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
			
			cell_6: {
			
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("6", Font9));
				cell = new PdfPCell(para_2);
				cell.setPadding(4);
				//cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_CENTER);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
		
		return table;
	}
	
	public static PdfPTable createTable57() throws DocumentException {
		PdfPTable table = new PdfPTable(6);

		table.setTotalWidth(550);
		table.setLockedWidth(true);
		table.setWidths(new float[]{1, 1, 1, 1, 1, 1});
		
		PdfPCell cell;
		
		////////////// EMPLOYEE DETAILS LINE 1 ////////////////////////////////////
		//////////////////////////////////////////////////////////////////////////
			
			cell_1: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("(i)", Font9));
				cell = new PdfPCell(para_2);
				cell.setPadding(4);
				//cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
			
			cell_2: {
			
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("", Font9));
				cell = new PdfPCell(para_2);
				cell.setPadding(4);
				//cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
			
			cell_3: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("", Font9));
				cell = new PdfPCell(para_2);
				cell.setPadding(4);
				//cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
			
			cell_4: {
			
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("", Font9));
				cell = new PdfPCell(para_2);
				cell.setPadding(4);
				//cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
			
			cell_5: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("", Font9));
				cell = new PdfPCell(para_2);
				cell.setPadding(4);
				//cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
			
			cell_6: {
			
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("", Font9));
				cell = new PdfPCell(para_2);
				cell.setPadding(4);
				//cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
		
		return table;
	}
	
	public static PdfPTable createTable58() throws DocumentException {
		PdfPTable table = new PdfPTable(6);

		table.setTotalWidth(550);
		table.setLockedWidth(true);
		table.setWidths(new float[]{1, 1, 1, 1, 1, 1});
		
		PdfPCell cell;
		
		////////////// EMPLOYEE DETAILS LINE 1 ////////////////////////////////////
		//////////////////////////////////////////////////////////////////////////
			
			cell_1: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("(ii)", Font9));
				cell = new PdfPCell(para_2);
				cell.setPadding(4);
				//cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
			
			cell_2: {
			
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("", Font9));
				cell = new PdfPCell(para_2);
				cell.setPadding(4);
				//cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
			
			cell_3: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("", Font9));
				cell = new PdfPCell(para_2);
				cell.setPadding(4);
				//cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
			
			cell_4: {
			
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("", Font9));
				cell = new PdfPCell(para_2);
				cell.setPadding(4);
				//cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
			
			cell_5: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("", Font9));
				cell = new PdfPCell(para_2);
				cell.setPadding(4);
				//cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
			
			cell_6: {
			
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("", Font9));
				cell = new PdfPCell(para_2);
				cell.setPadding(4);
				//cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
		
		return table;
	}
	
	public static PdfPTable createTable59() throws DocumentException {
		PdfPTable table = new PdfPTable(6);

		table.setTotalWidth(550);
		table.setLockedWidth(true);
		table.setWidths(new float[]{1, 1, 1, 1, 1, 1});
		
		PdfPCell cell;
		
		////////////// EMPLOYEE DETAILS LINE 1 ////////////////////////////////////
		//////////////////////////////////////////////////////////////////////////
			
			cell_1: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("(iii)", Font9));
				cell = new PdfPCell(para_2);
				cell.setPadding(4);
				//cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
			
			cell_2: {
			
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("", Font9));
				cell = new PdfPCell(para_2);
				cell.setPadding(4);
				//cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
			
			cell_3: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("", Font9));
				cell = new PdfPCell(para_2);
				cell.setPadding(4);
				//cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
			
			cell_4: {
			
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("", Font9));
				cell = new PdfPCell(para_2);
				cell.setPadding(4);
				//cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
			
			cell_5: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("", Font9));
				cell = new PdfPCell(para_2);
				cell.setPadding(4);
				//cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
			
			cell_6: {
			
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("", Font9));
				cell = new PdfPCell(para_2);
				cell.setPadding(4);
				//cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
		
		return table;
	}
	
	public static PdfPTable createTable60() throws DocumentException {
		PdfPTable table = new PdfPTable(1);

		table.setTotalWidth(550);
		table.setLockedWidth(true);
		table.setWidths(new float[]{1});
		
		PdfPCell cell;
		
		////////////// EMPLOYEE DETAILS LINE 1 ////////////////////////////////////
		//////////////////////////////////////////////////////////////////////////
			
			cell_1: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("* If he was exempted under Rule 6 of the West Bengal Factories (Welfare Officers) Rules. please quote the number and date of Government order.", Font9));
				
				cell = new PdfPCell(para_2);
				cell.setPaddingTop(8);
				cell.setPaddingBottom(120);
				cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
		
		return table;
	}
	
	public static PdfPTable createHeader11() throws DocumentException {
		PdfPTable table = new PdfPTable(1);

		table.setTotalWidth(550);
		table.setLockedWidth(true);
		table.setWidths(new float[]{1});
		
		PdfPCell cell_1;
		
		Paragraph para_1 = new Paragraph();
		//para_1.add(new Chunk("ADVANCE FOR DATE OF " + fromDate + " TO " + toDate, Font9Bold));
		para_1.add(new Chunk("(3)", Font10));
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
	
	public static PdfPTable createHeader12() throws DocumentException {
		PdfPTable table = new PdfPTable(1);

		table.setTotalWidth(550);
		table.setLockedWidth(true);
		table.setWidths(new float[]{1});
		
		PdfPCell cell_1;
		
		Paragraph para_1 = new Paragraph();
		para_1.add(new Chunk("Accidents", Font12Bold));
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
	
	public static PdfPTable createTable61() throws DocumentException {
		PdfPTable table = new PdfPTable(1);

		table.setTotalWidth(550);
		table.setLockedWidth(true);
		table.setWidths(new float[]{1});
		
		PdfPCell cell;
		
		////////////// EMPLOYEE DETAILS LINE 1 ////////////////////////////////////
		//////////////////////////////////////////////////////////////////////////
			
			cell_1: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("24.\t\t(a) Total number of accidents", Font9));
				
				cell = new PdfPCell(para_2);
				cell.setPadding(4);
				cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
		
		return table;
	}
	
	public static PdfPTable createTable62() throws DocumentException {
		PdfPTable table = new PdfPTable(1);

		table.setTotalWidth(550);
		table.setLockedWidth(true);
		table.setWidths(new float[]{1});
		
		PdfPCell cell;
		
		////////////// EMPLOYEE DETAILS LINE 1 ////////////////////////////////////
		//////////////////////////////////////////////////////////////////////////
			
			cell_1: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("\t\t\t\t\t\t\t(Seeexplanatory note) :", Font9));
				
				cell = new PdfPCell(para_2);
				cell.setPadding(4);
				cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
		
		return table;
	}
	
	public static PdfPTable createTable63(String fatalaccidents,String nonfatalaccidents) throws DocumentException {
		PdfPTable table = new PdfPTable(1);

		table.setTotalWidth(550);
		table.setLockedWidth(true);
		table.setWidths(new float[]{1});
		
		PdfPCell cell;
		
		////////////// EMPLOYEE DETAILS LINE 1 ////////////////////////////////////
		//////////////////////////////////////////////////////////////////////////
			
			cell_1: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("\t\t\t\t\t\t\t(i)  Fatal\t\t\t\t:   "+fatalaccidents+" \t\t\t\t\t\t\t\t\t\t\t\t(ii)  Non-Fatal\t\t\t\t:   "+nonfatalaccidents, Font9));
				
				cell = new PdfPCell(para_2);
				cell.setPadding(4);
				cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
		
		return table;
	}
	
	public static PdfPTable createTable64() throws DocumentException {
		PdfPTable table = new PdfPTable(1);

		table.setTotalWidth(550);
		table.setLockedWidth(true);
		table.setWidths(new float[]{1});
		
		PdfPCell cell;
		
		////////////// EMPLOYEE DETAILS LINE 1 ////////////////////////////////////
		//////////////////////////////////////////////////////////////////////////
			
			cell_1: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("\t\t\t\t\t\t\t(b) Accidents in which workers returned to work during the year to which this return relates :", Font9));
				
				cell = new PdfPCell(para_2);
				cell.setPadding(4);
				cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
		
		return table;
	}
	
	public static PdfPTable createTable65() throws DocumentException {
		PdfPTable table = new PdfPTable(1);

		table.setTotalWidth(550);
		table.setLockedWidth(true);
		table.setWidths(new float[]{1});
		
		PdfPCell cell;
		
		////////////// EMPLOYEE DETAILS LINE 1 ////////////////////////////////////
		//////////////////////////////////////////////////////////////////////////
			
			cell_1: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("\t\t\t\t\t\t\t\t\t\t\t\t(i) Accidents(workers injured) occurring during the year in which injured workers returned to work during the same year", Font9));
				
				cell = new PdfPCell(para_2);
				cell.setPadding(4);
				cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
		
		return table;
	}
	
	public static PdfPTable createTable66(String noofaccidents, String mandaysLost) throws DocumentException {
		PdfPTable table = new PdfPTable(1);

		table.setTotalWidth(550);
		table.setLockedWidth(true);
		table.setWidths(new float[]{1});
		
		PdfPCell cell;
		
		////////////// EMPLOYEE DETAILS LINE 1 ////////////////////////////////////
		//////////////////////////////////////////////////////////////////////////
			
			cell_1: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t (aa) Number of accidents  :  "+noofaccidents+" \t\t\t\t (bb) Mandays lost  :  "+mandaysLost, Font9));
				
				cell = new PdfPCell(para_2);
				cell.setPadding(4);
				cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
		
		return table;
	}
	
	public static PdfPTable createTable67() throws DocumentException {
		PdfPTable table = new PdfPTable(1);

		table.setTotalWidth(550);
		table.setLockedWidth(true);
		table.setWidths(new float[]{1});
		
		PdfPCell cell;
		
		////////////// EMPLOYEE DETAILS LINE 1 ////////////////////////////////////
		//////////////////////////////////////////////////////////////////////////
			
			cell_1: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("\t\t\t\t\t\t\t\t\t\t\t\t(iii) Accidents (workers injured) occurring in the previous year in which injured workers returned to work during the year \n \t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t to which injured workers did not return", Font9));
				
				cell = new PdfPCell(para_2);
				cell.setPadding(4);
				cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
		
		return table;
	}
	
	public static PdfPTable createTable68() throws DocumentException {
		PdfPTable table = new PdfPTable(1);

		table.setTotalWidth(550);
		table.setLockedWidth(true);
		table.setWidths(new float[]{1});
		
		PdfPCell cell;
		
		////////////// EMPLOYEE DETAILS LINE 1 ////////////////////////////////////
		//////////////////////////////////////////////////////////////////////////
			
			cell_1: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t (aa) Number of accidents  :  X \t\t\t\t (bb) Mandays lost  :  X", Font9));
				
				cell = new PdfPCell(para_2);
				cell.setPadding(4);
				cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
		
		return table;
	}
	
	public static PdfPTable createTable69() throws DocumentException {
		PdfPTable table = new PdfPTable(1);

		table.setTotalWidth(550);
		table.setLockedWidth(true);
		table.setWidths(new float[]{1});
		
		PdfPCell cell;
		
		////////////// EMPLOYEE DETAILS LINE 1 ////////////////////////////////////
		//////////////////////////////////////////////////////////////////////////
			
			cell_1: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("\t\t\t\t\t\t\t(c) Accidents (workers injured) occurring during the year in which injured workers did not return to work during the year \n\t\t\t\t\t\t\t\t\t\t\t\t to which this return relates", Font9));
				
				cell = new PdfPCell(para_2);
				cell.setPadding(4);
				cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
		
		return table;
	}
	
	public static PdfPTable createTable70() throws DocumentException {
		PdfPTable table = new PdfPTable(1);

		table.setTotalWidth(550);
		table.setLockedWidth(true);
		table.setWidths(new float[]{1});
		
		PdfPCell cell;
		
		////////////// EMPLOYEE DETAILS LINE 1 ////////////////////////////////////
		//////////////////////////////////////////////////////////////////////////
			
			cell_1: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t (aa) Number of accidents  :  X \t\t\t\t (bb) Mandays lost  :  X", Font9));
				
				cell = new PdfPCell(para_2);
				cell.setPadding(4);
				cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
		
		return table;
	}
	
	public static PdfPTable createHeader13() throws DocumentException {
		PdfPTable table = new PdfPTable(1);

		table.setTotalWidth(550);
		table.setLockedWidth(true);
		table.setWidths(new float[]{1});
		
		PdfPCell cell_1;
		
		Paragraph para_1 = new Paragraph();
		para_1.add(new Chunk("Suggestion Scheme", Font10));
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
	
	public static PdfPTable createTable71() throws DocumentException {
		PdfPTable table = new PdfPTable(1);

		table.setTotalWidth(550);
		table.setLockedWidth(true);
		table.setWidths(new float[]{1});
		
		PdfPCell cell;
		
		////////////// EMPLOYEE DETAILS LINE 1 ////////////////////////////////////
		//////////////////////////////////////////////////////////////////////////
			
			cell_1: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("25.\t\t(a) Is a Suggestion Scheme in operation in the factory?", Font9));
				
				cell = new PdfPCell(para_2);
				cell.setPadding(4);
				cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
		
		return table;
	}
	
	public static PdfPTable createTable72() throws DocumentException {
		PdfPTable table = new PdfPTable(1);

		table.setTotalWidth(550);
		table.setLockedWidth(true);
		table.setWidths(new float[]{1});
		
		PdfPCell cell;
		
		////////////// EMPLOYEE DETAILS LINE 1 ////////////////////////////////////
		//////////////////////////////////////////////////////////////////////////
			
			cell_1: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("\t\t\t\t\t\t\t(b) If so, the number of suggestion :", Font9));
				
				cell = new PdfPCell(para_2);
				cell.setPadding(4);
				cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
		
		return table;
	}
	
	public static PdfPTable createTable73() throws DocumentException {
		PdfPTable table = new PdfPTable(1);

		table.setTotalWidth(550);
		table.setLockedWidth(true);
		table.setWidths(new float[]{1});
		
		PdfPCell cell;
		
		////////////// EMPLOYEE DETAILS LINE 1 ////////////////////////////////////
		//////////////////////////////////////////////////////////////////////////
			
			cell_1: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("\t\t\t\t\t\t\t\t\t\t\t\t(i) Received during the year", Font9));
				
				cell = new PdfPCell(para_2);
				cell.setPadding(4);
				cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
		
		return table;
	}
	
	public static PdfPTable createTable74() throws DocumentException {
		PdfPTable table = new PdfPTable(1);

		table.setTotalWidth(550);
		table.setLockedWidth(true);
		table.setWidths(new float[]{1});
		
		PdfPCell cell;
		
		////////////// EMPLOYEE DETAILS LINE 1 ////////////////////////////////////
		//////////////////////////////////////////////////////////////////////////
			
			cell_1: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("\t\t\t\t\t\t\t\t\t\t\t\t(ii) Accepted during the year", Font9));
				
				cell = new PdfPCell(para_2);
				cell.setPadding(4);
				cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
		
		return table;
	}
	
	public static PdfPTable createTable75() throws DocumentException {
		PdfPTable table = new PdfPTable(1);

		table.setTotalWidth(550);
		table.setLockedWidth(true);
		table.setWidths(new float[]{1});
		
		PdfPCell cell;
		
		////////////// EMPLOYEE DETAILS LINE 1 ////////////////////////////////////
		//////////////////////////////////////////////////////////////////////////
			
			cell_1: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("\t\t\t\t\t\t\t(c) Amount awarded in cash prizes during the year :", Font9));
				
				cell = new PdfPCell(para_2);
				cell.setPadding(4);
				cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
		
		return table;
	}
	
	public static PdfPTable createTable76() throws DocumentException {
		PdfPTable table = new PdfPTable(1);

		table.setTotalWidth(550);
		table.setLockedWidth(true);
		table.setWidths(new float[]{1});
		
		PdfPCell cell;
		
		////////////// EMPLOYEE DETAILS LINE 1 ////////////////////////////////////
		//////////////////////////////////////////////////////////////////////////
			
			cell_1: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("\t\t\t\t\t\t\t\t\t\t\t\t(i) Total amount awarded", Font9));
				
				cell = new PdfPCell(para_2);
				cell.setPadding(4);
				cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
		
		return table;
	}
	
	public static PdfPTable createTable77() throws DocumentException {
		PdfPTable table = new PdfPTable(1);

		table.setTotalWidth(550);
		table.setLockedWidth(true);
		table.setWidths(new float[]{1});
		
		PdfPCell cell;
		
		////////////// EMPLOYEE DETAILS LINE 1 ////////////////////////////////////
		//////////////////////////////////////////////////////////////////////////
			
			cell_1: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("\t\t\t\t\t\t\t\t\t\t\t\t(ii) Value of the maximum cash prize awarded", Font9));
				
				cell = new PdfPCell(para_2);
				cell.setPadding(4);
				cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
		
		return table;
	}
	
	public static PdfPTable createTable78() throws DocumentException {
		PdfPTable table = new PdfPTable(1);

		table.setTotalWidth(550);
		table.setLockedWidth(true);
		table.setWidths(new float[]{1});
		
		PdfPCell cell;
		
		////////////// EMPLOYEE DETAILS LINE 1 ////////////////////////////////////
		//////////////////////////////////////////////////////////////////////////
			
			cell_1: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("\t\t\t\t\t\t\t\t\t\t\t\t(iii) Value of minimum cash prize awarded", Font9));
				
				cell = new PdfPCell(para_2);
				cell.setPadding(4);
				cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
		
		return table;
	}
	
	public static PdfPTable createTable79() throws DocumentException {
		PdfPTable table = new PdfPTable(1);

		table.setTotalWidth(550);
		table.setLockedWidth(true);
		table.setWidths(new float[]{1});
		
		PdfPCell cell;
		
		////////////// EMPLOYEE DETAILS LINE 1 ////////////////////////////////////
		//////////////////////////////////////////////////////////////////////////
			
			cell_1: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("\t\t\t\t\t\t\tCertified that the information furnished above is, to the best of my knowledge and belief, correct", Font9));
				
				cell = new PdfPCell(para_2);
				cell.setPaddingTop(4);
				cell.setPaddingBottom(20);
				cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
		
		return table;
	}
	
	public static PdfPTable createTable80() throws DocumentException {
		PdfPTable table = new PdfPTable(2);

		table.setTotalWidth(550);
		table.setLockedWidth(true);
		table.setWidths(new float[]{1, 1});
		
		PdfPCell cell;
		
		////////////// EMPLOYEE DETAILS LINE 1 ////////////////////////////////////
		//////////////////////////////////////////////////////////////////////////
			
			cell_1: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("Date", Font9));
				
				cell = new PdfPCell(para_2);
				cell.setPaddingTop(8);
				cell.setPaddingBottom(70);
				cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
		
			cell_2: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("Signature of the Manager", Font9));
				
				cell = new PdfPCell(para_2);
				cell.setPaddingTop(8);
				cell.setPaddingBottom(70);
				cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_RIGHT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
		
		return table;
	}
	
	public static PdfPTable createHeader14() throws DocumentException {
		PdfPTable table = new PdfPTable(1);

		table.setTotalWidth(550);
		table.setLockedWidth(true);
		table.setWidths(new float[]{1});
		
		PdfPCell cell_1;
		
		Paragraph para_1 = new Paragraph();
		para_1.add(new Chunk("THIS RETURN SHOULD BE SENT TO THE CHIEF INSPECTOR OF FACTORIES BY 31ST JANUARY OF THE SUCCEEDING YEAR.", Font8Bold));
		para_1.add(Chunk.NEWLINE);
		para_1.setSpacingBefore(20);
		para_1.setSpacingAfter(10);
		
		cell_1 = new PdfPCell(para_1);
		cell_1.setPaddingTop(5);
		cell_1.setPaddingBottom(15);
		//cell_1.setBorder(Rectangle.NO_BORDER);
		cell_1.setBorder(Rectangle.TOP);
		cell_1.setHorizontalAlignment(Element.ALIGN_CENTER);
		cell_1.setVerticalAlignment(Element.ALIGN_CENTER);
		table.addCell(cell_1);
		
		return table;
	}
	
	public static PdfPTable createHeader15() throws DocumentException {
		PdfPTable table = new PdfPTable(1);

		table.setTotalWidth(550);
		table.setLockedWidth(true);
		table.setWidths(new float[]{1});
		
		PdfPCell cell_1;
		
		Paragraph para_1 = new Paragraph();
		para_1.add(new Chunk("Explanatory Notes:", Font9));
		para_1.add(Chunk.NEWLINE);
		para_1.setSpacingBefore(20);
		para_1.setSpacingAfter(10);
		
		cell_1 = new PdfPCell(para_1);
		cell_1.setPaddingTop(2);
		cell_1.setPaddingBottom(5);
		cell_1.setBorder(Rectangle.NO_BORDER);
		cell_1.setHorizontalAlignment(Element.ALIGN_LEFT);
		cell_1.setVerticalAlignment(Element.ALIGN_CENTER);
		table.addCell(cell_1);
		
		return table;
	}
	
	public static PdfPTable createTable81() throws DocumentException {
		PdfPTable table = new PdfPTable(2);

		table.setTotalWidth(550);
		table.setLockedWidth(true);
		table.setWidths(new float[]{1, 11});
		
		PdfPCell cell;
		
		////////////// EMPLOYEE DETAILS LINE 1 ////////////////////////////////////
		//////////////////////////////////////////////////////////////////////////
			
			cell_1: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("1.", Font9));
				
				cell = new PdfPCell(para_2);
				cell.setPaddingTop(10);
				cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
		
			cell_2: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("The average number of workers employed daily should be calculated by dividing the aggregate number of attendances on working days (that is, mandays worked) by the number of working days in the year. In reckoning attendance, attendance by temporary as well as permanent employees should be counted, and All employees {including apprentices) should be included, whether they are employed directly or under contractors. Attendance on separate shifts (e.g. night and day shifts) should be counted separately. Days on which the factory was closed for whatever cause, and days on which the manufacturing processes were not carried on should not be treated as working days. However, if more than 50% of workers employed (on the previous day) attend to repair maintenance or other such work on closed days, such days should be treated as working days Partial attendance for less than half a shift on a working day should be ignored, while attendance for half a shift or more on such day should be treated as full attendance.", Font9));
				
				cell = new PdfPCell(para_2);
				cell.setPaddingTop(10);
				cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_JUSTIFIED);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
		
		return table;
	}
	
	public static PdfPTable createTable82() throws DocumentException {
		PdfPTable table = new PdfPTable(2);

		table.setTotalWidth(550);
		table.setLockedWidth(true);
		table.setWidths(new float[]{1, 11});
		
		PdfPCell cell;
		
		////////////// EMPLOYEE DETAILS LINE 1 ////////////////////////////////////
		//////////////////////////////////////////////////////////////////////////
			
			cell_1: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("2.", Font9));
				
				cell = new PdfPCell(para_2);
				cell.setPaddingTop(10);
				cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
		
			cell_2: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("For seasonal factories, the average number of workers employed during the working season and the off season should be given separately, Similarly the number of days worked and average number of manhours worked per week during the working and off season should be given separately.", Font9));
				
				cell = new PdfPCell(para_2);
				cell.setPaddingTop(10);
				cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_JUSTIFIED);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
		
		return table;
	}
	
	public static PdfPTable createTable83() throws DocumentException {
		PdfPTable table = new PdfPTable(2);

		table.setTotalWidth(550);
		table.setLockedWidth(true);
		table.setWidths(new float[]{1, 11});
		
		PdfPCell cell;
		
		////////////// EMPLOYEE DETAILS LINE 1 ////////////////////////////////////
		//////////////////////////////////////////////////////////////////////////
			
			cell_1: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("3.", Font9));
				
				cell = new PdfPCell(para_2);
				cell.setPaddingTop(10);
				cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
		
			cell_2: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("The average number of hours worked per week means the total actual hours worked by all workers during the year excluding the rest intervals but including overtime work divided by the product of average number of workers employed daily in the factory during the year and 52. In case the factory has not worked for the whole year, the number of weeks during which the factory worked should be used in place of the figure 52.", Font9));
				
				cell = new PdfPCell(para_2);
				cell.setPaddingTop(10);
				cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_JUSTIFIED);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
		
		return table;
	}
	
	public static PdfPTable createTable84() throws DocumentException {
		PdfPTable table = new PdfPTable(2);

		table.setTotalWidth(550);
		table.setLockedWidth(true);
		table.setWidths(new float[]{1, 11});
		
		PdfPCell cell;
		
		////////////// EMPLOYEE DETAILS LINE 1 ////////////////////////////////////
		//////////////////////////////////////////////////////////////////////////
			
			cell_1: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("4.", Font9));
				
				cell = new PdfPCell(para_2);
				cell.setPaddingTop(10);
				cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
		
			cell_2: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("Every person killed or injured should be treated as one separate accident. If in one occurrence, six persons were injured or killed it should be counted as six accidents.", Font9));
				
				cell = new PdfPCell(para_2);
				cell.setPaddingTop(10);
				cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_JUSTIFIED);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
		
		return table;
	}
	
	public static PdfPTable createTable85() throws DocumentException {
		PdfPTable table = new PdfPTable(2);

		table.setTotalWidth(550);
		table.setLockedWidth(true);
		table.setWidths(new float[]{1, 11});
		
		PdfPCell cell;
		
		////////////// EMPLOYEE DETAILS LINE 1 ////////////////////////////////////
		//////////////////////////////////////////////////////////////////////////
			
			cell_1: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("5.", Font9));
				
				cell = new PdfPCell(para_2);
				cell.setPaddingTop(10);
				cell.setPaddingBottom(30);
				cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
		
			cell_2: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("In item 24 (a) number of accidents which took place during the year should be given. In Case", Font9));
				
				cell = new PdfPCell(para_2);
				cell.setPaddingTop(10);
				cell.setPaddingBottom(30);
				cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_JUSTIFIED);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
		
		return table;
	}
	
	///////////////////
	
	public static PdfPTable createHeader16() throws DocumentException {
		PdfPTable table = new PdfPTable(1);

		table.setTotalWidth(550);
		table.setLockedWidth(true);
		table.setWidths(new float[]{1});
		
		PdfPCell cell_1;
		
		Paragraph para_1 = new Paragraph();
		para_1.add(new Chunk("FORM IV", Font10Bold));
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
	
	public static PdfPTable createHeader17() throws DocumentException {
		PdfPTable table = new PdfPTable(1);

		table.setTotalWidth(550);
		table.setLockedWidth(true);
		table.setWidths(new float[]{1});
		
		PdfPCell cell_1;
		
		Paragraph para_1 = new Paragraph();
		//para_1.add(new Chunk("ADVANCE FOR DATE OF " + fromDate + " TO " + toDate, Font9Bold));
		para_1.add(new Chunk("(See Rule 19)", Font10));
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
	
	public static PdfPTable createHeader18() throws DocumentException {
		PdfPTable table = new PdfPTable(1);

		table.setTotalWidth(550);
		table.setLockedWidth(true);
		table.setWidths(new float[]{1});
		
		PdfPCell cell_1;
		
		Paragraph para_1 = new Paragraph();
		para_1.add(new Chunk("ANNUAL RETURN UNDER THE WEST BENGAL PAYMENT OF WAGES RULES", Font10Bold));
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
	
	public static PdfPTable createTable86() throws DocumentException {
		PdfPTable table = new PdfPTable(2);

		table.setTotalWidth(550);
		table.setLockedWidth(true);
		table.setWidths(new float[]{1, 1});
		
		PdfPCell cell;
		
		////////////// EMPLOYEE DETAILS LINE 1 ////////////////////////////////////
		//////////////////////////////////////////////////////////////////////////
			
			cell_1: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("Registration No, 331.1/341 (d)21-HWI/X/71", Font9));
				cell = new PdfPCell(para_2);
				cell.setPadding(5);
				cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
			
			cell_2: {
			
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("Classification Code No. 27105", Font9));
				cell = new PdfPCell(para_2);
				cell.setPadding(5);
				cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
		
		return table;
	}
	
	public static PdfPTable createHeader19() throws DocumentException {
		PdfPTable table = new PdfPTable(1);

		table.setTotalWidth(550);
		table.setLockedWidth(true);
		table.setWidths(new float[]{1});
		
		PdfPCell cell_1;
		
		Paragraph para_1 = new Paragraph();
		para_1.add(new Chunk("WAGES AND DEDUCTIONS FROM WAGES", Font10Bold));
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
	
	public static PdfPTable createTable87() throws DocumentException {
		PdfPTable table = new PdfPTable(1);

		table.setTotalWidth(550);
		table.setLockedWidth(true);
		table.setWidths(new float[]{1});
		
		PdfPCell cell;
		
		////////////// EMPLOYEE DETAILS LINE 1 ////////////////////////////////////
		//////////////////////////////////////////////////////////////////////////
			
			cell_1: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("Return for the year ending", Font9Bold));
				para_2.add(new Chunk("  31-Dec-2018", Font9));
				cell = new PdfPCell(para_2);
				cell.setPadding(5);
				cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
		
		return table;
	}
	
	public static PdfPTable createTable88() throws DocumentException {
		PdfPTable table = new PdfPTable(1);

		table.setTotalWidth(550);
		table.setLockedWidth(true);
		table.setWidths(new float[]{1});
		
		PdfPCell cell;
		
		////////////// EMPLOYEE DETAILS LINE 1 ////////////////////////////////////
		//////////////////////////////////////////////////////////////////////////
			
			cell_1: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("1. (a) Name of the Factory or Establishment and posta! addtess : CRAWLEY & RAY (FOUNDERS AND ENGINEERS) PVT. LTD., \n\t\t\t\t\t\t\t\t 32,Foreshore Road, P.O. Botanic Garden , HOWRAH-711 103.", Font9));
				cell = new PdfPCell(para_2);
				cell.setPadding(5);
				cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
		
		return table;
	}
	
	public static PdfPTable createTable89() throws DocumentException {
		PdfPTable table = new PdfPTable(1);

		table.setTotalWidth(550);
		table.setLockedWidth(true);
		table.setWidths(new float[]{1});
		
		PdfPCell cell;
		
		////////////// EMPLOYEE DETAILS LINE 1 ////////////////////////////////////
		//////////////////////////////////////////////////////////////////////////
			
			cell_1: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("    (b) Industry : FOUNDRY", Font9));
				cell = new PdfPCell(para_2);
				cell.setPadding(5);
				cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
		
		return table;
	}
	
	public static PdfPTable createTable90() throws DocumentException {
		PdfPTable table = new PdfPTable(1);

		table.setTotalWidth(550);
		table.setLockedWidth(true);
		table.setWidths(new float[]{1});
		
		PdfPCell cell;
		
		////////////// EMPLOYEE DETAILS LINE 1 ////////////////////////////////////
		//////////////////////////////////////////////////////////////////////////
			
			cell_1: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("2. Number of days worked during the year :299", Font9));
				cell = new PdfPCell(para_2);
				cell.setPadding(5);
				cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
		
		return table;
	}
	
	public static PdfPTable createTable91() throws DocumentException {
		PdfPTable table = new PdfPTable(1);

		table.setTotalWidth(550);
		table.setLockedWidth(true);
		table.setWidths(new float[]{1});
		
		PdfPCell cell;
		
		////////////// EMPLOYEE DETAILS LINE 1 ////////////////////////////////////
		//////////////////////////////////////////////////////////////////////////
			
			cell_1: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk(" 3. (a) Number* of mandays worked during the year :1", Font9));
				cell = new PdfPCell(para_2);
				cell.setPaddingTop(5);
				cell.setPaddingBottom(15);
				cell.setBorder(Rectangle.BOTTOM);
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
		
		return table;
	}
	
	public static PdfPTable createTable92() throws DocumentException {
		PdfPTable table = new PdfPTable(2);

		table.setTotalWidth(550);
		table.setLockedWidth(true);
		table.setWidths(new float[]{1, 1});
		
		PdfPCell cell;
		
		////////////// EMPLOYEE DETAILS LINE 1 ////////////////////////////////////
		//////////////////////////////////////////////////////////////////////////
			
			cell_1: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("Adults", Font9));
				cell = new PdfPCell(para_2);
				cell.setPaddingTop(5);
				cell.setPaddingBottom(10);
				cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
		
			cell_2: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("1", Font9));
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
	
	public static PdfPTable createTable93() throws DocumentException {
		PdfPTable table = new PdfPTable(2);

		table.setTotalWidth(550);
		table.setLockedWidth(true);
		table.setWidths(new float[]{1, 1});
		
		PdfPCell cell;
		
		////////////// EMPLOYEE DETAILS LINE 1 ////////////////////////////////////
		//////////////////////////////////////////////////////////////////////////
			
			cell_1: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("Children", Font9));
				cell = new PdfPCell(para_2);
				cell.setPaddingTop(5);
				cell.setPaddingBottom(10);
				cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
		
			cell_2: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("", Font9));
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
	
	public static PdfPTable createTable94() throws DocumentException {
		PdfPTable table = new PdfPTable(3);

		table.setTotalWidth(550);
		table.setLockedWidth(true);
		table.setWidths(new float[]{7, 1, 4});
		
		PdfPCell cell;
		
		////////////// EMPLOYEE DETAILS LINE 1 ////////////////////////////////////
		//////////////////////////////////////////////////////////////////////////
			
			cell_1: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("", Font9));
				cell = new PdfPCell(para_2);
				cell.setPaddingTop(5);
				cell.setPaddingBottom(10);
				cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
		
			cell_2: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("Total :", Font9));
				cell = new PdfPCell(para_2);
				cell.setPaddingTop(5);
				cell.setPaddingBottom(10);
				cell.setPaddingRight(10);
				cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
			
			cell_3: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("1", Font9));
				cell = new PdfPCell(para_2);
				cell.setPaddingTop(5);
				cell.setPaddingBottom(10);
				cell.setPaddingRight(10);
				cell.setBorder(Rectangle.TOP);
				cell.setHorizontalAlignment(Element.ALIGN_RIGHT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
		
		return table;
	}
	
	public static PdfPTable createTable95() throws DocumentException {
		PdfPTable table = new PdfPTable(1);

		table.setTotalWidth(550);
		table.setLockedWidth(true);
		table.setWidths(new float[]{1});
		
		PdfPCell cell;
		
		////////////// EMPLOYEE DETAILS LINE 1 ////////////////////////////////////
		//////////////////////////////////////////////////////////////////////////
			
			cell_1: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("**(b) Average daily number of persons employed during the year :", Font9));
				cell = new PdfPCell(para_2);
				cell.setPaddingTop(5);
				cell.setPaddingBottom(5);
				cell.setBorder(Rectangle.BOTTOM | Rectangle.TOP);
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
		
		return table;
	}
	
	public static PdfPTable createTable96() throws DocumentException {
		PdfPTable table = new PdfPTable(2);

		table.setTotalWidth(550);
		table.setLockedWidth(true);
		table.setWidths(new float[]{1, 1});
		
		PdfPCell cell;
		
		////////////// EMPLOYEE DETAILS LINE 1 ////////////////////////////////////
		//////////////////////////////////////////////////////////////////////////
			
			cell_1: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("Adults", Font9));
				cell = new PdfPCell(para_2);
				cell.setPaddingTop(5);
				cell.setPaddingBottom(10);
				cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
		
			cell_2: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("0", Font9));
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
	
	public static PdfPTable createTable97() throws DocumentException {
		PdfPTable table = new PdfPTable(2);

		table.setTotalWidth(550);
		table.setLockedWidth(true);
		table.setWidths(new float[]{1, 1});
		
		PdfPCell cell;
		
		////////////// EMPLOYEE DETAILS LINE 1 ////////////////////////////////////
		//////////////////////////////////////////////////////////////////////////
			
			cell_1: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("Children", Font9));
				cell = new PdfPCell(para_2);
				cell.setPaddingTop(5);
				cell.setPaddingBottom(10);
				cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
		
			cell_2: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("", Font9));
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
	
	public static PdfPTable createTable98() throws DocumentException {
		PdfPTable table = new PdfPTable(3);

		table.setTotalWidth(550);
		table.setLockedWidth(true);
		table.setWidths(new float[]{7, 1, 4});
		
		PdfPCell cell;
		
		////////////// EMPLOYEE DETAILS LINE 1 ////////////////////////////////////
		//////////////////////////////////////////////////////////////////////////
			
			cell_1: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("", Font9));
				cell = new PdfPCell(para_2);
				cell.setPaddingTop(5);
				cell.setPaddingBottom(10);
				cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
		
			cell_2: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("Total :", Font9));
				cell = new PdfPCell(para_2);
				cell.setPaddingTop(5);
				cell.setPaddingBottom(10);
				cell.setPaddingRight(10);
				cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
			
			cell_3: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("0", Font9));
				cell = new PdfPCell(para_2);
				cell.setPaddingTop(5);
				cell.setPaddingBottom(10);
				cell.setPaddingRight(10);
				cell.setBorder(Rectangle.TOP);
				cell.setHorizontalAlignment(Element.ALIGN_RIGHT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
		
		return table;
	}
	
	public static PdfPTable createTable99() throws DocumentException {
		PdfPTable table = new PdfPTable(1);

		table.setTotalWidth(550);
		table.setLockedWidth(true);
		table.setWidths(new float[]{1});
		
		PdfPCell cell;
		
		////////////// EMPLOYEE DETAILS LINE 1 ////////////////////////////////////
		//////////////////////////////////////////////////////////////////////////
			
			cell_1: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("4. Total wages paid including including deductions under section 7(2) on the following accounts :", Font9));
				cell = new PdfPCell(para_2);
				cell.setPaddingTop(5);
				cell.setPaddingBottom(5);
				cell.setBorder(Rectangle.BOTTOM | Rectangle.TOP);
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
		
		return table;
	}
	
	public static PdfPTable createTable100(String profitsharingbonus) throws DocumentException {
		PdfPTable table = new PdfPTable(2);

		table.setTotalWidth(550);
		table.setLockedWidth(true);
		table.setWidths(new float[]{1, 1});
		
		PdfPCell cell;
		
		////////////// EMPLOYEE DETAILS LINE 1 ////////////////////////////////////
		//////////////////////////////////////////////////////////////////////////
			
			cell_1: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("(a) Profit sharing bonus", Font9));
				cell = new PdfPCell(para_2);
				cell.setPaddingTop(5);
				cell.setPaddingBottom(10);
				cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
		
			cell_2: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk(profitsharingbonus, Font9));
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
	
	public static PdfPTable createTable101() throws DocumentException {
		PdfPTable table = new PdfPTable(2);

		table.setTotalWidth(550);
		table.setLockedWidth(true);
		table.setWidths(new float[]{1, 1});
		
		PdfPCell cell;
		
		////////////// EMPLOYEE DETAILS LINE 1 ////////////////////////////////////
		//////////////////////////////////////////////////////////////////////////
			
			cell_1: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("(b) Money value of concessions", Font9));
				cell = new PdfPCell(para_2);
				cell.setPaddingTop(5);
				cell.setPaddingBottom(10);
				cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
		
			cell_2: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("", Font9));
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
	
	public static PdfPTable createTable102(String nonprofitsharingbonus) throws DocumentException {
		PdfPTable table = new PdfPTable(2);

		table.setTotalWidth(550);
		table.setLockedWidth(true);
		table.setWidths(new float[]{2, 1});
		
		PdfPCell cell;
		
		////////////// EMPLOYEE DETAILS LINE 1 ////////////////////////////////////
		//////////////////////////////////////////////////////////////////////////
			
			cell_1: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("(c) Basic wages including overtime wages and non-profit sharing bonus", Font9));
				cell = new PdfPCell(para_2);
				cell.setPaddingTop(5);
				cell.setPaddingBottom(10);
				cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
		
			cell_2: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk(nonprofitsharingbonus, Font9));
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
	
	public static PdfPTable createTable103() throws DocumentException {
		PdfPTable table = new PdfPTable(2);

		table.setTotalWidth(550);
		table.setLockedWidth(true);
		table.setWidths(new float[]{1, 1});
		
		PdfPCell cell;
		
		////////////// EMPLOYEE DETAILS LINE 1 ////////////////////////////////////
		//////////////////////////////////////////////////////////////////////////
			
			cell_1: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("(d) Dearness and other allowances in cash", Font9));
				cell = new PdfPCell(para_2);
				cell.setPaddingTop(5);
				cell.setPaddingBottom(10);
				cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
		
			cell_2: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("", Font9));
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
	
	public static PdfPTable createTable104(String arrearsofpay) throws DocumentException {
		PdfPTable table = new PdfPTable(2);

		table.setTotalWidth(550);
		table.setLockedWidth(true);
		table.setWidths(new float[]{1, 1});
		
		PdfPCell cell;
		
		////////////// EMPLOYEE DETAILS LINE 1 ////////////////////////////////////
		//////////////////////////////////////////////////////////////////////////
			
			cell_1: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("(e) Arrears of pay in respect of previous year paid during the year", Font9));
				cell = new PdfPCell(para_2);
				cell.setPaddingTop(5);
				cell.setPaddingBottom(10);
				cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
		
			cell_2: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk(arrearsofpay, Font9));
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
	
	public static PdfPTable createTable105(String profitsharingbonus, String nonprofitsharingbonus, String arrearsofpay) throws DocumentException {
		PdfPTable table = new PdfPTable(3);

		table.setTotalWidth(550);
		table.setLockedWidth(true);
		table.setWidths(new float[]{7, 1, 4});
		
		PdfPCell cell;
		
		////////////// EMPLOYEE DETAILS LINE 1 ////////////////////////////////////
		//////////////////////////////////////////////////////////////////////////
			
			cell_1: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("", Font9));
				cell = new PdfPCell(para_2);
				cell.setPaddingTop(5);
				cell.setPaddingBottom(10);
				cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
		
			cell_2: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("Total :", Font9));
				cell = new PdfPCell(para_2);
				cell.setPaddingTop(5);
				cell.setPaddingBottom(10);
				cell.setPaddingRight(10);
				cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
			
			cell_3: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk(String.valueOf(( Integer.parseInt(profitsharingbonus)+Integer.parseInt(nonprofitsharingbonus)+Integer.parseInt(arrearsofpay))), Font9));
				cell = new PdfPCell(para_2);
				cell.setPaddingTop(5);
				cell.setPaddingBottom(10);
				cell.setPaddingRight(10);
				cell.setBorder(Rectangle.TOP);
				cell.setHorizontalAlignment(Element.ALIGN_RIGHT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
		
		return table;
	}
	
	public static PdfPTable createTable106() throws DocumentException {
		PdfPTable table = new PdfPTable(1);

		table.setTotalWidth(550);
		table.setLockedWidth(true);
		table.setWidths(new float[]{1});
		
		PdfPCell cell;
		
		////////////// EMPLOYEE DETAILS LINE 1 ////////////////////////////////////
		//////////////////////////////////////////////////////////////////////////
			
			cell_1: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("5. Deductions-Number of cases and amount related :", Font9));
				cell = new PdfPCell(para_2);
				cell.setPaddingTop(5);
				cell.setPaddingBottom(5);
				cell.setBorder(Rectangle.BOTTOM | Rectangle.TOP);
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
		
		return table;
	}
	
	public static PdfPTable createTable107() throws DocumentException {
		PdfPTable table = new PdfPTable(4);

		table.setTotalWidth(550);
		table.setLockedWidth(true);
		table.setWidths(new float[]{7, 1, 2, 2});
		
		PdfPCell cell;
		
		////////////// EMPLOYEE DETAILS LINE 1 ////////////////////////////////////
		//////////////////////////////////////////////////////////////////////////
			
			cell_1: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("", Font9));
				cell = new PdfPCell(para_2);
				cell.setPaddingTop(5);
				cell.setPaddingBottom(10);
				cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
		
			cell_2: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("", Font9));
				cell = new PdfPCell(para_2);
				cell.setPaddingTop(5);
				cell.setPaddingBottom(10);
				cell.setPaddingRight(10);
				cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
			
			cell_3: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("Number of cases", Font9));
				cell = new PdfPCell(para_2);
				cell.setPaddingTop(5);
				cell.setPaddingBottom(10);
				cell.setPaddingRight(10);
				cell.setBorder(Rectangle.BOTTOM);
				cell.setHorizontalAlignment(Element.ALIGN_RIGHT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
			
			cell_4: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("Amount realized (Rs.)", Font9));
				cell = new PdfPCell(para_2);
				cell.setPaddingTop(5);
				cell.setPaddingBottom(10);
				cell.setPaddingRight(10);
				cell.setBorder(Rectangle.BOTTOM);
				cell.setHorizontalAlignment(Element.ALIGN_RIGHT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
		
		return table;
	}
	
	public static PdfPTable createTable108() throws DocumentException {
		PdfPTable table = new PdfPTable(2);

		table.setTotalWidth(550);
		table.setLockedWidth(true);
		table.setWidths(new float[]{1, 1});
		
		PdfPCell cell;
		
		////////////// EMPLOYEE DETAILS LINE 1 ////////////////////////////////////
		//////////////////////////////////////////////////////////////////////////
			
			cell_1: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("(a) Fines", Font9));
				cell = new PdfPCell(para_2);
				cell.setPaddingTop(5);
				cell.setPaddingBottom(10);
				cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
		
			cell_2: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("", Font9));
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
	
	public static PdfPTable createTable109() throws DocumentException {
		PdfPTable table = new PdfPTable(2);

		table.setTotalWidth(550);
		table.setLockedWidth(true);
		table.setWidths(new float[]{1, 1});
		
		PdfPCell cell;
		
		////////////// EMPLOYEE DETAILS LINE 1 ////////////////////////////////////
		//////////////////////////////////////////////////////////////////////////
			
			cell_1: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("(b) Deductions for damage or loss", Font9));
				cell = new PdfPCell(para_2);
				cell.setPaddingTop(5);
				cell.setPaddingBottom(10);
				cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
		
			cell_2: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("", Font9));
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
	
	public static PdfPTable createTable110() throws DocumentException {
		PdfPTable table = new PdfPTable(2);

		table.setTotalWidth(550);
		table.setLockedWidth(true);
		table.setWidths(new float[]{1, 1});
		
		PdfPCell cell;
		
		////////////// EMPLOYEE DETAILS LINE 1 ////////////////////////////////////
		//////////////////////////////////////////////////////////////////////////
			
			cell_1: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("(c) Deduction for breach of contract", Font9));
				cell = new PdfPCell(para_2);
				cell.setPaddingTop(5);
				cell.setPaddingBottom(10);
				cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
		
			cell_2: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("", Font9));
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
	
	public static PdfPTable createTable111() throws DocumentException {
		PdfPTable table = new PdfPTable(3);

		table.setTotalWidth(550);
		table.setLockedWidth(true);
		table.setWidths(new float[]{7, 1, 4});
		
		PdfPCell cell;
		
		////////////// EMPLOYEE DETAILS LINE 1 ////////////////////////////////////
		//////////////////////////////////////////////////////////////////////////
			
			cell_1: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("", Font9));
				cell = new PdfPCell(para_2);
				cell.setPaddingTop(5);
				cell.setPaddingBottom(10);
				cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
		
			cell_2: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("Total :", Font9));
				cell = new PdfPCell(para_2);
				cell.setPaddingTop(5);
				cell.setPaddingBottom(10);
				cell.setPaddingRight(10);
				cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
			
			cell_3: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("", Font9));
				cell = new PdfPCell(para_2);
				cell.setPaddingTop(5);
				cell.setPaddingBottom(10);
				cell.setPaddingRight(10);
				cell.setBorder(Rectangle.TOP);
				cell.setHorizontalAlignment(Element.ALIGN_RIGHT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
		
		return table;
	}
	
	public static PdfPTable createHeader20() throws DocumentException {
		PdfPTable table = new PdfPTable(1);

		table.setTotalWidth(550);
		table.setLockedWidth(true);
		table.setWidths(new float[]{1});
		
		PdfPCell cell_1;
		
		Paragraph para_1 = new Paragraph();
		//para_1.add(new Chunk("ADVANCE FOR DATE OF " + fromDate + " TO " + toDate, Font9Bold));
		para_1.add(new Chunk("", Font10));
		para_1.add(Chunk.NEWLINE);
		para_1.setSpacingBefore(50);
		para_1.setSpacingAfter(50);
		
		cell_1 = new PdfPCell(para_1);
		cell_1.setPaddingTop(110);
		cell_1.setBorder(Rectangle.NO_BORDER);
		cell_1.setHorizontalAlignment(Element.ALIGN_CENTER);
		cell_1.setVerticalAlignment(Element.ALIGN_CENTER);
		table.addCell(cell_1);
		
		return table;
	}
	
	public static PdfPTable createHeader21() throws DocumentException {
		PdfPTable table = new PdfPTable(1);

		table.setTotalWidth(550);
		table.setLockedWidth(true);
		table.setWidths(new float[]{1});
		
		PdfPCell cell_1;
		
		Paragraph para_1 = new Paragraph();
		//para_1.add(new Chunk("ADVANCE FOR DATE OF " + fromDate + " TO " + toDate, Font9Bold));
		para_1.add(new Chunk("(2)", Font10));
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
	
	public static PdfPTable createTable112() throws DocumentException {
		PdfPTable table = new PdfPTable(1);

		table.setTotalWidth(550);
		table.setLockedWidth(true);
		table.setWidths(new float[]{1});
		
		PdfPCell cell;
		
		////////////// EMPLOYEE DETAILS LINE 1 ////////////////////////////////////
		//////////////////////////////////////////////////////////////////////////
			
			cell_1: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("6. Fines fund", Font9));
				cell = new PdfPCell(para_2);
				cell.setPaddingTop(5);
				cell.setPaddingBottom(5);
				cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
		
		return table;
	}
	
	public static PdfPTable createTable113() throws DocumentException {
		PdfPTable table = new PdfPTable(2);

		table.setTotalWidth(550);
		table.setLockedWidth(true);
		table.setWidths(new float[]{6, 2});
		
		PdfPCell cell;
		
		////////////// EMPLOYEE DETAILS LINE 1 ////////////////////////////////////
		//////////////////////////////////////////////////////////////////////////
			
			cell_1: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("    (i) Balance of fines fund in hand at the Deginning of the year", Font9));
				cell = new PdfPCell(para_2);
				cell.setPaddingTop(5);
				cell.setPaddingBottom(10);
				cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
		
			cell_2: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("Rs.", Font9));
				cell = new PdfPCell(para_2);
				cell.setPaddingTop(5);
				cell.setPaddingBottom(10);
				cell.setPaddingRight(10);
				cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
		
		return table;
	}
	
	public static PdfPTable createTable114() throws DocumentException {
		PdfPTable table = new PdfPTable(2);

		table.setTotalWidth(550);
		table.setLockedWidth(true);
		table.setWidths(new float[]{6, 2});
		
		PdfPCell cell;
		
		////////////// EMPLOYEE DETAILS LINE 1 ////////////////////////////////////
		//////////////////////////////////////////////////////////////////////////
			
			cell_1: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("    (ii) Disbursement from fines fund :", Font9));
				cell = new PdfPCell(para_2);
				cell.setPaddingTop(5);
				cell.setPaddingBottom(10);
				cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
		
			cell_2: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("", Font9));
				cell = new PdfPCell(para_2);
				cell.setPaddingTop(5);
				cell.setPaddingBottom(10);
				cell.setPaddingRight(10);
				cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
		
		return table;
	}
	
	
	public static PdfPTable createTable115() throws DocumentException {
		PdfPTable table = new PdfPTable(2);

		table.setTotalWidth(550);
		table.setLockedWidth(true);
		table.setWidths(new float[]{1,1});
		
		PdfPCell cell;
		
		////////////// EMPLOYEE DETAILS LINE 1 ////////////////////////////////////
		//////////////////////////////////////////////////////////////////////////
			
			cell_1: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("Purpose", Font9));
				cell = new PdfPCell(para_2);
				cell.setPaddingTop(5);
				cell.setPaddingBottom(5);
				cell.setBorder(Rectangle.BOTTOM | Rectangle.TOP);
				cell.setHorizontalAlignment(Element.ALIGN_RIGHT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
		
		cell_2: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("Amount (Rs.)", Font9));
				cell = new PdfPCell(para_2);
				cell.setPaddingTop(5);
				cell.setPaddingBottom(5);
				cell.setBorder(Rectangle.BOTTOM | Rectangle.TOP);
				cell.setHorizontalAlignment(Element.ALIGN_RIGHT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
		
		return table;
	}
	
	public static PdfPTable createTable116() throws DocumentException {
		PdfPTable table = new PdfPTable(2);

		table.setTotalWidth(550);
		table.setLockedWidth(true);
		table.setWidths(new float[]{1, 1});
		
		PdfPCell cell;
		
		////////////// EMPLOYEE DETAILS LINE 1 ////////////////////////////////////
		//////////////////////////////////////////////////////////////////////////
			
			cell_1: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("(a)", Font9));
				cell = new PdfPCell(para_2);
				cell.setPaddingTop(5);
				cell.setPaddingBottom(10);
				cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
		
			cell_2: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("", Font9));
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
	
	public static PdfPTable createTable117() throws DocumentException {
		PdfPTable table = new PdfPTable(2);

		table.setTotalWidth(550);
		table.setLockedWidth(true);
		table.setWidths(new float[]{1, 1});
		
		PdfPCell cell;
		
		////////////// EMPLOYEE DETAILS LINE 1 ////////////////////////////////////
		//////////////////////////////////////////////////////////////////////////
			
			cell_1: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("(b)", Font9));
				cell = new PdfPCell(para_2);
				cell.setPaddingTop(5);
				cell.setPaddingBottom(10);
				cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
		
			cell_2: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("", Font9));
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
	
	public static PdfPTable createTable118() throws DocumentException {
		PdfPTable table = new PdfPTable(2);

		table.setTotalWidth(550);
		table.setLockedWidth(true);
		table.setWidths(new float[]{1, 1});
		
		PdfPCell cell;
		
		////////////// EMPLOYEE DETAILS LINE 1 ////////////////////////////////////
		//////////////////////////////////////////////////////////////////////////
			
			cell_1: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("(c)", Font9));
				cell = new PdfPCell(para_2);
				cell.setPaddingTop(5);
				cell.setPaddingBottom(10);
				cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
		
			cell_2: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("", Font9));
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
	
	public static PdfPTable createTable119() throws DocumentException {
		PdfPTable table = new PdfPTable(2);

		table.setTotalWidth(550);
		table.setLockedWidth(true);
		table.setWidths(new float[]{1, 1});
		
		PdfPCell cell;
		
		////////////// EMPLOYEE DETAILS LINE 1 ////////////////////////////////////
		//////////////////////////////////////////////////////////////////////////
			
			cell_1: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("(d)", Font9));
				cell = new PdfPCell(para_2);
				cell.setPaddingTop(5);
				cell.setPaddingBottom(10);
				cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
		
			cell_2: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("", Font9));
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
	
	public static PdfPTable createTable120() throws DocumentException {
		PdfPTable table = new PdfPTable(3);

		table.setTotalWidth(550);
		table.setLockedWidth(true);
		table.setWidths(new float[]{7, 1, 4});
		
		PdfPCell cell;
		
		////////////// EMPLOYEE DETAILS LINE 1 ////////////////////////////////////
		//////////////////////////////////////////////////////////////////////////
			
			cell_1: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("", Font9));
				cell = new PdfPCell(para_2);
				cell.setPaddingTop(5);
				cell.setPaddingBottom(10);
				cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
		
			cell_2: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("Total :", Font9));
				cell = new PdfPCell(para_2);
				cell.setPaddingTop(5);
				cell.setPaddingBottom(10);
				cell.setPaddingRight(10);
				cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
			
			cell_3: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("", Font9));
				cell = new PdfPCell(para_2);
				cell.setPaddingTop(5);
				cell.setPaddingBottom(10);
				cell.setPaddingRight(10);
				cell.setBorder(Rectangle.TOP);
				cell.setHorizontalAlignment(Element.ALIGN_RIGHT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
		
		return table;
	}
	
	public static PdfPTable createTable121() throws DocumentException {
		PdfPTable table = new PdfPTable(2);

		table.setTotalWidth(550);
		table.setLockedWidth(true);
		table.setWidths(new float[]{6, 2});
		
		PdfPCell cell;
		
		////////////// EMPLOYEE DETAILS LINE 1 ////////////////////////////////////
		//////////////////////////////////////////////////////////////////////////
			
			cell_1: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("    (iii) Balance of fines fund in hand at the end of the year", Font9));
				cell = new PdfPCell(para_2);
				cell.setPaddingTop(5);
				cell.setPaddingBottom(10);
				cell.setBorder(Rectangle.TOP);
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
		
			cell_2: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("Rs.", Font9));
				cell = new PdfPCell(para_2);
				cell.setPaddingTop(5);
				cell.setPaddingBottom(10);
				cell.setPaddingRight(10);
				cell.setBorder(Rectangle.TOP);
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
		
		return table;
	}
	
	public static PdfPTable createTable122() throws DocumentException {
		PdfPTable table = new PdfPTable(2);

		table.setTotalWidth(550);
		table.setLockedWidth(true);
		table.setWidths(new float[]{6, 2});
		
		PdfPCell cell;
		
		////////////// EMPLOYEE DETAILS LINE 1 ////////////////////////////////////
		//////////////////////////////////////////////////////////////////////////
			
			cell_1: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("", Font9));
				cell = new PdfPCell(para_2);
				cell.setPaddingTop(35);
				cell.setPaddingBottom(15);
				cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
		
			cell_2: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("Signature", Font9));
				cell = new PdfPCell(para_2);
				cell.setPaddingTop(35);
				cell.setPaddingBottom(15);
				cell.setPaddingRight(10);
				cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_RIGHT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
		
		return table;
	}
	
	public static PdfPTable createTable123() throws DocumentException {
		PdfPTable table = new PdfPTable(2);

		table.setTotalWidth(550);
		table.setLockedWidth(true);
		table.setWidths(new float[]{6, 2});
		
		PdfPCell cell;
		
		////////////// EMPLOYEE DETAILS LINE 1 ////////////////////////////////////
		//////////////////////////////////////////////////////////////////////////
			
			cell_1: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("", Font9));
				cell = new PdfPCell(para_2);
				cell.setPaddingTop(35);
				cell.setPaddingBottom(5);
				cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
		
			cell_2: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("Designation", Font9));
				cell = new PdfPCell(para_2);
				cell.setPaddingTop(5);
				cell.setPaddingBottom(5);
				cell.setPaddingRight(10);
				cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
		
		return table;
	}
	
	public static PdfPTable createTable124() throws DocumentException {
		PdfPTable table = new PdfPTable(1);

		table.setTotalWidth(550);
		table.setLockedWidth(true);
		table.setWidths(new float[]{1});
		
		PdfPCell cell;
		
		////////////// EMPLOYEE DETAILS LINE 1 ////////////////////////////////////
		//////////////////////////////////////////////////////////////////////////
			
			cell_1: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("Dated", Font9));
				cell = new PdfPCell(para_2);
				cell.setPaddingTop(0);
				cell.setPaddingBottom(10);
				cell.setBorder(Rectangle.BOTTOM);
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
		
		return table;
	}
	
	public static PdfPTable createTable125() throws DocumentException {
		PdfPTable table = new PdfPTable(1);

		table.setTotalWidth(550);
		table.setLockedWidth(true);
		table.setWidths(new float[]{1});
		
		PdfPCell cell;
		
		////////////// EMPLOYEE DETAILS LINE 1 ////////////////////////////////////
		//////////////////////////////////////////////////////////////////////////
			
			cell_1: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("*This is the aggregate number of attendances during the year.", Font9));
				cell = new PdfPCell(para_2);
				cell.setPaddingTop(5);
				cell.setPaddingBottom(5);
				cell.setPaddingLeft(25);
				cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
		
		return table;
	}
	
	public static PdfPTable createTable126() throws DocumentException {
		PdfPTable table = new PdfPTable(1);

		table.setTotalWidth(550);
		table.setLockedWidth(true);
		table.setWidths(new float[]{1});
		
		PdfPCell cell;
		
		////////////// EMPLOYEE DETAILS LINE 1 ////////////////////////////////////
		//////////////////////////////////////////////////////////////////////////
			
			cell_1: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("**The average daily number of persons employed during the year is obtained by dividing the aggregate number of attendances during the year by the number of working days.", Font9));
				cell = new PdfPCell(para_2);
				cell.setPaddingTop(5);
				cell.setPaddingBottom(5);
				cell.setPaddingLeft(25);
				cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
		
		return table;
	}
	
	public static PdfPTable createTable127() throws DocumentException {
		PdfPTable table = new PdfPTable(1);

		table.setTotalWidth(550);
		table.setLockedWidth(true);
		table.setWidths(new float[]{1});
		
		PdfPCell cell;
		
		////////////// EMPLOYEE DETAILS LINE 1 ////////////////////////////////////
		//////////////////////////////////////////////////////////////////////////
			
			cell_1: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("***The money value of concessions should be obtained by taking the difference or the price paid by the employer and the actual price paid by the employees for supply of essential commodities given free or at concessional rates.", Font9));
				cell = new PdfPCell(para_2);
				cell.setPaddingTop(5);
				cell.setPaddingBottom(5);
				cell.setPaddingLeft(25);
				cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
		
		return table;
	}
	
	public static PdfPTable createTable128() throws DocumentException {
		PdfPTable table = new PdfPTable(1);

		table.setTotalWidth(550);
		table.setLockedWidth(true);
		table.setWidths(new float[]{1});
		
		PdfPCell cell;
		
		////////////// EMPLOYEE DETAILS LINE 1 ////////////////////////////////////
		//////////////////////////////////////////////////////////////////////////
			
			cell_1: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("Note:   This retum should be sent to the Chief Inspector of Factories by 31st January of the succeeding year.", Font9));
				cell = new PdfPCell(para_2);
				cell.setPaddingTop(5);
				cell.setPaddingBottom(5);
				cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			
			}
		
		return table;
	}
	
}
