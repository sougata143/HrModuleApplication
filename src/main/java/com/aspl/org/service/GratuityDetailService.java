package com.aspl.org.service;
import java.util.List;

import com.aspl.org.dto.GratuityDetailsDTO;

public interface GratuityDetailService {

	List<GratuityDetailsDTO> getGratuityDetailReport(String month);

	
}
