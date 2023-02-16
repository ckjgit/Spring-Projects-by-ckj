package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.Voter;

public class VoterEligibleTest {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		Voter v=null;
		//preparing IOC Container
		ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		
		//get spring bean class object
		v=ctx.getBean("vtr",Voter.class);
		
		//calling B. method of voter class
		System.out.println(v.getVoter());
		
		((AbstractApplicationContext) ctx).close();
	}
}
