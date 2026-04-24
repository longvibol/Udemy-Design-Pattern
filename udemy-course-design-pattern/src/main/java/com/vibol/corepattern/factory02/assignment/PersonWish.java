package com.vibol.corepattern.factory02.assignment;

public class PersonWish {

	public Person persion(String gender, String wish) {

		Person persion = PersonFactory.createWishing(gender);
		persion.wish(wish);

		return persion;
	}

}
