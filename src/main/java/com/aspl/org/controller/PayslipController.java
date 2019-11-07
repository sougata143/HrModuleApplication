package com.aspl.org.controller;

import java.io.IOException;
import java.nio.file.Path;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import com.aspl.org.dto.PayslipDTO;
import com.aspl.org.entity.AttendaceGenerator;
import com.aspl.org.entity.Attendance;

import com.aspl.org.entity.Payslip;
import com.aspl.org.report.service.StaffPayslipReportService;
import com.aspl.org.service.AttendanceGeneratorService;
import com.aspl.org.service.AttendanceService;
import com.aspl.org.service.CapfileService;
import com.aspl.org.service.EmployeeMasterService;
import com.aspl.org.service.PayslipService;
import com.aspl.org.service.UtilService;
import com.aspl.org.service.impl.FileStorageService;


@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class PayslipController 
{
	
	@Autowired PayslipService payslipService; 
	@Autowired StaffPayslipReportService staffPayslipReportService;
	@Autowired EmployeeMasterService employeeMasterService; 
	@Autowired CapfileService capfileService;
	@Autowired UtilService utilService;
	@Autowired AttendanceGeneratorService attendanceGeneratorService;
	@Autowired AttendanceService attendanceservice;
	@Autowired FileStorageService fileStorageService;
	
	

	@GetMapping("/payslipgeneration/{employeeType}/{from_date}/{to_date}")
	
	public Payslip payslipgeneration(@PathVariable("employeeType") String employeeType, @PathVariable("from_date") String from_date, @PathVariable("to_date") String to_date)
	{
		return payslipService.payslipgeneration(employeeType, from_date, to_date);
		
	}
	
	@GetMapping("getPayslip/{foremployee}/{fromDate}/{toDate}")
	
	public List<PayslipDTO> getpayslip(@PathVariable("foremployee") String foremployee, @PathVariable("fromDate") String fromDate, @PathVariable("toDate") String toDate)
	{
		return payslipService.getPayslipdatewise(foremployee, fromDate, toDate);
		
	}
	
	@GetMapping("getPayslipPrint/{foremployee}/{fromDate}/{toDate}")	
	public Map<String, Object> getpayslipPrint(HttpServletRequest request, @PathVariable("foremployee") String foremployee, @PathVariable("fromDate") String fromDate, @PathVariable("toDate") String toDate)
	{
		return staffPayslipReportService.getStaffPayslipReport(request, foremployee, fromDate, toDate);
		
	}
	
	
	@RequestMapping(value = "/downloadpayslipReport/{fileName:.+}", method = RequestMethod.GET, produces = "application/pdf")
	 public ResponseEntity<InputStreamResource> downloadpayslip(@PathVariable("fileName") String fileName) throws IOException {
		  
		  ClassPathResource pdfFile = new ClassPathResource("src/main/resources/pdf/" + fileName);
		  HttpHeaders headers = new HttpHeaders();
		  headers.setContentType(MediaType.parseMediaType("application/pdf"));
		  headers.add("Access-Control-Allow-Origin", "*");
		  headers.add("Access-Control-Allow-Methods", "GET, POST, PUT");
		  headers.add("Access-Control-Allow-Headers", "Content-Type");
		  headers.add("Content-Disposition", "filename=" + fileName);
		  headers.add("Cache-Control", "no-cache, no-store, must-revalidate");
		  headers.add("Pragma", "no-cache");
		  headers.add("Expires", "0");
		 
		  headers.setContentLength(pdfFile.contentLength());
		  //System.out.println(pdfFile.getInputStream());
		  ResponseEntity<InputStreamResource> response = new ResponseEntity<InputStreamResource>(
		    new InputStreamResource(pdfFile.getInputStream()),  HttpStatus.OK);
		  
		  return response;
	 
	 }
	

	@GetMapping("/getupload")
	
	public Payslip getupload(@RequestParam ("filename") String filename) throws IOException
	{	
		//Path targetLocation = this.fileStorageLocation.resolve(fileName);
		Path filePath = fileStorageService.fileStorageLocation.resolve(filename).normalize();
		//String filepath1=fpath.getDescription();
		System.out.println(filePath);
		return payslipService.TestReadFile(filePath.toString());
		
	}
	
	@GetMapping("/getAttendanceGenerator")
	
	public void AttendaceGenerate() throws Exception
	{	
		
		payslipService.AttendaceGenerate();
		 
	
	}
	
	
	
	@GetMapping("/attendancePrepair/{forEmployee}/{from_date}/{to_date}")
	public Payslip attendancePrepair(@PathVariable("forEmployee")String forEmployee, @PathVariable("from_date") String from_date, @PathVariable("to_date") String to_date)
	{
		return payslipService.attendancePrepair(forEmployee, from_date, to_date);
		
	}
	
	
	@GetMapping("/getAllAttendaceGenerator")
	public List<AttendaceGenerator> getAllAttendaceGenerator()
	{
		return attendanceGeneratorService.getalldetailsAttendaceGeneratar();
	}
	
	
	@PutMapping("/updateAttendaceGenerator")
	public AttendaceGenerator updateAttendaceGenerator(@RequestBody AttendaceGenerator attendaceGenerator)
	{
		return attendanceGeneratorService.AttendaceGeneratorupdate(attendaceGenerator);
		
	}
	

	@PutMapping("/updateAttendace")
	public Attendance updateAttendace(@RequestBody Attendance attendace)
	{
		return attendanceservice.attendaceupdate(attendace);		
	}
	
}
