package com.aspl.org.repository;




import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.aspl.org.entity.Payslip;
import com.aspl.org.entity.WelfareFundReport;



@Repository
public interface WelfareFundReportRepo extends JpaRepository<WelfareFundReport, Integer>{
	
	@Query(value= "SELECT * FROM payslip p where (p.payslip_month='June' or p.payslip_month='December') and year(p.pay_date) = year(now()) and p.employee_code= ?1 " , nativeQuery = true)
	List<Payslip> welfareFundReportReportListbymonthandpaydate(String employeeCode);
}
