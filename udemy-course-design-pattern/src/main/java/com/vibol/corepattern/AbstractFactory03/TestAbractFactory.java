package com.vibol.corepattern.AbstractFactory03;

public class TestAbractFactory {

	public static void main(String[] args) {
		DaoAbstractFactory daf = DaoFactoryProducer.produce("db"); 
		Dao dao = daf.createDao("dept");
		dao.save();

	}

}
