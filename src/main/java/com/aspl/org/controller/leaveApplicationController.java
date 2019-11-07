package com.aspl.org.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.aspl.org.entity.LeaveMaster;
import com.aspl.org.entity.Leaveapplication;
import com.aspl.org.service.LeaveApplicationService;

@RestController
@RequestMapping(path = "/leaveapplication")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class leaveApplicationController {
	
	
	@Autowired LeaveApplicationService leaveapplicationservice;
	

	@PostMapping("/leaveapplicationsave")
	
	public Leaveapplication leaveapplication(@RequestBody Leaveapplication leaveapplication)
	{
			return leaveapplicationservice.leaveapplicationsave(leaveapplication);
	}
	
	@PostMapping("/leaveapplicationdelete")
	
	public List<Leaveapplication> leaveapplicationdelete(@RequestParam("leaveapplicationID") Integer leaveapplicationID)
	 
	{
		return leaveapplicationservice.Leaveapplicationlist(leaveapplicationID);
		
	}
	
	
	@GetMapping("/leaveapplicationlist")
	
	public List<Leaveapplication> leaveapplicationlist()
	{
		return leaveapplicationservice.leaveapplicationlist();
	}
	
	@GetMapping("/getleavedetailbyempcodeandleavetype")
	
	public LeaveMaster findByempcodeandtype(@RequestParam("empcode")Integer empcode, @RequestParam("leaveID") String leaveType) {
		
		return leaveapplicationservice.findByempcodeandtype(empcode, leaveType);
		
	}
	
}
