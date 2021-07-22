package com.example.datajpa2;

import java.util.ArrayList;
import java.util.List;

public class AllPersons {
	private List<Person> pp=new ArrayList<Person>();

	public List<Person> getPp() {
		return pp;
	}

	public void setPp(List<Person> pp) {
		this.pp = pp;
	}

	@Override
	public String toString() {
		return "AllPersons [pp=" + pp + "]";
	}
	
	

	
	
	
	

}
