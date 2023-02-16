package com.nt.country;

import java.util.ArrayList;
import java.util.List;

import com.nt.sportspersons.Student;

public class College{
	private String collegeName;
	private List<Student> StudentList;
	

	
	public College(String collegeName) {
		this.collegeName=collegeName;
	}
	public String getCollege() {
		return this.collegeName;
	}
	
	//Students setter
	public void setStudent(List<Student> studentList){
		 this.StudentList=studentList;
	}
	
	//Students getter
	public List<String> getStudentList() {
		
		List<String> sPerson=new ArrayList<String>();
		
		for(Student SP1:this.StudentList) {
			sPerson.add(SP1.getStudent());
		}
		
		return sPerson;
		
	}
}