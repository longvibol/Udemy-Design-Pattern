package com.vibol.corepattern.factory02;

public class MeatPizza implements Pizza {

	@Override
	public void prepare() {
		System.out.println("Prepare MeatPizza");

	}
  
	@Override
	public void bake() {
		System.out.println("Bake MeatPizza");

	}

	@Override
	public void cut() {
		System.out.println("Cut MeatPizza");

	}

}
