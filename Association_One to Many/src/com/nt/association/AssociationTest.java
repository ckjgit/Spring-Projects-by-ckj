package com.nt.association;

import java.util.ArrayList;
import java.util.List;

import com.nt.dept.Department;
import com.nt.professor.Professor;

public class AssociationTest {

	public static void main(String[] args) {
		Professor pf1=new Professor("prof. Jitesh Kumar Jena");
		Professor pf2=new Professor("prof. Pujaa Sen");

		Department dp=new Department("BIOLOGY");
		
		List<Professor> list=new ArrayList<Professor>();
		list.add(pf1);
		list.add(pf2);
		
		dp.setStaff(list);
		
		System.out.println(dp.getStaff()+" is/are the Professor/s of "+dp.getDeptName()+" Department. ");
	}

}
