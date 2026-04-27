package com.vibol.corepattern.brige13;

public class CardPayment extends Payment {

	public CardPayment(Bank bank) {
		super(bank);
		
	}

	@Override
	public void makePayment(String accountNumber, double amount) {
		System.out.println("Using Credit Card Payment");
		bank.processPayment(accountNumber, amount);

	}

}
