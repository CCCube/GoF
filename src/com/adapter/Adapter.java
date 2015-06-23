package com.adapter;
//适配器类，继承客户端目标接口或类Target，重写Target中的功能函数
public class Adapter extends Target{
	// 组合使用一个Adaptee对象，在重写中使用
	Adaptee adaptee = new Adaptee();
	
	//覆盖重写原实现函数
	@Override
	public void request(){
		adaptee.specialRequest();
	}
	
	
	// Test
	public static void main(String[] args){
		// 客户端目标接口或类为 Target
		// 通过Ioc、DI来实例化，java反射
		Target target = new Adapter();
		//适配完毕
		target.request();
	}
	
}
