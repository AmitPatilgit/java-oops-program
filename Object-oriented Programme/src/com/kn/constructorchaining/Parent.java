package com.kn.constructorchaining;

public class Parent {
	
	String name="subbo";
	int age=25;
	public Parent() {
		//super();
		this("papa",33);
		System.out.println("Parent no-arg Constructor.");
	}
	public Parent(String name, int age) {
		super();
		//System.out.println("Parent 2-arg Constructor.");
		System.out.println("*************Before****");
		System.out.println(this.name);
		System.out.println(this.age);
		this.name = name;
		this.age = age;
	}
	
	
	
}
