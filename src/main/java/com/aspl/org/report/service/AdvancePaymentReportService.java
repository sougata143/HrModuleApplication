package com.aspl.org.report.service;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

public interface AdvancePaymentReportService {

	Map<String, Object> getAdvancePaymentReport(HttpServletRequest request, String fromDate, String toDate);

}
