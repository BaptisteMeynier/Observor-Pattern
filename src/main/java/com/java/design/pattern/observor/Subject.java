package com.java.design.pattern.observor;

public interface Subject {

	int getState();

	void setState(int state) ;

	 void attach(Observer observer);

	void removeListener(Observer observer);

	 void notifyAllObservers();
	
}
