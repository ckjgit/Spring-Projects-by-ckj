package com.nt.beans;

import java.util.Arrays;

public class MarksInfo {
	private int marks[];

	public void setMarks(int[] marks) {
		System.out.println(marks.getClass());
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "MarksInfo [marks=" + Arrays.toString(marks) + "]";
	}

}
