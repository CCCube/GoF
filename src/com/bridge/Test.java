package com.bridge;

//6. ģʽ�ܽ�
//
//6.1 �ŵ�
//
//����6.1.1 ������������������ά����չʱ�ĸ��Ӷȣ���ֹ��Ĺ������͡�
//
//����6.1.2 �������������ά��֮�����ϣ�ʹ�������Ÿ��Է���仯��������Ӱ��
//
//6.2 ȱ��
//
//������δ����
//
//6.3 ���ó���
//
//����6.3.1 ��һ�������ж���仯����ʱ�����Կ���ʹ���Ž�ģʽ��ͨ��������Щ�仯���أ�����������ʵ���޸�Ϊ��������
//
//����6.3.2 ����������һ������Ķ���仯���ؿ��Զ�̬�仯�����Ҳ�Ӱ��ͻ��˵ĳ���ʹ��ʱ��
//
//����6.3.3 ���ʹ�ü̳е�ʵ�ַ������ᵼ�²����ܶ����࣬�κ�һ���仯���ض���Ҫ�������������ɣ���Ҫ�����Ž�ģʽ��

public class Test {

	public static void main(String[] args) {

		Implementor implementor1 = new ConcreteImplementorA();
		Implementor implementor2 = new ConcreteImplementorB();
		
		Abstraction abstraction = new RefinedAbstraction();
		abstraction.setImplementor(implementor1);
		abstraction.operation();
		
		abstraction.setImplementor(implementor2);
		abstraction.operation();
	}

}
