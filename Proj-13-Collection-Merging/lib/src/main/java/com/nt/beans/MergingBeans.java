package com.nt.beans;

import java.util.Set;

public class MergingBeans {
	private Set<String> course;

	//generating setter injections
	public void setCourse(Set<String> course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return "MergingBeans [course=" + course + "]";
	}
	
	
}
