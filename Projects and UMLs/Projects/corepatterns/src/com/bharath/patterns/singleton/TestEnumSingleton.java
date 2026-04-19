package com.bharath.patterns.singleton;

public class TestEnumSingleton {

	public static void main(String[] args) {
		EnumSingletonDemo instance = EnumSingletonDemo.INSTANCE;
		System.out.println(instance.getName());
		instance.setName("Bharath");
		System.out.println(instance.getName());

	}

}
