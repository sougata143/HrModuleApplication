package com.aspl.org.repository;



import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


import com.aspl.org.entity.AttendaceGenerator;




@Repository
public interface AttendaceGeneratorRepo extends JpaRepository<AttendaceGenerator, Integer>{


	List<AttendaceGenerator> findByattendacegeneretorID(Integer attendacegeneretorID);
	
	//List<AttendaceGenerator> findByVoucherDateBetween(Date fromDate , Date toDate);
	
	@Query(value="select * from attendacegenerator l where l.emp_code=?1 and l.attendacein_datetime between ?2 and ?3 " , nativeQuery = true)
	List<AttendaceGenerator> AttendaceGeneratorbydateempcode(String emp_code, Date from_date, Date to_date);
}
