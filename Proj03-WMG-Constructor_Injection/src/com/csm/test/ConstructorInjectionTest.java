package com.csm.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import com.csm.beans.WishMessageGenerator;

public class ConstructorInjectionTest {

	public static void main(String[] args) {
		
		System.out.println("SetterInjectionTest.main()");
		
		Resource res=null;
		BeanFactory factory=null;
		Object obj=null;
		WishMessageGenerator generator=null;
		String result=null;
		
		//res=new FileSystemResource("src/com/csm/cfgs/applicationContext.xml");
		
		res=new ClassPathResource("com/csm/cfg/applicationContext.xml");
		
		factory=new XmlBeanFactory(res);
		obj=factory.getBean("wmg");
		
		generator=(WishMessageGenerator)obj;
		result=generator.generateWishMessage("Chinmay");
		
		System.out.println("Hello ,"+result);
	}

}
