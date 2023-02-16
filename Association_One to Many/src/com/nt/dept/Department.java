package com.nt.dept;

import java.util.ArrayList;
import java.util.List;

import com.nt.professor.Professor;

public class Department {
	private String deptName;
	
	//create Professor class list object
	private List<Professor> staff;
	
	public Department(String deptName) {
		this.deptName=deptName;
	}
	
	public String getDeptName() {
		return deptName;
	}
	
	//creating setter for Professor statfs..(:
	public void setStaff(List<Professor> staff) {
		this.staff=staff;
	}
	
	
	//creating getter for Professor staff (:
	public List<String> getStaff() {
		List<String> profName=new ArrayList<String>();
		
		for(Professor prof:this.staff) {
			profName.add(prof.getProfName());
		}
		
		return profName;
	}
	
	
	
}
