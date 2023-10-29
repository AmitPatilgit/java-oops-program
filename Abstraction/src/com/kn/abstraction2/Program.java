package com.kn.abstraction2;

 abstract public class Program {
//	final int i=10;
//	
//	final public void m1()
//	{
//		System.out.println("Parent Method");
//	}
//	 public void m2()
//	{
//		System.out.println("Parent Method 2");
//	}
	 
	//Static variable
	 static int i;
	 
	 //instance variable
	 int j;
	 
	 //instance block
	 {
		 j=20;
		 
			System.out.println("Instance Block of parent");
	 }
	 
	 
	 //static block
	 static {
		 i=10;
		 
		System.out.println("Static Block  of parent");
	 }
	 
	 //concrete static method
	 public static void m1()
	 {
		System.out.println("Static method  of parent");

	 }
	 
	 //concrete instance method
	 public void m2()
	 {
		System.out.println("Instance method  of parent");

	 }
	 
	 //abstract method
	 abstract public void m3();
	 
	 //final method
	final public void m4()
	{
		System.out.println("Final method  of parent");

	}
	
	
	//constructor 
	public Program()
	{
		System.out.println("Constructor of parent");
	}
	//main method
	public static void main(String[] args) {
		System.out.println("Main method of Parent class ");
	}
}
