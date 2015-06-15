package com.simpleFactory;

public abstract class Product {

	// 抽象产品
	public Product(){
		
	}
	
	// 抽象产品具有的方法
	public abstract void operation();
	
	// 抽象产品的名字
	public String string ;

	// getters and setters

	public String getString() {
		return string;
	}

	public void setString(String string) {
		this.string = string;
	}

	


}
