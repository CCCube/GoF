package com.stratege;

public class Context {

	private Stratege stratege;
	
	public Context(Stratege stratege){
		this.stratege = stratege;
	}
	
    public void ExecuteAlgorithm(){
    		stratege.Algorithm();
    }
}
