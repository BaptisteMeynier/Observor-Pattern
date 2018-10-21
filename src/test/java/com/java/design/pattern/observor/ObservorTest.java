package com.java.design.pattern.observor;

import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.java.design.pattern.observor.impl.BinaryObserver;
import com.java.design.pattern.observor.impl.HexaObserver;
import com.java.design.pattern.observor.impl.OctalObserver;

public class ObservorTest {

	@BeforeEach
	public void separation() {
		System.out.println("__________________________");	
	}
	
	@Test
	public void should_print_hexa_Value_for_MemoryLeakPreventing_impl_when_state_change() {
		 SubjectMemoryLeakPreventing subject = new SubjectMemoryLeakPreventing();
		 new HexaObserver(subject);
		 subject.setState(15);
	}
	
	@Test
	public void should_trigger_all_observer_for_MemoryLeakPreventing_impl_when_state_change() {
		SubjectMemoryLeakPreventing subject = new SubjectMemoryLeakPreventing();

	      new HexaObserver(subject);
	      new OctalObserver(subject);
	      new BinaryObserver(subject);

	      System.out.println("First state change: 15");	
	      subject.setState(15);
	      System.out.println("Second state change: 10");	
	      subject.setState(10);
	}
	
	@Test
	public void should_print_hexa_Value_for_SubjectWithPermanentObserver_impl_when_state_change() {
		 SubjectWithPermanentObserver subject = new SubjectWithPermanentObserver();
		 new HexaObserver(subject);
		 subject.setState(15);
	}
	
	@Test
	public void should_trigger_all_observer_for_SubjectWithPermanentObserver_impl_when_state_change() {
		SubjectWithPermanentObserver subject = new SubjectWithPermanentObserver();

	      new HexaObserver(subject);
	      new OctalObserver(subject);
	      new BinaryObserver(subject);

	      System.out.println("First state change: 15");	
	      subject.setState(15);
	      System.out.println("Second state change: 10");	
	      subject.setState(10);
	}
	
	
	@Test
	public void should_remove_observer_for_MemoryLeakPreventing_impl_when_perform_gc() {
		SubjectMemoryLeakPreventing subject = new SubjectMemoryLeakPreventing();

	      new HexaObserver(subject);
	      new OctalObserver(subject);
	      new BinaryObserver(subject);

	      System.out.println("First state change: 15");	
	      subject.setState(15);
	      System.out.println("Second state change: 10");	
	      subject.setState(10);
	      System.out.println("Perform gc");
	      System.gc();
	      subject.setState(20);
	      System.out.println("Should not have print between 'Perform gc' and this one");
	}
	
	
}
