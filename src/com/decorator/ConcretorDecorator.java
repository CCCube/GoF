package com.decorator;

public class ConcretorDecorator extends Decorator {

	// 在具体构建函数上需要增加的新功能
	// 如 访问mysql之后，查询得数据要放进一个文件中用于后续操作，可以动态的加上去
	public void specialOperation(){
		System.out.println("And I have my own special operation");
	}
	
	// 覆盖父类Decorator的实现方法，调用父类的方法同时加上自己的额外方法
	@Override
	public void operation(){
		super.operation();
		this.specialOperation();
	}
}
