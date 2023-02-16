package com.nt.beans;

import java.util.Date;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;



public class Voter {
	private String name;
	private Integer age;
	private Date date;

	public Voter() {
		System.out.println("Voter.Voter()");
	}

	// setter methods
	public void setName(String name) {
		this.name = name;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	// init life cycle method /or custom life cycle method
	@PostConstruct
	public void myInit() {
		System.out.println("Voter.myInit()");
		boolean flag = false;

		date = new Date(); // initializing left over properties

		if (name == null) {
			System.out.println("Name Must not be null..or void..");
			flag = true;
		}

		if (age < 0)
			age = age * -1;

		if (age >= 100) {
			System.out.println("Age must not exceed 100..invalid age..");
			flag = true;
		}

		if (flag)
			throw new IllegalArgumentException("Invalid inputs..Plz check your inputs..");
	}

	// destroy life cycle method / custom destroy method
	@PreDestroy
	public void myDestroy() {
	System.out.println("Voter.myDestroy()");
		// nullifying all bean properties
		name = null;
		age = null;
		date = null;
	}

	// B. Method
	public String getVoter() {
		System.out.println("Voter.getVoter()");
		if (age >= 18)
			return "Congratulation " + name + ", You are eligible for Voting at age of " + age + ". as on date " + date;
		else
			return "Hello " + name + ",Unfortunately you are not eligible for Voting at age of " + age + " as on date "
					+ date;

	}

	

}
