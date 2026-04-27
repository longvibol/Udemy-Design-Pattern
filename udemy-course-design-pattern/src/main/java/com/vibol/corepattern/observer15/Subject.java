package com.vibol.corepattern.observer15;

public interface Subject {

	void register(Observer observer);
	void remove(Observer observer);
	void notifyObservers();
}
