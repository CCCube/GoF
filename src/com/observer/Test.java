package com.observer;

public class Test {

	public static void main(String[] args) {

		ConcreteSubject concreteSubject = new ConcreteSubject();
		
		ConcreteObserver concreteObserver1 = new ConcreteObserver(concreteSubject, "concreteSubject1");
		ConcreteObserver concreteObserver2 = new ConcreteObserver(concreteSubject, "concreteSubject2");
		ConcreteObserver concreteObserver3 = new ConcreteObserver(concreteSubject, "concreteSubject3");

		concreteSubject.attach(concreteObserver1);
		concreteSubject.attach(concreteObserver2);
		concreteSubject.attach(concreteObserver3);

		concreteSubject.setSubjectState("I am your ssssubject....");
		concreteSubject.Notify();
		
		concreteSubject.setSubjectState("Now I changeeeeeeee....");
		concreteSubject.Notify();
		
	}

}
