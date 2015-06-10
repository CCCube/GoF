package com.abstractFactory;

public class AccessFactory implements AbstractFactory{

	@Override
	public IUser createIUser() {

		
		return new AccessUser();
	}

	@Override
	public IEmployee createIEmployee() {

		return new AccessEmployee();
	}

}
