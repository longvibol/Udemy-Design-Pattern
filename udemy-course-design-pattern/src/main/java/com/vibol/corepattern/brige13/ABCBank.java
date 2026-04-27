package com.vibol.corepattern.brige13;

public class ABCBank implements Bank {

	@Override
	public void processPayment(String accountNumber, double amount) {
		System.out.println("Processing Payment of " + amount + 
				" Through ABC Bank for the account " + accountNumber);
	}

}
