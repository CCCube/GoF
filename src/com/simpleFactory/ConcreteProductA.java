package com.simpleFactory;

public class ConcreteProductA extends Product {

	@Override
	public void operation() {
		System.out.println("I am concreteProductA.....");
	}

	// �̳г����࣬ʵ�ֳ���������ɾ����ࡣ  
	//����������ͨ������𣺳����಻��ֱ��ʵ������ֻ�ܱ��̳У�������1��1�̳У�java���ܶ�̳�
	//���Զ�����ͨ�������к�����ʵ�֣� ���Զ����ʹ����ͨ�ֶ�
	public static void main(String[] agrs) {
		ConcreteProductA concreteProductA = new ConcreteProductA();
		concreteProductA.setString("invoking Product`s setString()");
		System.out.println(concreteProductA.getString());
		concreteProductA.operation();
					
	}
}