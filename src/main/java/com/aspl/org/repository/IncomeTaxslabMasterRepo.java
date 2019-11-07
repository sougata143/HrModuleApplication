package com.aspl.org.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.aspl.org.entity.IncomeTaxslabMst;


@Repository
public interface IncomeTaxslabMasterRepo extends JpaRepository<IncomeTaxslabMst, Integer>{

	@Query(value="select * from incometaxslabmst l where :basic <=l.upperrange" , nativeQuery = true)
	IncomeTaxslabMst findByincomeminmaxamt(@Param("basic") Double basic);

}
