package com.example.customerepositorymethodsjpa;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@CrossOrigin
public class WorkerController {
	@Autowired
	private WorkerRepository workerRepository;

	// 1st CRUD Repository API to Insert data into table 									    	//save()
	@PostMapping("save")
	public Worker save(@RequestBody Worker w) {
		workerRepository.save(w);
		return w;
	}

	// 2nd CRUD Repository API developed to read all the records from table 						// findAll()
	@RequestMapping(path = "readAll", method = RequestMethod.GET)
	public List<Worker> readAll() {
		return (List<Worker>) workerRepository.findAll();
	}
	
	

	// 3rd CRUD RepositoryThis API is developed to read specific records from table					// findById()
	// // findById()
	@RequestMapping(path = "read/{id}", method = RequestMethod.GET)
	public Worker read(@PathVariable Integer id) {
		return workerRepository.findById(id).get();
	}

	 //4th CrudRepository Method This API is used for Updating the record. Same				    	// save()
	// Save() method is used for even updating the record.Except method=
	// RequestMethod.PUT
	@RequestMapping(path = "update/{work}", method = RequestMethod.PUT)
	public Worker update(@PathVariable Worker work) {
		workerRepository.save(work); // Put()

		return work;
	}

	// 5th CrudRepository Method delete()															// delete()
	@RequestMapping(path="delete/{id}",method=RequestMethod.DELETE)
	public Integer delete(@PathVariable Integer id) {
		
		workerRepository.deleteById(id);
		return id;

	}

	// This is an API with custom method defined to search record by firstName
	// findByFirstName();
	@GetMapping("search/{fname}")
	public Worker searchByFirstName(@PathVariable String fname) {

		return workerRepository.findByFirstName(fname);
	}

	// This is an API with custom method defined to search record by lastName
	// findAlllastName();
	@GetMapping("searchBy/{lname}")
	public List<Worker> findAllByLastName(@PathVariable String lname) {

		return (List<Worker>) workerRepository.findAllByLastName(lname);
	}

	// This API is used to search record with the help of LIKE Operator LIKE %
	@GetMapping("searchLike/{fname}")
	public List<Worker> findAllByFirstNameLike(@PathVariable String fname) {
		return (List<Worker>) workerRepository.findAllByFirstNameLike("%" + fname + "%");

	}

	// This API is used to search record with the help of Boolean AND AND
	@GetMapping("readWithFirstNameAndLastName/{firstName}/{lastName}")
	public List<Worker> readWithFirstNameAndLastName(@PathVariable String firstName, @PathVariable String lastName) {
		return (List<Worker>) workerRepository.findAllByFirstNameAndLastName(firstName, lastName);

	}

	// This API is to display Complete firstname from table using @Query (Reading
	// Single Column @Query)
	@GetMapping("completeFirstName")
	public String[] allFirstName() {
		return workerRepository.allFirstName();
	}
	
	
	
	
	
	// This API is to display Complete list of those Id's which ae grater then 50 from table using @Query (Reading
		// Single Column @Query)
		@GetMapping("completeListOfId")
		public int[] allListOfId() {
			return workerRepository.allListOfId();
		}
		
		
		
		// This Api is developed to read multiple columns
		@GetMapping("readFirstAndLastName")
		public List<Object[]> readFirstNameAndLastName()
		{
			return workerRepository.readFirstNameAndLastName();
			
		}
		
		
		// This API is being developed to to read only few attaribute records from table through DTO class.
		/*
		 * @GetMapping("readWidAndLastName") public List<WorkerDTO> readWidAndLastName()
		 * { return workerRepository.readWidAndLastName(); }
		 */



	
	
	
	
}
