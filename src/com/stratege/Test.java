package com.stratege;

public class Test {

	public static void main(String[] args) {
		
		Stratege concreteStrategeA = new ConcreteStrategeA();
		Stratege concreteStrategeB = new ConcreteStrategeB();
		
		Context context1 = new Context(concreteStrategeA);
		context1.ExecuteAlgorithm();
		
		Context context2 = new Context(concreteStrategeB);
		context2.ExecuteAlgorithm();
		
		
	}

}
