package com.nt.test;

import com.nt.comp.Car;
import com.nt.factory.CarFactory;

public class Factory_Pattern_Test {

	public static void main(String[] args) {
		Car car=null;
		car=CarFactory.getInstance("LuXory");
		car.drive();
		System.out.println("=========================================================");
		car=CarFactory.getInstance("Sports");
		car.drive();
		System.out.println("=========================================================");
		car=CarFactory.getInstance("Budget");
		car.drive();
	}

}
