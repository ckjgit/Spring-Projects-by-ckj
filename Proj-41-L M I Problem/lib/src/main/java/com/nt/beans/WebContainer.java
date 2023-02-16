package com.nt.beans;

public class WebContainer {
	private RequestHandler rh;

	
	public WebContainer() {
		System.out.println("WebContainer.WebContainer(  -  0 - param constructer)");
	}
	public void setRh(RequestHandler rh) {
		this.rh = rh;
	}
	
	public void processRequest(String data) {
		System.out.println("Web Container is proessing request with data "+data+" by passing it to Handler.." );
		rh.handleRequest(data);
	}
}
