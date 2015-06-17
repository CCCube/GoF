package com.decorator;

public class ConcreteComponent extends Component {

	//具体构建是实现
	// 例如实现了mysql的数据库访问操作
	@Override
	public  void operation(){
	
		System.out.println("I am ConcreteComponentA");
		
	}

}
