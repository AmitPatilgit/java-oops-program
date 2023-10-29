package com.kn.Polymorphism;

public class Rectangle extends Shape {

	@Override
	public void draw() {
		
		System.out.println("Drawing Rectangle.");
	}

	@Override
	public double calculateArea() {
		double l=10.5,b=5.5;
		
		return l*b;
	}

	
}
