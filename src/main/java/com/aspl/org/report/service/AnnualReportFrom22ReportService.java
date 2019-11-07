package com.aspl.org.report.service;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

public interface AnnualReportFrom22ReportService {



	Map<String, Object> getAnnualReportFrom22Report(HttpServletRequest request, Integer reportId);

}
