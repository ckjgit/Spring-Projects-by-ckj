package com.nt.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.beans.Car;



public class Bean_Inheritance_Test {

	public static void main(String[] args) {
		DefaultListableBeanFactory factory = null;
		XmlBeanDefinitionReader reader = null;
		Car car01 = null, car02=null;

		// creating IOC Container
		factory = new DefaultListableBeanFactory();
		reader = new XmlBeanDefinitionReader(factory);

		// load applicationContext.xml file
		reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
		car01 = factory.getBean("CkjCar01", Car.class);
		System.out.println(car01);
		System.out.println("=============================================");
		car02 = factory.getBean("CkjCar02", Car.class);
		System.out.println(car02);
		

	}

}
