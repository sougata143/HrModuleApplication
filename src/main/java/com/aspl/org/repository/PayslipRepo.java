package com.aspl.org.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.aspl.org.entity.Payslip;


@Repository
public interface PayslipRepo extends JpaRepository<Payslip, Integer>{

	@Query(value="select * from payslip p where p.from_date= ?1 and p.to_date= ?2 " , nativeQuery = true)
	List<Payslip> findByFromDateAndToDate(Date fromDate, Date toDate);
	
	
	List<Payslip> findByForemployeeAndFromDateGreaterThanEqualAndToDateLessThanEqual(String Foremployee, Date fromDate, Date toDate);

	List<Payslip> findBypayDateBetween(Date fromDate, Date toDate);
	
	List<Payslip> payslipMonth(String month);
	
	@Query(value="SELECT * FROM payslip where foremployee='Worker' and pay_date between ?1 and ?2 and to_date IS NOT NULL \r\n" + 
			"GROUP BY employee_code, to_date; " , nativeQuery = true)
	List<Payslip> findByFromDateAndToDateforworkerpfreport(Date fromDate, Date toDate);
	
	List<Payslip> findByPayDateBetweenAndForemployee(Date fromDate, Date toDate, String forEmployee);
	
	
	@Query(value="SELECT * FROM payslip where foremployee='Worker' and pay_date between ?1 and ?2 ; " , nativeQuery = true)
	List<Payslip> findByFromDateAndToDateforworkerpfreportcountemp(Date fromDate, Date toDate);

	List<Payslip> findBypayslipMonth(String payslipmonth);
	
	
	@Query(value="SELECT * FROM payslip where foremployee='Worker' and employee_code=?1 and pay_date between ?2 and ?3 ;" , nativeQuery = true)
	List<Payslip> findByFromDateAndToDateforworkerpfreportcountempEmpwise(String empcode, Date fromDate, Date toDate);
	
	List<Payslip> findByFromDateBetweenAndToDateBetweenAndForemployee(Date from_dateStart, Date from_dateEnd, Date to_dateStart, Date to_dateEnd , String foremployee );
	
	List<Payslip> findByForemployee(String foremployee);

	   @Query(value="SELECT * FROM Payslip p where from_date >= ?2 and to_date <= ?3 and employee_code= ?1" , nativeQuery = true)
		List<Payslip> getByToDateBetweenAndemployeeCode(String empcode, Date fromDate, Date toDate);
	/* List<Payslip> findBypayslipYear(String year); */
	   
	   
		@Query(value= "SELECT * FROM payslip p where (p.payslip_month='June' or p.payslip_month='December') and year(p.pay_date) = year(now()) and p.employee_code= ?1 " , nativeQuery = true)
		List<Payslip> welfareFundReportReportListbymonthandpaydate(String employeeCode);

		List<Payslip> findByForemployeeAndPayslipMonth(String foremployee, String month);

}
