package com.nt.comp;

import java.util.Arrays;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public final class Flipkart {
	//Setting @Autowire annotation
//	@Autowired
	//@Qualifier("dtdc")
	//@Qualifier("bDart")
	private Courier courier=null;
	
	public Flipkart() {
		System.out.println("Flipkart :: 0 - Param constructor");
	}
	
	@Autowired
	public Flipkart(Courier courier) {
		System.out.println("Flipkart : : 1-Param constructor");
		this.courier=courier;
	}
	

	 public String shopping(String[] items, float[] prices) {
		 System.out.println("Flipkart.shopping()");
		 
		 float billAmt=0.0f;
		 int oid=0;
		 String msg="";
		
		 // calculate bill amount
		 for(float f:prices)
			 billAmt +=f;
		 
		 //generate order id as random number
		 oid=new Random().nextInt(10000); //generates 0 - 9999 random number
		 
		 //or  
		 
//		 oid=(int) Math.random();
		 
		 // use courier services to deliver the products
		 
		 msg=courier.deliver(oid);
		
		 // return courier details and bill amt to customer
		 
		 return "From Flipkart\n Dear Customer"+Arrays.toString(items)+" are purchased having prices "+Arrays.toString(prices)+" \n with bill amount "+billAmt+"---"+msg;	
		 
	 }
	
}
