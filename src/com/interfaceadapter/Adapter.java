package com.interfaceadapter;


public class Adapter extends Target implements Adaptee{

	@Override
	public void specialRequest() {
		System.out.println("I am Adaptee's specialRequest..");
	}

	
	@Override
	public void request(){
		specialRequest();
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Target target = new Adapter();
		target.request();
	}

}
