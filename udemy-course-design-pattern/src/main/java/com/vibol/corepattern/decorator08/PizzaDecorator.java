package com.vibol.corepattern.decorator08;

public class PizzaDecorator implements Pizza {
	
	//It stores another Pizza object inside : This is called wrapping
	private Pizza pizza;
	
	
	//Now this decorator is wrapping that pizza
	public PizzaDecorator(Pizza pizza) {
		this.pizza = pizza;
	}

	@Override
	public void bake() {
		pizza.bake();
	}

	
	/*
	🍕 Simple Analogy

	Think of this class like a transparent box:

	You put a pizza inside 📦🍕
	The box itself does nothing
	But later, you can create special boxes:
	Veggie box → adds toppings
	Cheese box → adds cheese
	
	*/
}
