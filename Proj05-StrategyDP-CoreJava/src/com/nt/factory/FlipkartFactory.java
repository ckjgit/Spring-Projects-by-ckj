package com.nt.factory;

import com.nt.comp.BlueDart;
import com.nt.comp.Courier;
import com.nt.comp.DTDC;
import com.nt.comp.Flipkart;

public class FlipkartFactory {
	
	public static Flipkart getInstance(String courierName) {
		
		Courier courier=null;
		Flipkart fkt=null;
		
		if(courierName.equalsIgnoreCase("DTdc")) 
			courier=new DTDC();
		else if(courierName.equalsIgnoreCase("BlueDARt"))
			courier=new BlueDart();
		else
			 throw new IllegalArgumentException("Invalid Courier Name  ):");
		
		fkt=new Flipkart();
		fkt.setCourier(courier);
		
		return fkt;
		
	}

}
