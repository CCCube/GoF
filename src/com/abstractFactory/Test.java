package com.abstractFactory;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		AbstractFactory sqlFactory = new SqlFactory();
		
		AbstractFactory accessFactory = new AccessFactory();
		
		System.out.println(sqlFactory.createIUser().getName());
		System.out.println(sqlFactory.createIEmployee().getName());
		System.out.println(accessFactory.createIUser().getName());
		System.out.println(accessFactory.createIEmployee().getName());

	}

}
