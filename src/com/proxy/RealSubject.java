package com.proxy;
//具体RealSubject，实现了Subject的方法
//需要进行代理的对象，不直接暴露给client
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
