package com.adapter;
//需要适配的类或接口，适配到Target里面去
public class Adaptee {
	//需要适配新的实现的函数
	public void specialRequest(){
		System.out.println("I am Adaptee's specialRequest..");
	}
}
