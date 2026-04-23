package com.vibol.corepattern.adapter05.hw01;

public class PaymentAdapter {
	
	PaymentProcessor payment = new PaymentProcessorImpl();
	
	Double payInRiel(Double i) {
		
		return payment.pay(i);		
	}
	
}