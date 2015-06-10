package com.proxy;

public class Text {

	public static void main(String[] args) {

		Subject subjectProxy = new Proxy(new RealSubject());
		subjectProxy.func1();
		subjectProxy.func2();
		
	}

}
