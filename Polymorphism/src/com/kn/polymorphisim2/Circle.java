package com.kn.polymorphisim2;

public class Circle extends Shape {
	
	double r=5.5;

	@Override
	public double calculateArea() {
		
		return Math.PI*r*r;
		
	}
	public double calculateCirclePerimeter()
	{
		return 2*Math.PI*r;
	}
	

}
