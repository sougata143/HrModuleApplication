package com.aspl.org.service;

import java.util.List;
import com.aspl.org.entity.PfvoucherEntry;

public interface PfmasterService {

	
	PfvoucherEntry pfmastersave(PfvoucherEntry pfvoucherEntry);

	

	void pfmasterdelete(PfvoucherEntry pfvoucherEntry);

	

	List<PfvoucherEntry> getallPfvoucherEntrylist();

	
	PfvoucherEntry findbypfNo(String pfNo);



	PfvoucherEntry PfvoucherEntryupdate(PfvoucherEntry pfvoucherEntry);



	PfvoucherEntry getByempcode(String empcode);
	
	PfvoucherEntry getByvoucherNo(String voucherNo);



	//PfvoucherEntry getByempcode(String empcode);

	
	
	
}
