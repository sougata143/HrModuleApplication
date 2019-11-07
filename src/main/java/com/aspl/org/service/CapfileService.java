package com.aspl.org.service;

import java.util.List;

import com.aspl.org.entity.Capfile;


public interface CapfileService 
{

	Capfile capfilesave(Capfile capfile);
	Capfile getBycapfileid(Integer capfileid);
	List<Capfile> getallCapfileEntry();
	
	List<Capfile> findByempCode(String empCode);
	

	//void deleteAllCapfileDetails(Capfile capfile);
	//Capfile deleteAllCapfileDetails(Capfile capfile);
	//void deleteAllCapfileDetails(List<Capfile> caplistall);
	void truncateCapfile();
	//List<Capfile> findByempCode(String empCode);
}
