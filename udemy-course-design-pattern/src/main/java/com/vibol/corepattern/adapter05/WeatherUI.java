package com.vibol.corepattern.adapter05;

public class WeatherUI {

	public void showTemperature(int zipCode) {
		
		WeatherAdapter adapter = new WeatherAdapter();
		System.out.println(adapter.findTemperature(zipCode));
		
	}
	
	public static void main(String[] args) {
		WeatherUI ui = new WeatherUI();
		ui.showTemperature(12345);
	}
}
