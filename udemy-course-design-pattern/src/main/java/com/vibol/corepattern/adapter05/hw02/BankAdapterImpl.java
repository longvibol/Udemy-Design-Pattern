package com.vibol.corepattern.adapter05.hw02;

public class BankAdapterImpl implements PaymentProcessor {

    private BankAPI bankAPI = new BankAPI();

    private static final double EXCHANGE_RATE = 4000;

    @Override
    public Double pay(Double amountInUSD) {

        // Convert USD → Riel
        Double amountInRiel = amountInUSD * EXCHANGE_RATE;

        // Call external API
        Double result = bankAPI.makePaymentInRiel(amountInRiel);

        return result;
    }
}