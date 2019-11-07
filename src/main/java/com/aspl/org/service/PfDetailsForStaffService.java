package com.aspl.org.service;

import java.util.List;

import com.aspl.org.dto.PfReportForStaffDTO;
import com.aspl.org.dto.PfReportForWorkerDTO;

public interface PfDetailsForStaffService {

	List<PfReportForStaffDTO> getPrintPfdetailsforStaff(String fromDate, String toDate);

	List<PfReportForWorkerDTO> getPrintPfdetailsforWorker(String fromDate, String toDate);

}
