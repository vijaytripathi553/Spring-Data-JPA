package com.example.customerepositorymethodsjpa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

class SortWorkerBasedOnId implements Comparator
{
	@Override
	public int compare(Object o1, Object o2) {
		return ((Worker)o1).getWid() - ((Worker)o2).getWid();
	}
	
}


class SortWorkerBasedOnFirstName implements Comparator
{
	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		return ((Worker)o1).getFirstName().compareTo(((Worker)o2).getFirstName());
	}
	
}

class SortWorkerBasedOnLastName implements Comparator
{
	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		return ((Worker)o1).getLastName().compareTo(((Worker)o2).getLastName());
	}
	
}

@SpringBootApplication
public class CustomeRepositoryMethodsJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomeRepositoryMethodsJpaApplication.class, args);

		List<Worker> al = new ArrayList<Worker>();

		Worker wk = new Worker();
		wk.getWid();
		wk.getFirstName();
		wk.getLastName();

		al.add(wk);

		 Collections.sort(al,new SortWorkerBasedOnId());

		 Collections.sort(al,new SortWorkerBasedOnFirstName());

		 Collections.sort(al,new SortWorkerBasedOnLastName());
	}

}
