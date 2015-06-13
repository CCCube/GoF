package com.observer;

public class ConcreteSubject extends Subject {
	
	//具体的主题 ConcreteSubject，继承扩展的抽象subject的属性
    private String subjectState; 

	public String getSubjectState() {
		return subjectState;
	}

	public void setSubjectState(String subjectState) {
		this.subjectState = subjectState;
	}
	
}
