package com.vibol.corepattern.strategy16;

public class CreditCardPayment implements PaymentStrategy {

	@Override
	public void pay(int amount) {
		System.out.println("Paid " + amount 
				+ " using Credit Card");

	}

}
