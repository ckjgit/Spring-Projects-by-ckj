package com.nt.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class MyComparator implements Comparator<Integer>{
	public int compare(Integer i1, Integer i2) {
		if(i1 < i2)
			return -1;
		else if(i1 > i2)
			return +1;
		else
			return 0;
	}
}

public class Test {

	public static void main(String[] args) {
		ArrayList<Integer> l=new ArrayList<Integer>();
		l.add(20);
		l.add(10);
		l.add(25);
		l.add(5);
		
		System.out.println(l);
		Collections.sort(l);
		
		System.out.println(l);
		
		Collections.sort(l, new MyComparator());
		System.out.println(l);
		

	}

}
