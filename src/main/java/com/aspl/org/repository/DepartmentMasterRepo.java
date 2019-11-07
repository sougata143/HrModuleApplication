package com.aspl.org.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aspl.org.entity.DepartmentMaster;

@Repository
public interface DepartmentMasterRepo extends JpaRepository<DepartmentMaster, Integer>{

	List<DepartmentMaster> findByDepartmentname(String departmentname);

	
}
