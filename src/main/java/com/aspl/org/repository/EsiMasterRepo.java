package com.aspl.org.repository;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.aspl.org.entity.Esientry;

@Repository
public interface EsiMasterRepo extends JpaRepository<Esientry, Integer>{

	Esientry findByempCode(String empCode);
	List<Esientry> findByesiNo(String esiNo);
	
	@Query("SELECT u FROM Esientry u WHERE u.empCode = ?1 and MONTH(u.voucherDate) = ?2")
	List<Esientry> findByempCode(String empcode, Integer monthInt);
}
