package com.vibol.corepattern.templatemethod04.hw;

public abstract class ComputerManufacturer {
	
	public void buildComputer() {
		
		String addHD = addHardDisk();
		String addRam = addHardRAM();
		String addKb = addKeyboard();
		System.out.println("Build Step - " + "step 1 :" + addHD + 
				"; step 2 :" + addRam + 
				"; step 3 :" + addKb);
		
	}
	
	public abstract String addHardDisk();
	public abstract String addHardRAM();
	public abstract String addKeyboard();

}
