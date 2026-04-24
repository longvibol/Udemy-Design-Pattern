package com.vibol.corepattern.decorator08.hw;

public class TaxDecorator extends SalaryDecorator {

	public TaxDecorator(Salary salary) {
		super(salary);
	}
	
	public double calculate() {
	        return super.calculate() - 50;
	    }

}
