package com.vibol.corepattern.templatemethod.hw;

public class TestComputerManufacturer {

	public static void main(String[] args) {

		ComputerManufacturer laptop = new LaptopManufacturer();
		ComputerManufacturer destop = new DesktopManufacturer();

		laptop.buildComputer();
		destop.buildComputer();
		
	}

}
