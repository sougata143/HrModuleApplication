package com.aspl.org.service.impl;

import java.util.List;


import com.aspl.org.dto.WagessheetforWorkersDTO;

public interface WagessheetforworkerService {

	//List<WagessheetforWorkersDTO> getPrintwagessheetreportforworker(String fromDate, String toDate);

	List<WagessheetforWorkersDTO> getPrintwagessheetreportforworker(String foremployee, String fromDate, String toDate);

}
