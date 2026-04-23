package com.vibol.corepattern.adapter05.hw02;

// Simulating third-party API
public class BankAPI {

    // Works only with Riel
    public Double makePaymentInRiel(Double amountInRiel) {
        System.out.println("Processing payment via Bank API...");
        return amountInRiel;
    }
}

/*

		Client (PaymentApp)
        ↓
		Target Interface (PaymentProcessor)
        ↓
		Adapter (BankAdapter)
        ↓
		Adaptee (BankAPI - external system)

*/