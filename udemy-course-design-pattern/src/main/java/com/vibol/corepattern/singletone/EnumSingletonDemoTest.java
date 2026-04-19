package com.vibol.corepattern.singletone;

public class EnumSingletonDemoTest {

	public static void main(String[] args) {

		EnumSingletonDemo instance = EnumSingletonDemo.INSTANCE;
		
		System.out.println(instance.getName());
		
		instance.setName("vibol");
		System.out.println(instance.getName());
	}

}
