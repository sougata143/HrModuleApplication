package com.aspl.org.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.aspl.org.entity.HolidayMaster;



@Repository
public interface HolidayMasterRepo extends JpaRepository<HolidayMaster, Integer>{

//HolidayMaster getByholidayid(Integer holidayid);
//HolidayMaster getOne(Integer Holidayid);
List<HolidayMaster> findAll();
 

@Query("SELECT u FROM HolidayMaster u WHERE  MONTH(u.holidaystardate) = ?1")
List<HolidayMaster> findByholidaystartdate(Integer monthInt);

@Query(value="SELECT * FROM crawley.holidaymaster  where holidaystardate >=?1 and holidayenddate <=?2 " , nativeQuery = true)
		List<HolidayMaster> getallHolidaydatebetween( String fromDate, String toDate);

}
