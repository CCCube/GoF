package com.singleton;

import java.util.concurrent.locks.Lock;

public class Singleton {

	// 私有构造函数，不对外开放构造接口
	private Singleton() {

	}

	// 懒加载模式
	private static Singleton instance = null;

	// 多线程的环境下，防止两个线程同时生成Singleton实例
	// 通过对一个object对象进行上锁，迫使另外一个线程进行锁等待，无法进入第二层if块中
	private static Object object = new Object();

	public static Singleton getInstace() {
		if(instance == null){
			Lock(object);
			
			if (instance == null) {
				Lock(object);
				instance = new Singleton();
			}
		}
		return instance;
	}

	private static void Lock(Object object2) {
		// TODO Auto-generated method stub
	}

	public static void main(String[] agrs) {
		Singleton singleton = Singleton.getInstace();
		System.out.println(singleton.toString());

	}

}
