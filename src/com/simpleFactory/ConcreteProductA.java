package com.simpleFactory;

public class ConcreteProductA extends Product {

	@Override
	public void operation() {
		System.out.println("I am concreteProductA.....");
	}

	// 继承抽象类，实现抽象函数，变成具体类。  
	//抽象类与普通类的区别：抽象类不能直接实例化，只能被继承，而且是1：1继承，java不能多继承
	//可以定义普通函数（有函数体实现） 可以定义和使用普通字段
	public static void main(String[] agrs) {
		ConcreteProductA concreteProductA = new ConcreteProductA();
		concreteProductA.setString("invoking Product`s setString()");
		System.out.println(concreteProductA.getString());
		concreteProductA.operation();
					
	}
}