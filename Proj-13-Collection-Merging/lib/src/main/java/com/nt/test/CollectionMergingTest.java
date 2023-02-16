package com.nt.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;


import com.nt.beans.MergingBeans;

public class CollectionMergingTest {

	public static void main(String[] args) {
		DefaultListableBeanFactory factory = null;
		XmlBeanDefinitionReader reader = null;
		MergingBeans mb=null;

		// creating IOC Container
		factory = new DefaultListableBeanFactory();
		reader = new XmlBeanDefinitionReader(factory);

		// load applicationContext.xml file
		reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
		mb=factory.getBean("cm2",MergingBeans.class);
		
		System.out.println(mb);

	}

}
