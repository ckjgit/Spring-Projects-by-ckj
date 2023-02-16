package com.nt.test;

interface inter{
	public int square(int a); //method wit return type
}

public class SquareIt {

	public static void main(String[] args) {
		//inter i=a->System.out.println(a*a); //for void return type method
		inter i=a->a * a; // for return type method
		System.out.print(i.square(6));

	}

}



