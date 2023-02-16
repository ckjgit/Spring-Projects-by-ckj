package com.nt.comp;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("bDart")
//@Primary
public final class BlueDart implements Courier {
	
	public BlueDart() {
		System.out.println("BlueDart :: 0 - Param constructor");
	}
	
	public String deliver(int oid) {
		System.out.println("BlueDart.deliver()");
		
		return "BlueDart Courier will deliver product having Order id :"+oid+" order444444 products.";
	}
}
