package com.aspl.org.report.service;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

public interface WorkerHouseRentReportService {



	Map<String, Object> getWorkerHouseRentPayslipReport(HttpServletRequest request, String Foremployee, String fromDate,
			String toDate);
}
