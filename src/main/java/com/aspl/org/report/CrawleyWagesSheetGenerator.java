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

public class CrawleyWagesSheetGenerator {

	///////////////// GENERATED PDF PATH ///////////////////////////////////////////////////////////////////////////////////////////
	static Date date = new java.util.Date();
	
	static long time = date.getTime();
	
	static int randNum = (int) ((int) Math.random() + time);
	
	static String fileName = "crawley-wages-sheet";
	
	//public static final String RESULT = "C:/emcee-workspace/erpa-v2/src/main/webapp/WEB-INF/pdf/" + fileName + "_" + randNum + ".pdf";
	
	public static final String RESULT = "D:/ABHIRUP/emcee_workspace/erpa-v2/src/main/webapp/WEB-INF/crawley-report/" + fileName + ".pdf";

	//////////////// HEADER CONSTANT /////////////////////////////////////////////////////////////////////////////////////////////
	
	static String companyName 			= "CRAWLEY & RAY (FOUNDERS AND ENGINEERS) PRIVATE LTD.";
	static String reportName 		   	= "WORKER WAGES SHEET FOR WEEK FROM 08/07/2019 TO 13/07/2019";
	static String netPayAmount 			= "2220.51";
	static String netPayAmountInWords   = "TWO THOUSAND TWO HUNDRED TWENTY AND FIFTY ONE PAISE";
	static String paymentDate 			= "30-06-2019";

	///////////////// END OF HEADER CONSTANT //////////////////////////////////////////////////////////////////////////////////////

	///////////////// REQUIRED FONTS //////////////////////////////////////////////////////////////////////////////////////////////
	private static Font Font5 = new Font(Font.FontFamily.HELVETICA, 5, Font.NORMAL);
	private static Font Font5Bold = new Font(Font.FontFamily.HELVETICA, 5, Font.BOLD);
	private static Font Font6 = new Font(Font.FontFamily.HELVETICA, 6, Font.NORMAL);
	private static Font Font6Bold = new Font(Font.FontFamily.HELVETICA, 6, Font.BOLD);
	private static Font Font7 = new Font(Font.FontFamily.HELVETICA, 7, Font.NORMAL);
	private static Font Font7Bold = new Font(Font.FontFamily.HELVETICA, 7, Font.BOLD);
	private static Font Font7BoldItalic = new Font(Font.FontFamily.HELVETICA, 7, Font.BOLDITALIC);
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
		document.setMargins(20, 10, 20, 10);

		PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream(RESULT));

		writer.setPdfVersion(PdfWriter.VERSION_1_7);

		document.open();
		
		/*PdfPTable header1 = createHeader1();
		document.add(header1);
		
		PdfPTable header2 = createHeader2();
		document.add(header2);

		/////////////////////// CREATE BLANK LINE ///////////////////////
		////////////////////////////////////////////////////////////////

		PdfPTable blankLine1 = createBlankLine();
		document.add(blankLine1);

		//////////////////// EMPLOYEE DETAILS TABLE ////////////////////
		///////////////////////////////////////////////////////////////
		
		PdfPTable employeeDetailsLine1 = createEmployeeDetailsLine1();
		document.add(employeeDetailsLine1);
		
		PdfPTable employeeDetailsLine2 = createEmployeeDetailsLine2();
		document.add(employeeDetailsLine2);
		
		PdfPTable employeeDetailsLine3 = createEmployeeDetailsLine3();
		document.add(employeeDetailsLine3);
		
		PdfPTable employeeDetailsLine4 = createEmployeeDetailsLine4();
		document.add(employeeDetailsLine4);
		
		PdfPTable employeeDetailsLine5 = createEmployeeDetailsLine5();
		document.add(employeeDetailsLine5);
		
		PdfPTable employeeDetailsLine6 = createEmployeeDetailsLine6();
		document.add(employeeDetailsLine6);
		
		PdfPTable employeeDetailsLine7 = createEmployeeDetailsLine7();
		document.add(employeeDetailsLine7);
		
		PdfPTable employeeDetailsLine8 = createEmployeeDetailsLine8();
		document.add(employeeDetailsLine8);
		
		/////////////////////// CREATE BLANK LINE ///////////////////////
		////////////////////////////////////////////////////////////////
		
		PdfPTable blankLine2 = createBlankLine();
		document.add(blankLine2);
		
		////////////////// EARNINGS & DEDUCTIONS TABLE //////////////////
		/////////////////////////////////////////////////////////////////
		
		PdfPTable earningTableHead = createEarningTableHead();
		document.add(earningTableHead);
		
		PdfPTable earningDetailsLine1 = createEarningDetailsLine1();
		document.add(earningDetailsLine1);
		
		PdfPTable earningDetailsLine2 = createEarningDetailsLine2();
		document.add(earningDetailsLine2);
		
		PdfPTable earningDetailsLine3 = createEarningDetailsLine3();
		document.add(earningDetailsLine3);
		
		/*PdfPTable earningDetailsLine4 = createEarningDetailsLine4();
		document.add(earningDetailsLine4);
		
		PdfPTable earningDetailsLine5 = createEarningDetailsLine5();
		document.add(earningDetailsLine5);
		
		PdfPTable earningDetailsLine6 = createEarningDetailsLine6();
		document.add(earningDetailsLine6);
		
		PdfPTable earningDetailsLine7 = createEarningDetailsLine7();
		document.add(earningDetailsLine7);
		
		PdfPTable earningDetailsLine8 = createEarningDetailsLine8();
		document.add(earningDetailsLine8);
		
		PdfPTable earningDetailsLine9 = createEarningDetailsLine9();
		document.add(earningDetailsLine9);
		
		PdfPTable grossEarningDetailsLine = createGrossEarningDetailsLine();
		document.add(grossEarningDetailsLine);
		
		PdfPTable netPayAmtLine = createNetPayAmtLine();
		document.add(netPayAmtLine);
		
		PdfPTable netPayamtInWordsLine = createNetPayamtInWordsLine();
		document.add(netPayamtInWordsLine);
		
		PdfPTable paymentDateLine = createPaymentDateLine();
		document.add(paymentDateLine);*/
		
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
		para_1.setSpacingBefore(50);
		para_1.setSpacingAfter(50);
		
		cell_1 = new PdfPCell(para_1);
		cell_1.setPadding(6);
		//cell_1.setBorder(Rectangle.NO_BORDER);
		cell_1.setHorizontalAlignment(Element.ALIGN_CENTER);
		cell_1.setVerticalAlignment(Element.ALIGN_CENTER);
		table.addCell(cell_1);
		
		return table;
	}
	
	public static PdfPTable createHeader2(String fromDate, String toDate, String payslipMonth, Integer payslipYear) throws DocumentException {
		PdfPTable table = new PdfPTable(1);

		table.setTotalWidth(550);
		table.setLockedWidth(true);
		table.setWidths(new float[]{1});
		
		PdfPCell cell_2;
		
		Paragraph para_1 = new Paragraph();
		para_1.add(new Chunk("WORKER WAGES SHEET FOR WEEK FROM " + fromDate + " TO " + toDate, Font8Bold));
		para_1.add(Chunk.NEWLINE);
		para_1.setSpacingBefore(50);
		para_1.setSpacingAfter(50);
		
		cell_2 = new PdfPCell(para_1);
		cell_2.setPadding(4);
		//cell_2.setBorder(Rectangle.NO_BORDER);
		cell_2.setHorizontalAlignment(Element.ALIGN_CENTER);
		cell_2.setVerticalAlignment(Element.ALIGN_CENTER);
		table.addCell(cell_2);
		
		return table;
	}
	
	public static PdfPTable createEmployeeDetailsLine1(Integer slNo, String empname) throws DocumentException {
		PdfPTable dataTable = new PdfPTable(4);

		dataTable.setTotalWidth(550);
		dataTable.setLockedWidth(true);
		dataTable.setWidths(new float[]{1, 1, 1, 1});
		
		PdfPCell cell;
		
		////////////// EMPLOYEE DETAILS LINE 1 ////////////////////////////////////
		//////////////////////////////////////////////////////////////////////////
			
			cell_1: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("SL NO", Font7Bold));
				cell = new PdfPCell(para_2);
				cell.setPadding(4);
				//cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				dataTable.addCell(cell);
			
			}
			
			cell_2: {
			
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk(slNo.toString(), Font7));
				cell = new PdfPCell(para_2);
				cell.setPadding(4);
				//cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_CENTER);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				dataTable.addCell(cell);
			
			}
			
			cell_3: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("Name", Font7Bold));
				cell = new PdfPCell(para_2);
				cell.setPadding(4);
				//cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				dataTable.addCell(cell);
			
			}
			
			cell_4: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk(empname, Font7));
				cell = new PdfPCell(para_2);
				cell.setPadding(4);
				//cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_CENTER);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				dataTable.addCell(cell);
			
			}

		return dataTable;
	}
	
	
	public static PdfPTable createEmployeeDetailsLine2(String employeeCode, String bankName) throws DocumentException {
		PdfPTable dataTable = new PdfPTable(4);

		dataTable.setTotalWidth(550);
		dataTable.setLockedWidth(true);
		dataTable.setWidths(new float[]{1, 1, 1, 1});
		
		PdfPCell cell;
		
		////////////// EMPLOYEE DETAILS LINE 2 ////////////////////////////////////
		//////////////////////////////////////////////////////////////////////////
			
			cell_1: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("Employee ID", Font7Bold));
				cell = new PdfPCell(para_2);
				cell.setPadding(4);
				//cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				dataTable.addCell(cell);
			
			}
			
			cell_2: {
			
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk(employeeCode.toString(), Font7));
				cell = new PdfPCell(para_2);
				cell.setPadding(4);
				//cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_CENTER);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				dataTable.addCell(cell);
			
			}
			
			cell_3: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("Bank", Font7Bold));
				cell = new PdfPCell(para_2);
				cell.setPadding(4);
				//cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				dataTable.addCell(cell);
			
			}
			
			cell_4: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk(bankName, Font7));
				cell = new PdfPCell(para_2);
				cell.setPadding(4);
				//cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_CENTER);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				dataTable.addCell(cell);
			
			}

		return dataTable;
	}
	
	
	public static PdfPTable createEmployeeDetailsLine3(String pfNo, String bankAcNo) throws DocumentException {
		PdfPTable dataTable = new PdfPTable(4);

		dataTable.setTotalWidth(550);
		dataTable.setLockedWidth(true);
		dataTable.setWidths(new float[]{1, 1, 1, 1});
		
		PdfPCell cell;
		
		////////////// EMPLOYEE DETAILS LINE 3 ////////////////////////////////////
		//////////////////////////////////////////////////////////////////////////
			
			cell_1: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("PF No.", Font7Bold));
				cell = new PdfPCell(para_2);
				cell.setPadding(4);
				//cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				dataTable.addCell(cell);
			
			}
			
			cell_2: {
			
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk(pfNo.toString(), Font7));
				cell = new PdfPCell(para_2);
				cell.setPadding(4);
				//cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_CENTER);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				dataTable.addCell(cell);
			
			}
			
			cell_3: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("Bank A/c No.", Font7Bold));
				cell = new PdfPCell(para_2);
				cell.setPadding(4);
				//cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				dataTable.addCell(cell);
			
			}
			
			cell_4: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk(bankAcNo, Font7));
				cell = new PdfPCell(para_2);
				cell.setPadding(4);
				//cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_CENTER);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				dataTable.addCell(cell);
			
			}

		return dataTable;
	}
	
	
	public static PdfPTable createEmployeeDetailsLine4(String dateofjoining, String esiNo) throws DocumentException {
		PdfPTable dataTable = new PdfPTable(4);

		dataTable.setTotalWidth(550);
		dataTable.setLockedWidth(true);
		dataTable.setWidths(new float[]{1, 1, 1, 1});
		
		PdfPCell cell;
		
		////////////// EMPLOYEE DETAILS LINE 4 ////////////////////////////////////
		//////////////////////////////////////////////////////////////////////////
			
			cell_1: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("DOJ", Font7Bold));
				cell = new PdfPCell(para_2);
				cell.setPadding(4);
				//cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				dataTable.addCell(cell);
			
			}
			
			cell_2: {
			
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk(String.valueOf(dateofjoining), Font7));
				cell = new PdfPCell(para_2);
				cell.setPadding(4);
				//cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_CENTER);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				dataTable.addCell(cell);
			
			}
			
			cell_3: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("ESI No.", Font7Bold));
				cell = new PdfPCell(para_2);
				cell.setPadding(4);
				//cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				dataTable.addCell(cell);
			
			}
			
			cell_4: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk(esiNo, Font7));
				cell = new PdfPCell(para_2);
				cell.setPadding(4);
				//cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_CENTER);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				dataTable.addCell(cell);
			
			}

		return dataTable;
	}
	
	
	public static PdfPTable createEmployeeDetailsLine5(Integer holiday, String empLocation) throws DocumentException {
		PdfPTable dataTable = new PdfPTable(4);

		dataTable.setTotalWidth(550);
		dataTable.setLockedWidth(true);
		dataTable.setWidths(new float[]{1, 1, 1, 1});
		
		PdfPCell cell;
		
		////////////// EMPLOYEE DETAILS LINE 5 ////////////////////////////////////
		//////////////////////////////////////////////////////////////////////////
			
			cell_1: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("Holiday", Font7Bold));
				cell = new PdfPCell(para_2);
				cell.setPadding(4);
				//cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				dataTable.addCell(cell);
			
			}
			
			cell_2: {
			
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk(holiday.toString(), Font7));
				cell = new PdfPCell(para_2);
				cell.setPadding(4);
				//cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_CENTER);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				dataTable.addCell(cell);
			
			}
			
			cell_3: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("Location", Font7Bold));
				cell = new PdfPCell(para_2);
				cell.setPadding(4);
				//cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				dataTable.addCell(cell);
			
			}
			
			cell_4: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk(empLocation, Font7));
				cell = new PdfPCell(para_2);
				cell.setPadding(4);
				//cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_CENTER);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				dataTable.addCell(cell);
			
			}

		return dataTable;
	}
	
	
	public static PdfPTable createEmployeeDetailsLine6(Integer total_working_day, Integer totalleave) throws DocumentException {
		PdfPTable dataTable = new PdfPTable(4);

		dataTable.setTotalWidth(550);
		dataTable.setLockedWidth(true);
		dataTable.setWidths(new float[]{1, 1, 1, 1});
		
		PdfPCell cell;
		
		////////////// EMPLOYEE DETAILS LINE 6 ////////////////////////////////////
		//////////////////////////////////////////////////////////////////////////
			
			cell_1: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("Total Work Days", Font7Bold));
				cell = new PdfPCell(para_2);
				cell.setPadding(4);
				//cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				dataTable.addCell(cell);
			
			}
			
			cell_2: {
			
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk(total_working_day.toString(), Font7));
				cell = new PdfPCell(para_2);
				cell.setPadding(4);
				//cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_CENTER);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				dataTable.addCell(cell);
			
			}
			
			cell_3: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("Leave", Font7Bold));
				cell = new PdfPCell(para_2);
				cell.setPadding(4);
				//cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				dataTable.addCell(cell);
			
			}
			
			cell_4: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk(totalleave.toString(), Font7));
				cell = new PdfPCell(para_2);
				cell.setPadding(4);
				//cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_CENTER);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				dataTable.addCell(cell);
			
			}

		return dataTable;
	}
	
	public static PdfPTable createEmployeeDetailsLine7(Double otHrs, Integer days_for_pay) throws DocumentException {
		PdfPTable dataTable = new PdfPTable(4);

		dataTable.setTotalWidth(550);
		dataTable.setLockedWidth(true);
		dataTable.setWidths(new float[]{1, 1, 1, 1});
		
		PdfPCell cell;
		
		////////////// EMPLOYEE DETAILS LINE 7 ////////////////////////////////////
		//////////////////////////////////////////////////////////////////////////
			
			cell_1: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("OT Hours", Font7Bold));
				cell = new PdfPCell(para_2);
				cell.setPadding(4);
				//cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				dataTable.addCell(cell);
			
			}
			
			cell_2: {
			
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk(String.valueOf(otHrs), Font7));
				cell = new PdfPCell(para_2);
				cell.setPadding(4);
				//cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_CENTER);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				dataTable.addCell(cell);
			
			}
			
			cell_3: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("Days for Pay", Font7Bold));
				cell = new PdfPCell(para_2);
				cell.setPadding(4);
				//cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				dataTable.addCell(cell);
			
			}
			
			cell_4: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk(days_for_pay.toString(), Font7));
				cell = new PdfPCell(para_2);
				cell.setPadding(4);
				//cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_CENTER);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				dataTable.addCell(cell);
			
			}

		return dataTable;
	}
	
	public static PdfPTable createEmployeeDetailsLine8(String dept, String designation) throws DocumentException {
		PdfPTable dataTable = new PdfPTable(4);

		dataTable.setTotalWidth(550);
		dataTable.setLockedWidth(true);
		dataTable.setWidths(new float[]{1, 1, 1, 1});
		
		PdfPCell cell;
		
		////////////// EMPLOYEE DETAILS LINE 8 ////////////////////////////////////
		//////////////////////////////////////////////////////////////////////////
			
			cell_1: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("Department", Font7Bold));
				cell = new PdfPCell(para_2);
				cell.setPadding(4);
				//cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				dataTable.addCell(cell);
			
			}
			
			cell_2: {
			
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk(dept, Font7));
				cell = new PdfPCell(para_2);
				cell.setPadding(4);
				//cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_CENTER);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				dataTable.addCell(cell);
			
			}
			
			cell_3: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("Designation", Font7Bold));
				cell = new PdfPCell(para_2);
				cell.setPadding(4);
				//cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				dataTable.addCell(cell);
			
			}
			
			cell_4: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk(designation, Font7));
				cell = new PdfPCell(para_2);
				cell.setPadding(4);
				//cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_CENTER);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				dataTable.addCell(cell);
			
			}

		return dataTable;
	}
	
	///////////////////////////// CREATE BLANK LINE ////////////////////////////////////
	///////////////////////////////////////////////////////////////////////////////////
	
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
		cell_1.setPadding(6);
		cell_1.setBorder(Rectangle.NO_BORDER);
		cell_1.setHorizontalAlignment(Element.ALIGN_CENTER);
		cell_1.setVerticalAlignment(Element.ALIGN_CENTER);
		table.addCell(cell_1);
		
		return table;
	}
	
	////////////////////////////// EARNINGS & DEDUCTIONS //////////////////////////////
	//////////////////////////////////////////////////////////////////////////////////
	
	public static PdfPTable createEarningTableHead() throws DocumentException {
		PdfPTable dataTable = new PdfPTable(4);

		dataTable.setTotalWidth(550);
		dataTable.setLockedWidth(true);
		dataTable.setWidths(new float[]{1, 1, 1, 1});
		
		String[] headersLabels = {"EARNINGS","AMT IN RS.","DEDUCTIONS","AMT IN RS."};
		
		for (int index = 0; index < headersLabels.length ; index++) {
			
    		PdfPCell cell;
			
			Paragraph headerParagraph = new Paragraph(headersLabels[index], Font7Bold);
			
			cell = new PdfPCell(headerParagraph);
			cell.setPadding(4);
			if(index == 0 || index == 2) {
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
			}
			else{
				cell.setHorizontalAlignment(Element.ALIGN_RIGHT);
			}
			cell.setVerticalAlignment(Element.ALIGN_CENTER);
			
			dataTable.addCell(cell);
			
		}

		return dataTable;
	}
	
	public static PdfPTable createEarningDetailsLine1(Double basicsalary, Double salaryAdv) throws DocumentException {
		PdfPTable dataTable = new PdfPTable(4);

		dataTable.setTotalWidth(550);
		dataTable.setLockedWidth(true);
		dataTable.setWidths(new float[]{1, 1, 1, 1});
		
		PdfPCell cell;
		
		////////////// EARNING DETAILS LINE 1 ////////////////////////////////////
		//////////////////////////////////////////////////////////////////////////
			
			cell_1: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("Rate Per Day", Font7Bold));
				cell = new PdfPCell(para_2);
				cell.setPadding(4);
				//cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				dataTable.addCell(cell);
			
			}
			
			cell_2: {
			
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk(String.valueOf(basicsalary), Font7));
				cell = new PdfPCell(para_2);
				cell.setPadding(4);
				//cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_RIGHT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				dataTable.addCell(cell);
			
			}
			
			cell_3: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("Salary Adv.", Font7Bold));
				cell = new PdfPCell(para_2);
				cell.setPadding(4);
				//cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				dataTable.addCell(cell);
			
			}
			
			cell_4: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk(String.valueOf(salaryAdv), Font7));
				cell = new PdfPCell(para_2);
				cell.setPadding(4);
				//cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_RIGHT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				dataTable.addCell(cell);
			
			}

		return dataTable;
	}
	
	public static PdfPTable createEarningDetailsLine2(Double normalwagesearned, Double pfcontribution) throws DocumentException {
		PdfPTable dataTable = new PdfPTable(4);

		dataTable.setTotalWidth(550);
		dataTable.setLockedWidth(true);
		dataTable.setWidths(new float[]{1, 1, 1, 1});
		
		PdfPCell cell;
		
		////////////// EARNING DETAILS LINE 2 ////////////////////////////////////
		//////////////////////////////////////////////////////////////////////////
			
			cell_1: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("Normal Wages Earned", Font7Bold));
				cell = new PdfPCell(para_2);
				cell.setPadding(4);
				//cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				dataTable.addCell(cell);
			
			}
			
			cell_2: {
			
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk(String.valueOf(normalwagesearned), Font7));
				cell = new PdfPCell(para_2);
				cell.setPadding(4);
				//cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_RIGHT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				dataTable.addCell(cell);
			
			}
			
			cell_3: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("PF Cont.", Font7Bold));
				cell = new PdfPCell(para_2);
				cell.setPadding(4);
				//cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				dataTable.addCell(cell);
			
			}
			
			cell_4: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk(String.valueOf(pfcontribution), Font7));
				cell = new PdfPCell(para_2);
				cell.setPadding(4);
				//cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_RIGHT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				dataTable.addCell(cell);
			
			}

		return dataTable;
	}
	
	public static PdfPTable createEarningDetailsLine3(Double otamount , Double fineAmt ) throws DocumentException {
		PdfPTable dataTable = new PdfPTable(4);

		dataTable.setTotalWidth(550);
		dataTable.setLockedWidth(true);
		dataTable.setWidths(new float[]{1, 1, 1, 1});
		
		PdfPCell cell;
		
		////////////// EARNING DETAILS LINE 3 ////////////////////////////////////
		//////////////////////////////////////////////////////////////////////////
			
			cell_1: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("OT Amount", Font7Bold));
				cell = new PdfPCell(para_2);
				cell.setPadding(4);
				//cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				dataTable.addCell(cell);
			
			}
			
			cell_2: {
			
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk(String.valueOf(otamount), Font7));
				cell = new PdfPCell(para_2);
				cell.setPadding(4);
				//cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_RIGHT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				dataTable.addCell(cell);
			
			}
			
			cell_3: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("Fine Amount", Font7Bold));
				cell = new PdfPCell(para_2);
				cell.setPadding(4);
				//cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				dataTable.addCell(cell);
			
			}
			
			cell_4: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk(String.valueOf(fineAmt), Font7));
				cell = new PdfPCell(para_2);
				cell.setPadding(4);
				//cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_RIGHT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				dataTable.addCell(cell);
			
			}

		return dataTable;
	}
	
	public static PdfPTable createEarningDetailsLine4() throws DocumentException {
		PdfPTable dataTable = new PdfPTable(4);

		dataTable.setTotalWidth(550);
		dataTable.setLockedWidth(true);
		dataTable.setWidths(new float[]{1, 1, 1, 1});
		
		PdfPCell cell;
		
		////////////// EARNING DETAILS LINE 4 ////////////////////////////////////
		//////////////////////////////////////////////////////////////////////////
			
			cell_1: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("", Font7Bold));
				cell = new PdfPCell(para_2);
				cell.setPadding(4);
				//cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				dataTable.addCell(cell);
			
			}
			
			cell_2: {
			
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("", Font7));
				cell = new PdfPCell(para_2);
				cell.setPadding(4);
				//cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_RIGHT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				dataTable.addCell(cell);
			
			}
			
			cell_3: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("", Font7Bold));
				cell = new PdfPCell(para_2);
				cell.setPadding(4);
				//cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				dataTable.addCell(cell);
			
			}
			
			cell_4: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("", Font7));
				cell = new PdfPCell(para_2);
				cell.setPadding(4);
				//cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_RIGHT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				dataTable.addCell(cell);
			
			}

		return dataTable;
	}
	
	public static PdfPTable createGrossEarningDetailsLine(Double grossearning, Double grossdeduction) throws DocumentException {
		PdfPTable dataTable = new PdfPTable(4);

		dataTable.setTotalWidth(550);
		dataTable.setLockedWidth(true);
		dataTable.setWidths(new float[]{1, 1, 1, 1});
		
		PdfPCell cell;
		
		////////////// GROSS EARNING DETAILS LINE ////////////////////////////////////
		///////////////////////////////////////////////////////////////////...///////
			
			cell_1: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("GROSS EARNING", Font7Bold));
				cell = new PdfPCell(para_2);
				cell.setPadding(4);
				//cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				dataTable.addCell(cell);
			
			}
			
			cell_2: {
			
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk(String.valueOf(grossearning), Font7Bold));
				cell = new PdfPCell(para_2);
				cell.setPadding(4);
				//cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_RIGHT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				dataTable.addCell(cell);
			
			}
			
			cell_3: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk("GROSS DEDUCTION", Font7Bold));
				cell = new PdfPCell(para_2);
				cell.setPadding(4);
				//cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				dataTable.addCell(cell);
			
			}
			
			cell_4: {
				
				Paragraph para_2 = new Paragraph();
				para_2.add(new Chunk(String.valueOf(grossdeduction), Font7Bold));
				cell = new PdfPCell(para_2);
				cell.setPadding(4);
				//cell.setBorder(Rectangle.NO_BORDER);
				cell.setHorizontalAlignment(Element.ALIGN_RIGHT);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				dataTable.addCell(cell);
			
			}

		return dataTable;
	}
	
	public static PdfPTable createNetPayAmtLine(Double netamt) throws DocumentException {
		PdfPTable table = new PdfPTable(2);

		table.setTotalWidth(550);
		table.setLockedWidth(true);
		table.setWidths(new float[]{1, 3});
		
		PdfPCell cell_1;
		
		cell_1:{
			Paragraph para_1 = new Paragraph();
			para_1.add(new Chunk("NET AMT: ", Font8Bold));
			/*para_1.add(Chunk.NEWLINE);
			para_1.setSpacingBefore(50);
			para_1.setSpacingAfter(50);*/
			
			cell_1 = new PdfPCell(para_1);
			cell_1.setPadding(6);
			//cell_1.setBorder(Rectangle.NO_BORDER);
			cell_1.setHorizontalAlignment(Element.ALIGN_LEFT);
			cell_1.setVerticalAlignment(Element.ALIGN_CENTER);
			table.addCell(cell_1);
		}
		
		cell_2:{
			Paragraph para_1 = new Paragraph();
			para_1.add(new Chunk(String.valueOf(netamt), Font8Bold));
			/*para_1.add(Chunk.NEWLINE);
			para_1.setSpacingBefore(50);
			para_1.setSpacingAfter(50);*/
			
			cell_1 = new PdfPCell(para_1);
			cell_1.setPadding(6);
			//cell_1.setBorder(Rectangle.NO_BORDER);
			cell_1.setHorizontalAlignment(Element.ALIGN_LEFT);
			cell_1.setVerticalAlignment(Element.ALIGN_CENTER);
			table.addCell(cell_1);
		}
		
		return table;
	}
	
	public static PdfPTable createNetPayamtInWordsLine(String amountinwords) throws DocumentException {
		PdfPTable table = new PdfPTable(2);

		table.setTotalWidth(550);
		table.setLockedWidth(true);
		table.setWidths(new float[]{1, 3});
		
		PdfPCell cell_1;
		
		cell_1:{
			Paragraph para_1 = new Paragraph();
			para_1.add(new Chunk("Amt in words : ", Font7BoldItalic));
			/*para_1.add(Chunk.NEWLINE);
			para_1.setSpacingBefore(50);
			para_1.setSpacingAfter(50);*/
			
			cell_1 = new PdfPCell(para_1);
			cell_1.setPadding(6);
			//cell_1.setBorder(Rectangle.NO_BORDER);
			cell_1.setHorizontalAlignment(Element.ALIGN_LEFT);
			cell_1.setVerticalAlignment(Element.ALIGN_CENTER);
			table.addCell(cell_1);
		}
		
		cell_2:{
			Paragraph para_1 = new Paragraph();
			para_1.add(new Chunk("" + amountinwords + " ONLY", Font7BoldItalic));
			/*para_1.add(Chunk.NEWLINE);
			para_1.setSpacingBefore(50);
			para_1.setSpacingAfter(50);*/
			
			cell_1 = new PdfPCell(para_1);
			cell_1.setPadding(6);
			//cell_1.setBorder(Rectangle.NO_BORDER);
			cell_1.setHorizontalAlignment(Element.ALIGN_LEFT);
			cell_1.setVerticalAlignment(Element.ALIGN_CENTER);
			table.addCell(cell_1);
		}
		
		return table;
	}
	
	public static PdfPTable createPaymentDateLine(String payDate) throws DocumentException {
		PdfPTable table = new PdfPTable(2);

		table.setTotalWidth(550);
		table.setLockedWidth(true);
		table.setWidths(new float[]{1, 3});
		
		PdfPCell cell_1;
		
		cell_1:{
			Paragraph para_1 = new Paragraph();
			para_1.add(new Chunk("Payment Date : ", Font8));
			/*para_1.add(Chunk.NEWLINE);
			para_1.setSpacingBefore(50);
			para_1.setSpacingAfter(50);*/
			
			cell_1 = new PdfPCell(para_1);
			cell_1.setPadding(6);
			//cell_1.setBorder(Rectangle.NO_BORDER);
			cell_1.setHorizontalAlignment(Element.ALIGN_LEFT);
			cell_1.setVerticalAlignment(Element.ALIGN_CENTER);
			table.addCell(cell_1);
		}
		
		cell_2:{
			Paragraph para_1 = new Paragraph();
			para_1.add(new Chunk("" + payDate, Font8));
			/*para_1.add(Chunk.NEWLINE);
			para_1.setSpacingBefore(50);
			para_1.setSpacingAfter(50);*/
			
			cell_1 = new PdfPCell(para_1);
			cell_1.setPadding(6);
			//cell_1.setBorder(Rectangle.NO_BORDER);
			cell_1.setHorizontalAlignment(Element.ALIGN_LEFT);
			cell_1.setVerticalAlignment(Element.ALIGN_CENTER);
			table.addCell(cell_1);
		}
		
		
		return table;
	}
		
}
