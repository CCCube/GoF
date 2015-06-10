package com.observer;

public class ConcreteObserver extends Observer{

	 private String observerState;
     private String name;
     private ConcreteSubject subject;
 
     
	@Override
	public void update() {
        observerState = subject.getSubjectState();
        System.out.println(observerState);
	}

	
	public ConcreteObserver(ConcreteSubject subject, String name)
    {
        this.subject = subject;
        this.name = name;
    }


	public String getObserverState() {
		return observerState;
	}


	public void setObserverState(String observerState) {
		this.observerState = observerState;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public ConcreteSubject getSubject() {
		return subject;
	}


	public void setSubject(ConcreteSubject subject) {
		this.subject = subject;
	}

	
	
	
}
