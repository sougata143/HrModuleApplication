package com.aspl.org.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


import com.aspl.org.entity.LeaveMaster;


@Repository
public interface LeaveMasterRepo extends JpaRepository<LeaveMaster, Integer>{

	List<LeaveMaster> findByleavetype(String leavetype);
	List<LeaveMaster> findByempcode(String empcode);
	
	//List<LeaveMaster> findByempcodelist(Integer empcode); empcodelist
	
	@Query(value="select * from leavemaster l where l.empcode=:empcode and l.leavetype=:leaveType" , nativeQuery = true)
	LeaveMaster findByempcodeandtype(@Param("empcode")String empcode, @Param("leaveType") String leaveType);
	
	
	List<LeaveMaster> findByEffectenddate(Date effectEndDate);
	List<LeaveMaster> findByEffectenddateBetween(Date startDate, Date endDate);
	List<LeaveMaster> findByEffectenddateBetweenAndEmpcode(Date startDate, Date endDate, String empcode);
	
}
