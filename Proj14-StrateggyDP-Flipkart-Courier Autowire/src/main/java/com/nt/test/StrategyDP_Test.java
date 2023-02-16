package com.nt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.nt.comp.Flipkart;

public class StrategyDP_Test {

	public static void main(String[] args) {
		Resource res=null;
		BeanFactory factory=null;
		Flipkart fpkt=null;
		
		//creating and hold spring bean configuration file
		res=new ClassPathResource("com/nt/cfgs/applicationContext.xml");
		
		//create IOC Container
		factory=new XmlBeanFactory(res);
		 
		// get target bean object
		fpkt=factory.getBean("fpkt", Flipkart.class);
		
		System.out.println(fpkt.shopping(new String[] {"Trolly Bag","Clothes","Foods","Train Tickets"}, new float[] {1549,1500,300,2005}));

	}

}
