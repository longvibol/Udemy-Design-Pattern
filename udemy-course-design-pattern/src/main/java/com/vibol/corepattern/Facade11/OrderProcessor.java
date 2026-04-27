package com.vibol.corepattern.Facade11;

public class OrderProcessor {
	
	public boolean checkStock(String name) {
		System.out.println("Checking stock");
		return true;
	}
	
	public String placeOrder(String name, int qty) {
		System.out.println("Order Placed");
		return "abc123";
	}
	
	public void ship(String orderId) {
		System.out.println("Order Shipped");
	}

}
