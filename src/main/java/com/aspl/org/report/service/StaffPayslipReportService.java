package com.aspl.org.report.service;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

public interface StaffPayslipReportService {

	Map<String, Object> getStaffPayslipReport(HttpServletRequest request, String Foremployee, String fromDate,
			String toDate);

}
