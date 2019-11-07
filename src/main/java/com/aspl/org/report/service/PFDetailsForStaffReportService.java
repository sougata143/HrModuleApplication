package com.aspl.org.report.service;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

public interface PFDetailsForStaffReportService {

	Map<String, Object> getPFDetailsReport(HttpServletRequest request, String fromDate, String toDate);

}
