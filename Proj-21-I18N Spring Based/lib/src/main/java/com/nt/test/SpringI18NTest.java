package com.nt.test;

import java.util.Locale;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringI18NTest {
	public static void main(String[] args) {
		ApplicationContext ctx=null;
		Locale locale=null;
		
		//creating IOC Container
		ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		
		String cap1=null,cap2=null,cap3=null,cap4=null;
		
		//prepare locale object
		locale=new Locale(args[0],args[1]);
		
		//get Message
		cap1=ctx.getMessage("btn1.cap",new String[] {"Student"},"msg1", locale);
		cap2=ctx.getMessage("btn2.cap",null,"msg1", locale);
		cap3=ctx.getMessage("btn3.cap",null,"msg1", locale);
		cap4=ctx.getMessage("btn4.cap",null,"msg1", locale);
		
		System.out.println(cap1+" "+cap2+" "+cap3+" "+cap4);
	}
}
