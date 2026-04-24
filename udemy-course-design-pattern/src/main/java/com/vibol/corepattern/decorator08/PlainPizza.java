package com.vibol.corepattern.decorator08;

public class PlainPizza implements Pizza {
	
	// this class like the plain nothing on it
	// this is the concrete component that implement from pizza

	@Override
	public void bake() {
		System.out.println("Baking Plain Pizza");
	}

}
