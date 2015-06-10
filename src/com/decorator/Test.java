package com.decorator;

//4. 模式总结
//
//4.1 优点
//
//　　4.1.1 每个装饰对象只关心自己的功能，不需要关心如何被添加到对象链当中。它是由Decorator的SetComponent方法来实现的，因而它们的职责是单一的。
//
//　　4.1.2 类的核心职责与动态添加的职责是分离的。如果再向主类中添加新的功能，一是违反了开放封闭原则，二是增加了主类的复杂度。
//
//　　4.1.3 比静态继承更灵活 与对象的静态继承相比，Decorator模式提供了更加灵活的向对象添加职责的方式，可以使用添加和分离的方法，用装饰在运行时刻增加和删除职责.
//
//4.2 缺点
//
//　　4.2.1 产生许多小对象，采用Decorator模式进行系统设计往往会产生许多看上去类似的小对象，这些对象仅仅在他们相互连接的方式上有所不同。
//
//4.3 适用场景
//
//　　4.3.1 当需要为已有功能动态地添加更多功能时。
//
//　　4.3.2 类的核心功能无需改变，只是需要添加新的功能时。

public class Test {

	public static void main(String[] args) {

		//具体构建A本身的operation
		ConcreteComponent concreteComponent = new ConcreteComponent();
		concreteComponent.operation();
		
		//子类装饰器扩展了原先具体构建concreteComponent的功能
		Decorator decorator = new ConcretorDecorator();
		decorator.setComponent(concreteComponent);
		decorator.operation();
		
	}

}
