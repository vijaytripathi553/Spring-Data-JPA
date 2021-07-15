package com.example.customerepositorymethodsjpa;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface WorkerRepository extends CrudRepository<Worker, Integer> {
	//You can see for save(),saveAll(),findAll(),findById() .  No such method is defined cause we are directly impementing those method becuse of CrudRepository.
	
	// Custom method to search Worker by firstname (For Unique Column)
	public Worker findByFirstName(String fname);
	
		// Custom method to search Worker by lastname  (For Non Unique Column)
		public List<Worker> findAllByLastName(String lname);
		
		// Custom method to search Worker by lastname  (Where clause with Boolean LIKE)
		
		public List<Worker> findAllByFirstNameLike(String fname);
		
		// Custom method to search customer by lastname  (Where clause with Boolean AND)
		public List<Worker> findAllByFirstNameAndLastName(String firstName, String lastName);
		
		
		// I have developed custom API which will return all the firstName from table   (Reading Single Column   @Query)
		@Query("select f.firstName from Worker f")
		public String[] allFirstName();
		
		
		
		// I have developed custom API which will return all the list of only those Id's which are grater then 50 from table   (Reading Single Column   @Query)
				@Query("select i.wid from Worker i where wid>50")
				public int[] allListOfId();
				
				
		// This Api is developed to read multiple columns .So we can read multiple columns with the help of List of object array (List<Object[]>)  (Reading multiple column @Query)
				@Query("select w.firstName, w.lastName from Worker w")
				public List<Object[]> readFirstNameAndLastName();
				
				
				
				
		// This API is being developed to to read only few attaribute records from table through DTO class.
		/*
		 * @Query("select new com.example.customerepositorymethodsjpa.WorkerDTO(w.wid, w.lastName) from Worker wm"
		 * ) public List<WorkerDTO> readWidAndLastName();
		 * 
		 */
}
