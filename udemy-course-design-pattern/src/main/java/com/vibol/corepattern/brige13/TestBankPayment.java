package com.vibol.corepattern.brige13;

public class TestBankPayment {

	public static void main(String[] args) {
		ABCBank abcBank = new ABCBank();
		XYZBank xyzBank = new XYZBank();
		
		UPIPayment upiPayment = new UPIPayment(abcBank);
		upiPayment.makePayment("abcl123", 1000);
		
		CardPayment cardPayment = new CardPayment(xyzBank);
		cardPayment.makePayment("xyz123", 2000);
		
	}

}
