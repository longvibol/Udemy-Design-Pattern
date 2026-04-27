package com.vibol.corepattern.strategy16;

public class PaymentContext {

	private PaymentStrategy strategy;
	
	public void setStrategy(PaymentStrategy strategy) {
		this.strategy = strategy;
	}
	
	public void excutePayment(int amount) {
		strategy.pay(amount);
	}
	
}
