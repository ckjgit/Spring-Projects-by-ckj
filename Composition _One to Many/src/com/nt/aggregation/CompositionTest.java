package com.nt.aggregation;

import java.util.ArrayList;
import java.util.List;

import com.nt.country.College;
import com.nt.sportspersons.Student;

public class CompositionTest {

	public static void main(String[] args) {
		Student sp1=new Student("Chinmay");
		Student sp2=new Student("Sachin");
		Student sp3=new Student("Ravindra");
		
		College c=new College("IMIT");
		
		List<Student> list=new ArrayList<Student>();
		list.add(sp1);
		list.add(sp2);
		list.add(sp3);
		
		c.setStudent(list);
		System.out.println("The Students studying in "+c.getCollege()+" are "+c.getStudentList());

	}

}
