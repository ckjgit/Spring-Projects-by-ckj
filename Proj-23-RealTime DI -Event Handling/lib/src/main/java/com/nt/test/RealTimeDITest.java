package com.nt.test;

import java.util.Scanner;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.controller.MainController;
import com.nt.vo.PatientVO;

public class RealTimeDITest {

	public static void main(String[] args) {
		String pname = null;
		String page = null;
		String padd = null;
		String hospitalname = null;
		String noofdays = null;

		Scanner sc = null;
		//DefaultListableBeanFactory factory = null;
		//XmlBeanDefinitionReader reader = null;
		
		ApplicationContext ctx=null;
		
		String result = null;
		MainController controller = null;
		PatientVO vo = null;

		sc = new Scanner(System.in);
		System.out.print("\n\nEnter Patient Name : ");
		pname = sc.nextLine();

		System.out.print("\n\nEnter Patient Age : ");
		page = sc.nextLine();

		System.out.print("\n\nEnter Patient Address : ");
		padd = sc.nextLine();

		System.out.print("\n\nEnter Hospital Name : ");
		hospitalname = sc.nextLine();

		System.out.print("\n\nEnter No of days for Admission : ");
		noofdays = sc.next();

		sc.close();
		// create VO Object
		vo = new PatientVO();

		// setting data to vo class object
		vo.setPname(pname);
		vo.setPage(page);
		vo.setPadd(padd);
		vo.setHospitalname(hospitalname);
		vo.setNoofdays(noofdays);

		//factory = new DefaultListableBeanFactory();
		//reader = new XmlBeanDefinitionReader(factory);
		
		// IOC Container Creating..
		ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		

		//reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
		controller = ctx.getBean("controller", MainController.class);
		
		//controller = factory.getBean("controller", MainController.class);

		// catching the exception propagation
		try {
			result = controller.processPatient(vo);
			System.out.println(result);
		} catch (Exception e) {
			System.out.println("\n\n Opps..Internal Errors..");
			e.printStackTrace();
		}
		
		System.out.println(System.getProperties());
		
		
		//Container Stopped...at this following line
		((AbstractApplicationContext) ctx).close();

	}

}
