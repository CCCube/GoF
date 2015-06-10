package com.abstractFactory;

public class SqlFactory implements AbstractFactory {

	@Override
	public IUser createIUser() {

		return new SqlUser();
	}

	@Override
	public IEmployee createIEmployee() {

		return new SqlEmployee();
	}

}
