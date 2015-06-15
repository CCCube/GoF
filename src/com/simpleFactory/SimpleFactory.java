package com.simpleFactory;
// 简单工厂，将客户端与产品的实例化过程解耦出来，客户端只关注使用，不关注生产。
public class SimpleFactory {

	public static Product createProduct(int productType){
		
		Product product = null;
		
		// switch Only convertible int values or enum constants are permitted
		
		switch (productType) {
		case 1:	
			product = new ConcreteProductA();
			break;

		case 2:	
			product = new ConcreteProductB();
			break;
	
		}
		
		return product;
	}
	
}
