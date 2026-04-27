package com.vibol.corepattern.observer15;

public class ObserverTest {

	public static void main(String[] args) {
		Stock stock = new Stock();
		
		stock.register(new WebDisplay());
		stock.register(new MobileDisplay());
		
		// when the price is update it will call the Web and Mobile to disply
		
		stock.setPrice(100.6);

	}

}
