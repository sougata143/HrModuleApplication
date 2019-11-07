package com.aspl.org.service;

import java.util.List;
import java.util.Optional;

import com.aspl.org.entity.HouseRentRecoveryEntry;

public interface HouseRentService 
{

	HouseRentRecoveryEntry houserentsave(HouseRentRecoveryEntry houseRentstatus);
	HouseRentRecoveryEntry getByhouserentID(Integer houserentID);
	List<HouseRentRecoveryEntry> getallHouseRentRecoveryEntry();
	
	Optional<HouseRentRecoveryEntry> findByempCode(String empCode);
	
	HouseRentRecoveryEntry findByempCodeandhouseRentstatus(String empCode, String houseRentstatus);
	//HouseRentRecoveryEntry findByempCodeandhouseRentstatus(String empCode, String houseRentstatus);
	//Optional<HouseRentRecoveryEntry> findByempCode(String empCode);
}
