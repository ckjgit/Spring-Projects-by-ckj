package com.nt.listener;

import java.util.Date;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

public class IOC_ContainerMoniteringListener implements ApplicationListener {

	private long start,end;
	
	@Override
	public void onApplicationEvent(ApplicationEvent e) {
		
		//when IOC Container is created
		if(e.toString().indexOf("ContextRefreshed")!=-1) {
			start=System.currentTimeMillis();
			System.out.println("\n\n IOC Container Started at "+new Date());
		}
		//when IOC Container is Stopped
		else if(e.toString().indexOf("ContextClosed")!=-1) {
			end=System.currentTimeMillis();
			System.out.println("\n\n IOC Container Stopped at "+new Date());
			System.out.println("\n\n IOC Container Active Duration is "+(end-start)+" Milli Seconds.  (:");
		}
	}

}
