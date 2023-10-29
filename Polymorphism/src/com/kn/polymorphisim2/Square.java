package com.kn.polymorphisim2;

public class Square extends Shape{

	double side=5.2;
	@Override
	public double calculateArea() {
		
		return side*side;
	}
	public double calSquarePerimetre()
	{
		return side*side*side*side ;
	}
	
}
