package com.nt.test;

import org.springframework.beans.factory.BeanFactory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.nt.comp.Flipkart;

public class StereoAnno_Test {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		Flipkart fpkt=null;
		
		//creating and hold spring bean configuration file and create IOC Container
		ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		
		// get target bean object
		fpkt=ctx.getBean("fpkt", Flipkart.class);
		
		System.out.println(fpkt.shopping(new String[] {"Trolly Bag","Clothes","Foods","Train Tickets"}, new float[] {1549,1500,300,2005}));

		((AbstractApplicationContext) ctx).close();
	}

}
