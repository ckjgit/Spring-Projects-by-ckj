package com.nt.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.beans.College;
import com.nt.beans.ContactsInfo;
import com.nt.beans.MarksInfo;
import com.nt.beans.UniversityInfo;

public class Collection_Injection_Test {

	public static void main(String[] args) {
		DefaultListableBeanFactory factory = null;
		XmlBeanDefinitionReader reader = null;

		MarksInfo info = null;
		College clg = null;
		ContactsInfo infoc = null;
		UniversityInfo unf = null;

		factory = new DefaultListableBeanFactory();
		reader = new XmlBeanDefinitionReader(factory);

		reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");

		info = factory.getBean("mi", MarksInfo.class);

		System.out.println(info);

		System.out.println("===============================================================");

		clg = factory.getBean("college", College.class);

		System.out.println(clg);
		System.out.println("===============================================================");
		infoc = factory.getBean("cinfo", ContactsInfo.class);

		System.out.println(infoc);

		System.out.println("==================================================================");

		unf = factory.getBean("uinfo", UniversityInfo.class);
		System.out.println(unf);
	}

}
