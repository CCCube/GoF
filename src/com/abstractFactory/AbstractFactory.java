package com.abstractFactory;
// 抽象工厂，负责抽象产品的创建，此时与具体的操作逻辑无关
public interface AbstractFactory {

	public IUser createIUser();
	
	public IEmployee createIEmployee();
	
}
