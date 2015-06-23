package com.cf.dependency;

public class A {

	private InterfaceB bb = null;
	
	public A(){
		// 设计关系为先有B类具体实现，再有A类对B类具体实现的依赖
		
		// 声明并初始化需要依赖的类B
		// 耦合关系产生，一旦需要修改InterfaceB的另一实现，
		// 除了修改InterfaceB接口的实现代码，还需要修改A内的代码，耦合关系不利于代码维护
		 bb = new B();
	}
	
	
	public void a(){
		System.out.println("I am function a() of Class A,I will call B.b()");
		bb.b();
	}
	
	
}
