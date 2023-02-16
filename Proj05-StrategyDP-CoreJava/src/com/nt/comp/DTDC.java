package com.nt.comp;

public final class DTDC implements Courier{

	 public DTDC() {
		System.out.println("DTDC :: 0 - Param constructor");
	}
	public String deliver(int oid) {
		
		System.out.println("DTDC.deliver()");	 	 
		
		return "DTDC Courier will deliver product having Order id :"+oid+" order products.";
	}
}
