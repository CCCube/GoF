package com.proxy;

public class Proxy implements Subject {

	protected RealSubject realSubject;
	
	public Proxy(RealSubject realSubject){
		this.realSubject = realSubject;
	}
	
	@Override
	public void func1() {
		realSubject.func1();
	}

	@Override
	public void func2() {
		realSubject.func2();
	}

}
