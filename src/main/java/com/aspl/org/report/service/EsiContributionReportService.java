package com.aspl.org.report.service;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

public interface EsiContributionReportService {

	//Map<String, Object> getEsiContributionReport(HttpServletRequest request, String month);

	Map<String, Object> getEsiContributionReport(HttpServletRequest request, String foremployee, String month);

}
