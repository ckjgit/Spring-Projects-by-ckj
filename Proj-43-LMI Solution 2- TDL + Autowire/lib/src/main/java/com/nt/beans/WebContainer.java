package com.nt.beans;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class WebContainer implements ApplicationContextAware{
	private String beanId;
	private ApplicationContext ctx=null;
	
	public void setBeanId(String beanId) {
		this.beanId = beanId;
	}



	public WebContainer() {
		System.out.println("WebContainer.WebContainer(  -  0 - param constructer)");
	}
	
	@Override
	public void setApplicationContext(ApplicationContext ctx) throws BeansException {
		this.ctx=ctx;
		
	}
	
	
	
	public void processRequest(String data) {
		
		RequestHandler handler=null;
		
		
		
		handler=ctx.getBean(beanId,RequestHandler.class);
		
		System.out.println("Web Container is proessing request with data "+data+" by passing it to Handler.." );
		handler.handleRequest(data);
		
		//((AbstractApplicationContext) ctx).close();
	}



	
}
