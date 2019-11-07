package com.aspl.org.service;



import java.util.Date;
import java.util.List;


import com.aspl.org.entity.AttendaceGenerator;




public interface AttendanceGeneratorService {

	
	AttendaceGenerator getAttendaceGenerator(Integer attendacegeneretorID);
	AttendaceGenerator AttendaceGeneratorsave(AttendaceGenerator attendaceGenerator);


	List<AttendaceGenerator> AttendaceGeneratorbydateempcode(String emp_code, Date from_date, Date to_date);

	List<AttendaceGenerator> getalldetailsAttendaceGeneratar();
	AttendaceGenerator AttendaceGeneratorupdate(AttendaceGenerator attendaceGenerator);
	//List<AttendaceGenerator> AttendaceGeneratorbydateempcode(String emp_code, Date from_date, Date to_date);
}
