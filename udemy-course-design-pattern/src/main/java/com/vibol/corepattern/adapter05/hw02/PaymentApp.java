package com.vibol.corepattern.adapter05.hw02;

public class PaymentApp {

    public static void main(String[] args) {

        PaymentProcessor processor = new BankAdapterImpl();

        Double usd = 10d;

        Double result = processor.pay(usd);

        System.out.println("Paid " + usd + " USD = " + result + " Riel");
    }
}