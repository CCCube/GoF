package com.bridge;

//6. 模式总结
//
//6.1 优点
//
//　　6.1.1 降低了沿着两个或多个维度扩展时的复杂度，防止类的过度膨胀。
//
//　　6.1.2 解除了两个或多个维度之间的耦合，使它们沿着各自方向变化而不互相影响
//
//6.2 缺点
//
//　　还未发现
//
//6.3 适用场景
//
//　　6.3.1 当一个对象有多个变化因素时，可以考虑使用桥接模式，通过抽象这些变化因素，将依赖具体实现修改为依赖抽象。
//
//　　6.3.2 当我们期望一个对象的多个变化因素可以动态变化，而且不影响客户端的程序使用时。
//
//　　6.3.3 如果使用继承的实现方案，会导致产生很多子类，任何一个变化因素都需要产生多个类来完成，就要考虑桥接模式。

public class Test {

	public static void main(String[] args) {

		Implementor implementor1 = new ConcreteImplementorA();
		Implementor implementor2 = new ConcreteImplementorB();
		
		Abstraction abstraction = new RefinedAbstraction();
		abstraction.setImplementor(implementor1);
		abstraction.operation();
		
		abstraction.setImplementor(implementor2);
		abstraction.operation();
	}

}
