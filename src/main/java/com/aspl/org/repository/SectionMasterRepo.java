package com.aspl.org.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.aspl.org.entity.SectionMaster;

@Repository
public interface SectionMasterRepo extends JpaRepository<SectionMaster, Integer>{

	SectionMaster findBysectionName(String sectionName);
}
