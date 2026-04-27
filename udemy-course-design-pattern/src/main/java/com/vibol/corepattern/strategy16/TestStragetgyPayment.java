package com.vibol.corepattern.strategy16;

public class TestStragetgyPayment {

	public static void main(String[] args) {
		PaymentContext context = new PaymentContext();
		context.setStrategy(new CreditCardPayment());
		context.excutePayment(1000);
		
		
		context.setStrategy(new UPIPayment());
		context.excutePayment(1500);
		
	}

}
