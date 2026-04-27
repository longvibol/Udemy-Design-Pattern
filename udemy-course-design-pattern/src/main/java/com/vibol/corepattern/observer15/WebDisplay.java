package com.vibol.corepattern.observer15;

public class WebDisplay implements Observer {

	@Override
	public void update(double price) {
		System.out.println("Mobile Display: Stock price update to: " + price);

	}

}
