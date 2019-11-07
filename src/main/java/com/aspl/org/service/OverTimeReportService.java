package com.aspl.org.service;

import java.util.List;

import com.aspl.org.dto.OverTimeDTO;
import com.aspl.org.dto.OverTimeDepertmentWiseDTO;

public interface OverTimeReportService {

	List<OverTimeDTO> getOverTimedetails(String fromDate, String toDate);

	List<OverTimeDepertmentWiseDTO> getOverTimedetailsdepartmentwise(String fromDate, String toDate);

	//List<OverTimeDepertmentWiseDTO> getOverTimedetailsdepartmentwise(String fromDate, String toDate);

}
