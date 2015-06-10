package com.decorator;

public class ConcretorDecorator extends Decorator {

	public void specialOperation(){
		System.out.println("And I have my own special operation");
	}
	
	@Override
	public void operation(){
		super.operation();
		this.specialOperation();
	}
}
