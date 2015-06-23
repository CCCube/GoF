package com.cf.ioc;

public class A {

	private InterfaceB bb = null;
	
	public A(InterfaceB sourceB){
		//设计顺序为：先A和InterfaceB，而不必先有具体的实现，基于接口驱动开发
		// 例:一个Service需要存储应用数据到数据库，先设计好一个DAO dao,dao.save();
		// 而DAO是接口，再有具体的实现子类函数来实现，那么就可以存储到mysql或者nosql等实现
		// 而不必修改Service中的一行代码。
		
		// 依赖注入：基于构造器注入，XML配置getter and setter注入等。
		// 注入具体的类名通过java的反射机制来寻找类的所有fileds and methods
		
		// 将InterfaceB sourceB作为参数传进来，可以传入InterfaceB的具体实现类(依赖注入)
		// Class A本身指向的是InterfaceB，依赖的是接口InterfaceB
		// 当需要修改InterfaceB的具体实现时，只需要将不同的子类实现传递进来，根据多态动态
		// 绑定到子类上，即可调用子类的功能，于是将A与具体的InterfaceB实现类解耦
		
		// A-->B 控制，A-->InterfaceB， InterfaceB<--B，反转
		
		 bb = sourceB;
	}
	
	
	public void a(){
		System.out.println("I am function a() of Class A,I will call B.b()");
		bb.b();
	}
	
	
}
