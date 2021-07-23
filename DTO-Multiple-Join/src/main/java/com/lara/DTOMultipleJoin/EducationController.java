package com.lara.DTOMultipleJoin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EducationController {
	
	
	
	@Autowired
	private EducationRepository educationRepository;
	
	
	@PostMapping("saveEducation")
	public Education save(@RequestBody Education education)
	{
		return educationRepository.save(education);
	}
	
	@GetMapping("findAllEducation")
	public List<Education> findAll()
	{
		return (List<Education>)educationRepository.findAll();
	}

}
