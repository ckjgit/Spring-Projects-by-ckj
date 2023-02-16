package com.nt.test;

interface Interf02{
	public void add(int a,int b);
}

public class Test02 {

	public static void main(String[] args) {
		Interf02 i=(int x,int y)->System.out.println("The Sum is "+(x+y));
		i.add(12, 23);
		i.add(122, 122);
		i.add(244, 122);
	}

}
