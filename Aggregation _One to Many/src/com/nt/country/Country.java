package com.nt.country;

import java.util.ArrayList;
import java.util.List;

import com.nt.sportspersons.SportsPerson;

public class Country{
	private String country;
	private List<SportsPerson> sportsPerson;

	
	public Country(String country) {
		this.country=country;
	}
	public String getCountry() {
		return this.country;
	}
	
	//SportsPerson setter
	public void setSportsPerson(List<SportsPerson> sportsPerson){
		 this.sportsPerson=sportsPerson;
	}
	
	//SportsPerson getter
	public List<String> getSportsPerson() {
		
		List<String> sPerson=new ArrayList<String>();
		
		for(SportsPerson SP1:this.sportsPerson) {
			sPerson.add(SP1.getSportsPerson());
		}
		
		return sPerson;
		
	}
}