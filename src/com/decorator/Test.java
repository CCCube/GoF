package com.decorator;


public class Test {

	public static void main(String[] args) {

		ConcreteComponent concreteComponent = new ConcreteComponent();
		concreteComponent.operation();
		
		Decorator decorator = new ConcretorDecorator();
		decorator.setComponent(concreteComponent);
		decorator.operation();
		
	}

}
