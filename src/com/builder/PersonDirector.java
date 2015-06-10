package com.builder;

public class PersonDirector {

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
