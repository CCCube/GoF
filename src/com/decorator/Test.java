package com.decorator;

//4. ģʽ�ܽ�
//
//4.1 �ŵ�
//
//����4.1.1 ÿ��װ�ζ���ֻ�����Լ��Ĺ��ܣ�����Ҫ������α���ӵ����������С�������Decorator��SetComponent������ʵ�ֵģ�������ǵ�ְ���ǵ�һ�ġ�
//
//����4.1.2 ��ĺ���ְ���붯̬��ӵ�ְ���Ƿ���ġ������������������µĹ��ܣ�һ��Υ���˿��ŷ��ԭ�򣬶�������������ĸ��Ӷȡ�
//
//����4.1.3 �Ⱦ�̬�̳и���� �����ľ�̬�̳���ȣ�Decoratorģʽ�ṩ�˸���������������ְ��ķ�ʽ������ʹ����Ӻͷ���ķ�������װ��������ʱ�����Ӻ�ɾ��ְ��.
//
//4.2 ȱ��
//
//����4.2.1 �������С���󣬲���Decoratorģʽ����ϵͳ��������������࿴��ȥ���Ƶ�С������Щ��������������໥���ӵķ�ʽ��������ͬ��
//
//4.3 ���ó���
//
//����4.3.1 ����ҪΪ���й��ܶ�̬����Ӹ��๦��ʱ��
//
//����4.3.2 ��ĺ��Ĺ�������ı䣬ֻ����Ҫ����µĹ���ʱ��

public class Test {

	public static void main(String[] args) {

		//���幹��A�����operation
		ConcreteComponent concreteComponent = new ConcreteComponent();
		concreteComponent.operation();
		
		//����װ������չ��ԭ�Ⱦ��幹��concreteComponent�Ĺ���
		Decorator decorator = new ConcretorDecorator();
		decorator.setComponent(concreteComponent);
		decorator.operation();
		
	}

}
