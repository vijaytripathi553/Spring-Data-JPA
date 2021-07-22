package com.example.DTOSingleJoin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
	@Autowired
	private EmployeeRepository employeeRepository;
	
	
	@PostMapping("saveEmployee")
	public Employee save(@RequestBody Employee employee)
	{
		return employeeRepository.save(employee);
	}
	
	@GetMapping("findAllEmployee")
	public List<Employee> findAll()
	{
		return (List<Employee>)employeeRepository.findAll();
	}
	
	
	  @GetMapping("all")
	  
	  public List<EmployeeDTO> readAllEmployees()
	  { 
		  return (List<EmployeeDTO>)employeeRepository.readAllEmployees(); 
		  }
	 

}
