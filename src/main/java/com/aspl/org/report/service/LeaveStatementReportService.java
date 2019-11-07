package com.aspl.org.report.service;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

public interface LeaveStatementReportService {

	Map<String, Object> getLeaveStatementReport(HttpServletRequest request, String currYear);

}
