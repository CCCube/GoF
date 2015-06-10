package com.builder;

public class FatPersonBuilder extends Builder{

	public FatPersonBuilder(Person person) {
		super(person);
	}

	@Override
	public void buildHead() {
		person.setHead("胖子的脑袋");
		
	}

	@Override
	public void buildBody() {
		person.setBody("胖子的身体");
		
	}

	@Override
	public void buildArm() {
		person.setArm("胖子的手臂");
		
	}

	@Override
	public void buildLeg() {
		person.setLeg("胖子的大腿");
		
	}

}
