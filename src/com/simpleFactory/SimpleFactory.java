package com.simpleFactory;

public class SimpleFactory {

	public static Product createProduct(int productType){
		
		Product product = null;
		
		// swithc÷–Only convertible int values or enum constants are permitted
		
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
