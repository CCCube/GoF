package com.bridge;

public class Test {

	public static void main(String[] args) {

		Implementor implementor1 = new ConcreteImplementorA();
		Implementor implementor2 = new ConcreteImplementorB();
		//水平扩展Implementor新的实现时，只需要传入新的Implementor具体实现子类
		//不需要修改或者很少修改Abstraction内部的代码
		Abstraction abstraction = new RefinedAbstraction();
		abstraction.setImplementor(implementor1);
		abstraction.operation();
		
		abstraction.setImplementor(implementor2);
		abstraction.operation();
	}

}
