package com.abstractFactory;

public class SqlUser implements IUser {
	
	// 不同家族的不同产品的具体实现，这里为sql版本
	@Override
	public String getName() {
		
		return "I am SqlUser";
	}

	
}
