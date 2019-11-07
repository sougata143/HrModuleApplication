package com.aspl.org.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.aspl.org.entity.ShiftMaster;

@Repository
public interface ShiftMasterRepo extends JpaRepository<ShiftMaster, Integer>{

	ShiftMaster findByshiftName(String shiftName);
}
