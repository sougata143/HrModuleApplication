package com.aspl.org.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aspl.org.entity.DesignationMaster;

@Repository
public interface DesignationMasterRepo extends JpaRepository<DesignationMaster, Integer>{

	DesignationMaster getDesignationMasterByDesignation(String designation);
}
