package com.aspl.org.report.service;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

public interface OvertimeDeptWiseReportService {

	Map<String, Object> OvertimeDeptWiseReport(HttpServletRequest request, String fromDate, String toDate);

}
