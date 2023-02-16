package com.nt.test;

import java.util.Scanner;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.controller.MainController;
import com.nt.vo.CustomerVO;

public class RealTimeDITest {

	public static void main(String[] args) {

		String cstName = null;
		String cstAdd = null;
		String pAmt = null;
		
		String time = null;
		String rate = null;

		Scanner sc = null;
		CustomerVO vo = null;
		DefaultListableBeanFactory factory = null;
		XmlBeanDefinitionReader reader = null;
		MainController controller = null;
		String result = null;

		// read input from end user using Scanner
		sc = new Scanner(System.in);
		System.out.print("\n\n Enter Customer Name : ");
		cstName = sc.next();
		System.out.print("\n\n Enter Customer Address : ");
		cstAdd = sc.next();
		System.out.print("\n\n Enter Principal Amount : ");
		pAmt = sc.next();
		System.out.print("\n\n Enter Time : ");
		time = sc.next();
		System.out.print("\n\n Enter Rate of Interest : ");
		rate = sc.next();

		// Store inputs into VO Class Object
		vo = new CustomerVO();
		vo.setCname(cstName);
		vo.setCadd(cstAdd);
		vo.setPamt(pAmt);
		vo.setTime(time);
		vo.setRate(rate);

		// creating beanfactory container
		factory = new DefaultListableBeanFactory();
		// creating reader object containing factory object
		reader = new XmlBeanDefinitionReader(factory);

		reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
		controller = factory.getBean("controller", MainController.class);

		// invoke methods

		try {
			result = controller.processCustomer(vo);
			System.out.println(result);
		} catch (Exception e) {
			System.out.println("\n\n Inernal Error..  ):");
			e.printStackTrace();
		}
	}

}
