package com.nt.aggregation;

import java.util.ArrayList;
import java.util.List;

import com.nt.country.Country;
import com.nt.sportspersons.SportsPerson;

public class AggregationTest {

	public static void main(String[] args) {
		SportsPerson sp1=new SportsPerson("Dhoni");
		SportsPerson sp2=new SportsPerson("Kohli");
		SportsPerson sp3=new SportsPerson("Chahal");
		
		Country c=new Country("India");
		
		List<SportsPerson> list=new ArrayList<SportsPerson>();
		list.add(sp1);
		list.add(sp2);
		list.add(sp3);
		
		c.setSportsPerson(list);
		System.out.println("The Sports People from the country "+c.getCountry()+" are "+c.getSportsPerson());

	}

}
