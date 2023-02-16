package com.nt.factory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import com.nt.comp.BlueDart;
import com.nt.comp.Courier;
import com.nt.comp.DTDC;
import com.nt.comp.Flipkart;

public class FlipkartFactory {
	private static Properties props;
	
	static {

			try {
				//Locate properties file
				   InputStream is=new FileInputStream("src/com/nt/commons/info.properties");
				   
				//creating properties class object
				   props=new Properties();
				//load properties file data info to java.util.properties object
				   props.load(is);
				   
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			

	}
	
	
	public static Flipkart getInstance()  {
		
		Courier courier=null;
		Flipkart fkt=null;
		
		// get dependency class name from properties collection(props)
		//load and instantiate that class
		
		try {
			courier=(Courier)Class.forName(props.getProperty("dependent.courier")).newInstance();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("It seems there is some problems in Dependency Management  ):");
		}
		
		fkt=new Flipkart();
		fkt.setCourier(courier);
		
		return fkt;
		
	}

}
