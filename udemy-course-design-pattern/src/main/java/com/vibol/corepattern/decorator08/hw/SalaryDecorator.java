package com.vibol.corepattern.decorator08.hw;

public class SalaryDecorator implements Salary {
	
	protected Salary salary;
	
	public SalaryDecorator(Salary salary) {
        this.salary = salary;
    }

	@Override
	public double calculate() {
		
		return salary.calculate();
	}

}
