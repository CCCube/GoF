package com.simpleFactory;

public abstract class Product {

	// 抽象类可以有默认的构造函数
	public Product(){
		
	}
	
	// 抽象函数加abstract修饰符
	public abstract void operation();
	
	//可以声明和使用字段
	public String string ;

	//可以定义和使用具体方法（必须有方法体）

	public String getString() {
		return string;
	}

	public void setString(String string) {
		this.string = string;
	}

	


}
