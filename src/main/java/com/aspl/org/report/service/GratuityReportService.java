package com.aspl.org.report.service;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

public interface GratuityReportService {

	Map<String, Object> getGratuityReport(HttpServletRequest request, String month);

}
