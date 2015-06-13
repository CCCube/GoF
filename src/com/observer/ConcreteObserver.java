package com.observer;

//具体观察者，继承抽象类，实现了抽象函数，为具体类，可实例化
public class ConcreteObserver extends Observer{

	 // 观察者observer的状态，这里假设信息等价于记录主题subject的状态
	 private String observerState;
	 // observer的名字
     private String name;
     // 传递进来的具体主题，还是存在一定的耦合关系，因为具体的主题有具体的属性，没办法抽象
     private ConcreteSubject subject;
 
    // 构造函数中传入的参数有 具体主题ConcreteSubject 还有观察者本身的名字name
	public ConcreteObserver(ConcreteSubject subject, String name)
    {
        this.subject = subject;
        this.name = name;
    }

	// 覆盖抽象观察者的update()函数，这里操作具体的subject对象中的属性还改变具体observer的信息状态
	@Override
	public void update() {
        observerState = subject.getSubjectState();
        System.out.println(observerState);
	}

	// getter and setter
	public String getObserverState() {
		return observerState;
	}

	public void setObserverState(String observerState) {
		this.observerState = observerState;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ConcreteSubject getSubject() {
		return subject;
	}


	public void setSubject(ConcreteSubject subject) {
		this.subject = subject;
	}

}
