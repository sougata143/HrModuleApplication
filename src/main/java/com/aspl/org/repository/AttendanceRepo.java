package com.aspl.org.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.aspl.org.entity.Attendance;


@Repository
public interface AttendanceRepo extends JpaRepository<Attendance, Integer>{


	@Query(value="select * from attendace l where l.employee_type= ?1 and l.from_date= ?2 and l.to_date= ?3 " , nativeQuery = true)
	List<Attendance> Attendancebydateempcode(String employeeType, Date from_date, Date to_date);
	
	
	
	@Query(value="SELECT * FROM crawley.attendace where from_date >=?1 and to_date <=?2 and (employee_type='Worker' or employee_type='Staff')"  , nativeQuery = true)
	List<Attendance> Attendancebydatebetween(Date from_date, Date to_date);
	
	List<Attendance> findByFromDateBetweenAndToDateBetween(Date from_dateStart, Date from_dateEnd, Date to_dateStart, Date to_dateEnd);
	
}
