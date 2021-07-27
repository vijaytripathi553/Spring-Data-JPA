package com.lara.onetoone.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lara.onetoone.entity.Address;
import com.lara.onetoone.repository.AddressRepository;
import com.lara.onetoone.service.AddressService;

@Service
public class AddressServiceImpl implements AddressService {
	@Autowired
	private AddressRepository addressRepoaitory;

	@Override
	public Address save(Address address) {
		return addressRepoaitory.save(address) ;
	}

	@Override
	public List<Address> readAll() {
		return (List<Address>)addressRepoaitory.findAll();
	}

	@Override
	public Address read(Integer id) {
		return addressRepoaitory.findById(id).get();
	}

	@Override
	public Integer deleteById(Integer id) {
		addressRepoaitory.deleteById(id);
		return id;
	}

}
