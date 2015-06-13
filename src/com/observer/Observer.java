package com.observer;

public abstract class Observer {
	
	// 抽象类观察者，留下接口函数update()，由具体的子类实现，更改observer本身的状态
    public abstract void update();
    
}
