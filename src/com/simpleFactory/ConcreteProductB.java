package com.simpleFactory;
//具体产品B
public class ConcreteProductB extends Product {

	//B产品特定的方法
	@Override
	public void operation() {
		System.out.println("I am concreteProductB.....");
	}
}