package com.nt.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.beans.Voter;


public class VoterET_BF {

	public static void main(String[] args) {
		XmlBeanDefinitionReader reader=null;
		DefaultListableBeanFactory factory=null;
		Voter voter=null;
		
		//preparing IOC container
		factory=new DefaultListableBeanFactory();
		reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
		
		voter=factory.getBean("vtr", Voter.class);
		
		//call bmethod
		System.out.println("B_F "+voter.getVoter());
		
		factory.destroySingletons();
		
	}

}
