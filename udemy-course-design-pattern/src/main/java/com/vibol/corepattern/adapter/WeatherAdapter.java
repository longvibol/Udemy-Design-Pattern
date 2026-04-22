package com.vibol.corepattern.adapter;

public class WeatherAdapter {
	
	public int findTemperature(int zipCode) {
		
		String city = null;
		
		if(zipCode == 12345) {
			
			city = "Phnom Penh";
			
		}
		
		WeatherFinder finder = new WeatherFinderImpl();
		
		int temperature = finder.find(city);
		
		return temperature;
		
	}

}
