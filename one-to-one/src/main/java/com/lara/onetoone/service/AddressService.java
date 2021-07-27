package com.lara.onetoone.service;

import java.util.List;

import com.lara.onetoone.entity.Address;


public interface AddressService {
	//INSERT
		public Address save(Address address);
		
		
		//DISPLAY
		public List<Address> readAll();
		
		
		//Find By Id
		public Address read(Integer id);
		
		
		//DELETE
		public  Integer deleteById(Integer id);
		

}
