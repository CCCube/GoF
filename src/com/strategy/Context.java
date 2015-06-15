package com.strategy;
// 具体的context上下文，需要用不同的策略来解决context中包含的问题
// 例如数组需要不同的排序算法，抑或一个用户需要不同的交通形式到达一个目的地
public class Context {
	// 传递进来的Strategy接口，具体实例化时传递进来具体的Strategy实现子类
	private Strategy strategy;
	
	public Context(Strategy strategy){
		this.strategy = strategy;
	}

	public Strategy getStrategy() {
		return strategy;
	}

	public void setStrategy(Strategy strategy) {
		this.strategy = strategy;
	}
	

}
