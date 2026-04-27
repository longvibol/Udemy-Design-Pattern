package com.vibol.corepattern.Facade11;

public class TestFacde {

	public static void main(String[] args) {
		
		OrderFacade facade = new OrderFacade();		
		facade.processOrder("MacBook", 3);

	}

}
