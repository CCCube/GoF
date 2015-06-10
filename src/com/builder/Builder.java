package com.builder;

public abstract class Builder {

	protected Person person;

	public Builder(Person person){
		this.person = person;
	}
	
	// 建造头
    public abstract void buildHead();
    // 建造身体
    public abstract void buildBody();
    // 建造胳膊
    public abstract void buildArm();
    // 建造腿
    public abstract void buildLeg();
	
	
	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}
	
	
	
}
