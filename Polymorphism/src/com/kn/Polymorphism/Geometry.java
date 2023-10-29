package com.kn.Polymorphism;

public class Geometry {

	public void doActivity(Shape sh)
	{
		sh.draw();
		System.out.println(sh.calculateArea());
	}
}
