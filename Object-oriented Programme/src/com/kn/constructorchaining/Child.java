package com.kn.constructorchaining;

public class Child extends Parent {

	String name="chotu";
	int age=12;
	
	public Child() {
		this(22);
		
		System.out.println("Child no-arg Constructor.");
	}
	

	public Child(String name) {
		
		System.out.println("Child 1-String arg  Constructor.");
		this.name = name;
	}
	


	public Child(int age) {
		this("ramu",2);
		
		System.out.println("Child 1-int arg Constructor.");
		this.age = age;
	}


	public Child(String name, int age) {
		//this("Dummy");
		super(name,age);
//		System.out.println("************************ Before**");
//		System.out.println(this.name);
//		System.out.println(this.age);
//		this.name = name;
//		this.age = age;
//		System.out.println("Child 2-arg constructor.");
//		this.name = name;
//		this.age = age;
//		System.out.println("************************  After***");
//		System.out.println(this.name);
//		System.out.println(this.age); 
		System.out.println("Child Name = " +this.name);
		System.out.println("Child Age = " +this.age);
		this.name = name;
		this.age = age;
		
		System.out.println("Parent Name = " +super.name );
		System.out.println("Parent Age = " +super.age);
		
		System.out.println("Child Name = " +this.name);
		System.out.println("Child Age = " +this.age);
	}
	
	
	
	
}
