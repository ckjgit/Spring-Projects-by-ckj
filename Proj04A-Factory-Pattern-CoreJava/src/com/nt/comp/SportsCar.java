package com.nt.comp;

public class SportsCar implements Car{
	private Tyre tyre;
	
	public SportsCar(Tyre tyre) {
		System.out.println("SportsCar : 1 - PAram Constructor");
		
		this.tyre=tyre;
	}
	
	@Override
	public void drive() {
		System.out.println("Driving Sports car having "+tyre.roadGrip());
	}

}
