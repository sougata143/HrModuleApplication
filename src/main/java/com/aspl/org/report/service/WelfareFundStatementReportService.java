package com.aspl.org.report.service;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

public interface WelfareFundStatementReportService {


	Map<String, Object> getWelfareFundStatementReport(HttpServletRequest request, Integer welfarefundeportId);

}
