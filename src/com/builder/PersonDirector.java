package com.builder;

public class PersonDirector {

	// 指挥并构造一个使用Builder接口的对象。 指挥builder生成产品的过程。
	Builder builder;
	
	public PersonDirector(Builder personBuilder) {
		this.builder = personBuilder;
	}
	
	public Person buildePerson(){
		builder.buildArm();
		builder.buildBody();
		builder.buildHead();
		builder.buildLeg();
		return builder.getPerson();
	}
}
