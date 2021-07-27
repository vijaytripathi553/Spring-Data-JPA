package com.lara.onetoone.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lara.onetoone.entity.Address;
import com.lara.onetoone.entity.Person;
import com.lara.onetoone.service.AddressService;

@RestController
@RequestMapping("/Address")
public class AddressController {
	@Autowired
	private AddressService addressService;
	

	@PostMapping("/save")
	public Address save(@RequestBody Address address)
	{
		return addressService.save(address);
	}
	
	@GetMapping("/readAll")
	public List<Address> readAll()
	{
		return addressService.readAll();
	}
	
	@GetMapping("/{id}")
	public Address read(@PathVariable Integer id)
	{
		return addressService.read(id);
	}
	
	@DeleteMapping("/delete{id}")
	public Integer delete(@PathVariable Integer id)
	{
	 addressService.deleteById(id);
	 return id;
	}
	
	
	

}
