package com.vibol.corepattern.adapter05.hw01;

public class PaymentProcessorImpl implements PaymentProcessor{
	
	
	@Override
	public Double pay(Double dollars) {
		Double riel = dollars * 4000; // convert
        return riel;
	}

}
