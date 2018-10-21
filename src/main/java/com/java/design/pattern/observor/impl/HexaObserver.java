package com.java.design.pattern.observor.impl;

import com.java.design.pattern.observor.Observer;
import com.java.design.pattern.observor.Subject;

public class HexaObserver extends Observer{

	public HexaObserver(Subject subject){
		this.subject = subject;
		this.subject.attach(this);
	}

	@Override
	public void update() {
		System.out.println( "Hex String: " + Integer.toHexString( subject.getState() ).toUpperCase() ); 
	}
}
