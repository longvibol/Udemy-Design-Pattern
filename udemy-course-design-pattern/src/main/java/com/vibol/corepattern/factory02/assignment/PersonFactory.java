package com.vibol.corepattern.factory02.assignment;

public class PersonFactory {

	public static Person createWishing(String gender) {
		
		Person p = null;
		if (gender.equals("male")) {
			p = new Male();
		} else if (gender.equals("female")) {
			p = new Female();
		}

		return p;
	}

}
