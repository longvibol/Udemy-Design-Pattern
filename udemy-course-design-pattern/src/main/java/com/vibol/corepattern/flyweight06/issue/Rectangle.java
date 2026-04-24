package com.vibol.corepattern.flyweight06.issue;

public class Rectangle implements Shape {
	
	private String lable;
	private int length;
	private int breadth;
	private String fileStyle;

	public Rectangle() {
		lable = "Rectangle";
	}

	@Override
	public void draw() {
		System.out.println("Drawing a " + lable + " with lenght " + length + " Breadth " + breadth 
				+ " File Style " + fileStyle);
	}

	public String getLable() {
		return lable;
	}

	public void setLable(String lable) {
		this.lable = lable;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getBreadth() {
		return breadth;
	}

	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}

	public String getFileStyle() {
		return fileStyle;
	}

	public void setFileStyle(String fileStyle) {
		this.fileStyle = fileStyle;
	}
}