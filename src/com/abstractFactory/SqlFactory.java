package com.abstractFactory;

public class SqlFactory implements AbstractFactory {

	// 具体工厂，将产品的创建过程与客户端的使用分离开来，解除耦合
	// 可以动态地改变客户端使用的数据库版本，只需提供不同的实现，再修改Test中的代码即可
	@Override
	public IUser createIUser() {
		return new SqlUser();
	}

	@Override
	public IEmployee createIEmployee() {
		return new SqlEmployee();
	}

}
