package com.kn.polymorphisim2;

public class Rectangle extends Shape {
	
	double l=5.5,b=2.5;
	@Override//Annotation
	public double calculateArea() {
		
		return l*b;
	}
	public double calculateRectPerimeter()
	{
		return 2*(l+b);
	}
	 

}
