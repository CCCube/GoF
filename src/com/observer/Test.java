package com.observer;

public class Test {

	public static void main(String[] args) {
		//声明一个具体主题concreteSubject
		ConcreteSubject concreteSubject = new ConcreteSubject();
		
		//声明三个ConcreteObserver，它们都对concreteSubject感兴趣
		ConcreteObserver concreteObserver1 = new ConcreteObserver(concreteSubject, "concreteSubject1");
		ConcreteObserver concreteObserver2 = new ConcreteObserver(concreteSubject, "concreteSubject2");
		ConcreteObserver concreteObserver3 = new ConcreteObserver(concreteSubject, "concreteSubject3");

		//告诉concreteSubject有三个ConcreteObserver对它感兴趣，记录维护在List中
		concreteSubject.attach(concreteObserver1);
		concreteSubject.attach(concreteObserver2);
		concreteSubject.attach(concreteObserver3);
		
		//一旦concreteSubject修改自身信息，主动触发Notify()函数，又触发了各个ConcreteObserver
		//内的update()函数，达到了使主题信息传递到具体观察者的功能
		concreteSubject.setSubjectState("I am your ssssubject....");
		concreteSubject.Notify();
		
		concreteSubject.setSubjectState("Now I changeeeeeeee....");
		concreteSubject.Notify();
		
	}

}
