package com.vibol.corepattern.templatemethod;

public abstract class DataRender {

	public void render() {
		
		String data = readData();
		String processData = processData(data);
		System.out.println(processData);
		
	}
	
	public abstract String readData();
	public abstract String processData(String data);
	
}
