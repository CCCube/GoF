package com.singleton;

import java.util.concurrent.locks.Lock;

// 懒加载模式

public class Singleton {

	// 私有构造函数
	private Singleton() {

	}

	private static Singleton instance = null;

	// 多线程的环境下，防止两个线程同时生成Singleton实例
	private static Object object = new Object();

	public static Singleton getInstace() {

		if (instance == null) {
			Lock(object);
			instance = new Singleton();

		}

		return instance;
	}

	private static void Lock(Object object2) {
		// TODO Auto-generated method stub

	}

	public static void main(String[] agrs) {
		Singleton ssSingleton = Singleton.getInstace();
		System.out.println(ssSingleton.toString());

	}

}
