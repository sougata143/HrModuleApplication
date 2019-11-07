package com.aspl.org.report.service;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

public interface OverTimeReportPDFService {

	Map<String, Object> getOverTimeDetailsReport(HttpServletRequest request, String fromDate, String toDate);

	
	
}
