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

public class CrawleyWagesSheetReportGenerator {

	///////////////// GENERATED PDF PATH ///////////////// 
	///////////////////////////////////////////////////////////////////////////////////////////
	static Date date = new java.util.Date();

	static long time = date.getTime();

	static int randNum = (int) ((int) Math.random() + time);

	static String fileName = "crawley-wages-sheet-report";

	// public static final String RESULT = "D:/ABHIRUP/emcee_workspace/erpa-v2/src/main/webapp/WEB-INF/pdf/" + fileName + "_" + randNum + ".pdf";

	public static final String RESULT = "D:/ABHIRUP/emcee_workspace/erpa-v2/src/main/webapp/WEB-INF/crawley-report/"+ fileName + ".pdf";

	///////////////// HEADER CONSTANT ///////////////// 
	/////////////////////////////////////////////////////////////////////////////////////////////

	static String companyName = "CRAWLEY & RAY (FOUNDERS AND ENGINEERS) PRIVATE LTD.";
	static String reportName  = "WAGES SHEET FOR WEEK FROM 01-07-2019 TO 06-07-2019";

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

		PdfPTable listItems = createDescriptionTable();
		document.add(listItems);
		
		PdfPTable totalLine = createTotalLine();
		document.add(totalLine);*/

		document.close();

//		("Report Name : " + reportName + "\nPDF has been generated successfully in this path : \n" + RESULT);

	}

	public static PdfPTable createHeader1() throws DocumentException {
		PdfPTable table = new PdfPTable(1);

		table.setTotalWidth(800);
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

	public static PdfPTable createHeader2(String reportfromDate, String reporttoDate) throws DocumentException {
		PdfPTable table = new PdfPTable(1);

		table.setTotalWidth(800);
		table.setLockedWidth(true);
		table.setWidths(new float[] { 1 });

		PdfPCell cell_2;

		Paragraph para_1 = new Paragraph();
		para_1.add(new Chunk("WAGES SHEET FOR WEEK FROM " + reportfromDate + " TO " + reporttoDate, Font8Bold));
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
		PdfPTable dataTable = new PdfPTable(19);

		dataTable.setTotalWidth(800);
		dataTable.setLockedWidth(true);
		dataTable.setWidths(new float[] { 1, 2, 4, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2 });

		PdfPCell cell;

		////////////// WAGES DETAILS //////////////////////////////////////
		//////////////////////////////////////////////////////////////////

		cell_1: {

			Paragraph para_2 = new Paragraph();
			para_2.add(new Chunk("", Font7));
			cell = new PdfPCell(para_2);
			cell.setPadding(4);
			// cell.setBorder(Rectangle.NO_BORDER);
			cell.setHorizontalAlignment(Element.ALIGN_LEFT);
			cell.setVerticalAlignment(Element.ALIGN_CENTER);
			dataTable.addCell(cell);

		}

		cell_2: {

			Paragraph para_2 = new Paragraph();
			para_2.add(new Chunk("", Font7));
			cell = new PdfPCell(para_2);
			cell.setPadding(4);
			// cell.setBorder(Rectangle.NO_BORDER);
			cell.setHorizontalAlignment(Element.ALIGN_CENTER);
			cell.setVerticalAlignment(Element.ALIGN_CENTER);
			dataTable.addCell(cell);

		}

		cell_3: {

			Paragraph para_2 = new Paragraph();
			para_2.add(new Chunk("", Font7));
			cell = new PdfPCell(para_2);
			cell.setPadding(4);
			// cell.setBorder(Rectangle.NO_BORDER);
			cell.setHorizontalAlignment(Element.ALIGN_LEFT);
			cell.setVerticalAlignment(Element.ALIGN_CENTER);
			dataTable.addCell(cell);

		}

		cell_4: {

			Paragraph para_2 = new Paragraph();
			para_2.add(new Chunk("EARNING DETAILS", Font7Bold));
			cell = new PdfPCell(para_2);
			cell.setPadding(4);
			cell.setColspan(9);
			// cell.setBorder(Rectangle.NO_BORDER);
			cell.setHorizontalAlignment(Element.ALIGN_CENTER);
			cell.setVerticalAlignment(Element.ALIGN_CENTER);
			dataTable.addCell(cell);

		}

		cell_5: {

			Paragraph para_2 = new Paragraph();
			para_2.add(new Chunk("DEDUCTION DETAILS", Font7Bold));
			cell = new PdfPCell(para_2);
			cell.setPadding(4);
			cell.setColspan(6);
			// cell.setBorder(Rectangle.NO_BORDER);
			cell.setHorizontalAlignment(Element.ALIGN_CENTER);
			cell.setVerticalAlignment(Element.ALIGN_CENTER);
			dataTable.addCell(cell);

		}

		cell_6: {

			Paragraph para_2 = new Paragraph();
			para_2.add(new Chunk("", Font7));
			cell = new PdfPCell(para_2);
			cell.setPadding(4);
			// cell.setBorder(Rectangle.RIGHT);
			cell.setHorizontalAlignment(Element.ALIGN_CENTER);
			cell.setVerticalAlignment(Element.ALIGN_CENTER);
			dataTable.addCell(cell);

		}

		return dataTable;
	}
	
	public static PdfPTable createDescriptionTableHead2() throws DocumentException {
		PdfPTable dataTable = new PdfPTable(19);

		dataTable.setTotalWidth(800);
		dataTable.setLockedWidth(true);
		dataTable.setWidths(new float[] { 1, 2, 4, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2 });

		String[] headersLabels = { "SL NO", "ESI NO", "NAME", "TOTAL WORK DAYS", "H D", "L E V", "DAYS \nFOR \nPAY","RATE \nPER \nDAY", "NORMAL WAGES EARNED", "O.T. HOURS", "O.T. AMOUNT", "GROSS WAGES EARNED", "WAGES ADV","PF", "EMP \nPEN \nFUND", "ER SR PF", "FINE AMT", "TOTAL DEDUCT", "NET PAY" };

		for (int index = 0; index < headersLabels.length; index++) {

			PdfPCell cell;

			Paragraph headerParagraph = new Paragraph(headersLabels[index], Font7Bold);

			cell = new PdfPCell(headerParagraph);
			cell.setPadding(2);
			if (index == 2) {
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

	public static PdfPTable createDescriptionTable(int slno, String esino, String empname, String totalworkdays, String hd, String leaveday, String dayforpay, String rateperday, String normalwagesearned, Double oThrs, String oTamt, String grosswagesearned, String wagesAdvdeduction, String pfAmtdeduction, String empPenfunddeduction, String erSrpfdeduction, String fineAmtdeduction, String totalDeduction, String totalNetpay) throws DocumentException {
		PdfPTable dataTable = new PdfPTable(19);

		dataTable.setTotalWidth(800);
		dataTable.setLockedWidth(true);
		dataTable.setWidths(new float[] { 1, 2, 4, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2 });

		PdfPCell cell;

		////////////// PRODUCT DETAILS ////////////////////////////////////
		//////////////////////////////////////////////////////////////////

		//for (int i = 1; i <= 32; i++) {

		cell_1: {

			Paragraph para_2 = new Paragraph();
			para_2.add(new Chunk(slno + "", Font7Bold));
			cell = new PdfPCell(para_2);
			cell.setPadding(4);
			// cell.setBorder(Rectangle.NO_BORDER);
			cell.setHorizontalAlignment(Element.ALIGN_LEFT);
			cell.setVerticalAlignment(Element.ALIGN_CENTER);
			dataTable.addCell(cell);

		}

		cell_2: {

			Paragraph para_2 = new Paragraph();
			para_2.add(new Chunk(esino, Font7Bold));
			cell = new PdfPCell(para_2);
			cell.setPadding(4);
			// cell.setBorder(Rectangle.NO_BORDER);
			cell.setHorizontalAlignment(Element.ALIGN_CENTER);
			cell.setVerticalAlignment(Element.ALIGN_CENTER);
			dataTable.addCell(cell);

		}

		cell_3: {

			Paragraph para_2 = new Paragraph();
			para_2.add(new Chunk(empname, Font7Bold));
			cell = new PdfPCell(para_2);
			cell.setPadding(4);
			// cell.setBorder(Rectangle.NO_BORDER);
			cell.setHorizontalAlignment(Element.ALIGN_LEFT);
			cell.setVerticalAlignment(Element.ALIGN_CENTER);
			dataTable.addCell(cell);

		}

		cell_4: {

			Paragraph para_2 = new Paragraph();
			para_2.add(new Chunk(totalworkdays, Font7Bold));
			cell = new PdfPCell(para_2);
			cell.setPadding(4);
			// cell.setBorder(Rectangle.NO_BORDER);
			cell.setHorizontalAlignment(Element.ALIGN_CENTER);
			cell.setVerticalAlignment(Element.ALIGN_CENTER);
			dataTable.addCell(cell);

		}

		cell_5: {

			Paragraph para_2 = new Paragraph();
			para_2.add(new Chunk(hd, Font7Bold));
			cell = new PdfPCell(para_2);
			cell.setPadding(4);
			// cell.setBorder(Rectangle.NO_BORDER);
			cell.setHorizontalAlignment(Element.ALIGN_CENTER);
			cell.setVerticalAlignment(Element.ALIGN_CENTER);
			dataTable.addCell(cell);

		}

		cell_6: {

			Paragraph para_2 = new Paragraph();
			para_2.add(new Chunk(leaveday, Font7Bold));
			cell = new PdfPCell(para_2);
			cell.setPadding(4);
			// cell.setBorder(Rectangle.RIGHT);
			cell.setHorizontalAlignment(Element.ALIGN_CENTER);
			cell.setVerticalAlignment(Element.ALIGN_CENTER);
			dataTable.addCell(cell);

		}

		cell_7: {

			Paragraph para_2 = new Paragraph();
			para_2.add(new Chunk(dayforpay, Font7Bold));
			cell = new PdfPCell(para_2);
			cell.setPadding(4);
			// cell.setBorder(Rectangle.NO_BORDER);
			cell.setHorizontalAlignment(Element.ALIGN_CENTER);
			cell.setVerticalAlignment(Element.ALIGN_CENTER);
			dataTable.addCell(cell);

		}

		cell_8: {

			Paragraph para_2 = new Paragraph();
			para_2.add(new Chunk(rateperday, Font7Bold));
			cell = new PdfPCell(para_2);
			cell.setPadding(4);
			// cell.setBorder(Rectangle.NO_BORDER);
			cell.setHorizontalAlignment(Element.ALIGN_CENTER);
			cell.setVerticalAlignment(Element.ALIGN_CENTER);
			dataTable.addCell(cell);

		}

		cell_9: {

			Paragraph para_2 = new Paragraph();
			para_2.add(new Chunk(normalwagesearned, Font7Bold));
			cell = new PdfPCell(para_2);
			cell.setPadding(4);
			// cell.setBorder(Rectangle.NO_BORDER);
			cell.setHorizontalAlignment(Element.ALIGN_CENTER);
			cell.setVerticalAlignment(Element.ALIGN_CENTER);
			dataTable.addCell(cell);

		}

		cell_10: {

			Paragraph para_2 = new Paragraph();
			para_2.add(new Chunk(String.valueOf(oThrs), Font7Bold));
			cell = new PdfPCell(para_2);
			cell.setPadding(4);
			// cell.setBorder(Rectangle.NO_BORDER);
			cell.setHorizontalAlignment(Element.ALIGN_CENTER);
			cell.setVerticalAlignment(Element.ALIGN_CENTER);
			dataTable.addCell(cell);

		}

		cell_11: {

			Paragraph para_2 = new Paragraph();
			para_2.add(new Chunk(oTamt, Font7));
			cell = new PdfPCell(para_2);
			cell.setPadding(4);
			// cell.setBorder(Rectangle.NO_BORDER);
			cell.setHorizontalAlignment(Element.ALIGN_CENTER);
			cell.setVerticalAlignment(Element.ALIGN_CENTER);
			dataTable.addCell(cell);

		}

		cell_12: {

			Paragraph para_2 = new Paragraph();
			para_2.add(new Chunk(grosswagesearned, Font7));
			cell = new PdfPCell(para_2);
			cell.setPadding(4);
			// cell.setBorder(Rectangle.NO_BORDER);
			cell.setHorizontalAlignment(Element.ALIGN_CENTER);
			cell.setVerticalAlignment(Element.ALIGN_CENTER);
			dataTable.addCell(cell);

		}

		cell_13: {

			Paragraph para_2 = new Paragraph();
			para_2.add(new Chunk(wagesAdvdeduction, Font7Bold));
			cell = new PdfPCell(para_2);
			cell.setPadding(4);
			// cell.setBorder(Rectangle.NO_BORDER);
			cell.setHorizontalAlignment(Element.ALIGN_CENTER);
			cell.setVerticalAlignment(Element.ALIGN_CENTER);
			dataTable.addCell(cell);

		}

		cell_14: {

			Paragraph para_2 = new Paragraph();
			para_2.add(new Chunk(pfAmtdeduction, Font7Bold));
			cell = new PdfPCell(para_2);
			cell.setPadding(4);
			// cell.setBorder(Rectangle.NO_BORDER);
			cell.setHorizontalAlignment(Element.ALIGN_CENTER);
			cell.setVerticalAlignment(Element.ALIGN_CENTER);
			dataTable.addCell(cell);

		}

		cell_15: {

			Paragraph para_2 = new Paragraph();
			para_2.add(new Chunk(empPenfunddeduction, Font7Bold));
			cell = new PdfPCell(para_2);
			cell.setPadding(4);
			// cell.setBorder(Rectangle.NO_BORDER);
			cell.setHorizontalAlignment(Element.ALIGN_CENTER);
			cell.setVerticalAlignment(Element.ALIGN_CENTER);
			dataTable.addCell(cell);

		}

		cell_16: {

			Paragraph para_2 = new Paragraph();
			para_2.add(new Chunk(erSrpfdeduction, Font7Bold));
			cell = new PdfPCell(para_2);
			cell.setPadding(4);
			// cell.setBorder(Rectangle.NO_BORDER);
			cell.setHorizontalAlignment(Element.ALIGN_CENTER);
			cell.setVerticalAlignment(Element.ALIGN_CENTER);
			dataTable.addCell(cell);

		}

		cell_17: {

			Paragraph para_2 = new Paragraph();
			para_2.add(new Chunk(fineAmtdeduction, Font7Bold));
			cell = new PdfPCell(para_2);
			cell.setPadding(4);
			// cell.setBorder(Rectangle.NO_BORDER);
			cell.setHorizontalAlignment(Element.ALIGN_CENTER);
			cell.setVerticalAlignment(Element.ALIGN_CENTER);
			dataTable.addCell(cell);

		}

		cell_18: {

			Paragraph para_2 = new Paragraph();
			para_2.add(new Chunk(totalDeduction, Font7Bold));
			cell = new PdfPCell(para_2);
			cell.setPadding(4);
			// cell.setBorder(Rectangle.NO_BORDER);
			cell.setHorizontalAlignment(Element.ALIGN_CENTER);
			cell.setVerticalAlignment(Element.ALIGN_CENTER);
			dataTable.addCell(cell);

		}

		cell_19: {

			Paragraph para_2 = new Paragraph();
			para_2.add(new Chunk(totalNetpay, Font7Bold));
			cell = new PdfPCell(para_2);
			cell.setPadding(4);
			// cell.setBorder(Rectangle.NO_BORDER);
			cell.setHorizontalAlignment(Element.ALIGN_CENTER);
			cell.setVerticalAlignment(Element.ALIGN_CENTER);
			dataTable.addCell(cell);

		}

		//}

		return dataTable;
	}

	public static PdfPTable createCFTotalLine(String TotalworkdaysTotal, String HdTotal, String LeavedayTotal, String DayforpayTotal, String RateperdayTotal, String NormalwagesearnedTotal, Double OThrsTotal, String OTamtTotal, String GrosswagesearnedTotal, String WagesAdvdeductionTotal, String PfAmtdeductionTotal, String EmpPenfunddeductionTotal, String ErSrpfdeductionTotal, String FineAmtdeductionTotal, String TotalDeductionTotal, String TotalNetpayTotal) throws DocumentException {
		PdfPTable dataTable = new PdfPTable(19);

		dataTable.setTotalWidth(800);
		dataTable.setLockedWidth(true);
		dataTable.setWidths(new float[] { 1, 2, 4, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2 });

		PdfPCell cell;

		////////////// C/F LINE ////////////////////////////////////
		/////////////////////////////////////////////////////////////
		cell_1: {

			Paragraph para_2 = new Paragraph();
			para_2.add(new Chunk("C/F", Font8Bold));
			cell = new PdfPCell(para_2);
			cell.setPadding(4);
			cell.setColspan(3);
			// cell.setBorder(Rectangle.NO_BORDER);
			cell.setHorizontalAlignment(Element.ALIGN_LEFT);
			cell.setVerticalAlignment(Element.ALIGN_CENTER);
			dataTable.addCell(cell);

		}

		cell_2: {

			Paragraph para_2 = new Paragraph();
			para_2.add(new Chunk(TotalworkdaysTotal, Font8));
			cell = new PdfPCell(para_2);
			cell.setPadding(4);
			// cell.setBorder(Rectangle.NO_BORDER);
			cell.setHorizontalAlignment(Element.ALIGN_CENTER);
			cell.setVerticalAlignment(Element.ALIGN_CENTER);
			dataTable.addCell(cell);

		}

		cell_3: {

			Paragraph para_2 = new Paragraph();
			para_2.add(new Chunk(HdTotal, Font8));
			cell = new PdfPCell(para_2);
			cell.setPadding(4);
			// cell.setBorder(Rectangle.NO_BORDER);
			cell.setHorizontalAlignment(Element.ALIGN_LEFT);
			cell.setVerticalAlignment(Element.ALIGN_CENTER);
			dataTable.addCell(cell);

		}

		cell_4: {

			Paragraph para_2 = new Paragraph();
			para_2.add(new Chunk(LeavedayTotal, Font8));
			cell = new PdfPCell(para_2);
			cell.setPadding(4);
			// cell.setBorder(Rectangle.NO_BORDER);
			cell.setHorizontalAlignment(Element.ALIGN_CENTER);
			cell.setVerticalAlignment(Element.ALIGN_CENTER);
			dataTable.addCell(cell);

		}

		cell_5: {

			Paragraph para_2 = new Paragraph();
			para_2.add(new Chunk(DayforpayTotal, Font8));
			cell = new PdfPCell(para_2);
			cell.setPadding(4);
			// cell.setBorder(Rectangle.NO_BORDER);
			cell.setHorizontalAlignment(Element.ALIGN_CENTER);
			cell.setVerticalAlignment(Element.ALIGN_CENTER);
			dataTable.addCell(cell);

		}

		cell_6: {

			Paragraph para_2 = new Paragraph();
			para_2.add(new Chunk(RateperdayTotal, Font8));
			cell = new PdfPCell(para_2);
			cell.setPadding(4);
			// cell.setBorder(Rectangle.RIGHT);
			cell.setHorizontalAlignment(Element.ALIGN_CENTER);
			cell.setVerticalAlignment(Element.ALIGN_CENTER);
			dataTable.addCell(cell);

		}

		cell_7: {

			Paragraph para_2 = new Paragraph();
			para_2.add(new Chunk(NormalwagesearnedTotal, Font8));
			cell = new PdfPCell(para_2);
			cell.setPadding(4);
			// cell.setBorder(Rectangle.NO_BORDER);
			cell.setHorizontalAlignment(Element.ALIGN_CENTER);
			cell.setVerticalAlignment(Element.ALIGN_CENTER);
			dataTable.addCell(cell);

		}

		cell_8: {

			Paragraph para_2 = new Paragraph();
			para_2.add(new Chunk(String.valueOf(OThrsTotal), Font8));
			cell = new PdfPCell(para_2);
			cell.setPadding(4);
			// cell.setBorder(Rectangle.NO_BORDER);
			cell.setHorizontalAlignment(Element.ALIGN_CENTER);
			cell.setVerticalAlignment(Element.ALIGN_CENTER);
			dataTable.addCell(cell);

		}

		cell_9: {

			Paragraph para_2 = new Paragraph();
			para_2.add(new Chunk(OTamtTotal, Font8));
			cell = new PdfPCell(para_2);
			cell.setPadding(4);
			// cell.setBorder(Rectangle.NO_BORDER);
			cell.setHorizontalAlignment(Element.ALIGN_CENTER);
			cell.setVerticalAlignment(Element.ALIGN_CENTER);
			dataTable.addCell(cell);

		}

		cell_10: {

			Paragraph para_2 = new Paragraph();
			para_2.add(new Chunk(GrosswagesearnedTotal, Font8));
			cell = new PdfPCell(para_2);
			cell.setPadding(4);
			// cell.setBorder(Rectangle.NO_BORDER);
			cell.setHorizontalAlignment(Element.ALIGN_CENTER);
			cell.setVerticalAlignment(Element.ALIGN_CENTER);
			dataTable.addCell(cell);

		}

		cell_11: {

			Paragraph para_2 = new Paragraph();
			para_2.add(new Chunk(WagesAdvdeductionTotal, Font8));
			cell = new PdfPCell(para_2);
			cell.setPadding(4);
			// cell.setBorder(Rectangle.NO_BORDER);
			cell.setHorizontalAlignment(Element.ALIGN_CENTER);
			cell.setVerticalAlignment(Element.ALIGN_CENTER);
			dataTable.addCell(cell);

		}

		cell_12: {

			Paragraph para_2 = new Paragraph();
			para_2.add(new Chunk(PfAmtdeductionTotal, Font8));
			cell = new PdfPCell(para_2);
			cell.setPadding(4);
			// cell.setBorder(Rectangle.NO_BORDER);
			cell.setHorizontalAlignment(Element.ALIGN_CENTER);
			cell.setVerticalAlignment(Element.ALIGN_CENTER);
			dataTable.addCell(cell);

		}

		cell_13: {

			Paragraph para_2 = new Paragraph();
			para_2.add(new Chunk(EmpPenfunddeductionTotal, Font8));
			cell = new PdfPCell(para_2);
			cell.setPadding(4);
			// cell.setBorder(Rectangle.NO_BORDER);
			cell.setHorizontalAlignment(Element.ALIGN_CENTER);
			cell.setVerticalAlignment(Element.ALIGN_CENTER);
			dataTable.addCell(cell);

		}

		cell_14: {

			Paragraph para_2 = new Paragraph();
			para_2.add(new Chunk(ErSrpfdeductionTotal, Font8));
			cell = new PdfPCell(para_2);
			cell.setPadding(4);
			// cell.setBorder(Rectangle.NO_BORDER);
			cell.setHorizontalAlignment(Element.ALIGN_CENTER);
			cell.setVerticalAlignment(Element.ALIGN_CENTER);
			dataTable.addCell(cell);

		}

		cell_15: {

			Paragraph para_2 = new Paragraph();
			para_2.add(new Chunk(FineAmtdeductionTotal, Font8));
			cell = new PdfPCell(para_2);
			cell.setPadding(4);
			// cell.setBorder(Rectangle.NO_BORDER);
			cell.setHorizontalAlignment(Element.ALIGN_CENTER);
			cell.setVerticalAlignment(Element.ALIGN_CENTER);
			dataTable.addCell(cell);

		}

		cell_16: {

			Paragraph para_2 = new Paragraph();
			para_2.add(new Chunk(TotalDeductionTotal, Font8));
			cell = new PdfPCell(para_2);
			cell.setPadding(4);
			// cell.setBorder(Rectangle.NO_BORDER);
			cell.setHorizontalAlignment(Element.ALIGN_CENTER);
			cell.setVerticalAlignment(Element.ALIGN_CENTER);
			dataTable.addCell(cell);

		}

		cell_17: {

			Paragraph para_2 = new Paragraph();
			para_2.add(new Chunk(TotalNetpayTotal, Font8));
			cell = new PdfPCell(para_2);
			cell.setPadding(4);
			// cell.setBorder(Rectangle.NO_BORDER);
			cell.setHorizontalAlignment(Element.ALIGN_CENTER);
			cell.setVerticalAlignment(Element.ALIGN_CENTER);
			dataTable.addCell(cell);

		}

		return dataTable;
	}
	
	public static PdfPTable createBFTotalLine(String TotalworkdaysTotal, String HdTotal, String LeavedayTotal, String DayforpayTotal, String RateperdayTotal, String NormalwagesearnedTotal, Double OThrsTotal, String OTamtTotal, String GrosswagesearnedTotal, String WagesAdvdeductionTotal, String PfAmtdeductionTotal, String EmpPenfunddeductionTotal, String ErSrpfdeductionTotal, String FineAmtdeductionTotal, String TotalDeductionTotal, String TotalNetpayTotal) throws DocumentException {
		PdfPTable dataTable = new PdfPTable(19);

		dataTable.setTotalWidth(800);
		dataTable.setLockedWidth(true);
		dataTable.setWidths(new float[] { 1, 2, 4, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2 });

		PdfPCell cell;

		////////////// B/F LINE ////////////////////////////////////
		/////////////////////////////////////////////////////////////
		cell_1: {

			Paragraph para_2 = new Paragraph();
			para_2.add(new Chunk("B/F", Font8Bold));
			cell = new PdfPCell(para_2);
			cell.setPadding(4);
			cell.setColspan(3);
			// cell.setBorder(Rectangle.NO_BORDER);
			cell.setHorizontalAlignment(Element.ALIGN_LEFT);
			cell.setVerticalAlignment(Element.ALIGN_CENTER);
			dataTable.addCell(cell);

		}

		cell_2: {

			Paragraph para_2 = new Paragraph();
			para_2.add(new Chunk(TotalworkdaysTotal, Font8));
			cell = new PdfPCell(para_2);
			cell.setPadding(4);
			// cell.setBorder(Rectangle.NO_BORDER);
			cell.setHorizontalAlignment(Element.ALIGN_CENTER);
			cell.setVerticalAlignment(Element.ALIGN_CENTER);
			dataTable.addCell(cell);

		}

		cell_3: {

			Paragraph para_2 = new Paragraph();
			para_2.add(new Chunk(HdTotal, Font8));
			cell = new PdfPCell(para_2);
			cell.setPadding(4);
			// cell.setBorder(Rectangle.NO_BORDER);
			cell.setHorizontalAlignment(Element.ALIGN_LEFT);
			cell.setVerticalAlignment(Element.ALIGN_CENTER);
			dataTable.addCell(cell);

		}

		cell_4: {

			Paragraph para_2 = new Paragraph();
			para_2.add(new Chunk(LeavedayTotal, Font8));
			cell = new PdfPCell(para_2);
			cell.setPadding(4);
			// cell.setBorder(Rectangle.NO_BORDER);
			cell.setHorizontalAlignment(Element.ALIGN_CENTER);
			cell.setVerticalAlignment(Element.ALIGN_CENTER);
			dataTable.addCell(cell);

		}

		cell_5: {

			Paragraph para_2 = new Paragraph();
			para_2.add(new Chunk(DayforpayTotal, Font8));
			cell = new PdfPCell(para_2);
			cell.setPadding(4);
			// cell.setBorder(Rectangle.NO_BORDER);
			cell.setHorizontalAlignment(Element.ALIGN_CENTER);
			cell.setVerticalAlignment(Element.ALIGN_CENTER);
			dataTable.addCell(cell);

		}

		cell_6: {

			Paragraph para_2 = new Paragraph();
			para_2.add(new Chunk(RateperdayTotal, Font8));
			cell = new PdfPCell(para_2);
			cell.setPadding(4);
			// cell.setBorder(Rectangle.RIGHT);
			cell.setHorizontalAlignment(Element.ALIGN_CENTER);
			cell.setVerticalAlignment(Element.ALIGN_CENTER);
			dataTable.addCell(cell);

		}

		cell_7: {

			Paragraph para_2 = new Paragraph();
			para_2.add(new Chunk(NormalwagesearnedTotal, Font8));
			cell = new PdfPCell(para_2);
			cell.setPadding(4);
			// cell.setBorder(Rectangle.NO_BORDER);
			cell.setHorizontalAlignment(Element.ALIGN_CENTER);
			cell.setVerticalAlignment(Element.ALIGN_CENTER);
			dataTable.addCell(cell);

		}

		cell_8: {

			Paragraph para_2 = new Paragraph();
			para_2.add(new Chunk(String.valueOf(OThrsTotal), Font8));
			cell = new PdfPCell(para_2);
			cell.setPadding(4);
			// cell.setBorder(Rectangle.NO_BORDER);
			cell.setHorizontalAlignment(Element.ALIGN_CENTER);
			cell.setVerticalAlignment(Element.ALIGN_CENTER);
			dataTable.addCell(cell);

		}

		cell_9: {

			Paragraph para_2 = new Paragraph();
			para_2.add(new Chunk(OTamtTotal, Font8));
			cell = new PdfPCell(para_2);
			cell.setPadding(4);
			// cell.setBorder(Rectangle.NO_BORDER);
			cell.setHorizontalAlignment(Element.ALIGN_CENTER);
			cell.setVerticalAlignment(Element.ALIGN_CENTER);
			dataTable.addCell(cell);

		}

		cell_10: {

			Paragraph para_2 = new Paragraph();
			para_2.add(new Chunk(GrosswagesearnedTotal, Font8));
			cell = new PdfPCell(para_2);
			cell.setPadding(4);
			// cell.setBorder(Rectangle.NO_BORDER);
			cell.setHorizontalAlignment(Element.ALIGN_CENTER);
			cell.setVerticalAlignment(Element.ALIGN_CENTER);
			dataTable.addCell(cell);

		}

		cell_11: {

			Paragraph para_2 = new Paragraph();
			para_2.add(new Chunk(WagesAdvdeductionTotal, Font8));
			cell = new PdfPCell(para_2);
			cell.setPadding(4);
			// cell.setBorder(Rectangle.NO_BORDER);
			cell.setHorizontalAlignment(Element.ALIGN_CENTER);
			cell.setVerticalAlignment(Element.ALIGN_CENTER);
			dataTable.addCell(cell);

		}

		cell_12: {

			Paragraph para_2 = new Paragraph();
			para_2.add(new Chunk(PfAmtdeductionTotal, Font8));
			cell = new PdfPCell(para_2);
			cell.setPadding(4);
			// cell.setBorder(Rectangle.NO_BORDER);
			cell.setHorizontalAlignment(Element.ALIGN_CENTER);
			cell.setVerticalAlignment(Element.ALIGN_CENTER);
			dataTable.addCell(cell);

		}

		cell_13: {

			Paragraph para_2 = new Paragraph();
			para_2.add(new Chunk(EmpPenfunddeductionTotal, Font8));
			cell = new PdfPCell(para_2);
			cell.setPadding(4);
			// cell.setBorder(Rectangle.NO_BORDER);
			cell.setHorizontalAlignment(Element.ALIGN_CENTER);
			cell.setVerticalAlignment(Element.ALIGN_CENTER);
			dataTable.addCell(cell);

		}

		cell_14: {

			Paragraph para_2 = new Paragraph();
			para_2.add(new Chunk(ErSrpfdeductionTotal, Font8));
			cell = new PdfPCell(para_2);
			cell.setPadding(4);
			// cell.setBorder(Rectangle.NO_BORDER);
			cell.setHorizontalAlignment(Element.ALIGN_CENTER);
			cell.setVerticalAlignment(Element.ALIGN_CENTER);
			dataTable.addCell(cell);

		}

		cell_15: {

			Paragraph para_2 = new Paragraph();
			para_2.add(new Chunk(FineAmtdeductionTotal, Font8));
			cell = new PdfPCell(para_2);
			cell.setPadding(4);
			// cell.setBorder(Rectangle.NO_BORDER);
			cell.setHorizontalAlignment(Element.ALIGN_CENTER);
			cell.setVerticalAlignment(Element.ALIGN_CENTER);
			dataTable.addCell(cell);

		}

		cell_16: {

			Paragraph para_2 = new Paragraph();
			para_2.add(new Chunk(TotalDeductionTotal, Font8));
			cell = new PdfPCell(para_2);
			cell.setPadding(4);
			// cell.setBorder(Rectangle.NO_BORDER);
			cell.setHorizontalAlignment(Element.ALIGN_CENTER);
			cell.setVerticalAlignment(Element.ALIGN_CENTER);
			dataTable.addCell(cell);

		}

		cell_17: {

			Paragraph para_2 = new Paragraph();
			para_2.add(new Chunk(TotalNetpayTotal, Font8));
			cell = new PdfPCell(para_2);
			cell.setPadding(4);
			// cell.setBorder(Rectangle.NO_BORDER);
			cell.setHorizontalAlignment(Element.ALIGN_CENTER);
			cell.setVerticalAlignment(Element.ALIGN_CENTER);
			dataTable.addCell(cell);

		}

		return dataTable;
	}
	
	public static PdfPTable createTotalLine(String TotalworkdaysTotal, String HdTotal, String LeavedayTotal, String DayforpayTotal, String RateperdayTotal, String NormalwagesearnedTotal, Double OThrsTotal, String OTamtTotal, String GrosswagesearnedTotal, String WagesAdvdeductionTotal, String PfAmtdeductionTotal, String EmpPenfunddeductionTotal, String ErSrpfdeductionTotal, String FineAmtdeductionTotal, String TotalDeductionTotal, String TotalNetpayTotal) throws DocumentException {
		PdfPTable dataTable = new PdfPTable(19);

		dataTable.setTotalWidth(800);
		dataTable.setLockedWidth(true);
		dataTable.setWidths(new float[] { 1, 2, 4, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2 });

		PdfPCell cell;

		////////////// TOTAL LINE ////////////////////////////////////
		/////////////////////////////////////////////////////////////
		cell_1: {

			Paragraph para_2 = new Paragraph();
			para_2.add(new Chunk("TOTAL", Font8Bold));
			cell = new PdfPCell(para_2);
			cell.setPadding(4);
			cell.setColspan(3);
			// cell.setBorder(Rectangle.NO_BORDER);
			cell.setHorizontalAlignment(Element.ALIGN_LEFT);
			cell.setVerticalAlignment(Element.ALIGN_CENTER);
			dataTable.addCell(cell);

		}

		cell_2: {

			Paragraph para_2 = new Paragraph();
			para_2.add(new Chunk(TotalworkdaysTotal, Font8));
			cell = new PdfPCell(para_2);
			cell.setPadding(4);
			// cell.setBorder(Rectangle.NO_BORDER);
			cell.setHorizontalAlignment(Element.ALIGN_CENTER);
			cell.setVerticalAlignment(Element.ALIGN_CENTER);
			dataTable.addCell(cell);

		}

		cell_3: {

			Paragraph para_2 = new Paragraph();
			para_2.add(new Chunk(HdTotal, Font8));
			cell = new PdfPCell(para_2);
			cell.setPadding(4);
			// cell.setBorder(Rectangle.NO_BORDER);
			cell.setHorizontalAlignment(Element.ALIGN_LEFT);
			cell.setVerticalAlignment(Element.ALIGN_CENTER);
			dataTable.addCell(cell);

		}

		cell_4: {

			Paragraph para_2 = new Paragraph();
			para_2.add(new Chunk(LeavedayTotal, Font8));
			cell = new PdfPCell(para_2);
			cell.setPadding(4);
			// cell.setBorder(Rectangle.NO_BORDER);
			cell.setHorizontalAlignment(Element.ALIGN_CENTER);
			cell.setVerticalAlignment(Element.ALIGN_CENTER);
			dataTable.addCell(cell);

		}

		cell_5: {

			Paragraph para_2 = new Paragraph();
			para_2.add(new Chunk(DayforpayTotal, Font8));
			cell = new PdfPCell(para_2);
			cell.setPadding(4);
			// cell.setBorder(Rectangle.NO_BORDER);
			cell.setHorizontalAlignment(Element.ALIGN_CENTER);
			cell.setVerticalAlignment(Element.ALIGN_CENTER);
			dataTable.addCell(cell);

		}

		cell_6: {

			Paragraph para_2 = new Paragraph();
			para_2.add(new Chunk(RateperdayTotal, Font8));
			cell = new PdfPCell(para_2);
			cell.setPadding(4);
			// cell.setBorder(Rectangle.RIGHT);
			cell.setHorizontalAlignment(Element.ALIGN_CENTER);
			cell.setVerticalAlignment(Element.ALIGN_CENTER);
			dataTable.addCell(cell);

		}

		cell_7: {

			Paragraph para_2 = new Paragraph();
			para_2.add(new Chunk(NormalwagesearnedTotal, Font8));
			cell = new PdfPCell(para_2);
			cell.setPadding(4);
			// cell.setBorder(Rectangle.NO_BORDER);
			cell.setHorizontalAlignment(Element.ALIGN_CENTER);
			cell.setVerticalAlignment(Element.ALIGN_CENTER);
			dataTable.addCell(cell);

		}

		cell_8: {

			Paragraph para_2 = new Paragraph();
			para_2.add(new Chunk(String.valueOf(OThrsTotal), Font8));
			cell = new PdfPCell(para_2);
			cell.setPadding(4);
			// cell.setBorder(Rectangle.NO_BORDER);
			cell.setHorizontalAlignment(Element.ALIGN_CENTER);
			cell.setVerticalAlignment(Element.ALIGN_CENTER);
			dataTable.addCell(cell);

		}

		cell_9: {

			Paragraph para_2 = new Paragraph();
			para_2.add(new Chunk(OTamtTotal, Font8));
			cell = new PdfPCell(para_2);
			cell.setPadding(4);
			// cell.setBorder(Rectangle.NO_BORDER);
			cell.setHorizontalAlignment(Element.ALIGN_CENTER);
			cell.setVerticalAlignment(Element.ALIGN_CENTER);
			dataTable.addCell(cell);

		}

		cell_10: {

			Paragraph para_2 = new Paragraph();
			para_2.add(new Chunk(GrosswagesearnedTotal, Font8));
			cell = new PdfPCell(para_2);
			cell.setPadding(4);
			// cell.setBorder(Rectangle.NO_BORDER);
			cell.setHorizontalAlignment(Element.ALIGN_CENTER);
			cell.setVerticalAlignment(Element.ALIGN_CENTER);
			dataTable.addCell(cell);

		}

		cell_11: {

			Paragraph para_2 = new Paragraph();
			para_2.add(new Chunk(WagesAdvdeductionTotal, Font8));
			cell = new PdfPCell(para_2);
			cell.setPadding(4);
			// cell.setBorder(Rectangle.NO_BORDER);
			cell.setHorizontalAlignment(Element.ALIGN_CENTER);
			cell.setVerticalAlignment(Element.ALIGN_CENTER);
			dataTable.addCell(cell);

		}

		cell_12: {

			Paragraph para_2 = new Paragraph();
			para_2.add(new Chunk(PfAmtdeductionTotal, Font8));
			cell = new PdfPCell(para_2);
			cell.setPadding(4);
			// cell.setBorder(Rectangle.NO_BORDER);
			cell.setHorizontalAlignment(Element.ALIGN_CENTER);
			cell.setVerticalAlignment(Element.ALIGN_CENTER);
			dataTable.addCell(cell);

		}

		cell_13: {

			Paragraph para_2 = new Paragraph();
			para_2.add(new Chunk(EmpPenfunddeductionTotal, Font8));
			cell = new PdfPCell(para_2);
			cell.setPadding(4);
			// cell.setBorder(Rectangle.NO_BORDER);
			cell.setHorizontalAlignment(Element.ALIGN_CENTER);
			cell.setVerticalAlignment(Element.ALIGN_CENTER);
			dataTable.addCell(cell);

		}

		cell_14: {

			Paragraph para_2 = new Paragraph();
			para_2.add(new Chunk(ErSrpfdeductionTotal, Font8));
			cell = new PdfPCell(para_2);
			cell.setPadding(4);
			// cell.setBorder(Rectangle.NO_BORDER);
			cell.setHorizontalAlignment(Element.ALIGN_CENTER);
			cell.setVerticalAlignment(Element.ALIGN_CENTER);
			dataTable.addCell(cell);

		}

		cell_15: {

			Paragraph para_2 = new Paragraph();
			para_2.add(new Chunk(FineAmtdeductionTotal, Font8));
			cell = new PdfPCell(para_2);
			cell.setPadding(4);
			// cell.setBorder(Rectangle.NO_BORDER);
			cell.setHorizontalAlignment(Element.ALIGN_CENTER);
			cell.setVerticalAlignment(Element.ALIGN_CENTER);
			dataTable.addCell(cell);

		}

		cell_16: {

			Paragraph para_2 = new Paragraph();
			para_2.add(new Chunk(TotalDeductionTotal, Font8));
			cell = new PdfPCell(para_2);
			cell.setPadding(4);
			// cell.setBorder(Rectangle.NO_BORDER);
			cell.setHorizontalAlignment(Element.ALIGN_CENTER);
			cell.setVerticalAlignment(Element.ALIGN_CENTER);
			dataTable.addCell(cell);

		}

		cell_17: {

			Paragraph para_2 = new Paragraph();
			para_2.add(new Chunk(TotalNetpayTotal, Font8));
			cell = new PdfPCell(para_2);
			cell.setPadding(4);
			// cell.setBorder(Rectangle.NO_BORDER);
			cell.setHorizontalAlignment(Element.ALIGN_CENTER);
			cell.setVerticalAlignment(Element.ALIGN_CENTER);
			dataTable.addCell(cell);

		}

		return dataTable;
	}

}
