package com.vibol.corepattern.factory;

public class VegPizza implements Pizza {

	@Override
	public void prepare() {
		System.out.println("Prepare Veg Pizza");

	}

	@Override
	public void bake() {
		System.out.println("Bake Veg Pizza");
 
	}

	@Override
	public void cut() {
		System.out.println("Cut Veg Pizza");

	}

}
