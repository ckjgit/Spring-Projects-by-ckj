package com.nt.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class WebContainer {
	private String beanId;
	
	
	public void setBeanId(String beanId) {
		this.beanId = beanId;
	}



	public WebContainer() {
		System.out.println("WebContainer.WebContainer(  -  0 - param constructer)");
	}
	
	
	
	public void processRequest(String data) {
		ApplicationContext ctx=null;
		RequestHandler handler=null;
		
		ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		
		handler=ctx.getBean(beanId,RequestHandler.class);
		
		System.out.println("Web Container is proessing request with data "+data+" by passing it to Handler.." );
		handler.handleRequest(data);
		
		((AbstractApplicationContext) ctx).close();
	}
}
