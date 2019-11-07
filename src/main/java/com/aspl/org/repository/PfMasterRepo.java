package com.aspl.org.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aspl.org.entity.PfvoucherEntry;


@Repository
public interface PfMasterRepo extends JpaRepository<PfvoucherEntry, Integer>{

	PfvoucherEntry findByempcode(String empcode);
	PfvoucherEntry findBypfNo(String pfNo);
	PfvoucherEntry findByvoucherNo(String voucherNo);
}
