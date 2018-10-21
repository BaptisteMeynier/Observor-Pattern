package com.java.design.pattern.observor;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;

public class SubjectMemoryLeakPreventing implements Subject{
	private Collection<Observer> observers = Collections.newSetFromMap(
			new WeakHashMap<Observer, Boolean>());
	private int state;

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
		notifyAllObservers();
	}

	public void attach(Observer observer){
		observers.add(observer);		
	}

	public void removeListener(Observer observer) {
		observers.remove(observer);
	}

	public void notifyAllObservers(){
		for (Observer observer : observers) {
			observer.update();
		}
	} 	
}
