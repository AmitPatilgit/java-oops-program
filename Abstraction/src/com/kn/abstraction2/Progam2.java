package com.kn.abstraction2;
public  class Progam2 extends Program {

	@Override
	public void m3() {
		
		System.out.println("abstract method has been overridden in the Child class ");
	}

	public Progam2()
	{
		super();
		System.out.println("Child Constructor.");
	}

	
}
