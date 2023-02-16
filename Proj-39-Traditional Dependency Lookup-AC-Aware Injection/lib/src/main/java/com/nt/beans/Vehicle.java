package com.nt.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Vehicle implements ApplicationContextAware{
private String beanId;
//private Vehicle beanId;
	
	ApplicationContext ctx = null;
	
private Engine engg;
	
	public Vehicle(String beanId) {
		this.beanId=beanId;
		System.out.println("Vehicle:: 1-param constructor");
	}
	
	@Override
	public void setApplicationContext(ApplicationContext ctx) throws BeansException {
		this.ctx = ctx;
		
	}
	
	
//	public void setEngg1(Engine engine) {
//		this.engg1 = engine;
//	}
	
	public  void  entertainment() {
		System.out.println("Vehicle is equipped with  DVD Player  for entertainment");
	}
	
	public  void soundHorn() {
		System.out.println("Vehicle  is equippled with skoda horn  ");
	}
	
	public  void  fillFuel() {
		System.out.println("Vehicle is having fuel tank of 50 liters");
	}
	
	public void  journey(String  sourcePlace , String destPlace) {
		System.out.println("Vehicle.journey()");
	/*	DefaultListableBeanFactory factory=null;
		XmlBeanDefinitionReader reader=null;
		Engine engg=null;
		//create an extra IOC Container 
		factory=new DefaultListableBeanFactory();
		reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
		
		System.out.println("Extra/2nd container...");
		
		//get Dependent  Bean class object  (Dependency lookup)
		engg=factory.getBean(beanId, Engine.class);  
	*/	
		
		engg=ctx.getBean(beanId, Engine.class);  
		
		engg.start();
		System.out.println("journey  started  at ::"+sourcePlace);
		System.out.println("journey is going on.......  from "+sourcePlace+" to "+destPlace);
		engg.stop();
		System.out.println("jounery ended at ::"+destPlace);
	}


	
}
