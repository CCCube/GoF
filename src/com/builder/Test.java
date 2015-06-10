package com.builder;

public class Test {

	public static void main(String[] args) {

		Builder thinBuilder = new ThinPersonBuilder(new Person());
		PersonDirector personDirector = new PersonDirector(thinBuilder);
		Person person = personDirector.buildePerson();
		System.out.print(person.getArm()+" "+person.getBody()+"\n");
		
		Builder fatBuilder = new FatPersonBuilder(new Person());
		PersonDirector fatpersonDirector = new PersonDirector(fatBuilder);
		Person fatperson = fatpersonDirector.buildePerson();
		System.out.print(fatperson.getArm()+" "+fatperson.getBody());
		
		
		
	}

}
