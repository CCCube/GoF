package com.simpleFactory;

public abstract class Product {

	// �����������Ĭ�ϵĹ��캯��
	public Product(){
		
	}
	
	// ��������abstract���η�
	public abstract void operation();
	
	//����������ʹ���ֶ�
	public String string ;

	//���Զ����ʹ�þ��巽���������з����壩

	public String getString() {
		return string;
	}

	public void setString(String string) {
		this.string = string;
	}

	


}
