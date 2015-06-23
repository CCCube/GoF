package com.cf.ioc;

public class Test {

	public static void main(String[] args) {
		// 具体实现类B和B2分别实例化
		B b = new B();
		B2 b2 = new B2();
		// 指向B类b的具体实现
		A a = new A(b);
		a.a();
		// 指向B2类b2的具体实现
		A a2 = new A(b2);
		a2.a();
		
	}

}
