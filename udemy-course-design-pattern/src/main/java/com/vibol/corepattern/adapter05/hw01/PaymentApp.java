package com.vibol.corepattern.adapter05.hw01;

public class PaymentApp {

	public static void main(String[] args) {
		PaymentProcessor processor = new PaymentProcessorImpl();

        Double inDollars = 5d;
        Double result = processor.pay(inDollars);

        System.out.println("USD: " + inDollars + " -> Riel: " + result);

	}

}
