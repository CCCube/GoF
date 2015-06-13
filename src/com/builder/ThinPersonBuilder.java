package com.builder;

public class ThinPersonBuilder extends Builder{

	public ThinPersonBuilder(Person person) {
		super(person);
	}

	@Override
	public void buildHead() {
		person.setHead("瘦子的头部");
	}

	@Override
	public void buildBody() {
		person.setBody("瘦子的身体");

	}

	@Override
	public void buildArm() {
		person.setArm("瘦子的手臂");
		
	}

	@Override
	public void buildLeg() {
		person.setLeg("瘦子的大腿");
	}

}
