package com.bridge;
//提炼的抽象？
public class RefinedAbstraction extends Abstraction{

	@Override
	public void operation() {
		super.implementor.operation();
	}
	
}
