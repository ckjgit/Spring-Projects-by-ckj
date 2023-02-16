package com.nt.beans;

import java.util.Date;
import java.util.List;

public class College {
	private List<String> studentNames;
	private List<Date> dateList;

	// performing Setter Injection
	public void setStudentNames(List<String> studentNames) {
		System.out.println(studentNames.getClass());
		this.studentNames = studentNames;
	}

	public void setDateList(List<Date> dateList) {
		this.dateList = dateList;
	}

	// generating toString() method
	@Override
	public String toString() {
		return "College [studentNames=" + studentNames + ", dateList=" + dateList + "]";
	}

}
