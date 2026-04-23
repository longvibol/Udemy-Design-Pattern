package com.vibol.corepattern.AbstractFactory03;

public class DBDeptDao implements Dao {

	@Override
	public void save() {
		System.out.println("Saving Department to Database");
	}

}
