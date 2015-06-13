package com.builder;

// product:person  人可分为具体的瘦子，肥仔等类别   
// 若product：sql，则有mysql、nosql等，属性值可以有版本号，引擎，编码等
public class Person {

	public String head;
	
	public String body;
	
	public String arm;
	
	public String leg;

	
	
	public String getHead() {
		return head;
	}

	public void setHead(String head) {
		this.head = head;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public String getArm() {
		return arm;
	}

	public void setArm(String arm) {
		this.arm = arm;
	}

	public String getLeg() {
		return leg;
	}

	public void setLeg(String leg) {
		this.leg = leg;
	}
	
	
}
