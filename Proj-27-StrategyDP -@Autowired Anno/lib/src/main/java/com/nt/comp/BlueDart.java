package com.nt.comp;

public final class BlueDart implements Courier {
	
	public BlueDart() {
		System.out.println("BlueDart :: 0 - Param constructor");
	}
	
	public String deliver(int oid) {
		System.out.println("BlueDart.deliver()");
		
		return "BlueDart Courier will deliver product having Order id :"+oid+" order products.";
	}
}
