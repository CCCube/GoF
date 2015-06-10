package com.proxy;

public class RealSubject implements Subject {

	@Override
	public void func1() {
		System.out.println("I am func1");
	}

	@Override
	public void func2() {
		System.out.println("I am func2");
	}

	
	
}
