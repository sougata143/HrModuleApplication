package com.aspl.org.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.aspl.org.entity.AttendaceGenerator;
import com.aspl.org.repository.AttendaceGeneratorRepo;
import com.aspl.org.service.AttendanceGeneratorService;


@Service
@Transactional
public class AttendanceGeneratorServiceImpl implements AttendanceGeneratorService{

	
	@Autowired AttendaceGeneratorRepo attendaceGeneratorRepo;
	
	@Override
	public AttendaceGenerator getAttendaceGenerator(Integer attendacegeneretorID) {
		return null;
	}

	@Override
	public AttendaceGenerator AttendaceGeneratorsave(AttendaceGenerator attendaceGenerator) {

		return attendaceGeneratorRepo.save(attendaceGenerator);
	}

	@Override
	public List<AttendaceGenerator> AttendaceGeneratorbydateempcode(String emp_code,  Date from_date, Date to_date) {
		return attendaceGeneratorRepo.AttendaceGeneratorbydateempcode( emp_code,from_date, to_date);
	}

	@Override
	public List<AttendaceGenerator> getalldetailsAttendaceGeneratar() {
		return attendaceGeneratorRepo.findAll();
	}
	
	@Override
	public AttendaceGenerator AttendaceGeneratorupdate(AttendaceGenerator attendaceGenerator) {
		
		attendaceGenerator.setAttendaceinDatetime(attendaceGenerator.getAttendaceinDatetime());
		attendaceGenerator.setAttendaceoutDatetime(attendaceGenerator.getAttendaceoutDatetime());
		attendaceGenerator.setEmp_code(attendaceGenerator.getEmp_code());
		attendaceGenerator.setEmployeeType(attendaceGenerator.getEmployeeType());
		attendaceGenerator.setTotal_absent_day(attendaceGenerator.getTotal_absent_day());
		attendaceGenerator.setTotal_absent_hrs(attendaceGenerator.getTotal_absent_hrs());
		attendaceGenerator.setTotal_ot_hrs(attendaceGenerator.getTotal_ot_hrs());
		attendaceGenerator.setTotal_working_day(attendaceGenerator.getTotal_working_day());
		attendaceGenerator.setTotal_working_hrs(attendaceGenerator.getTotal_working_hrs());
		
		
		
		
		return attendaceGeneratorRepo.save(attendaceGenerator);
	}

}
