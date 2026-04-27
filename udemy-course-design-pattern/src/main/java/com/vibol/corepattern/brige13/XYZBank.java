package com.vibol.corepattern.brige13;

public class XYZBank implements Bank {

	@Override
	public void processPayment(String accountNumber, double amount) {
		System.out.println("Processing Payment of " + amount 
				+ " Through XYZ Bank for the account " + accountNumber);
	}

}
