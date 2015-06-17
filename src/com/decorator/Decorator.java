package com.decorator;
// 继承于Component，从外类来扩展Component类的功能
public class Decorator extends Component {

	// 组合使用接口component，用于接收具体的构建实现ConcreteComponent，多态。
	protected Component component;
	
	public  void setComponent(Component component) {
		this.component = component;
	}
	
	
	// 调用具体构建的基本实现函数
	// 如 mysql的访问操作
	@Override
	public  void operation(){
		if(component!=null){
			this.component.operation();
		}
	}
	
}
