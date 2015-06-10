package com.adapter;

// ¶ÔÏóÊÊÅäÆ÷
public class Adapter extends Target{

	Adaptee adaptee = new Adaptee();
	
	@Override
	public void request(){
		adaptee.specialRequest();
	}
	
	
	
	public static void main(String[] args){
		
		Target target = new Adapter();
		
		target.request();
	}
	
}
