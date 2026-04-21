package com.vibol.corepattern.factory;

public class PizzaFactory {

	public static Pizza createPizza(String type) {
		Pizza p = null;

		if (type.equals("cheese")) {
			p = new CheesePizza();
		} else if (type.equals("meat")) {
			p = new MeatPizza();
		} else if (type.equals("veg")) {
			p = new VegPizza(); 
		}
  
		return p;
	}

}
