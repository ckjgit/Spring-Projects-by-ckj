package com.nt.beans;



public abstract class WebContainer {
	


	public WebContainer() {
		System.out.println("WebContainer.WebContainer(  -  0 - param constructer)"+this.getClass()+" "+this.getClass().getSuperclass());
	}
	
	
	public abstract RequestHandler getRequestHandler(); //abstract method 
	
	
	public void processRequest(String data) {
		
		RequestHandler handler=null;
		
		
		handler=getRequestHandler();		
		
		
		
		System.out.println("Web Container is proessing request with data "+data+" by passing it to Handler.." );
		handler.handleRequest(data);
		
		//((AbstractApplicationContext) ctx).close();
	}



	
}
