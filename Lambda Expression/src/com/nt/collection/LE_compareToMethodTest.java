package com.nt.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Employee{
	String ename;
	Integer eno;
	
	//declaring 2-param constructor
	public Employee(String ename, Integer eno) {
		this.ename = ename;
		this.eno = eno;
	}
	
	//declaring toString()
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return eno+" : "+ename;
	}
}

public class LE_compareToMethodTest {

	public static void main(String[] args) {
		ArrayList<Employee> l = new ArrayList<Employee>();
		l.add(new Employee("Sunny", 234455));
		l.add(new Employee("Bunny", 567238));
		l.add(new Employee("Chinny", 632255));
		l.add(new Employee("Kunny", 123456));
		
		System.out.println(l);
		
		Collections.sort(l, (e1,e2)-> (e1.eno>e2.eno) ? -1 : (e2.eno<e2.eno) ? +1 : 0);
		
		System.out.println(l);
		
		Collections.sort(l, (e1, e2)->(e1.ename.compareTo(e2.ename)));
		
		System.out.println(" \n "+ l);
	}

}
