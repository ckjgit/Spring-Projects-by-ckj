package com.nt.beans;

public class RequestHandler {
	private static int count;
	
	
	public RequestHandler() {
		count ++;
		System.out.println("RequestHandler.RequestHandler()==== 0 - param constructor"+count);
	}
	
	public void handleRequest(String data) {
		System.out.println("Handling request with data "+data+" using the object "+count);
	}
	
}
