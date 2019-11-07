package com.aspl.org.report.service;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

public interface LeaveApplicationReportService {

	Map<String, Object> getLeaveApplicationReport(HttpServletRequest request, String fromDate, String toDate);

}
