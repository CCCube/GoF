package com.observer;

import java.util.ArrayList;
import java.util.List;


public abstract class Subject {
	
	// 抽象subject，需要维护一个 List<Observer> ,由接口指向具体的observe
	List<Observer> observers = new ArrayList<Observer>();
	
	//增加一个需要维护的observer
	public void attach(Observer observer){
		observers.add(observer);
	}
	
	//删除一个已经订阅subject的observer
	public void detach(Observer observer){
		observers.remove(observer);
	}
	
	// 通过遍历subject对象所维护的observer列表，来通知所有的observer更改自己的状态
	//这里传进来的observer的update()函数被调用，回调。
	
	public void Notify(){
		for (Observer observer : observers) {
			observer.update();
		}
	
	}

	
}
