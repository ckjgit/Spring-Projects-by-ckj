package com.csm.main;

import com.csm.test.Test;

public class CreateObjectWithout_new_CLA {
	public static void main(String[] args) {
		
		Class c=null;
		Object obj=null;
		
		try {
			c=Class.forName(args[0]);
			
			obj=c.newInstance();
			
			//obj.toString();
			
			Test t=(Test)obj;
			t.Test01();
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
