package com.vibol.corepattern.flyweight06;

public class Circle extends Shape {
	
	private String lable;
	
	public Circle() {
		lable = "Circle";
	}

	@Override
	public void draw(int radius, String fillColor, String lineColor) {
		System.out.println("Drawing a " + lable + " with radius " + radius 
				+ " Fill Color " + fillColor + " Line Color " + lineColor);
	}
}