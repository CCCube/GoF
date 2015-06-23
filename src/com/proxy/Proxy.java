package com.proxy;
// 实现Subject接口，覆盖接口方法
public class Proxy implements Subject {
	// 维护一个具体实现RealSubject，并在构造阶段时候生成实例
	// 通过Proxy来访问RealSubject
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
