package com.vibol.corepattern.flyweight06.issue;

public class Circle implements Shape {
	
	private String lable;
	private int radius;
	private String fillColor;
	private String lineColor;
	
	
	public Circle() {
		lable = "Circle";
	}

	@Override
	public void draw() {
		System.out.println("Drawing a " + lable + " with radius " + radius + " Fill Color " + fillColor + " Line Color " + lineColor);

	}

	public String getLable() {
		return lable;
	}

	public void setLable(String lable) {
		this.lable = lable;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public String getFillColor() {
		return fillColor;
	}

	public void setFillColor(String fillColor) {
		this.fillColor = fillColor;
	}

	public String getLineColor() {
		return lineColor;
	}

	public void setLineColor(String lineColor) {
		this.lineColor = lineColor;
	}

}
