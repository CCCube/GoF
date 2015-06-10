package com.builder;

public class FatPersonBuilder extends Builder{

	public FatPersonBuilder(Person person) {
		super(person);
	}

	@Override
	public void buildHead() {
		person.setHead("���ӵ��Դ�");
		
	}

	@Override
	public void buildBody() {
		person.setBody("���ӵ�����");
		
	}

	@Override
	public void buildArm() {
		person.setArm("���ӵ��ֱ�");
		
	}

	@Override
	public void buildLeg() {
		person.setLeg("���ӵĴ���");
		
	}

}
