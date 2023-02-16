package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.WebContainer;

public class LMI_Problem_Test {

	public static void main(String[] args) {
		ApplicationContext ctx = null;
		WebContainer container = null;
		//create IOC container
		ctx = new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		
		//get target bean class obj
		container = ctx.getBean("container", WebContainer.class);
		
		//invoke b method
		container.processRequest("ckj");
		System.out.println("------------------------------------------");
		
		container.processRequest("123");
		System.out.println("------------------------------------------");
		
		container.processRequest("good luck");
		System.out.println("------------------------------------------");
		
		

	}

}
