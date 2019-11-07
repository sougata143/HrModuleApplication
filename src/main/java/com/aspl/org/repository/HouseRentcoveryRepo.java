package com.aspl.org.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


import com.aspl.org.entity.HouseRentRecoveryEntry;

@Repository
public interface HouseRentcoveryRepo extends JpaRepository<HouseRentRecoveryEntry, Integer>{

	@Query(value = "select * from houserentrecoveryentry as h where h.emp_code=?1 and h.house_rentstatus=?2" , nativeQuery = true)
	HouseRentRecoveryEntry getHouseRentRecoverybyempcodeandstatus(String empCode , String houseRentstatus);
	
	
	Optional<HouseRentRecoveryEntry> findByempCode(String empCode);
}
