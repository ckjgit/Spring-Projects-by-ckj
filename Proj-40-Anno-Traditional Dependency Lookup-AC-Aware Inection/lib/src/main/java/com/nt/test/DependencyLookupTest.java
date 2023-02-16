package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.Vehicle;

public class DependencyLookupTest {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		Vehicle vehicle = null;
		//prepare IOC container
		ctx = new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		
		//use ctx to get target class object
		vehicle = ctx.getBean("vehicle", Vehicle.class);
		
		System.out.println(" 1st Container Execution..");
		
		//invoke methods
		vehicle.journey("Balasore", "Rameshwaram");
		vehicle.entertainment();
		vehicle.soundHorn();
		vehicle.fillFuel();
		
		((AbstractApplicationContext) ctx).close();
	}

}
