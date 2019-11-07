package com.aspl.org.report.service;


import java.util.Map;

import javax.servlet.http.HttpServletRequest;


public interface PFDetailsForWorkerReportService {

	Map<String, Object> getPFDetailsReportforworker(HttpServletRequest request, String fromDate, String toDate);

}
