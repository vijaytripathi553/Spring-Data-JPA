package com.lara.DTOMultipleJoin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GenderController {
	@Autowired
	private GenderRepository genderRepository;
	
	@PostMapping("saveGender")
	public Gender save(@RequestBody Gender gender)
	{
		return genderRepository.save(gender);
		
	}
	

	@GetMapping("findAllGender")
	public List<Gender> findAll()
	{
		return (List<Gender>)genderRepository.findAll();
	}

}
