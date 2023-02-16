package com.nt.comp;

public class LuxoryCar implements Car{
	private Tyre tyre;
	
	public LuxoryCar(Tyre tyre) {
		System.out.println("LuxoryCar : 1 - PAram Constructor");
		
		this.tyre=tyre;
	}
	
	@Override
	public void drive() {
		System.out.println("Driving Luxory car having "+tyre.roadGrip());
	}

}
