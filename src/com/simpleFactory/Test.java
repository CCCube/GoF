package com.simpleFactory;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
				
		Product productA = SimpleFactory.createProduct(1);
		
		Product productB = SimpleFactory.createProduct(2);

		productA.operation();
		
		productB.operation();
		
	}

}
