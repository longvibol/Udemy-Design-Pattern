package com.vibol.corepattern.decorator08.hw;

public class TestSalary {

	public static void main(String[] args) {
		
		Salary salary = new BaseSalary();
		salary = new BonusDecorator(salary);
		salary = new TaxDecorator(salary);

		System.out.println(salary.calculate());
		
		// 500 + 200 - 50 = 650

	}

}
