package com.aspl.org.report.service;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

public interface WagesSheetReportService {

	//Map<String, Object> getWagesSheetReport(HttpServletRequest request, String fromDate, String toDate);

	Map<String, Object> getWagesSheetReport(HttpServletRequest request, String foremployee, String fromDate,
			String toDate);

}
