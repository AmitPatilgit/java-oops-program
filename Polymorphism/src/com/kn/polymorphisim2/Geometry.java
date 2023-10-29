package com.kn.polymorphisim2;

public class Geometry {

	public void doActivity(Shape sh)
	{
		sh.draw();
		System.out.println(sh.calculateArea());
		
//		System.out.println("Perimeter of Rectangle = " +((Rectangle)(sh)).calculateRectPerimeter());
//		System.out.println("Perimeter of Square = " +((Square)(sh)).calSquarePerimetre());
//		System.out.println("Perimeter of Circle = " +((Circle)(sh)).calculateCirclePerimeter());
//		
		
		if(sh instanceof Rectangle)
		{
			System.out.println("Perimeter of Rectangle = " +((Rectangle)(sh)).calculateRectPerimeter());
		}
		else if(sh instanceof Square)
		{
			System.out.println("Perimeter of Square = " +((Square)(sh)).calSquarePerimetre());
		}
		else
		{
			System.out.println("Perimeter of Circle = " +((Circle)(sh)).calculateCirclePerimeter());
		}
		System.out.println("------------------------");
	}
}
