package com.vibol.corepattern.Facade11;

public class OrderFacade {
	
	private OrderProcessor processor = new OrderProcessor();

	public void processOrder(String name, int qty) {
		
		if (processor.checkStock(name)) {
			String orderId = processor.placeOrder(name, qty);
			processor.ship(orderId);
		}
		
	}
}
