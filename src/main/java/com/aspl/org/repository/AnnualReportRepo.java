package com.aspl.org.repository;




import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aspl.org.entity.AnnualReport;



@Repository
public interface AnnualReportRepo extends JpaRepository<AnnualReport, Integer>{
	
}
