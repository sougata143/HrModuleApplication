package com.aspl.org.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aspl.org.entity.Address;


@Repository
public interface AddressDao extends JpaRepository<Address, Integer>{
	
	Address findByBillTo(String billTo);
	
	Address findByShipTo(String shipTo);
	
	Address findByAddressCode(String addressCode);
	
	Address save(Optional<Address> address1);

}
