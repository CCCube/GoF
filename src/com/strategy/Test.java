package com.strategy;

public class Test {

	public static void main(String[] args) {
		
		Strategy concreteStrategyA = new ConcreteStrategyA();
		Strategy concreteStrategyB = new ConcreteStrategyB();
		
		// context可以自由的选择实现的Strategy，而不需再次修改Context内部的代码
		// 将context与具体的Strategy解耦
		Context context1 = new Context(concreteStrategyA);
		context1.getStrategy().Algorithm();
		
		Context context2 = new Context(concreteStrategyB);
		context2.getStrategy().Algorithm();
		
		
	}

}
