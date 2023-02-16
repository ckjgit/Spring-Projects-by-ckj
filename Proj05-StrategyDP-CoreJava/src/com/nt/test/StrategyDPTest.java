package com.nt.test;

import com.nt.comp.Courier;
import com.nt.comp.Flipkart;
import com.nt.factory.FlipkartFactory;

public class StrategyDPTest {
	public static void main(String[] args) {
		
		
		Flipkart fkt=null;
		
		
		//factory method for getting DTDC class Object
		fkt=FlipkartFactory.getInstance("DTdC");
		
		System.out.println(fkt.shopping(new String[] {"Umbrella, RianCoat, Medicine"},
										
										new float[] {765.7f,800,923}));
		
	}
}
