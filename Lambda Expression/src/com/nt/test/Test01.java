package com.nt.test;

interface Interf {
	public void m1();
}

public class Test01 {

	public static void main(String[] args) {
		Interf i=()->System.out.println("Achieving Lambda Expression Through Functional Interface");
		i.m1();

	}

}
