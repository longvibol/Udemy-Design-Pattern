package com.vibol.corepattern.decorator08;

public class CheesePizzaDecorator extends PizzaDecorator {

	// contractor then it called the base pizza first 
	public CheesePizzaDecorator(Pizza pizza) {
		super(pizza);
	}

	public void bake() {
		super.bake();
		System.out.println("Adding Cheese toppings");
	}
}
