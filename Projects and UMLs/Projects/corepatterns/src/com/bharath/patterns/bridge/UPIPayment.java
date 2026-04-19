package com.bharath.patterns.bridge;

public class UPIPayment extends Payment {
    public UPIPayment(Bank bank) {
        super(bank);
    }

    @Override
    public void makePayment(String accountNumber, double amount) {
        System.out.println("Using UPI Payment...");
        bank.processPayment(accountNumber, amount);
    }
}
