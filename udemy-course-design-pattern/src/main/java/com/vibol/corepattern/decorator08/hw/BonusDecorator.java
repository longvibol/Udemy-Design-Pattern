package com.vibol.corepattern.decorator08.hw;

public class BonusDecorator extends SalaryDecorator {

	public BonusDecorator(Salary salary) {
		super(salary);
	}
	
	
	// Bonus 200
	public double calculate() {
        return super.calculate() + 200;
    }

}
