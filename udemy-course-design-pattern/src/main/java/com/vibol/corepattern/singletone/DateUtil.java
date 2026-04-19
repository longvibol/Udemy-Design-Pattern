package com.vibol.corepattern.singletone;

import java.io.Serializable;

public class DateUtil implements Serializable, Cloneable{

	private static final long serialVersionUID = 1L;

	private static volatile DateUtil instance;


	private DateUtil() {

	}

	public static DateUtil getInstance() {
		if (instance == null) {
			synchronized (DateUtil.class) {
				if (instance == null) {
					instance = new DateUtil();
				}
			}
		}
		return instance;
	}
	
	private Object readResolve() {
	    return getInstance();
	}
	
	protected Object clone() throws CloneNotSupportedException{
		throw new CloneNotSupportedException();
	}	

}
