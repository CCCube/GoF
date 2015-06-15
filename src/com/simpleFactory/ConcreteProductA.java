package com.simpleFactory;
// 具体产品A
public class ConcreteProductA extends Product {

	// A产品特定的方法
	@Override
	public void operation() {
		System.out.println("I am concreteProductA.....");
	}

}