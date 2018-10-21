package com.java.design.pattern.observor.impl;

import com.java.design.pattern.observor.Observer;
import com.java.design.pattern.observor.Subject;

public class OctalObserver extends Observer{

	   public OctalObserver(Subject subject){
	      this.subject = subject;
	      this.subject.attach(this);
	   }

	   @Override
	   public void update() {
	     System.out.println( "Octal String: " + Integer.toOctalString( subject.getState() ) ); 
	   }
	}
