package com.vibol.corepattern.observer15;

public class MobileDisplay implements Observer {

	@Override
	public void update(double price) {
		System.out.println("Web Display: Stock price update to: " + price);

	}

}
