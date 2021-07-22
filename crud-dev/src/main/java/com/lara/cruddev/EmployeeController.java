package com.lara.cruddev;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
	@Autowired
	private EmployeeRepository employeeRepository;
	
	// 1st CrudRepository Method      								Save()
	@RequestMapping(path="save",method=RequestMethod.POST)
	public Employee save(@RequestBody Employee e)
	{
		
		employeeRepository.save(e);
		return e;
	}
	
	// 2nd CrudRepository Method      								SaveAll()
	@RequestMapping(path="saveAll" , method=RequestMethod.POST)
	public List<Employee> saveAll(@RequestBody Company company)
	{
		List<Employee> employees=company.getEmployees();
		employeeRepository.saveAll(employees);
		
		
		return employees;
		
	}
	
	// 3rd CrudRepository Method      								count()  => This method is used to display how many objects are there
	@RequestMapping(path="count", method=RequestMethod.GET)
	public Long count()
	{
		return employeeRepository.count();       // In order to read how many records are there count() method is used.
		
	}
	
	
	
	// 4th CrudRepository Method      								existsById()  => This method is used to check whether particualr id's record exist or not
	@RequestMapping(path="availability/{id}", method=RequestMethod.GET)
	public Boolean checkAvailability(@PathVariable Integer id)
	{
		return employeeRepository.existsById(id);
	}
	
	// 5th CrudRepository Method      								findAll()  => Earlier we were using a list of Employees if it is a list of employee then you need to down cast it explicitly.findAll method return type is Iterable that iterable is a super interface to list	.You need to downcast is exlicitly. So, here we are using Iterable<Employee>
@GetMapping("readAll")	
public Iterable<Employee> readAll()
{
	return employeeRepository.findAll();
			
}

//6th CrudRepository Method      								findById()  => This method is used to dispaly specific record by Id.

@GetMapping("read/{id}")
public Employee read(@PathVariable Integer id)
{
	return employeeRepository.findById(id).get();
}

//7th CrudRepository Method										delete()
@DeleteMapping
public Employee delete(@RequestBody Employee employee)
{
	employeeRepository.delete(employee);
	return employee;
	
}

//8th CrudRepository											deleteAll()
@DeleteMapping("employees")
public Iterable<Employee> deleteAllByIdsWithPost(@RequestBody Company company)
{

	List<Employee> employees=company.getEmployees();
	employeeRepository.deleteAll(employees);
	return employees;
	
}

//9th CrudRepository											deleteAll()
@DeleteMapping("all")
public String deleteAll()
{
	employeeRepository.deleteAll();
	return "Successfully deleted all the records";
}



}
