package com.nt.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.beans.Null_Injection;

public class NullInjectionTest {

	public static void main(String[] args) {
		DefaultListableBeanFactory factory=null;
		XmlBeanDefinitionReader reader=null;
		Null_Injection ninject=null;
		
		//creating IOC Container
		factory=new DefaultListableBeanFactory();
		reader=new XmlBeanDefinitionReader(factory);
		
		//load applicationContext.xml file
		reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
		ninject=factory.getBean("ni",Null_Injection.class);
		
		System.out.println(ninject);
		

	}

}
