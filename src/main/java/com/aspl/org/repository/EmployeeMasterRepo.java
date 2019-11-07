package com.aspl.org.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aspl.org.entity.EmployeeMaster;


@Repository
public interface EmployeeMasterRepo extends JpaRepository<EmployeeMaster, Integer>{

	EmployeeMaster findByidcardno(String idcardno);
	EmployeeMaster findByempid(Integer empid);
	//Optional<EmployeeMaster> findByempcodeoptional(Integer empcode);
	List<EmployeeMaster> findByempcode(String empcode);
	List<EmployeeMaster> findByDepartment(Integer department);
	//List<EmployeeMaster> findByempcode(Integer empcode, int month);
	List<EmployeeMaster> findByemptype(String emptype);
}
