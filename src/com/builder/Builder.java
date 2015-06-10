package com.builder;

public abstract class Builder {

	protected Person person;

	public Builder(Person person){
		this.person = person;
	}
	
	// ����ͷ
    public abstract void buildHead();
    // ��������
    public abstract void buildBody();
    // ����첲
    public abstract void buildArm();
    // ������
    public abstract void buildLeg();
	
	
	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}
	
	
	
}
