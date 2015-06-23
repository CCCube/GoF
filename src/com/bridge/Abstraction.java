package com.bridge;
// 抽象类，定义方法不具体实现，拥有一个Implementor用于接收具体的实现子类
public abstract class Abstraction {

	protected Implementor implementor;
	
	public void setImplementor(Implementor implementor){
		this.implementor = implementor;
	}
	
	public abstract void operation();
}
