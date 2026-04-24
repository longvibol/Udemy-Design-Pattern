package com.vibol.corepattern.decorator08;

public class VeggiePizzaDecorator extends PizzaDecorator {

	// contractor then it called the base pizza first 
	public VeggiePizzaDecorator(Pizza pizza) {
		super(pizza);
	}

	public void bake() {
		super.bake();
		System.out.println("Adding veggie toppings");
	}
}