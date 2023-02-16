package com.nt.beans;

public class Null_Injection {
	private int eid;
	private String ename;
	private String edesig;
	private int age;
	
	//constructor injection
	public Null_Injection(int eid, String ename, String edesig, int age) {
		
		this.eid = eid;
		this.ename = ename;
		this.edesig = edesig;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Null_Injection [eid=" + eid + ", ename=" + ename + ", edesig=" + edesig + ", age=" + age + "]";
	}
	
	
}

