package com.singleton;

import java.util.concurrent.locks.Lock;

// ������ģʽ

public class Singleton {

	// ˽�й��캯��
	private Singleton() {

	}

	private static Singleton instance = null;

	// ���̵߳Ļ����£���ֹ�����߳�ͬʱ����Singletonʵ��
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
