package com.builder;

public abstract class Builder {

	// 由builder负责创建的person，也就是最终返回给client使用的person
	protected Person person;

	public Builder(Person person){
		this.person = person;
	}
	
	//构造人的头部
    public abstract void buildHead();
    //构造人的身体
    public abstract void buildBody();
    //构造人的手臂
    public abstract void buildArm();
    //构造人的大腿
    public abstract void buildLeg();
	
	
	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}
	
}
