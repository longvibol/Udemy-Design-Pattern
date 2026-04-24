package com.vibol.corepattern.flyweight06;

public class Rectangle extends Shape {
	
	private String lable;

	public Rectangle() {
		lable = "Rectangle";
	}

	@Override
	public void draw(int length, int breadth, String fileStyle) {
		System.out.println("Drawing a " + lable + " with lenght " + length + " Breadth " + breadth 
				+ " File Style " + fileStyle);
	}

}