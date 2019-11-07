package com.aspl.org.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.aspl.org.entity.ProffesionalTaxslabMst;


@Repository
public interface ProffesionalTaxslabMasterRepo extends JpaRepository<ProffesionalTaxslabMst, Integer>{

	
	@Query(value="select * from professionaltaxslabmst l where :basic  between l.lowerrange and l.upperrange" , nativeQuery = true)
	ProffesionalTaxslabMst findByproffesionalminmaxamt(@Param("basic") Double basic);

}
