package com.builder;

public class FatPersonBuilder extends Builder{

	public FatPersonBuilder(Person person) {
		super(person);
	}

	@Override
	public void buildHead() {
		person.setHead("肥仔的头部");
		
	}

	@Override
	public void buildBody() {
		person.setBody("肥仔的身体");
		
	}

	@Override
	public void buildArm() {
		person.setArm("肥仔的手臂");
		
	}

	@Override
	public void buildLeg() {
		person.setLeg("肥仔的大腿");
		
	}

}
