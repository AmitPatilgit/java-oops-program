package com.kn.constructorchaining;

public class DemoApp {

	public static void main(String[] args) {
		
		Child c=  new Child();
		System.out.println("Child Name = " + c.name);
		System.out.println("Child Age = " + c.age);
		
//		Child c1= new Child("Golu" , 13);
//		System.out.println("Child Name = " +c1.name);
//		System.out.println("Child Age = " +c1.age);
		 
	}

}
