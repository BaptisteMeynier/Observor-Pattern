package com.java.design.pattern.observor.impl;

import com.java.design.pattern.observor.Observer;
import com.java.design.pattern.observor.Subject;

public class BinaryObserver extends Observer{

	public BinaryObserver(Subject subject){
		this.subject = subject;
		this.subject.attach(this);
	}

	@Override
	public void update() {
		System.out.println( "Binary String: " + Integer.toBinaryString( subject.getState() ) ); 
	}
}
